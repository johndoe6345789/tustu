#!/usr/bin/env python3
"""
Analyze all imports in Java files to map dependencies.
This will help us update imports when we rename obfuscated files.
"""

import os
import json
import re
from pathlib import Path

def extract_imports(filepath):
    """Extract all import statements from a Java file"""
    try:
        with open(filepath, 'r', encoding='utf-8', errors='ignore') as f:
            content = f.read()
        
        # Find all import statements
        imports = re.findall(r'import\s+([\w.]+);', content)
        return imports
    except Exception as e:
        return []

def analyze_all_imports(base_dir):
    """Analyze all imports across the codebase"""
    print("Analyzing imports across all Java files...")
    
    # Load the rename mapping
    with open('PACKAGE_MAPPING_SMART.json', 'r') as f:
        rename_mapping = json.load(f)
    
    # Build reverse mapping: old_path -> new_path
    old_to_new = {}
    for old_path, new_path in rename_mapping.items():
        old_to_new[old_path] = new_path
    
    # Build package.ClassName -> filepath mapping for obfuscated files
    obfuscated_class_map = {}
    obfuscated_simple_map = {}  # Just classname -> filepath for single-letter classes
    
    for old_path in rename_mapping.keys():
        # Extract package and class name from path
        parts = old_path.split('/')
        if 'obfuscated_packages' in parts:
            # Read file to get actual package declaration and class name
            try:
                full_path = os.path.join(base_dir, old_path)
                with open(full_path, 'r', encoding='utf-8', errors='ignore') as f:
                    content = f.read()
                
                # Extract package statement
                pkg_match = re.search(r'package\s+([\w.]+);', content)
                # Extract class name (could be obfuscated single letter)
                class_match = re.search(r'(?:public\s+)?(?:class|interface|enum)\s+(\w+)', content)
                
                if pkg_match and class_match:
                    full_package = pkg_match.group(1)
                    class_name = class_match.group(1)
                    qualified_name = f"{full_package}.{class_name}"
                    obfuscated_class_map[qualified_name] = {
                        'old_path': old_path,
                        'new_path': rename_mapping[old_path],
                        'package': full_package,
                        'old_classname': class_name
                    }
                    
                    # Also track by just classname for simple imports
                    if class_name not in obfuscated_simple_map:
                        obfuscated_simple_map[class_name] = []
                    obfuscated_simple_map[class_name].append(qualified_name)
            except Exception as e:
                pass
    
    # Now analyze imports in all Java files
    import_dependencies = {}
    files_to_update = {}
    
    java_files = list(Path(base_dir).rglob('*.java'))
    print(f"Scanning {len(java_files)} Java files for imports...")
    
    for idx, filepath in enumerate(java_files):
        if idx % 500 == 0 and idx > 0:
            print(f"  Processed {idx} files...")
        
        rel_path = str(filepath.relative_to(base_dir))
        imports = extract_imports(filepath)
        
        if not imports:
            continue
        
        # Check which imports reference obfuscated files
        obfuscated_imports = []
        for imp in imports:
            # Check fully qualified import
            if imp in obfuscated_class_map:
                obfuscated_imports.append({
                    'import_statement': imp,
                    'old_path': obfuscated_class_map[imp]['old_path'],
                    'new_path': obfuscated_class_map[imp]['new_path'],
                    'old_package': obfuscated_class_map[imp]['package'],
                    'old_classname': obfuscated_class_map[imp]['old_classname']
                })
            else:
                # Check if just the classname matches (last part of import)
                class_part = imp.split('.')[-1]
                if class_part in obfuscated_simple_map:
                    # Multiple matches possible, include all
                    for qualified in obfuscated_simple_map[class_part]:
                        if imp == qualified:  # Exact match
                            obfuscated_imports.append({
                                'import_statement': imp,
                                'old_path': obfuscated_class_map[qualified]['old_path'],
                                'new_path': obfuscated_class_map[qualified]['new_path'],
                                'old_package': obfuscated_class_map[qualified]['package'],
                                'old_classname': obfuscated_class_map[qualified]['old_classname']
                            })
        
        if obfuscated_imports:
            import_dependencies[rel_path] = {
                'all_imports': imports,
                'obfuscated_imports': obfuscated_imports
            }
            files_to_update[rel_path] = obfuscated_imports
    
    # Generate the comprehensive mapping
    result = {
        'rename_mapping': rename_mapping,
        'obfuscated_class_map': obfuscated_class_map,
        'import_dependencies': import_dependencies,
        'files_to_update': files_to_update,
        'statistics': {
            'total_files': len(rename_mapping),
            'obfuscated_classes_tracked': len(obfuscated_class_map),
            'files_with_imports': len(import_dependencies),
            'files_needing_updates': len(files_to_update)
        }
    }
    
    return result

def main():
    base_dir = '/home/rewrich/Documents/GitHub/tustu'
    
    result = analyze_all_imports(base_dir)
    
    # Save the comprehensive mapping
    output_file = 'COMPLETE_RENAME_MAPPING.json'
    with open(output_file, 'w') as f:
        json.dump(result, f, indent=2)
    
    print("\n" + "="*60)
    print(f"Complete mapping saved to: {output_file}")
    print("="*60)
    print(f"Total files to rename:          {result['statistics']['total_files']}")
    print(f"Obfuscated classes tracked:     {result['statistics']['obfuscated_classes_tracked']}")
    print(f"Files with imports:             {result['statistics']['files_with_imports']}")
    print(f"Files needing import updates:   {result['statistics']['files_needing_updates']}")
    
    if result['statistics']['files_needing_updates'] > 0:
        print(f"\n⚠️  {result['statistics']['files_needing_updates']} files have imports that need updating")
        print("Sample files that need import updates:")
        for filepath in list(result['files_to_update'].keys())[:5]:
            print(f"  - {filepath}")
    
    print("\nReady for batch rename and import updates!")

if __name__ == '__main__':
    main()
