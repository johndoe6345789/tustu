#!/usr/bin/env python3
"""
Rename obfuscated Java package folders to meaningful names.
This script uses the PACKAGE_MAPPING.json to determine proper package names.
"""

import json
import os
import shutil
from pathlib import Path
from collections import defaultdict

def load_package_mapping():
    """Load the package mapping from JSON file."""
    script_dir = Path(__file__).parent
    mapping_file = script_dir / "data" / "PACKAGE_MAPPING.json"
    
    with open(mapping_file, 'r') as f:
        return json.load(f)

def extract_folder_mappings(package_mapping):
    """
    Extract unique folder renames from the package mapping.
    Returns a dict of {old_folder: new_folder}
    """
    folder_mapping = {}
    
    for old_path, new_path in package_mapping.items():
        # Extract folder parts
        old_parts = Path(old_path).parts
        new_parts = Path(new_path).parts
        
        # Find the obfuscated folder name (single letter or two letter combos)
        for i, part in enumerate(old_parts):
            if part in ['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'] or \
               (len(part) == 2 and part[0] in 'ab' and part[1] in 'ABCDEFGHIJKLMNOPQRSTUVWXYZ') or \
               (len(part) == 2 and part[0] in 'ab' and part[1] in 'abcdefghijklmnopqrstuvwxyz'):
                # This is likely an obfuscated package folder
                if i < len(new_parts):
                    folder_mapping[part] = new_parts[i]
    
    return folder_mapping

def get_consistent_folder_name(folder_mappings, obfuscated_name):
    """
    Get the most common new name for an obfuscated folder.
    """
    if obfuscated_name in folder_mappings:
        # Count occurrences
        counts = defaultdict(int)
        for new_name in folder_mappings[obfuscated_name]:
            counts[new_name] += 1
        
        # Return most common
        return max(counts.items(), key=lambda x: x[1])[0]
    return None

def build_folder_rename_map(package_mapping):
    """Build a consolidated map of folder renames."""
    temp_map = defaultdict(list)
    
    for old_path, new_path in package_mapping.items():
        old_parts = Path(old_path).parts
        new_parts = Path(new_path).parts
        
        # Look for package folder mappings (after app/obfuscated_packages/)
        try:
            if 'obfuscated_packages' in old_parts:
                idx = list(old_parts).index('obfuscated_packages')
                if idx + 1 < len(old_parts) and idx + 1 < len(new_parts):
                    old_pkg = old_parts[idx + 1]
                    new_pkg = new_parts[idx + 1]
                    if old_pkg != new_pkg:
                        temp_map[old_pkg].append(new_pkg)
        except (ValueError, IndexError):
            continue
    
    # Build final map with most common mapping
    final_map = {}
    for old_name, new_names in temp_map.items():
        # Get most common
        counts = defaultdict(int)
        for name in new_names:
            counts[name] += 1
        final_map[old_name] = max(counts.items(), key=lambda x: x[1])[0]
    
    return final_map

def rename_folders(java_root, folder_map, dry_run=True):
    """Rename folders in the java root directory."""
    java_path = Path(java_root)
    
    if not java_path.exists():
        print(f"Error: Java root path does not exist: {java_path}")
        return
    
    print(f"\n{'DRY RUN - ' if dry_run else ''}Renaming folders in: {java_path}\n")
    print(f"Total mappings found: {len(folder_map)}\n")
    
    renamed_count = 0
    skipped_count = 0
    
    # Sort by folder name for consistent output
    for old_name in sorted(folder_map.keys()):
        new_name = folder_map[old_name]
        old_path = java_path / old_name
        new_path = java_path / new_name
        
        if old_path.exists() and old_path.is_dir():
            if new_path.exists():
                print(f"⚠️  SKIP: {old_name} -> {new_name} (target already exists)")
                skipped_count += 1
            else:
                print(f"✓ {'Would rename' if dry_run else 'Renaming'}: {old_name} -> {new_name}")
                if not dry_run:
                    old_path.rename(new_path)
                renamed_count += 1
        elif not old_path.exists():
            print(f"⚠️  SKIP: {old_name} (does not exist)")
            skipped_count += 1
    
    print(f"\n{'Would rename' if dry_run else 'Renamed'}: {renamed_count} folders")
    print(f"Skipped: {skipped_count} folders")
    
    if dry_run:
        print("\n⚠️  This was a DRY RUN. No changes were made.")
        print("Run with --execute to actually rename folders.")

def main():
    import argparse
    
    parser = argparse.ArgumentParser(description='Rename obfuscated Java package folders')
    parser.add_argument('--execute', action='store_true', 
                       help='Actually perform the renames (default is dry-run)')
    parser.add_argument('--java-root', type=str,
                       default='../app/src/main/java',
                       help='Path to Java source root (default: ../app/src/main/java)')
    
    args = parser.parse_args()
    
    # Load mappings
    print("Loading package mappings...")
    package_mapping = load_package_mapping()
    print(f"Loaded {len(package_mapping)} file mappings")
    
    # Build folder rename map
    print("Building folder rename map...")
    folder_map = build_folder_rename_map(package_mapping)
    
    # Resolve java root path
    script_dir = Path(__file__).parent
    java_root = (script_dir / args.java_root).resolve()
    
    # Perform renames
    rename_folders(java_root, folder_map, dry_run=not args.execute)

if __name__ == '__main__':
    main()
