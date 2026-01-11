#!/usr/bin/env python3
"""
Fix constructor names in obfuscated Java code.
Constructors must have the same name as their enclosing class.
"""

import os
import re
from pathlib import Path

def fix_java_file(filepath):
    """Fix constructor names in a single Java file."""
    with open(filepath, 'r', encoding='utf-8', errors='ignore') as f:
        content = f.read()
    
    # Find the class name (handles inner classes too)
    # Pattern: class ClassName
    class_match = re.search(r'\bclass\s+([A-Za-z_][A-Za-z0-9_]*)', content)
    if not class_match:
        return False  # No class found
    
    class_name = class_match.group(1)
    
    # Find invalid constructor declarations
    # Pattern: identifier(params) {} where identifier != class_name
    # This is tricky because we need to distinguish constructors from methods
    
    # Look for patterns like:  SomeName(Type param) {}
    # where SomeName starts with uppercase (constructor convention)
    pattern = r'^\s+([A-Z][A-Za-z0-9_]*)\s*\([^)]*\)\s*\{'
    
    lines = content.split('\n')
    modified = False
    
    for i, line in enumerate(lines):
        match = re.match(pattern, line)
        if match:
            constructor_name = match.group(1)
            # If it's not the class name and looks like a constructor (starts with uppercase)
            # This is likely a misnamed constructor
            if constructor_name != class_name and constructor_name != "public" and constructor_name != "private" and constructor_name != "protected":
                # Check if there's no return type before it (indicating it's a constructor)
                if i > 0:
                    prev_line = lines[i-1].strip()
                    # If previous line doesn't end with a type declaration, it's likely a constructor
                    if not re.match(r'.*\b(void|int|boolean|String|long|double|float|byte|short|char)\s*$', prev_line):
                        # Replace the constructor name with the class name
                        fixed_line = re.sub(r'^(\s+)' + re.escape(constructor_name), r'\1' + class_name, line)
                        if fixed_line != line:
                            lines[i] = fixed_line
                            modified = True
                            print(f"Fixed constructor in {filepath}: {constructor_name} -> {class_name}")
    
    if modified:
        with open(filepath, 'w', encoding='utf-8') as f:
            f.write('\n'.join(lines))
    
    return modified

def main():
    app_dir = Path('/home/rewrich/Documents/GitHub/tustu/app')
    fixed_count = 0
    
    for java_file in app_dir.rglob('*.java'):
        if fix_java_file(java_file):
            fixed_count += 1
    
    print(f"\nFixed {fixed_count} files")

if __name__ == '__main__':
    main()
