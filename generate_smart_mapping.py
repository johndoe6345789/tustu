#!/usr/bin/env python3
"""
Smart Java file renaming with conflict resolution and creative naming.
Uses actual class names and context to generate unique, descriptive filenames.
"""

import os
import sys
import json
import re
from collections import defaultdict

def extract_class_info(filepath, content):
    """Extract class name and key characteristics from Java content"""
    info = {
        'class_name': None,
        'is_interface': False,
        'is_abstract': False,
        'is_enum': False,
        'extends': None,
        'implements': [],
        'key_methods': [],
        'field_types': [],
        'field_names': [],
        'string_literals': [],
        'imported_classes': [],
        'instantiated_classes': [],
        'description': None,
        'specific_name': None
    }
    
    # Extract class/interface/enum declaration
    class_match = re.search(r'public\s+(?:(abstract|final)\s+)?(class|interface|enum)\s+(\w+)', content)
    if class_match:
        modifier, type_keyword, class_name = class_match.groups()
        info['class_name'] = class_name
        info['is_interface'] = (type_keyword == 'interface')
        info['is_enum'] = (type_keyword == 'enum')
        info['is_abstract'] = (modifier == 'abstract')
    
    # Extract extends
    extends_match = re.search(r'extends\s+(\w+)', content)
    if extends_match:
        info['extends'] = extends_match.group(1)
    
    # Extract implements
    implements_match = re.findall(r'implements\s+([\w,\s]+)', content)
    if implements_match:
        for impl in implements_match:
            info['implements'].extend([i.strip() for i in impl.split(',')])
    
    # Extract ALL public methods (not just first 5)
    methods = re.findall(r'public\s+(?:static\s+)?(?:synchronized\s+)?\w+\s+(\w+)\s*\(', content)
    info['key_methods'] = methods
    
    # Extract field types to understand what this class manages
    field_types = re.findall(r'(?:private|protected|public)\s+(?:static\s+)?(?:final\s+)?(\w+)\s+\w+\s*[;=]', content)
    info['field_types'] = [f for f in field_types if len(f) > 2][:10]  # Meaningful types only
    
    # Extract field names for context
    field_names = re.findall(r'(?:private|protected|public)\s+(?:static\s+)?(?:final\s+)?\w+\s+(\w+)\s*[;=]', content)
    info['field_names'] = [f for f in field_names if len(f) > 1][:10]
    
    # Extract string literals for domain understanding
    string_literals = re.findall(r'"([^"]{5,40})"', content)  # 5-40 char strings
    info['string_literals'] = string_literals[:5]
    
    # Extract imported classes (just the class name, not full package)
    imports = re.findall(r'import\s+[\w.]+\.(\w+);', content)
    info['imported_classes'] = [i for i in imports if len(i) > 2][:10]
    
    # Extract instantiated classes (new ClassName())
    instantiations = re.findall(r'new\s+(\w+)\s*\(', content)
    info['instantiated_classes'] = [i for i in instantiations if len(i) > 2][:10]
    
    # Try to infer specific name from content
    specific_name = None
    
    # Special handling for ActionListener - look at body content first
    if 'ActionListener' in info['implements']:
        # Extract more context from the code body
        content_lower = content.lower()
        
        # Look for method calls to understand the action
        method_calls = re.findall(r'\.(\w+)\(', content)
        meaningful_calls = [m for m in method_calls if len(m) > 3 and m not in ['this', 'super', 'toString', 'equals', 'hashCode', 'getClass']]
        
        # Look for field assignments to understand what's being modified
        field_assignments = re.findall(r'this\.(\w+)\s*=', content)
        meaningful_fields = [f for f in field_assignments if len(f) > 1]
        
        # Look for specific patterns with more context
        if '.dispose()' in content:
            # Check what's being disposed
            if 'dialog' in content_lower:
                if 'cancel' in content_lower or 'close' in content_lower:
                    specific_name = 'CancelDialogAndCloseListener'
                else:
                    specific_name = 'DisposeDialogListener'
            elif 'window' in content_lower or 'frame' in content_lower:
                specific_name = 'CloseWindowListener'
            else:
                specific_name = 'DisposeListener'
        
        # RadioButton with specific context
        elif 'JRadioButton' in content:
            if 'rating' in content_lower or 'feedback' in content_lower:
                specific_name = 'RatingSelectionRadioButtonListener'
            elif 'parse' in content_lower or 'Integer.parseInt' in content:
                specific_name = 'ParseIntegerFromRadioButtonListener'
            elif meaningful_fields:
                specific_name = f"Update{meaningful_fields[0].capitalize()}FromRadioButtonListener"
            else:
                specific_name = 'RadioButtonSelectionListener'
        
        # CheckBox with specific context
        elif 'JCheckBox' in content:
            if 'enable' in content_lower or 'disable' in content_lower:
                specific_name = 'ToggleEnableStateCheckBoxListener'
            elif 'visible' in content_lower or 'visibility' in content_lower:
                specific_name = 'ToggleVisibilityCheckBoxListener'
            elif meaningful_fields:
                specific_name = f"Update{meaningful_fields[0].capitalize()}CheckBoxListener"
            else:
                specific_name = 'CheckBoxStateChangeListener'
        
        # MenuItem with context
        elif 'JMenuItem' in content or 'MenuItem' in content:
            if 'open' in content_lower:
                specific_name = 'OpenMenuItemListener'
            elif 'save' in content_lower:
                specific_name = 'SaveMenuItemListener'
            elif 'exit' in content_lower or 'quit' in content_lower:
                specific_name = 'ExitMenuItemListener'
            else:
                specific_name = 'MenuItemActionListener'
        
        # Dialog patterns with more specificity
        elif ('JDialog' in content or 'Dialog' in content) and content.count('Dialog') > 1:
            if 'submit' in content_lower or 'ok' in content_lower:
                if 'validation' in content_lower or 'validate' in content_lower:
                    specific_name = 'ValidateAndSubmitDialogListener'
                else:
                    specific_name = 'SubmitDialogListener'
            elif 'cancel' in content_lower:
                specific_name = 'CancelDialogListener'
            elif 'apply' in content_lower:
                specific_name = 'ApplyDialogChangesListener'
            else:
                specific_name = 'DialogActionListener'
        
        # Frame actions
        elif ('JFrame' in content or 'Frame' in content) and content.count('Frame') > 1:
            if 'minimize' in content_lower:
                specific_name = 'MinimizeFrameListener'
            elif 'maximize' in content_lower:
                specific_name = 'MaximizeFrameListener'
            else:
                specific_name = 'FrameActionListener'
        
        # Button actions
        elif ('JButton' in content or 'Button' in content) and content.count('Button') > 2:
            if 'browse' in content_lower:
                specific_name = 'BrowseButtonClickListener'
            elif 'search' in content_lower:
                specific_name = 'SearchButtonClickListener'
            else:
                specific_name = 'ButtonClickActionListener'
        
        # Look for method calls that indicate purpose (more specific)
        if not specific_name:
            if 'setEnabled' in meaningful_calls:
                specific_name = 'ToggleComponentEnabledStateListener'
            elif 'setVisible' in meaningful_calls:
                specific_name = 'ToggleComponentVisibilityListener'
            elif 'setText' in meaningful_calls:
                specific_name = 'UpdateTextFieldListener'
            elif 'setSelected' in meaningful_calls:
                specific_name = 'UpdateSelectionStateListener'
            elif any(m.startswith('show') for m in meaningful_calls):
                show_methods = [m for m in meaningful_calls if m.startswith('show')]
                specific_name = f"{show_methods[0].capitalize()}Listener"
            elif any(m.startswith('open') for m in meaningful_calls):
                open_methods = [m for m in meaningful_calls if m.startswith('open')]
                specific_name = f"{open_methods[0].capitalize()}Listener"
            elif any(m.startswith('start') for m in meaningful_calls):
                start_methods = [m for m in meaningful_calls if m.startswith('start')]
                specific_name = f"{start_methods[0].capitalize()}Listener"
            elif meaningful_calls and len(meaningful_calls) > 0:
                # Use the most prominent method call
                specific_name = f"{meaningful_calls[0].capitalize()}ActionListener"
        
        # Fallback to generic ActionListener
        if not specific_name:
            specific_name = 'GenericActionListener'
    
    # Check for OTHER listener/callback patterns with specific event types (not ActionListener)
    if not specific_name:
        for impl in info['implements']:
            if impl != 'ActionListener' and ('Listener' in impl or 'Callback' in impl):
                # Extract the specific type (e.g., "DeviceUpdate" from "DeviceUpdateListener")
                specific = impl.replace('Listener', '').replace('Callback', '').replace('Handler', '')
                if len(specific) > 2:
                    specific_name = f"{specific}Listener"
                    break
    
    # Look for dominant field types (what this class manages)
    if not specific_name and info['field_types']:
        type_counts = {}
        for ft in info['field_types']:
            if ft not in ['int', 'long', 'boolean', 'double', 'float', 'String', 'List', 'Map', 'Object']:
                type_counts[ft] = type_counts.get(ft, 0) + 1
        if type_counts:
            dominant_type = max(type_counts.items(), key=lambda x: x[1])[0]
            if len(dominant_type) > 2:
                # Check if we have multiple of same type - more specific naming
                if type_counts[dominant_type] > 1:
                    specific_name = f"Multiple{dominant_type}Manager"
                else:
                    specific_name = f"{dominant_type}Manager"
    
    # Look at instantiated classes for more specific naming
    if not specific_name and info['instantiated_classes']:
        # Filter out common types
        meaningful_classes = [c for c in info['instantiated_classes'] 
                            if c not in ['StringBuilder', 'StringBuffer', 'ArrayList', 'HashMap', 'HashSet', 
                                       'LinkedList', 'TreeMap', 'TreeSet', 'Vector', 'Hashtable', 'Exception',
                                       'RuntimeException', 'IllegalArgumentException', 'Date', 'Calendar',
                                       'String', 'Integer', 'Long', 'Double', 'Float', 'Boolean', 'Object']]
        if meaningful_classes:
            # Get most common instantiation
            class_counts = {}
            for cls in meaningful_classes:
                class_counts[cls] = class_counts.get(cls, 0) + 1
            most_common = max(class_counts.items(), key=lambda x: x[1])[0]
            # Only use if it's not an exception being thrown
            if not most_common.endswith('Exception'):
                if class_counts[most_common] > 1:
                    specific_name = f"Multiple{most_common}Creator"
                else:
                    specific_name = f"{most_common}Creator"
    
    # Use string literals to understand domain context
    if not specific_name and info['string_literals']:
        # Look for domain-specific keywords in strings
        combined_strings = ' '.join(info['string_literals']).lower()
        domain_keywords = {
            'error': 'ErrorHandler',
            'warning': 'WarningHandler',
            'log': 'LogHandler',
            'file': 'FileHandler',
            'connection': 'ConnectionHandler',
            'socket': 'SocketHandler',
            'serial': 'SerialHandler',
            'port': 'PortHandler',
            'device': 'DeviceHandler',
            'sensor': 'SensorHandler',
            'gauge': 'GaugeHandler',
            'table': 'TableHandler',
            'chart': 'ChartHandler',
            'graph': 'GraphHandler',
            'config': 'ConfigHandler',
            'setting': 'SettingsHandler',
            'parameter': 'ParameterHandler',
            'tuning': 'TuningHandler',
            'calibration': 'CalibrationHandler',
            'diagnostic': 'DiagnosticHandler',
        }
        for keyword, handler_name in domain_keywords.items():
            if keyword in combined_strings:
                specific_name = handler_name
                break
    
    # Look for method name patterns (verbs + nouns)
    if not specific_name and info['key_methods']:
        # Find methods with meaningful names (>3 chars)
        meaningful_methods = [m for m in info['key_methods'] if len(m) > 3]
        if meaningful_methods:
            # Look for common patterns
            for method in meaningful_methods:
                # handleXxx, processXxx, manageXxx patterns
                for prefix in ['handle', 'process', 'manage', 'update', 'create', 'build']:
                    if method.lower().startswith(prefix) and len(method) > len(prefix) + 2:
                        noun = method[len(prefix):].capitalize()
                        specific_name = f"{noun}Handler"
                        break
                if specific_name:
                    break
    
    info['specific_name'] = specific_name
    
    # Generate description based on context
    desc_parts = []
    
    if info['is_interface']:
        desc_parts.append('Interface')
    elif info['is_enum']:
        desc_parts.append('Enum')
    elif info['is_abstract']:
        desc_parts.append('Abstract')
    
    # Add pattern hints
    if any(m in ['getInstance', 'create', 'newInstance'] for m in info['key_methods']):
        desc_parts.append('Factory')
    elif any('Listener' in i or 'Observer' in i for i in info['implements']):
        desc_parts.append('Listener')
    elif 'Exception' in str(info['extends']) or 'Error' in str(info['extends']):
        desc_parts.append('Exception')
    elif any(m.startswith('render') or m == 'paint' for m in info['key_methods']):
        desc_parts.append('Renderer')
    elif any(m == 'parse' or 'parse' in m.lower() for m in info['key_methods']):
        desc_parts.append('Parser')
    elif any(m in ['save', 'load', 'persist', 'fetch'] for m in info['key_methods']):
        desc_parts.append('Repository')
    elif any(m in ['start', 'stop', 'execute', 'run'] for m in info['key_methods']):
        desc_parts.append('Service')
    elif any(m in ['validate', 'check', 'isValid'] for m in info['key_methods']):
        desc_parts.append('Validator')
    elif len(info['key_methods']) >= 4:
        desc_parts.append('Manager')
    
    info['description'] = ''.join(desc_parts) if desc_parts else None
    
    return info

def generate_creative_name(class_info, pkg_name, fallback_letter, used_names):
    """Generate a creative, unique filename using specific inference first"""
    
    # Strategy 1: Use the specific inferred name (most descriptive)
    if class_info.get('specific_name') and len(class_info['specific_name']) > 2:
        base_name = class_info['specific_name']
        candidate = f"{base_name}.java"
        if candidate not in used_names:
            return candidate
        # Add instantiated class context if available
        if class_info.get('instantiated_classes'):
            inst_class = class_info['instantiated_classes'][0]
            candidate = f"{base_name}For{inst_class}.java"
            if candidate not in used_names:
                return candidate
        # Add field type context
        if class_info.get('field_types'):
            field_type = class_info['field_types'][0]
            candidate = f"{base_name}With{field_type}.java"
            if candidate not in used_names:
                return candidate
        # Add method name context
        if class_info.get('key_methods'):
            method = class_info['key_methods'][0]
            if len(method) > 2:
                candidate = f"{base_name}{method.capitalize()}.java"
                if candidate not in used_names:
                    return candidate
        # Add package hint
        pkg_suffix = pkg_name.replace('_', '').capitalize()
        candidate = f"{base_name}In{pkg_suffix}.java"
        if candidate not in used_names:
            return candidate
    
    # Strategy 2: Use actual class name ONLY if it's not obfuscated (multi-char)
    if class_info['class_name'] and len(class_info['class_name']) > 2:
        base_name = class_info['class_name']
        candidate = f"{base_name}.java"
        if candidate not in used_names:
            return candidate
        # Add context from what it creates/manages
        if class_info.get('instantiated_classes'):
            inst_class = class_info['instantiated_classes'][0]
            candidate = f"{base_name}Creating{inst_class}.java"
            if candidate not in used_names:
                return candidate
        # Add context from imports
        if class_info.get('imported_classes'):
            for imp in class_info['imported_classes'][:3]:
                candidate = f"{base_name}Using{imp}.java"
                if candidate not in used_names:
                    return candidate
        # If already used, add the package hint
        pkg_suffix = pkg_name.replace('_', '').capitalize()
        candidate = f"{base_name}In{pkg_suffix}.java"
        if candidate not in used_names:
            return candidate
    
    # Strategy 3: Use description with enriched context
    if class_info['description']:
        base_name = class_info['description']
        candidate = f"{base_name}.java"
        if candidate not in used_names:
            return candidate
        
        # Add field type context for Managers/Services (avoid redundancy)
        if 'Manager' in base_name or 'Service' in base_name or 'Handler' in base_name:
            if class_info.get('field_types'):
                for field_type in class_info['field_types'][:3]:
                    # Skip if field type is in the base name
                    if field_type.lower() not in base_name.lower():
                        candidate = f"{field_type}{base_name}.java"
                        if candidate not in used_names:
                            return candidate
            
            if class_info.get('instantiated_classes'):
                for inst_class in class_info['instantiated_classes'][:3]:
                    # Skip if class is in the base name
                    if inst_class.lower() not in base_name.lower():
                        candidate = f"{inst_class}{base_name}.java"
                        if candidate not in used_names:
                            return candidate
            
            # Use field names for context
            if class_info.get('field_names'):
                for field_name in class_info['field_names'][:3]:
                    if len(field_name) > 2 and field_name.lower() not in base_name.lower():
                        candidate = f"{field_name.capitalize()}{base_name}.java"
                        if candidate not in used_names:
                            return candidate
        
        # Add primary method name (avoid common getters/setters)
        if class_info.get('key_methods'):
            for method in class_info['key_methods'][:5]:
                if len(method) > 3 and method not in ['toString', 'hashCode', 'equals', 'getClass']:
                    # Skip common patterns
                    if not method.startswith('get') and not method.startswith('set'):
                        candidate = f"{method.capitalize()}{base_name}.java"
                        if candidate not in used_names:
                            return candidate
        
        # Add package context
        pkg_suffix = pkg_name.replace('_', '').capitalize()
        candidate = f"{pkg_suffix}{base_name}.java"
        if candidate not in used_names:
            return candidate
        
        # Add letter as last resort before numbering
        candidate = f"{base_name}_{fallback_letter.upper()}.java"
        if candidate not in used_names:
            return candidate
    
    # Strategy 4: Use extends class name if meaningful
    if class_info['extends'] and len(class_info['extends']) > 2:
        base_name = f"{class_info['extends']}{fallback_letter.upper()}"
        candidate = f"{base_name}.java"
        if candidate not in used_names:
            return candidate
    
    # Strategy 5: Use implements interface if meaningful
    if class_info['implements']:
        for impl in class_info['implements']:
            impl_name = impl.split('.')[-1]  # Get simple name
            if len(impl_name) > 2:
                base_name = f"{impl_name}{fallback_letter.upper()}"
                candidate = f"{base_name}.java"
                if candidate not in used_names:
                    return candidate
    
    # Strategy 6: Use first meaningful method name + letter
    if class_info['key_methods']:
        for method in class_info['key_methods']:
            if len(method) > 2:  # Meaningful method name
                base_name = f"{method.capitalize()}{fallback_letter.upper()}"
                candidate = f"{base_name}.java"
                if candidate not in used_names:
                    return candidate
    
    # Strategy 7: Package context + letter
    base_name = f"{pkg_name.split('_')[0].capitalize()}{fallback_letter.upper()}"
    candidate = f"{base_name}.java"
    if candidate not in used_names:
        return candidate
    
    # Strategy 8: Ensure absolute uniqueness with sequential numbering
    base = f"{pkg_name.split('_')[0].capitalize()}_{fallback_letter.upper()}"
    candidate = f"{base}.java"
    if candidate not in used_names:
        return candidate
    
    # Add number suffix - guaranteed to be unique
    counter = 1
    while f"{base}_{counter}.java" in used_names:
        counter += 1
        if counter > 1000:  # Safety limit
            break
    return f"{base}_{counter}.java"

def generate_smart_mapping_v2():
    """Generate improved mapping with conflict resolution"""
    
    base_path = "/home/rewrich/Documents/GitHub/tustu/app/obfuscated_packages"
    
    mapping = {}
    analysis_details = {}
    stats = {
        'mapped': 0,
        'skipped_renamed': 0,
        'skipped_empty': 0,
        'used_class_name': 0,
        'used_description': 0,
        'used_fallback': 0
    }
    
    # Package name mappings
    package_renames = {
        "a": "linear_algebra",
        "A": "ui_colors",
        "B": "bluetooth_comm",
        "C": "can_interface",
        "D": "display_controller",
        "E": "engine_params",
        "F": "fuel_system",
        "G": "core_events",
        "H": "hardware_monitor",
        "I": "runtime_metrics",
        "J": "job_scheduler",
        "K": "key_manager",
        "L": "signal_processing",
        "M": "filters",
        "N": "network_manager",
        "O": "output_handlers",
        "P": "protocol_handlers",
        "Q": "query_engine",
        "R": "renderer_core",
        "S": "service_manager",
        "T": "thread_manager",
        "U": "util_common",
        "V": "vehicle_control",
        "W": "widget_base",
        "X": "extension_system",
        "Y": "yaml_parser",
        "Z": "zip_utils",
        "aa": "math_utils",
        "aA": "sensors",
        "ab": "sensor_calibration",
        "aB": "gauge_models",
        "ac": "table_editor",
        "aC": "data_serialization",
        "ad": "file_io",
        "aD": "logging",
        "ae": "scripting_engine",
        "aE": "crypto",
        "af": "ui_dialogs",
        "aF": "data_listener",
        "ag": "network_sockets",
        "aG": "data_formatter",
        "ah": "ui_themes",
        "aH": "config_parser",
        "ai": "ui_components",
        "aI": "sql_queries",
        "aj": "vehicle_params",
        "aJ": "theme_colors",
        "ak": "ui_layout",
        "aK": "window_manager",
        "al": "mouse_keyboard",
        "aL": "event_handlers",
        "am": "ui_rendering",
        "aM": "animation",
        "an": "ui_layout_helpers",
        "aN": "dimension_utils",
        "aO": "text_rendering",
        "aP": "tuning_maps",
        "aq": "value_conversion",
        "aQ": "permission_checker",
        "ar": "error_handler",
        "aR": "diagnostic_view",
        "as": "report_generator",
        "aS": "data_validation",
        "at": "timer_utils",
        "aT": "resource_loader",
    }
    
    # Track used names per package to avoid conflicts
    used_names_per_pkg = defaultdict(set)
    
    # Walk through all packages
    for pkg_dir in sorted(os.listdir(base_path)):
        old_pkg_path = os.path.join(base_path, pkg_dir)
        
        if not os.path.isdir(old_pkg_path):
            continue
        
        new_pkg = package_renames.get(pkg_dir, f"{pkg_dir}_refactored")
        
        # First pass: record all already-existing non-obfuscated files
        for file in os.listdir(old_pkg_path):
            if file.endswith('.java'):
                basename = file.replace('.java', '')
                # Already renamed files
                if len(basename) > 2 or (len(basename) > 1 and basename[0].isupper()):
                    used_names_per_pkg[new_pkg].add(file)
        
        # Second pass: analyze and map obfuscated files
        for file in sorted(os.listdir(old_pkg_path)):
            if not file.endswith('.java'):
                continue
            
            filepath = os.path.join(old_pkg_path, file)
            basename = file.replace('.java', '')
            
            # Skip already renamed files
            if len(basename) > 2 or (len(basename) > 1 and basename[0].isupper()):
                stats['skipped_renamed'] += 1
                continue
            
            # Skip special completed cases
            if pkg_dir == "a" and file in ["a.java", "b.java", "c.java"]:
                stats['skipped_renamed'] += 1
                continue
            
            try:
                with open(filepath, 'r', encoding='utf-8', errors='ignore') as f:
                    content = f.read()
                
                if not content.strip():
                    stats['skipped_empty'] += 1
                    continue
                
                # Extract class information
                class_info = extract_class_info(filepath, content)
                
                # Generate creative name
                new_file = generate_creative_name(
                    class_info, 
                    pkg_dir, 
                    basename, 
                    used_names_per_pkg[new_pkg]
                )
                
                # Track which strategy was used
                if class_info['class_name'] and class_info['class_name'] in new_file:
                    stats['used_class_name'] += 1
                elif class_info['description'] and class_info['description'] in new_file:
                    stats['used_description'] += 1
                else:
                    stats['used_fallback'] += 1
                
                # Add to used names
                used_names_per_pkg[new_pkg].add(new_file)
                
                old_full = f"app/obfuscated_packages/{pkg_dir}/{file}"
                new_full = f"app/obfuscated_packages/{new_pkg}/{new_file}"
                
                mapping[old_full] = new_full
                analysis_details[f"{pkg_dir}/{file}"] = {
                    'new_name': new_file,
                    'class_info': class_info
                }
                
                stats['mapped'] += 1
                
                if stats['mapped'] % 500 == 0:
                    print(f"Processed {stats['mapped']} files...")
                
            except Exception as e:
                continue
    
    # Save mapping
    mapping_file = "/home/rewrich/Documents/GitHub/tustu/PACKAGE_MAPPING_SMART.json"
    with open(mapping_file, 'w') as f:
        json.dump(mapping, f, indent=2, sort_keys=True)
    
    # Post-process to ensure ALL names are unique across entire workspace
    print("\nEnsuring global uniqueness...")
    global_name_count = {}
    for old_path, new_path in mapping.items():
        new_name = new_path.split('/')[-1]
        if new_name not in global_name_count:
            global_name_count[new_name] = []
        global_name_count[new_name].append((old_path, new_path))
    
    # Fix duplicates by adding small numeric suffixes
    duplicates_fixed = 0
    for new_name, paths in global_name_count.items():
        if len(paths) > 1:
            # Keep first one, rename others
            for idx, (old_path, new_path) in enumerate(paths[1:], start=2):
                # Insert number before .java extension
                base_name = new_name[:-5]  # Remove .java
                unique_name = f"{base_name}{idx}.java"
                # Update the new path
                new_dir = '/'.join(new_path.split('/')[:-1])
                mapping[old_path] = f"{new_dir}/{unique_name}"
                duplicates_fixed += 1
    
    # Save the globally unique mapping
    with open(mapping_file, 'w') as f:
        json.dump(mapping, f, indent=2, sort_keys=True)
    
    print(f"Fixed {duplicates_fixed} duplicate filenames for global uniqueness")
    
    print(f"\n{'='*60}")
    print(f"Generated smart mapping: {mapping_file}")
    print(f"{'='*60}")
    print(f"Total files mapped:        {stats['mapped']}")
    print(f"Used actual class names:   {stats['used_class_name']}")
    print(f"Used pattern descriptions: {stats['used_description']}")
    print(f"Used fallback names:       {stats['used_fallback']}")
    print(f"Skipped (already renamed): {stats['skipped_renamed']}")
    print(f"Skipped (empty):           {stats['skipped_empty']}")
    print(f"Global duplicates fixed:   {duplicates_fixed}")
    
    # Save analysis details
    analysis_file = "/home/rewrich/Documents/GitHub/tustu/JAVA_ANALYSIS_DETAILED.json"
    with open(analysis_file, 'w') as f:
        json.dump(analysis_details, f, indent=2, default=str)
    
    print(f"\nAnalysis details saved to: {analysis_file}")
    
    return mapping

if __name__ == '__main__':
    generate_smart_mapping_v2()
