#!/usr/bin/env python3
"""
Reorganize the app directory structure:
1. Analyze current state (packages, dependencies, structure)
2. Propose reorganization plan
3. Execute restructuring (move files to match packages OR update package declarations)
"""

import os
import re
import json
from pathlib import Path
from collections import defaultdict

def analyze_current_structure():
    """Analyze the current app directory structure"""
    base_dir = '/home/rewrich/Documents/GitHub/tustu/app'
    
    analysis = {
        'packages': defaultdict(list),
        'mismatches': [],
        'dependencies': defaultdict(set),
        'total_files': 0
    }
    
    print("Analyzing current structure...")
    
    for root, dirs, files in os.walk(base_dir):
        for file in files:
            if not file.endswith('.java'):
                continue
                
            filepath = os.path.join(root, file)
            rel_path = os.path.relpath(filepath, base_dir)
            analysis['total_files'] += 1
            
            try:
                with open(filepath, 'r', encoding='utf-8', errors='ignore') as f:
                    content = f.read()
                
                # Extract package declaration
                pkg_match = re.search(r'package\s+([\w.]+);', content)
                if pkg_match:
                    declared_pkg = pkg_match.group(1)
                    analysis['packages'][declared_pkg].append(rel_path)
                    
                    # Check if location matches package
                    dir_path = os.path.dirname(rel_path)
                    if dir_path.startswith('obfuscated_packages/'):
                        # Remove obfuscated_packages prefix
                        expected_pkg = dir_path.replace('obfuscated_packages/', '').replace(os.sep, '.')
                    else:
                        expected_pkg = dir_path.replace(os.sep, '.')
                    
                    if declared_pkg != expected_pkg and expected_pkg != '.':
                        analysis['mismatches'].append({
                            'file': rel_path,
                            'declared': declared_pkg,
                            'location': expected_pkg
                        })
                
                # Extract imports to map dependencies
                imports = re.findall(r'import\s+([\w.]+);', content)
                if pkg_match:
                    for imp in imports:
                        imp_pkg = '.'.join(imp.split('.')[:-1])  # Get package part
                        if imp_pkg:
                            analysis['dependencies'][declared_pkg].add(imp_pkg)
            except Exception as e:
                pass
    
    return analysis

def propose_reorganization(analysis):
    """Propose a reorganization strategy"""
    print(f"\n{'='*70}")
    print("CURRENT STATE ANALYSIS")
    print(f"{'='*70}")
    print(f"Total Java files: {analysis['total_files']}")
    print(f"Unique packages: {len(analysis['packages'])}")
    print(f"Package/location mismatches: {len(analysis['mismatches'])}")
    
    # Categorize packages
    obfuscated_pkgs = [p for p in analysis['packages'].keys() if len(p) <= 2 and p.isalpha()]
    proper_pkgs = [p for p in analysis['packages'].keys() if p.startswith('com.') or p.startswith('org.')]
    other_pkgs = [p for p in analysis['packages'].keys() if p not in obfuscated_pkgs and p not in proper_pkgs]
    
    print(f"\nPackage breakdown:")
    print(f"  Obfuscated packages (1-2 letters): {len(obfuscated_pkgs)}")
    print(f"  Proper packages (com.*, org.*): {len(proper_pkgs)}")
    print(f"  Other packages: {len(other_pkgs)}")
    
    print(f"\n{'='*70}")
    print("REORGANIZATION OPTIONS")
    print(f"{'='*70}")
    
    print("\nOption 1: MOVE FILES (Fast, preserves package names)")
    print("  - Move files from obfuscated_packages/* to app/* to match package declarations")
    print("  - Pros: No source code changes needed")
    print("  - Cons: Obfuscated packages (A, B, C, etc.) remain at root level")
    print(f"  - Files affected: {len(analysis['mismatches'])}")
    
    print("\nOption 2: RENAME PACKAGES (Clean, better organization)")
    print("  - Update all package declarations to include 'obfuscated_packages.' prefix")
    print("  - Update all imports accordingly")
    print("  - Pros: All obfuscated code stays in obfuscated_packages/ subdirectory")
    print("  - Cons: Requires modifying source code")
    print(f"  - Files affected: {len(analysis['mismatches'])} + all importers")
    
    print("\nOption 3: HYBRID (Recommended)")
    print("  - Keep proper packages (com.*, org.*) where they are")
    print("  - Rename obfuscated packages to meaningful names")
    print("  - Group related obfuscated packages into logical modules")
    print("  - Example: A → com.efiAnalytics.core.ui")
    print("  - Pros: Clean structure, no short package names")
    print("  - Cons: Most work, but best long-term solution")
    
    return {
        'obfuscated_pkgs': obfuscated_pkgs,
        'proper_pkgs': proper_pkgs,
        'other_pkgs': other_pkgs
    }

def execute_option1():
    """Option 1: Move files to match their package declarations"""
    base_dir = '/home/rewrich/Documents/GitHub/tustu/app'
    
    print(f"\n{'='*70}")
    print("EXECUTING OPTION 1: Move files to match package declarations")
    print(f"{'='*70}\n")
    
    moves = []
    
    # Find all files that need to be moved
    for root, dirs, files in os.walk(os.path.join(base_dir, 'obfuscated_packages')):
        for file in files:
            if not file.endswith('.java'):
                continue
            
            filepath = os.path.join(root, file)
            
            try:
                with open(filepath, 'r', encoding='utf-8', errors='ignore') as f:
                    content = f.read()
                
                # Extract package declaration
                pkg_match = re.search(r'package\s+([\w.]+);', content)
                if pkg_match:
                    declared_pkg = pkg_match.group(1)
                    
                    # Calculate target path based on package
                    target_dir = os.path.join(base_dir, declared_pkg.replace('.', os.sep))
                    target_path = os.path.join(target_dir, file)
                    
                    if filepath != target_path:
                        moves.append({
                            'from': filepath,
                            'to': target_path,
                            'package': declared_pkg
                        })
            except Exception as e:
                print(f"Error reading {filepath}: {e}")
    
    print(f"Found {len(moves)} files to move")
    
    if not moves:
        print("No files need to be moved!")
        return
    
    print("\nSample moves:")
    for move in moves[:5]:
        print(f"  {os.path.relpath(move['from'], base_dir)}")
        print(f"    → {os.path.relpath(move['to'], base_dir)}")
    
    response = input(f"\nProceed with moving {len(moves)} files? (yes/no): ")
    if response.lower() != 'yes':
        print("Cancelled.")
        return
    
    # Execute moves
    moved_count = 0
    errors = []
    
    for move in moves:
        try:
            # Create target directory
            os.makedirs(os.path.dirname(move['to']), exist_ok=True)
            
            # Check if target exists
            if os.path.exists(move['to']):
                errors.append(f"Target already exists: {move['to']}")
                continue
            
            # Move file
            shutil.move(move['from'], move['to'])
            moved_count += 1
            
            if moved_count % 100 == 0:
                print(f"  Moved {moved_count} files...")
        
        except Exception as e:
            errors.append(f"Error moving {move['from']}: {e}")
    
    print(f"\n✅ Moved {moved_count} files")
    
    if errors:
        print(f"\n⚠️  {len(errors)} errors:")
        for err in errors[:10]:
            print(f"  {err}")
    
    # Clean up empty directories
    print("\nCleaning up empty directories...")
    removed_dirs = 0
    for root, dirs, files in os.walk(os.path.join(base_dir, 'obfuscated_packages'), topdown=False):
        if not files and not dirs:
            try:
                os.rmdir(root)
                removed_dirs += 1
            except:
                pass
    
    print(f"Removed {removed_dirs} empty directories")
    
    print(f"\n{'='*70}")
    print("MOVE COMPLETE!")
    print(f"{'='*70}")
    print(f"Files moved: {moved_count}")
    print(f"Errors: {len(errors)}")
    print("\nNext steps:")
    print("1. Try compiling: cd app && javac -d build/classes -sourcepath . TunerStudio.java")
    print("2. Review any compilation errors")
    print("3. Consider Option 3 for proper reorganization later")

def main():
    import sys
    
    if '--execute-option-1' in sys.argv or '--option-1' in sys.argv:
        execute_option1()
        return
    
    analysis = analyze_current_structure()
    categories = propose_reorganization(analysis)
    
    # Save analysis
    output = {
        'analysis': {
            'total_files': analysis['total_files'],
            'packages': {k: len(v) for k, v in analysis['packages'].items()},
            'mismatches': len(analysis['mismatches']),
            'obfuscated_packages': categories['obfuscated_pkgs'],
            'proper_packages': categories['proper_pkgs'],
            'other_packages': categories['other_pkgs']
        },
        'sample_mismatches': analysis['mismatches'][:20]
    }
    
    with open('/home/rewrich/Documents/GitHub/tustu/STRUCTURE_ANALYSIS.json', 'w') as f:
        json.dump(output, f, indent=2)
    
    print(f"\n{'='*70}")
    print("Analysis saved to: STRUCTURE_ANALYSIS.json")
    print(f"{'='*70}")
    print("\nNext steps:")
    print("1. Review the options above")
    print("2. Choose reorganization strategy")
    print("3. Run with --execute-option-N flag to proceed")

if __name__ == '__main__':
    main()
