#!/usr/bin/env python3
"""
Complete solution for renaming obfuscated Java files:
1. Generate smart semantic names (no single letters, no numbers, no keywords)
2. Analyze all import dependencies
3. Execute batch rename with import updates
"""

import os
import json
import re
import shutil
from pathlib import Path
from collections import defaultdict

# ============================================================================
# PART 1: SEMANTIC NAME GENERATION
# ============================================================================

def extract_class_info(filepath, content):
    """Extract comprehensive information about a Java class"""
    info = {
        'filepath': filepath,
        'class_name': None,
        'is_interface': False,
        'is_enum': False,
        'is_abstract': False,
        'extends': None,
        'implements': [],
        'key_methods': [],
        'field_types': [],
        'field_names': [],
        'imported_classes': [],
        'instantiated_classes': [],
        'param_types': [],
        'return_types': [],
        'string_literals': [],
        'description': None,
        'specific_name': None
    }
    
    # Extract class/interface/enum name
    class_match = re.search(r'(?:public\s+)?(?:abstract\s+)?(?:final\s+)?(class|interface|enum)\s+(\w+)', content)
    if class_match:
        info['class_name'] = class_match.group(2)
        info['is_interface'] = class_match.group(1) == 'interface'
        info['is_enum'] = class_match.group(1) == 'enum'
    
    info['is_abstract'] = 'abstract class' in content
    
    # Extract extends and implements
    extends_match = re.search(r'extends\s+([\w.]+)', content)
    if extends_match:
        info['extends'] = extends_match.group(1).split('.')[-1]
    
    implements_matches = re.findall(r'implements\s+([\w.,\s]+)', content)
    for impl_str in implements_matches:
        interfaces = [i.strip() for i in impl_str.split(',')]
        info['implements'].extend(interfaces)
    
    # Extract method names
    methods = re.findall(r'(?:public|private|protected)\s+(?:static\s+)?(?:\w+\s+)?(\w+)\s*\(', content)
    info['key_methods'] = [m for m in methods if len(m) > 2 and m not in ['get', 'set', 'is']][:15]
    
    # Extract field types and names
    fields = re.findall(r'(?:private|protected|public)\s+(?:static\s+)?(?:final\s+)?(\w+)\s+(\w+)\s*[;=]', content)
    java_primitives_and_keywords = ['int', 'long', 'boolean', 'double', 'float', 'String', 'List', 'Map', 'Object',
                                     'char', 'byte', 'short', 'void', 'class', 'interface', 'extends', 'implements']
    info['field_types'] = [f[0] for f in fields if len(f[0]) > 2 and f[0] not in java_primitives_and_keywords][:10]
    info['field_names'] = [f[1] for f in fields if len(f[1]) > 2][:10]
    
    # Extract imports
    imports = re.findall(r'import\s+[\w.]+\.(\w+);', content)
    info['imported_classes'] = [i for i in imports if len(i) > 2 and not any(c.isdigit() for c in i)][:15]
    
    # Extract instantiations
    instantiations = re.findall(r'new\s+(\w+)\s*\(', content)
    info['instantiated_classes'] = [i for i in instantiations 
                                    if len(i) > 2 
                                    and i not in java_primitives_and_keywords
                                    and not any(c.isdigit() for c in i)][:15]
    
    # Extract parameter types
    method_params = re.findall(r'\w+\s+\w+\s*\(([^)]*)\)', content)
    param_types = []
    for params in method_params:
        if params.strip():
            types = re.findall(r'(\w+)\s+\w+', params)
            param_types.extend([t for t in types if len(t) > 2 and t not in java_primitives_and_keywords])
    info['param_types'] = list(set(param_types))[:10]
    
    # Extract return types
    return_types = re.findall(r'(?:public|private|protected)\s+(?:static\s+)?(\w+)\s+\w+\s*\(', content)
    info['return_types'] = [r for r in return_types if len(r) > 2 and r not in java_primitives_and_keywords][:10]
    
    # Technology flags
    info['uses_thread'] = 'Thread' in content or 'Runnable' in content
    info['uses_io'] = 'InputStream' in content or 'OutputStream' in content
    info['uses_network'] = 'Socket' in content or 'URL' in content
    info['uses_swing'] = 'JFrame' in content or 'JPanel' in content or 'JButton' in content
    info['uses_collection'] = 'List' in content or 'Map' in content
    info['uses_serialization'] = 'Serializable' in content
    
    # Try to infer specific listener name
    specific_name = None
    for impl in info['implements']:
        if 'Listener' in impl:
            specific_name = impl.split('.')[-1]
            break
    info['specific_name'] = specific_name
    
    # Generate description
    desc_parts = []
    if info['is_interface']:
        desc_parts.append('Interface')
    elif info['is_enum']:
        desc_parts.append('Enum')
    elif info['is_abstract']:
        desc_parts.append('Abstract')
    
    if any(m in ['getInstance', 'create'] for m in info['key_methods']):
        desc_parts.append('Factory')
    elif any('Listener' in i for i in info['implements']):
        desc_parts.append('Listener')
    elif 'Exception' in str(info['extends']):
        desc_parts.append('Exception')
    elif len(info['key_methods']) >= 4:
        desc_parts.append('Manager')
    
    info['description'] = ''.join(desc_parts) if desc_parts else None
    
    return info

def generate_creative_name(class_info, pkg_name, fallback_letter, used_names):
    """Generate unique semantic filename"""
    
    def build_contextual_name(base_name):
        """Add context to base name"""
        number_words = {'0': 'Zero', '1': 'One', '2': 'Two', '3': 'Three', '4': 'Four',
                       '5': 'Five', '6': 'Six', '7': 'Seven', '8': 'Eight', '9': 'Nine'}
        sanitized_base = base_name
        for digit, word in number_words.items():
            sanitized_base = sanitized_base.replace(digit, word)
        
        java_keywords = ['boolean', 'int', 'long', 'double', 'float', 'char', 'byte', 'short', 
                        'void', 'class', 'interface', 'Interface']
        if sanitized_base.lower() in java_keywords:
            sanitized_base = f"{sanitized_base}Type"
        
        if sanitized_base + ".java" not in used_names:
            return sanitized_base + ".java"
        
        # Add field type context
        if class_info.get('field_types'):
            for ft in class_info['field_types'][:5]:
                if len(ft) > 2 and ft.lower() not in base_name.lower():
                    for digit, word in number_words.items():
                        ft = ft.replace(digit, word)
                    name = f"{sanitized_base}Using{ft}"
                    if name + ".java" not in used_names:
                        return name + ".java"
        
        # Add method context
        if class_info.get('key_methods'):
            for method in class_info['key_methods'][:10]:
                if len(method) > 3 and method.lower() not in base_name.lower():
                    name = f"{sanitized_base}{method.capitalize()}"
                    if name + ".java" not in used_names:
                        return name + ".java"
        
        # Add package context
        pkg_clean = pkg_name.replace('_', '').capitalize()
        name = f"{sanitized_base}In{pkg_clean}Package"
        if name + ".java" not in used_names:
            return name + ".java"
        
        return None
    
    # Strategy 1: Specific inferred name
    if class_info.get('specific_name') and len(class_info['specific_name']) > 2:
        result = build_contextual_name(class_info['specific_name'])
        if result:
            return result
    
    # Strategy 2: Actual class name
    if class_info['class_name'] and len(class_info['class_name']) > 2:
        java_keywords = ['boolean', 'int', 'long', 'double', 'float', 'char', 'byte', 'short', 
                        'void', 'class', 'interface', 'extends', 'implements']
        if class_info['class_name'].lower() not in java_keywords:
            result = build_contextual_name(class_info['class_name'])
            if result:
                return result
    
    # Strategy 3: Description
    if class_info['description']:
        java_keywords = ['boolean', 'int', 'long', 'double', 'float', 'char', 'byte', 'short', 
                        'void', 'class', 'interface', 'Interface']
        if class_info['description'].lower() not in java_keywords:
            result = build_contextual_name(class_info['description'])
            if result:
                return result
    
    # Strategy 4: Extends
    if class_info.get('extends') and len(class_info['extends']) > 2:
        result = build_contextual_name(f"{class_info['extends']}Extension")
        if result:
            return result
    
    # Strategy 5: Implements
    if class_info.get('implements'):
        for impl in class_info['implements']:
            impl_name = impl.split('.')[-1]
            if len(impl_name) > 2:
                result = build_contextual_name(f"{impl_name}Impl")
                if result:
                    return result
    
    # Strategy 6: Technology + field type + method
    name_parts = []
    if class_info.get('uses_network'):
        name_parts.append('Network')
    elif class_info.get('uses_io'):
        name_parts.append('IO')
    elif class_info.get('uses_thread'):
        name_parts.append('Threaded')
    elif class_info.get('uses_swing'):
        name_parts.append('UI')
    
    if class_info.get('field_types'):
        ft = class_info['field_types'][0]
        if len(ft) > 2:
            name_parts.append(ft)
    
    if class_info.get('key_methods'):
        for method in class_info['key_methods'][:5]:
            if len(method) > 3 and not method.startswith('get') and not method.startswith('set'):
                name_parts.append(method.capitalize())
                break
    
    if len(name_parts) > 0:
        result = build_contextual_name(''.join(name_parts))
        if result:
            return result
    
    # Phonetic alphabet fallback
    phonetic = {'a': 'Alpha', 'b': 'Bravo', 'c': 'Charlie', 'd': 'Delta', 'e': 'Echo',
                'f': 'Foxtrot', 'g': 'Golf', 'h': 'Hotel', 'i': 'India', 'j': 'Juliet',
                'k': 'Kilo', 'l': 'Lima', 'm': 'Mike', 'n': 'November', 'o': 'Oscar',
                'p': 'Papa', 'q': 'Quebec', 'r': 'Romeo', 's': 'Sierra', 't': 'Tango',
                'u': 'Uniform', 'v': 'Victor', 'w': 'Whiskey', 'x': 'Xray', 'y': 'Yankee', 'z': 'Zulu'}
    
    pkg_clean = pkg_name.replace('_', '').capitalize()
    phonetic_name = phonetic.get(fallback_letter.lower(), fallback_letter.capitalize())
    
    candidates = [
        f"{pkg_clean}Interface{phonetic_name}",
        f"{pkg_clean}Component{phonetic_name}",
        f"{pkg_clean}{phonetic_name}Impl"
    ]
    
    for candidate in candidates:
        if candidate + ".java" not in used_names:
            return candidate + ".java"
    
    return f"{pkg_clean}{phonetic_name}Variant.java"

def generate_smart_mapping(base_dir):
    """Generate semantic mapping for all obfuscated files"""
    print("Generating smart semantic mapping...")
    
    mapping = {}
    global_used_names = set()
    stats = {'class_names': 0, 'descriptions': 0, 'fallbacks': 0}
    
    obfuscated_dir = os.path.join(base_dir, 'app', 'obfuscated_packages')
    
    for pkg_dir in sorted(os.listdir(obfuscated_dir)):
        pkg_path = os.path.join(obfuscated_dir, pkg_dir)
        if not os.path.isdir(pkg_path):
            continue
        
        java_files = [f for f in os.listdir(pkg_path) if f.endswith('.java')]
        
        for java_file in sorted(java_files):
            filepath = os.path.join(pkg_path, java_file)
            rel_path = os.path.relpath(filepath, base_dir)
            
            # Skip if filename is already long (likely already renamed)
            filename_without_ext = java_file.replace('.java', '')
            if len(filename_without_ext) > 2:
                continue
            
            try:
                with open(filepath, 'r', encoding='utf-8', errors='ignore') as f:
                    content = f.read()
                
                class_info = extract_class_info(rel_path, content)
                
                old_name = java_file.replace('.java', '')
                new_name = generate_creative_name(class_info, pkg_dir, old_name, global_used_names)
                
                global_used_names.add(new_name)
                
                new_rel_path = os.path.join('app', 'obfuscated_packages', pkg_dir, new_name)
                mapping[rel_path] = new_rel_path
                
                if class_info.get('specific_name') or (class_info['class_name'] and len(class_info['class_name']) > 2):
                    stats['class_names'] += 1
                elif class_info.get('description'):
                    stats['descriptions'] += 1
                else:
                    stats['fallbacks'] += 1
                    
            except Exception as e:
                print(f"Error processing {rel_path}: {e}")
    
    print(f"\n✅ Generated {len(mapping)} semantic names")
    print(f"   Class names: {stats['class_names']}")
    print(f"   Descriptions: {stats['descriptions']}")
    print(f"   Fallbacks: {stats['fallbacks']}")
    
    return mapping

# ============================================================================
# PART 2: IMPORT DEPENDENCY ANALYSIS
# ============================================================================

def analyze_imports(base_dir, rename_mapping):
    """Analyze all imports to track dependencies"""
    print("\nAnalyzing import dependencies...")
    
    obfuscated_class_map = {}
    obfuscated_simple_map = {}
    
    for old_path in rename_mapping.keys():
        parts = old_path.split('/')
        if 'obfuscated_packages' in parts:
            try:
                full_path = os.path.join(base_dir, old_path)
                with open(full_path, 'r', encoding='utf-8', errors='ignore') as f:
                    content = f.read()
                
                pkg_match = re.search(r'package\s+([\w.]+);', content)
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
                    
                    if class_name not in obfuscated_simple_map:
                        obfuscated_simple_map[class_name] = []
                    obfuscated_simple_map[class_name].append(qualified_name)
            except:
                pass
    
    # Analyze imports in all files
    import_dependencies = {}
    files_to_update = {}
    
    java_files = list(Path(base_dir).rglob('*.java'))
    
    for filepath in java_files:
        rel_path = str(filepath.relative_to(base_dir))
        
        try:
            with open(filepath, 'r', encoding='utf-8', errors='ignore') as f:
                content = f.read()
            
            imports = re.findall(r'import\s+([\w.]+);', content)
            
            if not imports:
                continue
            
            obfuscated_imports = []
            for imp in imports:
                if imp in obfuscated_class_map:
                    obfuscated_imports.append({
                        'import_statement': imp,
                        'old_path': obfuscated_class_map[imp]['old_path'],
                        'new_path': obfuscated_class_map[imp]['new_path'],
                        'old_package': obfuscated_class_map[imp]['package'],
                        'old_classname': obfuscated_class_map[imp]['old_classname']
                    })
                else:
                    class_part = imp.split('.')[-1]
                    if class_part in obfuscated_simple_map:
                        for qualified in obfuscated_simple_map[class_part]:
                            if imp == qualified:
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
        except:
            pass
    
    print(f"✅ Found {len(obfuscated_class_map)} obfuscated classes")
    print(f"✅ Found {len(files_to_update)} files with imports to update")
    
    return {
        'obfuscated_class_map': obfuscated_class_map,
        'import_dependencies': import_dependencies,
        'files_to_update': files_to_update
    }

# ============================================================================
# PART 3: BATCH EXECUTION
# ============================================================================

def execute_rename(base_dir, mapping_file, force=False):
    """Execute the batch rename and import updates"""
    print(f"\nLoading mapping from {mapping_file}...")
    
    with open(mapping_file, 'r') as f:
        data = json.load(f)
    
    rename_mapping = data['rename_mapping']
    files_to_update = data['files_to_update']
    obfuscated_class_map = data['obfuscated_class_map']
    
    print(f"\n{'='*60}")
    print(f"Ready to rename {len(rename_mapping)} files")
    print(f"Ready to update imports in {len(files_to_update)} files")
    print(f"{'='*60}")
    
    if not force:
        print("\n⚠️  This will modify files in place!")
        print("Recommended: Create a git commit or backup first")
        
        response = input("\nProceed with rename? (yes/no): ")
        if response.lower() != 'yes':
            print("Cancelled.")
            return
    
    print("\n" + "="*60)
    print("STEP 1: Renaming files and updating class declarations")
    print("="*60)
    
    # Build reverse mapping: old_classname -> new_classname
    class_rename_map = {}
    for qualified_name, info in obfuscated_class_map.items():
        old_classname = info['old_classname']
        new_filename = info['new_path'].split('/')[-1].replace('.java', '')
        class_rename_map[qualified_name] = {
            'old_name': old_classname,
            'new_name': new_filename,
            'package': info['package']
        }
    
    # Rename files and update class declarations
    renamed_count = 0
    for old_path, new_path in rename_mapping.items():
        old_full = os.path.join(base_dir, old_path)
        new_full = os.path.join(base_dir, new_path)
        
        if not os.path.exists(old_full):
            print(f"⚠️  Skip (not found): {old_path}")
            continue
        
        try:
            # Read content
            with open(old_full, 'r', encoding='utf-8', errors='ignore') as f:
                content = f.read()
            
            # Extract package and old class name
            pkg_match = re.search(r'package\s+([\w.]+);', content)
            class_match = re.search(r'((?:public|private|protected)\s+)?(?:abstract\s+)?(class|interface|enum)\s+(\w+)', content)
            
            if pkg_match and class_match:
                package = pkg_match.group(1)
                old_classname = class_match.group(3)
                new_classname = new_path.split('/')[-1].replace('.java', '')
                
                # Update class declaration
                old_decl = class_match.group(0)
                new_decl = old_decl.replace(f' {old_classname}', f' {new_classname}')
                content = content.replace(old_decl, new_decl, 1)
                
                # Update constructor declarations (if it's a class)
                if 'class' in old_decl:
                    # Find constructor patterns: public ClassName(...)
                    constructor_pattern = rf'((?:public|private|protected)\s+){old_classname}(\s*\([^)]*\))'
                    content = re.sub(constructor_pattern, rf'\1{new_classname}\2', content)
            
            # Write to new location
            os.makedirs(os.path.dirname(new_full), exist_ok=True)
            with open(new_full, 'w', encoding='utf-8') as f:
                f.write(content)
            
            # Remove old file if different location
            if old_full != new_full:
                os.remove(old_full)
            
            renamed_count += 1
            if renamed_count % 100 == 0:
                print(f"  Renamed {renamed_count} files...")
        
        except Exception as e:
            print(f"❌ Error renaming {old_path}: {e}")
    
    print(f"✅ Renamed {renamed_count} files")
    
    print("\n" + "="*60)
    print("STEP 2: Updating import statements")
    print("="*60)
    
    # Update imports in all affected files
    updated_count = 0
    for file_path, imports_info in files_to_update.items():
        full_path = os.path.join(base_dir, file_path)
        
        if not os.path.exists(full_path):
            # Try the new path (if this file was renamed)
            if file_path in rename_mapping:
                full_path = os.path.join(base_dir, rename_mapping[file_path])
        
        if not os.path.exists(full_path):
            print(f"⚠️  Skip (not found): {file_path}")
            continue
        
        try:
            with open(full_path, 'r', encoding='utf-8', errors='ignore') as f:
                content = f.read()
            
            # Update each obfuscated import
            for imp_info in imports_info:
                old_import = imp_info['import_statement']
                old_package = imp_info['old_package']
                old_classname = imp_info['old_classname']
                new_filename = imp_info['new_path'].split('/')[-1].replace('.java', '')
                
                # Replace: import old.package.OldClass; -> import old.package.NewClass;
                old_import_stmt = f"import {old_import};"
                new_import_stmt = f"import {old_package}.{new_filename};"
                
                if old_import_stmt in content:
                    content = content.replace(old_import_stmt, new_import_stmt)
                    
                    # Also update any references to the old class name in this file
                    # (e.g., new OldClass() -> new NewClass())
                    # Use word boundaries to avoid partial matches
                    content = re.sub(rf'\b{old_classname}\b', new_filename, content)
            
            # Write updated content
            with open(full_path, 'w', encoding='utf-8') as f:
                f.write(content)
            
            updated_count += 1
            if updated_count % 100 == 0:
                print(f"  Updated {updated_count} files...")
        
        except Exception as e:
            print(f"❌ Error updating {file_path}: {e}")
    
    print(f"✅ Updated imports in {updated_count} files")
    
    print("\n" + "="*60)
    print("RENAME COMPLETE!")
    print("="*60)
    print(f"Files renamed: {renamed_count}")
    print(f"Imports updated: {updated_count}")
    print("\nRecommended next steps:")
    print("1. Test compile the project")
    print("2. Run any tests")
    print("3. Commit changes if successful")

# ============================================================================
# MAIN
# ============================================================================

def main():
    base_dir = '/home/rewrich/Documents/GitHub/tustu'
    output_file = 'COMPLETE_RENAME_MAPPING.json'
    
    print("="*60)
    print("OBFUSCATED JAVA FILE RENAMER")
    print("="*60)
    
    # Generate mapping
    rename_mapping = generate_smart_mapping(base_dir)
    
    # Analyze imports
    import_analysis = analyze_imports(base_dir, rename_mapping)
    
    # Combine into complete mapping
    complete_mapping = {
        'rename_mapping': rename_mapping,
        'obfuscated_class_map': import_analysis['obfuscated_class_map'],
        'import_dependencies': import_analysis['import_dependencies'],
        'files_to_update': import_analysis['files_to_update'],
        'statistics': {
            'total_files': len(rename_mapping),
            'obfuscated_classes': len(import_analysis['obfuscated_class_map']),
            'files_with_imports': len(import_analysis['import_dependencies']),
            'files_needing_updates': len(import_analysis['files_to_update'])
        }
    }
    
    # Save
    with open(output_file, 'w') as f:
        json.dump(complete_mapping, f, indent=2)
    
    print(f"\n{'='*60}")
    print(f"Complete mapping saved to: {output_file}")
    print(f"{'='*60}")
    print(f"Total files to rename:        {complete_mapping['statistics']['total_files']}")
    print(f"Obfuscated classes tracked:   {complete_mapping['statistics']['obfuscated_classes']}")
    print(f"Files needing import updates: {complete_mapping['statistics']['files_needing_updates']}")
    
    # Option to execute
    print(f"\n{'='*60}")
    print("To execute rename, run:")
    print(f"  python3 {__file__} --execute")
    print(f"{'='*60}")

if __name__ == '__main__':
    import sys
    if '--execute' in sys.argv:
        force = '--force' in sys.argv
        execute_rename('/home/rewrich/Documents/GitHub/tustu', 'COMPLETE_RENAME_MAPPING.json', force=force)
    else:
        main()
