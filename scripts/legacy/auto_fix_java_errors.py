#!/usr/bin/env python3
"""Automatically fix common Java decompilation errors."""

import re
import sys
from pathlib import Path

def fix_java_file(file_path):
    """Apply multiple fixes to a Java file."""
    with open(file_path, 'r', encoding='utf-8', errors='ignore') as f:
        content = f.read()
    
    original = content
    changes = []
    
    # 1. Fix illegal escape sequences like \I -> \\I
    def fix_escape(match):
        return match.group(1) + '\\\\' + match.group(2)
    
    before = content
    content = re.sub(r'(\\)([A-Z])', fix_escape, content)
    if content != before:
        changes.append("illegal escape sequences")
    
    # 2. Fix invalid method declarations (constructors without class match)
    # Pattern: methodName(Type param) where methodName starts with lowercase
    before = content
    lines = content.split('\n')
    for i, line in enumerate(lines):
        # Match lines like "  dd(dc paramdc) {}"
        match = re.match(r'^(\s+)([a-z][a-z])\(([^)]+)\)\s*\{', line)
        if match:
            indent, name, params = match.groups()
            lines[i] = f"{indent}public void {name}({params}) {{"
    content = '\n'.join(lines)
    if content != before:
        changes.append("invalid method declarations")
    
    # 3. Fix malformed class declarations
    before = content
    content = re.sub(
        r'\b(public|private|protected)?\s*(\w+)(lass)\s+\2\b',
        lambda m: f"{m.group(1) + ' ' if m.group(1) else ''}class {m.group(2)}",
        content
    )
    if content != before:
        changes.append("malformed class declarations")
    
    # 4. Fix malformed interface declarations
    before = content
    content = re.sub(
        r'\b(public|private|protected)?\s*(\w+)(nterface)\s+\2\b',
        lambda m: f"{m.group(1) + ' ' if m.group(1) else ''}interface {m.group(2)}",
        content
    )
    if content != before:
        changes.append("malformed interface declarations")
    
    # 5. Fix malformed enum declarations
    before = content
    content = re.sub(
        r'\b(public|private|protected)?\s*(\w+)(num)\s+\2\b',
        lambda m: f"{m.group(1) + ' ' if m.group(1) else ''}enum {m.group(2)}",
        content
    )
    if content != before:
        changes.append("malformed enum declarations")
    
    if content != original:
        with open(file_path, 'w', encoding='utf-8') as f:
            f.write(content)
        return changes
    return []

if __name__ == '__main__':
    if len(sys.argv) > 1:
        files = [Path(f) for f in sys.argv[1:]]
    else:
        # Find all Java files
        root = Path('app/src/main/java')
        files = list(root.rglob('*.java'))
    
    fixed_files = 0
    total_changes = {}
    
    for file_path in files:
        if file_path.exists():
            changes = fix_java_file(file_path)
            if changes:
                print(f"Fixed {file_path}: {', '.join(changes)}")
                fixed_files += 1
                for change in changes:
                    total_changes[change] = total_changes.get(change, 0) + 1
    
    print(f"\nTotal files fixed: {fixed_files}")
    print("Changes made:")
    for change, count in sorted(total_changes.items()):
        print(f"  - {change}: {count} files")
