#!/usr/bin/env python3
"""
Powerful Java error fixer using regex patterns and heuristics.
Handles decompilation artifacts and common syntax errors.
"""

import re
import sys
from pathlib import Path
from typing import List, Tuple

class JavaErrorFixer:
    def __init__(self):
        self.fixes_applied = []
    
    def fix_file(self, file_path: Path) -> bool:
        """Apply all fixes to a Java file."""
        try:
            with open(file_path, 'r', encoding='utf-8', errors='ignore') as f:
                original_content = f.read()
        except Exception as e:
            print(f"Error reading {file_path}: {e}")
            return False
        
        content = original_content
        file_fixes = []
        
        # Apply all fix methods
        content, fixes = self.fix_malformed_class_declarations(content)
        file_fixes.extend(fixes)
        
        content, fixes = self.fix_illegal_escape_sequences(content)
        file_fixes.extend(fixes)
        
        content, fixes = self.fix_invalid_constructors(content)
        file_fixes.extend(fixes)
        
        content, fixes = self.fix_reserved_keyword_variables(content)
        file_fixes.extend(fixes)
        
        content, fixes = self.fix_code_outside_class(content)
        file_fixes.extend(fixes)
        
        content, fixes = self.fix_invalid_method_declarations(content)
        file_fixes.extend(fixes)
        
        content, fixes = self.fix_missing_semicolons(content)
        file_fixes.extend(fixes)
        
        # Write if changed
        if content != original_content:
            try:
                with open(file_path, 'w', encoding='utf-8') as f:
                    f.write(content)
                self.fixes_applied.append((file_path, file_fixes))
                return True
            except Exception as e:
                print(f"Error writing {file_path}: {e}")
                return False
        return False
    
    def fix_malformed_class_declarations(self, content: str) -> Tuple[str, List[str]]:
        """Fix patterns like 'public XClasslass X' -> 'public class X'"""
        fixes = []
        
        # Pattern: public FileInXPackagelass FileInXPackage
        pattern = r'\b(public|private|protected|)\s*([A-Z]\w*)(lass|nterface|num)\s+\2\b'
        
        def replacer(match):
            modifier = match.group(1).strip()
            classname = match.group(2)
            type_suffix = match.group(3)
            
            if type_suffix == 'lass':
                type_word = 'class'
            elif type_suffix == 'nterface':
                type_word = 'interface'
            elif type_suffix == 'num':
                type_word = 'enum'
            else:
                return match.group(0)
            
            result = f"{modifier} {type_word} {classname}".strip()
            if modifier:
                result = f"{modifier} {type_word} {classname}"
            else:
                result = f"{type_word} {classname}"
            return result
        
        new_content = re.sub(pattern, replacer, content)
        if new_content != content:
            fixes.append('malformed_class_declarations')
        
        return new_content, fixes
    
    def fix_illegal_escape_sequences(self, content: str) -> Tuple[str, List[str]]:
        """Fix illegal escape sequences like \\I -> \\\\I"""
        fixes = []
        
        # Fix patterns like \I, \A, etc. in strings
        pattern = r'("(?:[^"\\]|\\.)*?)(\\)([A-Z])([^"]*?")'
        
        def replacer(match):
            return f"{match.group(1)}\\\\{match.group(3)}{match.group(4)}"
        
        new_content = re.sub(pattern, replacer, content)
        if new_content != content:
            fixes.append('illegal_escape_sequences')
        
        return new_content, fixes
    
    def fix_invalid_constructors(self, content: str) -> Tuple[str, List[str]]:
        """Fix constructors that don't match class name."""
        fixes = []
        
        # Extract class name
        class_match = re.search(r'\b(?:public|private|protected)?\s+class\s+(\w+)', content)
        if not class_match:
            return content, fixes
        
        classname = class_match.group(1)
        
        # Find potential constructor without return type on its own line
        # Pattern: "  dd(Type param) {" where dd is lowercase
        pattern = r'^(\s+)([a-z]{1,3})\(([^)]*)\)\s*\{'
        
        lines = content.split('\n')
        modified = False
        for i, line in enumerate(lines):
            match = re.match(pattern, line)
            if match:
                indent = match.group(1)
                old_name = match.group(2)
                params = match.group(3)
                # Replace with proper constructor
                lines[i] = f"{indent}public {classname}({params}) {{"
                modified = True
                fixes.append(f'invalid_constructor_{old_name}')
        
        if modified:
            content = '\n'.join(lines)
        
        return content, fixes
    
    def fix_reserved_keyword_variables(self, content: str) -> Tuple[str, List[str]]:
        """Fix use of reserved keywords as variable names."""
        fixes = []
        
        # Fix: for (String null : collection)
        pattern = r'\bfor\s*\(\s*(\w+)\s+(null|abstract|continue|new|switch|assert|default|goto|package|synchronized|boolean|do|if|private|this|break|double|implements|protected|throw|byte|else|import|public|throws|case|enum|instanceof|return|transient|catch|extends|int|short|try|char|final|interface|static|void|class|finally|long|strictfp|volatile|const|float|native|super|while)\s*:'
        
        def replacer(match):
            type_name = match.group(1)
            keyword = match.group(2)
            # Generate safe variable name
            var_name = f"{keyword}_var" if keyword != 'null' else 'item'
            return f"for ({type_name} {var_name} :"
        
        new_content = re.sub(pattern, replacer, content)
        if new_content != content:
            fixes.append('reserved_keyword_variables')
        
        return new_content, fixes
    
    def fix_code_outside_class(self, content: str) -> Tuple[str, List[str]]:
        """Detect and attempt to fix code appearing outside class body."""
        fixes = []
        
        # Look for pattern where there's an extra closing brace
        # followed by method-like code
        pattern = r'\n}\n\n(\s+(?:public|private|protected)?\s+(?:void|int|String|\w+)\s+\w+\([^)]*\)\s*\{)'
        
        # This is tricky - we need to remove one of the closing braces
        # For now, just detect and report
        if re.search(pattern, content):
            fixes.append('code_outside_class_detected')
        
        return content, fixes
    
    def fix_invalid_method_declarations(self, content: str) -> Tuple[str, List[str]]:
        """Fix method declarations missing return types."""
        fixes = []
        
        # Pattern: method on its own line with params but no return type
        # and it's not a constructor (lowercase name)
        pattern = r'^(\s+)([a-z][a-z_]*)\(([^)]*)\)\s*\{$'
        
        lines = content.split('\n')
        modified = False
        for i, line in enumerate(lines):
            match = re.match(pattern, line)
            if match and 'public' not in line and 'private' not in line and 'protected' not in line:
                indent = match.group(1)
                method_name = match.group(2)
                params = match.group(3)
                # Add void return type
                lines[i] = f"{indent}public void {method_name}({params}) {{"
                modified = True
                fixes.append(f'missing_return_type_{method_name}')
        
        if modified:
            content = '\n'.join(lines)
        
        return content, fixes
    
    def fix_missing_semicolons(self, content: str) -> Tuple[str, List[str]]:
        """Fix obvious missing semicolons."""
        fixes = []
        
        # This is hard to do reliably without a parser
        # Skip for now
        
        return content, fixes
    
    def print_summary(self):
        """Print summary of all fixes applied."""
        if not self.fixes_applied:
            print("\nNo fixes applied.")
            return
        
        print(f"\n{'='*60}")
        print(f"FIXED {len(self.fixes_applied)} FILES")
        print(f"{'='*60}")
        
        for file_path, fixes in self.fixes_applied:
            print(f"\n{file_path}:")
            for fix in set(fixes):
                count = fixes.count(fix)
                print(f"  ✓ {fix} ({count}x)")
        
        # Count by fix type
        all_fixes = {}
        for _, fixes in self.fixes_applied:
            for fix in fixes:
                all_fixes[fix] = all_fixes.get(fix, 0) + 1
        
        print(f"\n{'='*60}")
        print("TOTAL FIXES BY TYPE:")
        print(f"{'='*60}")
        for fix_type, count in sorted(all_fixes.items(), key=lambda x: x[1], reverse=True):
            print(f"  {fix_type}: {count}")


def main():
    if len(sys.argv) > 1:
        files = [Path(f) for f in sys.argv[1:] if Path(f).exists()]
    else:
        # Process all Java files
        root = Path('app/src/main/java')
        files = list(root.rglob('*.java'))
    
    print(f"Processing {len(files)} Java files...")
    
    fixer = JavaErrorFixer()
    fixed_count = 0
    
    for file_path in files:
        if fixer.fix_file(file_path):
            fixed_count += 1
            print(f".", end="", flush=True)
    
    print()  # New line after dots
    fixer.print_summary()
    
    return 0 if fixed_count > 0 else 1


if __name__ == '__main__':
    sys.exit(main())
