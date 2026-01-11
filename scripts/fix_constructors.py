#!/usr/bin/env python3
"""
Fix obfuscated constructor names in Java files.
Finds patterns like: `  aI(ClassName param) {}` 
and replaces them with proper constructor names matching the class name.
"""

import re
import sys
from pathlib import Path

def fix_constructors_in_file(file_path):
    """Fix constructor names in a single Java file."""
    try:
        with open(file_path, 'r', encoding='utf-8') as f:
            content = f.read()
        
        original_content = content
        
        # Find the class name from the file
        # Match: class ClassName ... or public class ClassName ...
        class_match = re.search(r'\b(?:public\s+|private\s+|protected\s+)?class\s+(\w+)', content)
        if not class_match:
            return False, "No class definition found"
        
        class_name = class_match.group(1)
        
        # Find obfuscated constructors - patterns like:
        #   aI(ClassName param) {}
        #   a(Type param) {
        # These are lines starting with 2 spaces, followed by a lowercase identifier (not a keyword),
        # followed by parentheses (constructor-like), but the identifier doesn't match class name
        
        # Pattern to match potential obfuscated constructors
        # Look for: start of line, optional access modifier, short identifier (1-3 chars starting with lowercase), 
        # followed by parameter list
        # Updated to catch patterns like aD, aI, az, etc. (1-2 chars, starting lowercase)
        pattern = r'^(\s+)([a-z][A-Za-z]?)\(([^)]*)\)\s*\{'
        
        changes_made = 0
        lines = content.split('\n')
        new_lines = []
        
        for i, line in enumerate(lines):
            match = re.match(pattern, line)
            if match:
                indent = match.group(1)
                potential_constructor = match.group(2)
                params = match.group(3)
                
                # Check if this looks like an obfuscated constructor
                # (short name, not matching class name, has parameters that might include class types)
                if potential_constructor != class_name and len(potential_constructor) <= 2:
                    # Check if parameters contain a class type (capitalized word)
                    # or if there are no parameters (default constructor)
                    if not params.strip() or re.search(r'\b[A-Z]\w+', params):
                        # This looks like an obfuscated constructor
                        new_line = line.replace(f'{indent}{potential_constructor}(', 
                                               f'{indent}{class_name}(')
                        new_lines.append(new_line)
                        changes_made += 1
                        continue
            
            new_lines.append(line)
        
        if changes_made > 0:
            new_content = '\n'.join(new_lines)
            with open(file_path, 'w', encoding='utf-8') as f:
                f.write(new_content)
            return True, f"Fixed {changes_made} constructor(s)"
        
        return False, "No changes needed"
        
    except Exception as e:
        return False, f"Error: {str(e)}"

def main():
    if len(sys.argv) < 2:
        print("Usage: python fix_constructors.py <file_or_directory>")
        sys.exit(1)
    
    path = Path(sys.argv[1])
    
    if path.is_file():
        files = [path]
    elif path.is_dir():
        files = list(path.rglob("*.java"))
    else:
        print(f"Error: {path} is not a valid file or directory")
        sys.exit(1)
    
    total_fixed = 0
    total_files = len(files)
    
    for java_file in files:
        changed, message = fix_constructors_in_file(java_file)
        if changed:
            print(f"✓ {java_file.relative_to(path.parent if path.is_file() else path)}: {message}")
            total_fixed += 1
    
    print(f"\nFixed {total_fixed} out of {total_files} files")

if __name__ == "__main__":
    main()
