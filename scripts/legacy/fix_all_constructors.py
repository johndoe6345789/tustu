#!/usr/bin/env python3
"""
Fix all constructor declaration errors in Java files.
This script finds lowercase method names that should be constructors
and fixes them to use the proper class name.
"""

import re
import os
import sys
from pathlib import Path

def fix_constructors_in_file(file_path):
    """Fix constructor declarations in a single Java file."""
    with open(file_path, 'r', encoding='utf-8', errors='ignore') as f:
        content = f.read()
    
    original_content = content
    
    # Extract class name from the file
    class_match = re.search(r'\bclass\s+(\w+)', content)
    if not class_match:
        return False
    
    class_name = class_match.group(1)
    
    # Pattern to find lowercase method declarations that look like constructors
    # These have no return type and are at the class level
    # Pattern: lowercase_identifier(parameters) {
    pattern = r'\b([a-z]\w*)\s*\(([^)]*)\)\s*\{'
    
    def replacer(match):
        method_name = match.group(1)
        params = match.group(2)
        
        # Skip known keywords and common method names
        skip_keywords = ['if', 'for', 'while', 'switch', 'catch', 'synchronized', 
                        'assert', 'return', 'throw', 'try']
        if method_name in skip_keywords:
            return match.group(0)
        
        # Look backwards to see if there's a type declaration (return type)
        # If there is, it's a regular method, not a constructor
        start_pos = match.start()
        # Get 100 chars before to check context
        context_start = max(0, start_pos - 100)
        context = content[context_start:start_pos]
        
        # Check if there's a type declaration right before (like "public void method(")
        # Split by common boundaries
        last_statement = context.split(';')[-1].split('}')[-1].strip()
        
        # If there's a clear return type, skip it
        if re.search(r'\b(void|int|boolean|String|double|float|long|byte|char|short)\s+$', last_statement):
            return match.group(0)
        
        # If it's a visibility modifier followed by lowercase, it's likely a constructor
        if re.search(r'\b(public|private|protected)\s+$', last_statement):
            return f'{class_name}({params}) {{'
        
        # Check if it's at the start of the file (after class declaration)
        # and has no return type
        if not re.search(r'\w\s+$', last_statement):
            # Likely a constructor
            return f'{class_name}({params}) {{'
            
        return match.group(0)
    
    # Apply the fix
    content = re.sub(pattern, replacer, content)
    
    if content != original_content:
        with open(file_path, 'w', encoding='utf-8') as f:
            f.write(content)
        return True
    
    return False

def main():
    # Get the source directory
    script_dir = Path(__file__).parent
    src_dir = script_dir.parent / 'app' / 'src' / 'main' / 'java'
    
    if not src_dir.exists():
        print(f"Error: Source directory not found: {src_dir}")
        sys.exit(1)
    
    # Find all Java files
    java_files = list(src_dir.rglob('*.java'))
    print(f"Found {len(java_files)} Java files")
    
    fixed_count = 0
    for java_file in java_files:
        try:
            if fix_constructors_in_file(java_file):
                fixed_count += 1
                print(f"Fixed: {java_file.relative_to(src_dir)}")
        except Exception as e:
            print(f"Error processing {java_file}: {e}")
    
    print(f"\nFixed {fixed_count} files")

if __name__ == '__main__':
    main()
