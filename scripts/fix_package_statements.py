#!/usr/bin/env python3
"""
Fix package statements in Java files to match their directory structure.
"""
import os
import re
from pathlib import Path

def get_expected_package(file_path, src_root):
    """Calculate the expected package name based on file path."""
    # Get relative path from src root
    rel_path = os.path.relpath(file_path, src_root)
    # Get directory path
    dir_path = os.path.dirname(rel_path)
    # Convert path to package name
    package = dir_path.replace(os.sep, '.')
    return package

def fix_package_statement(file_path, src_root):
    """Fix the package statement in a Java file."""
    expected_package = get_expected_package(file_path, src_root)
    
    try:
        with open(file_path, 'r', encoding='utf-8') as f:
            content = f.read()
        
        # Find current package statement
        package_match = re.match(r'^package\s+([^;]+);', content, re.MULTILINE)
        
        if package_match:
            current_package = package_match.group(1).strip()
            
            # Check if it needs fixing
            if current_package != expected_package:
                # Replace package statement
                new_content = re.sub(
                    r'^package\s+[^;]+;',
                    f'package {expected_package};',
                    content,
                    count=1,
                    flags=re.MULTILINE
                )
                
                # Write back
                with open(file_path, 'w', encoding='utf-8') as f:
                    f.write(new_content)
                
                return True, current_package, expected_package
        
        return False, None, None
        
    except Exception as e:
        print(f"Error processing {file_path}: {e}")
        return False, None, None

def main():
    # Define source root
    src_root = Path('/home/rewrich/Documents/GitHub/tustu/app/src/main/java')
    business_dir = src_root / 'business'
    
    if not business_dir.exists():
        print(f"Directory not found: {business_dir}")
        return
    
    # Find all Java files
    java_files = list(business_dir.rglob('*.java'))
    
    print(f"Found {len(java_files)} Java files in business directory")
    print(f"Checking and fixing package statements...\n")
    
    fixed_count = 0
    
    for java_file in sorted(java_files):
        changed, old_pkg, new_pkg = fix_package_statement(java_file, src_root)
        if changed:
            fixed_count += 1
            rel_path = java_file.relative_to(src_root)
            print(f"Fixed: {rel_path}")
            print(f"  {old_pkg} -> {new_pkg}")
    
    print(f"\nTotal files fixed: {fixed_count}")
    print(f"Total files checked: {len(java_files)}")

if __name__ == '__main__':
    main()
