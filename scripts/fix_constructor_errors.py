#!/usr/bin/env python3
"""
Fix constructor errors by reading the compilation output.
Finds files with "invalid method declaration; return type required"
and fixes the lowercase method to be a proper constructor.
"""

import re
import subprocess
from pathlib import Path

def get_class_name_from_file(file_path):
    """Extract the class name from a Java file."""
    try:
        with open(file_path, 'r', encoding='utf-8', errors='ignore') as f:
            content = f.read()
        
        # Look for class declaration
        match = re.search(r'\b(public\s+|private\s+|protected\s+)?class\s+(\w+)', content)
        if match:
            return match.group(2)
    except Exception as e:
        print(f"Error reading {file_path}: {e}")
    
    return None

def fix_constructor_at_line(file_path, line_num, class_name):
    """Fix a constructor error at a specific line."""
    try:
        with open(file_path, 'r', encoding='utf-8', errors='ignore') as f:
            lines = f.readlines()
        
        # Line numbers are 1-based
        if line_num < 1 or line_num > len(lines):
            return False
        
        line = lines[line_num - 1]
        
        # Pattern: lowercase_name(params) {
        pattern = r'\b([a-z]\w*)\s*\('
        match = re.search(pattern, line)
        
        if match:
            # Replace with class name
            old_name = match.group(1)
            new_line = line.replace(f'{old_name}(', f'{class_name}(', 1)
            lines[line_num - 1] = new_line
            
            with open(file_path, 'w', encoding='utf-8') as f:
                f.writelines(lines)
            
            return True
    except Exception as e:
        print(f"Error fixing {file_path}:{line_num}: {e}")
    
    return False

def main():
    # Compile and get errors
    print("Running compilation to get errors...")
    result = subprocess.run(
        ['./gradlew', ':app:compileJava', '--no-build-cache'],
        cwd='/home/rewrich/Documents/GitHub/tustu',
        capture_output=True,
        text=True
    )
    
    output = result.stdout + result.stderr
    
    # Parse errors: "invalid method declaration; return type required"
    error_pattern = r'^(.+\.java):(\d+):\s*error:\s*invalid method declaration'
    errors = []
    
    for line in output.split('\n'):
        match = re.match(error_pattern, line)
        if match:
            file_path = match.group(1)
            line_num = int(match.group(2))
            errors.append((file_path, line_num))
    
    # Debug: show some lines
    if not errors:
        print("Debug: Checking output for errors...")
        for line in output.split('\n'):
            if 'error:' in line and '.java:' in line:
                print(f"Error line: {line[:150]}")
                if len([e for e in errors if e[0] in line]) < 5:
                    # Try to parse it differently
                    match2 = re.search(r'(/[^:]+\.java):(\d+):', line)
                    if match2:
                        file_path = match2.group(1)
                        line_num = int(match2.group(2))
                        errors.append((file_path, line_num))
                        print(f"  Parsed: {file_path}:{line_num}")
    
    print(f"Found {len(errors)} constructor errors")
    
    # Fix each error
    fixed_count = 0
    for file_path, line_num in errors:
        class_name = get_class_name_from_file(file_path)
        if class_name:
            if fix_constructor_at_line(file_path, line_num, class_name):
                fixed_count += 1
                print(f"Fixed: {file_path}:{line_num}")
    
    print(f"\nFixed {fixed_count} constructor errors")

if __name__ == '__main__':
    main()
