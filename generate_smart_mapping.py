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
        'description': None
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
    
    # Extract key public methods (first 5)
    methods = re.findall(r'public\s+(?:static\s+)?(?:synchronized\s+)?\w+\s+(\w+)\s*\(', content)
    info['key_methods'] = methods[:5]
    
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
    """Generate a creative, unique filename"""
    
    # Strategy 1: Use actual class name ONLY if it's not obfuscated (multi-char)
    if class_info['class_name'] and len(class_info['class_name']) > 2:
        base_name = class_info['class_name']
        candidate = f"{base_name}.java"
        if candidate not in used_names:
            return candidate
        # If already used, add the package hint
        candidate = f"{base_name}_{pkg_name}.java"
        if candidate not in used_names:
            return candidate
    
    # Strategy 2: Use description + letter (more specific than just letter)
    if class_info['description']:
        base_name = f"{class_info['description']}_{fallback_letter.upper()}"
        candidate = f"{base_name}.java"
        if candidate not in used_names:
            return candidate
    
    # Strategy 3: Use extends class name if meaningful
    if class_info['extends'] and len(class_info['extends']) > 2:
        base_name = f"{class_info['extends']}{fallback_letter.upper()}"
        candidate = f"{base_name}.java"
        if candidate not in used_names:
            return candidate
    
    # Strategy 4: Use implements interface if meaningful
    if class_info['implements']:
        for impl in class_info['implements']:
            impl_name = impl.split('.')[-1]  # Get simple name
            if len(impl_name) > 2:
                base_name = f"{impl_name}{fallback_letter.upper()}"
                candidate = f"{base_name}.java"
                if candidate not in used_names:
                    return candidate
    
    # Strategy 5: Use first meaningful method name + letter
    if class_info['key_methods']:
        for method in class_info['key_methods']:
            if len(method) > 2:  # Meaningful method name
                base_name = f"{method.capitalize()}{fallback_letter.upper()}"
                candidate = f"{base_name}.java"
                if candidate not in used_names:
                    return candidate
    
    # Strategy 6: Package context + letter
    base_name = f"{pkg_name.split('_')[0].capitalize()}{fallback_letter.upper()}"
    candidate = f"{base_name}.java"
    if candidate not in used_names:
        return candidate
    
    # Strategy 7: Fallback with number suffix
    base = f"{pkg_name.split('_')[0].capitalize()}_{fallback_letter.upper()}"
    candidate = f"{base}.java"
    if candidate not in used_names:
        return candidate
    
    # Add number suffix
    counter = 1
    while f"{base}_{counter}.java" in used_names:
        counter += 1
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
    
    print(f"\n{'='*60}")
    print(f"Generated smart mapping: {mapping_file}")
    print(f"{'='*60}")
    print(f"Total files mapped:        {stats['mapped']}")
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
