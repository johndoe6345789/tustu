#!/usr/bin/env python3
"""
Generate smart package mapping using heuristic analysis of Java files.
Creates PACKAGE_MAPPING_SMART.json with suggested filenames based on code analysis.
"""

import os
import sys
import json
import re
from collections import defaultdict
from pathlib import Path

# Import the analyzer
sys.path.insert(0, '/home/rewrich/Documents/GitHub/tustu')
from analyze_java_files import JavaFileAnalyzer

def generate_smart_mapping():
    """Generate mapping using heuristic analysis of Java files"""
    
    analyzer = JavaFileAnalyzer()
    base_path = "/home/rewrich/Documents/GitHub/tustu/app/obfuscated_packages"
    
    mapping = {}
    analysis_details = {}
    skipped = {'already_renamed': 0, 'empty': 0, 'error': 0}
    
    # Package-level descriptive names
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
    
    processed_count = 0
    
    # Walk through all packages
    for pkg_dir in sorted(os.listdir(base_path)):
        old_pkg_path = os.path.join(base_path, pkg_dir)
        
        if not os.path.isdir(old_pkg_path):
            continue
        
        new_pkg = package_renames.get(pkg_dir, f"{pkg_dir}_refactored")
        
        # Analyze each file
        for file in sorted(os.listdir(old_pkg_path)):
            if not file.endswith('.java'):
                continue
            
            filepath = os.path.join(old_pkg_path, file)
            basename = file.replace('.java', '')
            
            # Skip files that are already renamed (multi-char or CamelCase)
            if len(basename) > 2 or (len(basename) > 1 and basename[0].isupper()):
                skipped['already_renamed'] += 1
                continue
            
            # Skip already completed renames
            if pkg_dir == "a" and file in ["a.java", "b.java", "c.java"]:
                skipped['already_renamed'] += 1
                continue
            
            try:
                with open(filepath, 'r', encoding='utf-8', errors='ignore') as f:
                    content = f.read()
                
                if not content.strip():
                    skipped['empty'] += 1
                    continue
                
                # Analyze the file
                analysis = analyzer.analyze_file(filepath, file)
                
                if analysis and 'suggested_name' in analysis:
                    new_file = analysis['suggested_name']
                    analysis_details[f"{pkg_dir}/{file}"] = analysis
                else:
                    # Fallback: use generic name
                    new_file = f"Component_{basename}.java"
                
                old_full = f"app/obfuscated_packages/{pkg_dir}/{file}"
                new_full = f"app/obfuscated_packages/{new_pkg}/{new_file}"
                
                mapping[old_full] = new_full
                processed_count += 1
                
                if processed_count % 500 == 0:
                    print(f"Processed {processed_count} files...")
                
            except Exception as e:
                skipped['error'] += 1
                continue
    
    # Save mapping
    mapping_file = "/home/rewrich/Documents/GitHub/tustu/PACKAGE_MAPPING_SMART.json"
    with open(mapping_file, 'w') as f:
        json.dump(mapping, f, indent=2, sort_keys=True)
    
    print(f"\nGenerated smart mapping: {mapping_file}")
    print(f"Total files mapped: {len(mapping)}")
    print(f"Skipped (already renamed): {skipped['already_renamed']}")
    print(f"Skipped (empty): {skipped['empty']}")
    print(f"Skipped (error): {skipped['error']}")
    print(f"Total processed: {processed_count}")
    
    # Save analysis details
    analysis_file = "/home/rewrich/Documents/GitHub/tustu/JAVA_ANALYSIS_DETAILED.json"
    with open(analysis_file, 'w') as f:
        json.dump(analysis_details, f, indent=2, default=str)
    
    print(f"Analysis details saved to: {analysis_file}")
    
    return mapping

if __name__ == '__main__':
    generate_smart_mapping()
