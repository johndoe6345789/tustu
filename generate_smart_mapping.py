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
    # Filter out primitives and common types AND Java keywords
    java_primitives_and_keywords = ['int', 'long', 'boolean', 'double', 'float', 'String', 'List', 'Map', 'Object',
                                     'char', 'byte', 'short', 'void', 'class', 'interface', 'extends', 'implements']
    info['field_types'] = [f for f in field_types if len(f) > 2 and f not in java_primitives_and_keywords][:10]
    
    # Extract field names for context
    field_names = re.findall(r'(?:private|protected|public)\s+(?:static\s+)?(?:final\s+)?\w+\s+(\w+)\s*[;=]', content)
    info['field_names'] = [f for f in field_names if len(f) > 1][:10]
    
    # Extract string literals for domain understanding
    string_literals = re.findall(r'"([^"]{3,40})"', content)  # 3-40 char strings
    info['string_literals'] = string_literals[:10]
    
    # Extract imported classes (just the class name, not full package)
    imports = re.findall(r'import\s+[\w.]+\.(\w+);', content)
    # Filter out classes with numbers (like Base64, CRC32, etc.)
    info['imported_classes'] = [i for i in imports if len(i) > 2 and not any(c.isdigit() for c in i)][:15]
    
    # Extract instantiated classes (new ClassName())
    instantiations = re.findall(r'new\s+(\w+)\s*\(', content)
    # Filter out primitives, wrappers, and classes with numbers
    info['instantiated_classes'] = [i for i in instantiations 
                                    if len(i) > 2 
                                    and i not in ['int', 'Integer', 'long', 'Long', 
                                                  'boolean', 'Boolean', 'double', 'Double',
                                                  'float', 'Float', 'byte', 'Byte',
                                                  'short', 'Short', 'char', 'Character']
                                    and not any(c.isdigit() for c in i)][:15]
    
    # Extract method parameter types for more context
    method_params = re.findall(r'\w+\s+\w+\s*\(([^)]*)\)', content)
    param_types = []
    java_primitives_and_keywords = ['int', 'long', 'boolean', 'double', 'float', 'String', 'List', 'Map', 'Object',
                                     'char', 'byte', 'short', 'void', 'class', 'interface']
    for params in method_params:
        if params.strip():
            types = re.findall(r'(\w+)\s+\w+', params)
            param_types.extend([t for t in types if len(t) > 2 and t not in java_primitives_and_keywords])
    info['param_types'] = list(set(param_types))[:10]
    
    # Extract method return types
    return_types = re.findall(r'(?:public|private|protected)\s+(?:static\s+)?(\w+)\s+\w+\s*\(', content)
    java_primitives_and_keywords = ['int', 'long', 'boolean', 'double', 'float', 'String', 'List', 'Map', 'Object',
                                     'char', 'byte', 'short', 'void', 'class', 'interface']
    info['return_types'] = [r for r in return_types if len(r) > 2 and r not in java_primitives_and_keywords][:10]
    
    # Look for specific patterns in method bodies
    info['uses_thread'] = 'Thread' in content or 'Runnable' in content or 'ExecutorService' in content
    info['uses_io'] = 'InputStream' in content or 'OutputStream' in content or 'Reader' in content or 'Writer' in content
    info['uses_network'] = 'Socket' in content or 'ServerSocket' in content or 'URL' in content or 'HttpURLConnection' in content
    info['uses_swing'] = 'JFrame' in content or 'JPanel' in content or 'JButton' in content or 'JTable' in content
    info['uses_collection'] = 'List' in content or 'Map' in content or 'Set' in content
    info['uses_serialization'] = 'Serializable' in content or 'ObjectInputStream' in content or 'ObjectOutputStream' in content
    
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
                # Add technology context
                if info.get('uses_network') and 'Socket' not in dominant_type:
                    specific_name = f"Network{dominant_type}Manager"
                elif info.get('uses_io') and 'File' in content:
                    specific_name = f"File{dominant_type}Manager"
                elif info.get('uses_thread'):
                    specific_name = f"Threaded{dominant_type}Manager"
                elif type_counts[dominant_type] > 1:
                    specific_name = f"Multiple{dominant_type}Manager"
                else:
                    specific_name = f"{dominant_type}Manager"
    
    # Analyze field names for semantic meaning
    if not specific_name and info['field_names']:
        meaningful_fields = [f for f in info['field_names'] if len(f) > 3 and f not in ['this', 'that', 'temp', 'tmp', 'value', 'data']]
        if meaningful_fields:
            # Look for domain-specific field patterns
            field_str = ' '.join(meaningful_fields).lower()
            if 'connection' in field_str or 'socket' in field_str:
                specific_name = 'ConnectionManager'
            elif 'cache' in field_str or 'buffer' in field_str:
                specific_name = 'CacheManager'
            elif 'config' in field_str or 'setting' in field_str:
                specific_name = 'ConfigurationManager'
            elif 'logger' in field_str or 'logging' in field_str:
                specific_name = 'LoggingManager'
            elif 'session' in field_str:
                specific_name = 'SessionManager'
            elif 'queue' in field_str:
                specific_name = 'QueueManager'
    
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
    """Generate a creative, unique filename using deep semantic analysis"""
    
    # Helper to build context-rich names
    def build_contextual_name(base_name):
        """Add context to base name to make it unique"""
        # Sanitize base name: spell out numbers
        number_words = {'0': 'Zero', '1': 'One', '2': 'Two', '3': 'Three', '4': 'Four',
                       '5': 'Five', '6': 'Six', '7': 'Seven', '8': 'Eight', '9': 'Nine'}
        sanitized_base = base_name
        for digit, word in number_words.items():
            sanitized_base = sanitized_base.replace(digit, word)
        
        # Also check if it's a Java keyword - if so, add descriptive suffix
        java_keywords = ['boolean', 'int', 'long', 'double', 'float', 'char', 'byte', 'short', 
                        'void', 'class', 'interface', 'Interface']
        if sanitized_base.lower() in java_keywords:
            sanitized_base = f"{sanitized_base}Type"  # "boolean" → "booleanType"
        
        if sanitized_base + ".java" not in used_names:
            return sanitized_base + ".java"
            return sanitized_base + ".java"
        
        # Add field type context
        if class_info.get('field_types'):
            for ft in class_info['field_types'][:5]:
                if ft.lower() not in sanitized_base.lower() and len(ft) > 2:
                    # Sanitize field type too
                    sanitized_ft = ft
                    for digit, word in number_words.items():
                        sanitized_ft = sanitized_ft.replace(digit, word)
                    name = f"{sanitized_base}With{sanitized_ft}"
                    if name + ".java" not in used_names:
                        return name + ".java"
        
        # Add instantiated class context (avoid redundancy)
        if class_info.get('instantiated_classes'):
            for inst in class_info['instantiated_classes'][:5]:
                if inst.lower() not in base_name.lower() and len(inst) > 2:
                    if not inst.endswith('Exception'):
                        name = f"{base_name}Creating{inst}"
                        if name + ".java" not in used_names:
                            return name + ".java"
        
        # Add param type context
        if class_info.get('param_types'):
            for param in class_info['param_types'][:5]:
                if param.lower() not in base_name.lower() and len(param) > 2:
                    name = f"{base_name}Using{param}"
                    if name + ".java" not in used_names:
                        return name + ".java"
        
        # Add return type context
        if class_info.get('return_types'):
            for ret in class_info['return_types'][:5]:
                if ret.lower() not in base_name.lower() and len(ret) > 2:
                    name = f"{base_name}Returning{ret}"
                    if name + ".java" not in used_names:
                        return name + ".java"
        
        # Add method name context (skip getters/setters)
        if class_info.get('key_methods'):
            for method in class_info['key_methods'][:10]:
                if len(method) > 3 and not method.startswith('get') and not method.startswith('set'):
                    if method.lower() not in base_name.lower():
                        name = f"{base_name}{method.capitalize()}"
                        if name + ".java" not in used_names:
                            return name + ".java"
        
        # Add field name context
        if class_info.get('field_names'):
            for field in class_info['field_names'][:10]:
                if len(field) > 3 and field.lower() not in base_name.lower():
                    name = f"{base_name}For{field.capitalize()}"
                    if name + ".java" not in used_names:
                        return name + ".java"
        
        # Add package context (clean version)
        pkg_clean = pkg_name.replace('_', '').capitalize()
        name = f"{base_name}In{pkg_clean}Package"
        if name + ".java" not in used_names:
            return name + ".java"
        
        # Last resort: combine multiple contexts
        if class_info.get('field_types') and class_info.get('key_methods'):
            ft = class_info['field_types'][0]
            method = [m for m in class_info['key_methods'] if len(m) > 3][0] if [m for m in class_info['key_methods'] if len(m) > 3] else ''
            if method:
                name = f"{base_name}{method.capitalize()}{ft}"
                if name + ".java" not in used_names:
                    return name + ".java"
        
        return None
    
    # Strategy 1: Use the specific inferred name with context
    if class_info.get('specific_name') and len(class_info['specific_name']) > 2:
        result = build_contextual_name(class_info['specific_name'])
        if result:
            return result
    
    # Strategy 2: Use actual class name with context
    if class_info['class_name'] and len(class_info['class_name']) > 2:
        # Avoid Java keywords
        java_keywords = ['boolean', 'int', 'long', 'double', 'float', 'char', 'byte', 'short', 
                        'void', 'class', 'interface', 'extends', 'implements', 'package', 'import',
                        'public', 'private', 'protected', 'static', 'final', 'abstract']
        if class_info['class_name'].lower() not in java_keywords:
            result = build_contextual_name(class_info['class_name'])
            if result:
                return result
    
    # Strategy 3: Use description with enriched context
    if class_info['description']:
        # Skip if description itself is a keyword
        java_keywords = ['boolean', 'int', 'long', 'double', 'float', 'char', 'byte', 'short', 
                        'void', 'class', 'interface', 'extends', 'implements', 'Interface']
        if class_info['description'].lower() not in java_keywords:
            result = build_contextual_name(class_info['description'])
            if result:
                return result
    
    # Strategy 4: Build name from extends
    if class_info.get('extends') and len(class_info['extends']) > 2:
        base_name = f"{class_info['extends']}Extension"
        result = build_contextual_name(base_name)
        if result:
            return result
    
    # Strategy 5: Use implements interface with context
    if class_info.get('implements'):
        for impl in class_info['implements']:
            impl_name = impl.split('.')[-1]
            if len(impl_name) > 2:
                result = build_contextual_name(f"{impl_name}Impl")
                if result:
                    return result
    
    # Strategy 6: Build name from multiple characteristics
    name_parts = []
    
    # Add technology context
    if class_info.get('uses_network'):
        name_parts.append('Network')
    elif class_info.get('uses_io'):
        name_parts.append('IO')
    elif class_info.get('uses_thread'):
        name_parts.append('Threaded')
    elif class_info.get('uses_swing'):
        name_parts.append('UI')
    
    # Add primary field type
    if class_info.get('field_types'):
        ft = class_info['field_types'][0]
        if len(ft) > 2 and ft not in ['String', 'Object', 'List', 'Map']:
            name_parts.append(ft)
    
    # Add primary method
    if class_info.get('key_methods'):
        for method in class_info['key_methods'][:5]:
            if len(method) > 3 and not method.startswith('get') and not method.startswith('set'):
                name_parts.append(method.capitalize())
                break
    
    if len(name_parts) > 0:
        base_name = ''.join(name_parts)
        result = build_contextual_name(base_name)
        if result:
            return result
    
    # Strategy 7: Package-based comprehensive name
    pkg_clean = pkg_name.replace('_', '').capitalize()
    base_name = f"{pkg_clean}Component"
    result = build_contextual_name(base_name)
    if result:
        return result
    
    # Final fallback: Combine everything for guaranteed uniqueness
    # NO single letters, NO numbers - just descriptive concatenation
    parts = [pkg_clean]
    
    if class_info.get('description'):
        parts.append(class_info['description'])
    elif class_info.get('is_interface'):
        parts.append('InterfaceImpl')
    elif class_info.get('is_abstract'):
        parts.append('AbstractImpl')
    else:
        parts.append('ComponentImpl')
    
    if class_info.get('field_types'):
        ft = class_info['field_types'][0]
        if len(ft) > 2:
            parts.append('Managing' + ft)
    elif class_info.get('param_types'):
        pt = class_info['param_types'][0]
        if len(pt) > 2:
            parts.append('Processing' + pt)
    
    if class_info.get('key_methods'):
        for m in class_info['key_methods']:
            if len(m) > 3 and not m.startswith('get') and not m.startswith('set'):
                parts.append('Via' + m.capitalize())
                break
    
    # Use original filename letter as distinguisher (spelled out)
    letter_names = {
        'a': 'Alpha', 'b': 'Beta', 'c': 'Charlie', 'd': 'Delta', 'e': 'Echo',
        'f': 'Foxtrot', 'g': 'Golf', 'h': 'Hotel', 'i': 'India', 'j': 'Juliet',
        'k': 'Kilo', 'l': 'Lima', 'm': 'Mike', 'n': 'November', 'o': 'Oscar',
        'p': 'Papa', 'q': 'Quebec', 'r': 'Romeo', 's': 'Sierra', 't': 'Tango',
        'u': 'Uniform', 'v': 'Victor', 'w': 'Whiskey', 'x': 'Xray', 'y': 'Yankee',
        'z': 'Zulu'
    }
    letter_key = fallback_letter.lower()
    if letter_key in letter_names:
        parts.append(letter_names[letter_key])
    else:
        # For multi-char filenames, use them directly
        parts.append(fallback_letter.capitalize() + 'Variant')
    
    final_name = ''.join(parts) + '.java'
    
    # If still duplicate, try adding more context systematically
    if final_name in used_names:
        # Add imported classes
        if class_info.get('imported_classes'):
            for imp in class_info['imported_classes'][:3]:
                test_name = ''.join(parts) + 'Imports' + imp + '.java'
                if test_name not in used_names:
                    return test_name
        
        # Add string literal hints
        if class_info.get('string_literals'):
            for lit in class_info['string_literals'][:2]:
                # Clean the string for use in filename
                clean_lit = ''.join(c.capitalize() if c.isalnum() else '' for c in lit)
                if len(clean_lit) > 3:
                    test_name = ''.join(parts) + 'Ref' + clean_lit[:15] + '.java'
                    if test_name not in used_names:
                        return test_name
        
        # Add extends/implements info
        if class_info.get('extends'):
            test_name = ''.join(parts) + 'Extends' + class_info['extends'] + '.java'
            if test_name not in used_names:
                return test_name
        
        # Ultimate fallback: use phonetic alphabet with package combo
        combo = pkg_clean + letter_names.get(letter_key, fallback_letter.capitalize())
        test_name = ''.join(parts) + 'Unique' + combo + '.java'
        if test_name not in used_names:
            return test_name
        
        # If STILL duplicate (nearly impossible), add more parts
        extra_parts = []
        if class_info.get('uses_network'):
            extra_parts.append('Network')
        if class_info.get('uses_io'):
            extra_parts.append('InputOutput')
        if class_info.get('uses_thread'):
            extra_parts.append('Threading')
        if class_info.get('uses_swing'):
            extra_parts.append('SwingUI')
        if extra_parts:
            return ''.join(parts) + ''.join(extra_parts) + combo + '.java'
        else:
            # Very last resort: full package name spelling
            return ''.join(parts) + 'From' + pkg_name.replace('_', '').capitalize() + combo + '.java'
    
    return final_name

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
    
    # Track used names GLOBALLY for complete uniqueness
    global_used_names = set()
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
                
                # Generate creative name with GLOBAL uniqueness check
                new_file = generate_creative_name(
                    class_info, 
                    pkg_dir, 
                    basename, 
                    global_used_names  # Changed from per-package to global
                )
                
                # Track which strategy was used
                if class_info['class_name'] and class_info['class_name'] in new_file:
                    stats['used_class_name'] += 1
                elif class_info['description'] and class_info['description'] in new_file:
                    stats['used_description'] += 1
                else:
                    stats['used_fallback'] += 1
                
                # Add to BOTH global and per-package tracking
                global_used_names.add(new_file)
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
    
    # Check for remaining duplicates (should be zero with new strategy)
    print("\nVerifying global uniqueness...")
    global_name_count = {}
    for old_path, new_path in mapping.items():
        new_name = new_path.split('/')[-1]
        if new_name not in global_name_count:
            global_name_count[new_name] = []
        global_name_count[new_name].append((old_path, new_path))
    
    duplicates = [name for name, paths in global_name_count.items() if len(paths) > 1]
    if duplicates:
        print(f"⚠️  Found {len(duplicates)} duplicate names (should not happen with new strategy)")
        for name in duplicates[:5]:
            print(f"  - {name}: {len(global_name_count[name])} instances")
    else:
        print("✅ All filenames are unique!")
    
    print(f"\n{'='*60}")
    print(f"Generated smart mapping: {mapping_file}")
    print(f"{'='*60}")
    print(f"Total files mapped:        {stats['mapped']}")
    print(f"Total unique filenames:    {len(global_name_count)}")
    print(f"Used actual class names:   {stats['used_class_name']}")
    print(f"Used pattern descriptions: {stats['used_description']}")
    print(f"Used fallback names:       {stats['used_fallback']}")
    print(f"Skipped (already renamed): {stats['skipped_renamed']}")
    print(f"Skipped (empty):           {stats['skipped_empty']}")
    
    # Save analysis details
    analysis_file = "/home/rewrich/Documents/GitHub/tustu/JAVA_ANALYSIS_DETAILED.json"
    with open(analysis_file, 'w') as f:
        json.dump(analysis_details, f, indent=2, default=str)
    
    print(f"\nAnalysis details saved to: {analysis_file}")
    
    return mapping

if __name__ == '__main__':
    generate_smart_mapping_v2()
