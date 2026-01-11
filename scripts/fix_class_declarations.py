#!/usr/bin/env python3
"""Fix malformed class/interface/enum declarations from decompilation."""

import re
import sys
from pathlib import Path

def fix_class_declarations(file_path):
    """Fix malformed class, interface, and enum declarations."""
    with open(file_path, 'r', encoding='utf-8', errors='ignore') as f:
        content = f.read()
    
    original = content
    
    # Fix patterns like "public XClasslass X" -> "public class X"
    content = re.sub(
        r'\b(public|private|protected)?\s*(\w+)(lass)\s+\2\b',
        lambda m: f"{m.group(1) + ' ' if m.group(1) else ''}class {m.group(2)}",
        content
    )
    
    # Fix patterns like "public XInterfacenterface X" -> "public interface X"
    content = re.sub(
        r'\b(public|private|protected)?\s*(\w+)(nterface)\s+\2\b',
        lambda m: f"{m.group(1) + ' ' if m.group(1) else ''}interface {m.group(2)}",
        content
    )
    
    # Fix patterns like "public XEnumnum X" -> "public enum X"
    content = re.sub(
        r'\b(public|private|protected)?\s*(\w+)(num)\s+\2\b',
        lambda m: f"{m.group(1) + ' ' if m.group(1) else ''}enum {m.group(2)}",
        content
    )
    
    if content != original:
        with open(file_path, 'w', encoding='utf-8') as f:
            f.write(content)
        return True
    return False

if __name__ == '__main__':
    if len(sys.argv) > 1:
        files = [Path(f) for f in sys.argv[1:]]
    else:
        # Find all Java files
        root = Path('app/src/main/java')
        files = list(root.rglob('*.java'))
    
    fixed_count = 0
    for file_path in files:
        if file_path.exists() and fix_class_declarations(file_path):
            print(f"Fixed: {file_path}")
            fixed_count += 1
    
    print(f"\nTotal files fixed: {fixed_count}")
