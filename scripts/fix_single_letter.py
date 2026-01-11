#!/usr/bin/env python3
"""
Fix single-letter constructor names to match class names.
"""
import re
from pathlib import Path

# Map of files that need fixing
files_to_fix = {
    "/home/rewrich/Documents/GitHub/tustu/app/src/main/java/com/efiAnalytics/apps/ts/tuningViews/TuningViewPanel.java": "TuningViewPanel",
    "/home/rewrich/Documents/GitHub/tustu/app/src/main/java/com/efiAnalytics/apps/ts/tuningViews/TuningViewWindow.java": "TuningViewWindow",
    "/home/rewrich/Documents/GitHub/tustu/app/src/main/java/com/efiAnalytics/tunerStudio/panels/ProtocolStatsPanel.java": "ProtocolStatsPanel",
    "/home/rewrich/Documents/GitHub/tustu/app/src/main/java/com/efiAnalytics/tunerStudio/panels/RealTimeDisplayPanel.java": "RealTimeDisplayPanel",
    "/home/rewrich/Documents/GitHub/tustu/app/src/main/java/com/efiAnalytics/tunerStudio/panels/CalibrationTablePanel.java": "CalibrationTablePanel",
    "/home/rewrich/Documents/GitHub/tustu/app/src/main/java/com/efiAnalytics/tunerStudio/search/SearchResultItemPanel.java": "SearchResultItemPanel",
    "/home/rewrich/Documents/GitHub/tustu/app/src/main/java/com/efiAnalytics/tunerStudio/search/SearchResultItemMouseAdapter.java": "SearchResultItemMouseAdapter",
    "/home/rewrich/Documents/GitHub/tustu/app/src/main/java/com/efiAnalytics/tuningwidgets/panels/ProfileDatalogFieldsPanel.java": "ProfileDatalogFieldsPanel",
}

def fix_single_letter_constructors(filepath, classname):
    """Fix single-letter constructors in a file."""
    path = Path(filepath)
    if not path.exists():
        print(f"SKIP: {filepath}")
        return False
    
    try:
        with open(path, 'r', encoding='utf-8', errors='ignore') as f:
            content = f.read()
        
        original = content
        
        # Pattern: public X( where X is a single uppercase letter
        pattern = r'(\s+)(public\s+|private\s+|protected\s+|)([A-Z])\s*\('
        
        def replacer(match):
            indent = match.group(1)
            modifier = match.group(2)
            letter = match.group(3)
            
            # Replace with class name
            return f'{indent}{modifier}{classname}('
        
        content = re.sub(pattern, replacer, content)
        
        if content != original:
            with open(path, 'w', encoding='utf-8') as f:
                f.write(content)
            print(f"FIXED: {classname}")
            return True
        else:
            print(f"UNCHANGED: {classname}")
            return False
            
    except Exception as e:
        print(f"ERROR: {filepath} - {e}")
        return False

# Fix all files
fixed = 0
for filepath, classname in files_to_fix.items():
    if fix_single_letter_constructors(filepath, classname):
        fixed += 1

print(f"\nFixed {fixed} files with single-letter constructors")
