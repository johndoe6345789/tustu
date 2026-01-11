#!/usr/bin/env python3
"""
Fix misnamed constructors in Java files based on Gradle error output.
"""

import re
import os
from pathlib import Path

# Map of files to fix (file_path: [(line_num, wrong_name, class_name)])
fixes = {}

# Read the known error pattern - these classes have constructors with wrong names
# The files are inner classes where constructor name doesn't match class name

error_files = [
    "/home/rewrich/Documents/GitHub/tustu/app/com/efiAnalytics/apps/ts/dashboard/GaugeClusterRefreshActionListener.java",
    "/home/rewrich/Documents/GitHub/tustu/app/com/efiAnalytics/apps/ts/dashboard/GaugeClusterIndexActionListener.java",
    "/home/rewrich/Documents/GitHub/tustu/app/com/efiAnalytics/apps/ts/dashboard/CheckBoxStateActionListener.java",
    "/home/rewrich/Documents/GitHub/tustu/app/com/efiAnalytics/apps/ts/dashboard/HtmlDisplayHyperlinkListener.java",
    "/home/rewrich/Documents/GitHub/tustu/app/com/efiAnalytics/apps/ts/dashboard/GaugePropertiesPanel.java",
]

def get_class_name_from_file(filepath):
    """Extract the main class name from a Java file."""
    with open(filepath, 'r', encoding='utf-8', errors='ignore') as f:
        content = f.read()
    
    # Find class declaration
    match = re.search(r'\bclass\s+([A-Za-z_][A-Za-z0-9_]*)', content)
    if match:
        return match.group(1)
    return None

def fix_constructor_in_file(filepath, class_name):
    """Fix constructor names in a file."""
    with open(filepath, 'r', encoding='utf-8', errors='ignore') as f:
        lines = f.readlines()
    
    modified = False
    
    for i, line in enumerate(lines):
        # Look for constructor-like patterns that don't match the class name
        # Pattern: identifier(params) { where identifier is a single letter or wrong name
        match = re.match(r'^(\s*)([A-Za-z_][A-Za-z0-9_]*)\s*\([^)]*\)\s*\{\s*\}?\s*$', line)
        if match:
            indent = match.group(1)
            name = match.group(2)
            
            # Skip if it's already correct or if it's a keyword
            if name in ['public', 'private', 'protected', 'static', 'final']:
                continue
                
            # If it's a single letter or doesn't match class name, it's likely a constructor
            if (len(name) <= 2 or name != class_name) and name[0].isupper():
                # Check if previous line doesn't have a return type
                if i > 0:
                    prev_line = lines[i-1].strip()
                    # If no obvious return type, assume it's a constructor
                    if not re.search(r'\b(void|int|boolean|String|long|double|float|byte|short|char|public|private|protected)\s*$', prev_line):
                        # Replace with class name
                        fixed_line = re.sub(r'^(\s*)' + re.escape(name), r'\1' + class_name, line)
                        lines[i] = fixed_line
                        modified = True
                        print(f"Fixed: {filepath}:{i+1} - {name} -> {class_name}")
    
    if modified:
        with open(filepath, 'w', encoding='utf-8') as f:
            f.writelines(lines)
        return True
    return False

def main():
    # Find all Java files in the app directory that might have this issue
    app_dir = Path('/home/rewrich/Documents/GitHub/tustu/app')
    
    fixed_files = 0
    total_fixes = 0
    
    for java_file in app_dir.rglob('*.java'):
        class_name = get_class_name_from_file(java_file)
        if class_name and fix_constructor_in_file(java_file, class_name):
            fixed_files += 1
    
    print(f"\nProcessed files. Fixed {fixed_files} files.")

if __name__ == '__main__':
    main()
