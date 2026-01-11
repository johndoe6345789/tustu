#!/usr/bin/env python3
"""
Fix constructor declarations in Java files where methods have lowercase names
matching patterns like: a(X paramX) or b(Y paramY) but should be constructors.
"""

import os
import re
import sys

def fix_constructor(file_path):
    """Fix constructor declarations in a Java file."""
    with open(file_path, 'r', encoding='utf-8', errors='ignore') as f:
        content = f.read()
    
    # Extract class name from file
    filename = os.path.basename(file_path)
    expected_class_name = filename.replace('.java', '')
    
    # Find the class declaration
    class_match = re.search(r'class\s+(\w+)', content)
    if not class_match:
        return False
    
    actual_class_name = class_match.group(1)
    
    # Pattern: lowercase method name followed by constructor-like parameters
    # Examples: c(b paramb) {}, d(b paramb) {}, etc.
    pattern = r'(\n\s+)([a-z][A-Z]?)\(([^)]+)\)\s*\{\}'
    
    def replace_constructor(match):
        indent = match.group(1)
        method_name = match.group(2)
        params = match.group(3)
        # Replace with actual class name
        return f"{indent}{actual_class_name}({params}) {{}}"
    
    new_content = re.sub(pattern, replace_constructor, content)
    
    if new_content != content:
        with open(file_path, 'w', encoding='utf-8') as f:
            f.write(new_content)
        return True
    
    return False

def main():
    base_path = "/home/rewrich/Documents/GitHub/tustu/app/src/main/java"
    
    fixed_count = 0
    for root, dirs, files in os.walk(base_path):
        for file in files:
            if file.endswith('.java'):
                file_path = os.path.join(root, file)
                try:
                    if fix_constructor(file_path):
                        fixed_count += 1
                        print(f"Fixed: {file_path}")
                except Exception as e:
                    print(f"Error processing {file_path}: {e}", file=sys.stderr)
    
    print(f"\nTotal files fixed: {fixed_count}")

if __name__ == "__main__":
    main()
