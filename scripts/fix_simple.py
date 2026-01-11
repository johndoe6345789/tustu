#!/usr/bin/env python3
"""
Simple constructor fixer - reads file list and fixes lowercase constructors.
"""
import re
from pathlib import Path

# Files with constructor errors
files = """
/home/rewrich/Documents/GitHub/tustu/app/src/main/java/com/efiAnalytics/ui/ArrowButton.java
/home/rewrich/Documents/GitHub/tustu/app/src/main/java/com/efiAnalytics/ui/ChartDataPoint.java
/home/rewrich/Documents/GitHub/tustu/app/src/main/java/com/efiAnalytics/ui/CurveDataPoint.java
/home/rewrich/Documents/GitHub/tustu/app/src/main/java/com/efiAnalytics/ui/DataGapRange.java
/home/rewrich/Documents/GitHub/tustu/app/src/main/java/com/efiAnalytics/ui/FloatPolygon.java
/home/rewrich/Documents/GitHub/tustu/app/src/main/java/com/efiAnalytics/ui/CustomGridLayout.java
/home/rewrich/Documents/GitHub/tustu/app/src/main/java/com/efiAnalytics/ui/TableSizeSelectorCell.java
/home/rewrich/Documents/GitHub/tustu/app/src/main/java/com/efiAnalytics/ui/TableStatisticsData.java
/home/rewrich/Documents/GitHub/tustu/app/src/main/java/com/efiAnalytics/ui/TableStatisticsOverlay.java
/home/rewrich/Documents/GitHub/tustu/app/src/main/java/com/efiAnalytics/ui/PagedNavigationPanel.java
/home/rewrich/Documents/GitHub/tustu/app/src/main/java/com/efiAnalytics/ui/RowHeaderCellRenderer.java
/home/rewrich/Documents/GitHub/tustu/app/src/main/java/com/efiAnalytics/ui/FileSelectorListModel.java
/home/rewrich/Documents/GitHub/tustu/app/src/main/java/com/efiAnalytics/ui/ThreeDimensionalViewPanel.java
/home/rewrich/Documents/GitHub/tustu/app/src/main/java/com/efiAnalytics/ui/Table3DColorMapPanel.java
/home/rewrich/Documents/GitHub/tustu/app/src/main/java/com/efiAnalytics/ui/Table3DDataModel.java
/home/rewrich/Documents/GitHub/tustu/app/src/main/java/com/efiAnalytics/ui/Table3DPaintThrottle.java
/home/rewrich/Documents/GitHub/tustu/app/src/main/java/com/efiAnalytics/ui/Table3DProjection.java
""".strip().split('\n')

# Listener classes
listeners = """
AxisSelectorMouseAdapter
ChartMouseHandler
ColorClearActionListener
ColorSetActionListener
CommentBoxCloseListener
CommentBoxDismissListener
CommentBoxFocusListener
CommentBoxHyperlinkListener
CommentBoxMouseListener
CommIndicatorActionListenerA
CommIndicatorActionListenerB
CommIndicatorMouseListener
FileSelectorActionListenerC
FileSelectorActionListenerD
FileSelectorActionListenerE
InputFieldFocusListener
ListAddItemListener
RegistrationDialogCountdownThread
SpinnerDownActionListener
SpinnerUpActionListener
TableSizeSelectorMouseAdapter
ThreeDViewAntialiasingListener
ThreeDViewColorShadeListener
ThreeDViewEvenSpacingListener
ThreeDViewFollowModeListener
ThreeDViewHorizontalSliderListener
ThreeDViewResetActionListener
TimestampUpdateTask
WaitBarThread
YAxisSelectorLayoutRunnable
""".strip().split('\n')

# Add listener files
for listener in listeners:
    files.append(f"/home/rewrich/Documents/GitHub/tustu/app/src/main/java/com/efiAnalytics/ui/{listener}.java")

# Add panel files
panels = [
    "/home/rewrich/Documents/GitHub/tustu/app/src/main/java/com/efiAnalytics/tunerStudio/panels/CalibrationTablePanel.java",
    "/home/rewrich/Documents/GitHub/tustu/app/src/main/java/com/efiAnalytics/tunerStudio/panels/CanDeviceConfigPanel.java",
    "/home/rewrich/Documents/GitHub/tustu/app/src/main/java/com/efiAnalytics/tunerStudio/panels/ProtocolStatsPanel.java",
    "/home/rewrich/Documents/GitHub/tustu/app/src/main/java/com/efiAnalytics/tunerStudio/panels/RealTimeDisplayPanel.java",
    "/home/rewrich/Documents/GitHub/tustu/app/src/main/java/com/efiAnalytics/tuningwidgets/panels/AutoLoggingTriggerPanel.java",
    "/home/rewrich/Documents/GitHub/tustu/app/src/main/java/com/efiAnalytics/tuningwidgets/panels/InjectorControlPanel.java",
    "/home/rewrich/Documents/GitHub/tustu/app/src/main/java/com/efiAnalytics/tuningwidgets/panels/ProfileDatalogFieldsPanel.java",
    "/home/rewrich/Documents/GitHub/tustu/app/src/main/java/com/efiAnalytics/tuningwidgets/panels/ProjectArchiveOptionsPanel.java",
    "/home/rewrich/Documents/GitHub/tustu/app/src/main/java/com/efiAnalytics/tuningwidgets/panels/RequiredFuelPanel.java",
    "/home/rewrich/Documents/GitHub/tustu/app/src/main/java/com/efiAnalytics/tuningwidgets/panels/RestorePointDetailsPanel.java",
    "/home/rewrich/Documents/GitHub/tustu/app/src/main/java/com/efiAnalytics/tuningwidgets/panels/ScalarDataLogListener.java",
    "/home/rewrich/Documents/GitHub/tustu/app/src/main/java/com/efiAnalytics/tuningwidgets/panels/Table2DDataLogListener.java",
]
files.extend(panels)

# Add other files
others = [
    "/home/rewrich/Documents/GitHub/tustu/app/src/main/java/com/efiAnalytics/tuningwidgets/portEditor/OutputChannelComboBox.java",
    "/home/rewrich/Documents/GitHub/tustu/app/src/main/java/com/efiAnalytics/tunerStudio/search/SearchDelayThread.java",
    "/home/rewrich/Documents/GitHub/tustu/app/src/main/java/com/efiAnalytics/tunerStudio/search/SearchResultItemMouseAdapter.java",
    "/home/rewrich/Documents/GitHub/tustu/app/src/main/java/com/efiAnalytics/tunerStudio/search/SearchResultItemPanel.java",
    "/home/rewrich/Documents/GitHub/tustu/app/src/main/java/com/efiAnalytics/apps/ts/tuningViews/EcuConfigDelegate.java",
    "/home/rewrich/Documents/GitHub/tustu/app/src/main/java/com/efiAnalytics/apps/ts/tuningViews/TuningViewController.java",
    "/home/rewrich/Documents/GitHub/tustu/app/src/main/java/com/efiAnalytics/apps/ts/tuningViews/TuningViewFileLoadThread.java",
    "/home/rewrich/Documents/GitHub/tustu/app/src/main/java/com/efiAnalytics/apps/ts/tuningViews/TuningViewPanel.java",
    "/home/rewrich/Documents/GitHub/tustu/app/src/main/java/com/efiAnalytics/apps/ts/tuningViews/TuningViewTabbedPane.java",
    "/home/rewrich/Documents/GitHub/tustu/app/src/main/java/com/efiAnalytics/apps/ts/tuningViews/TuningViewWindow.java",
    "/home/rewrich/Documents/GitHub/tustu/app/src/main/java/ui/ui_dialogs/AfInterfaceIndia.java",
]
files.extend(others)

def fix_file(filepath):
    """Fix constructors in a single file."""
    path = Path(filepath)
    if not path.exists():
        print(f"SKIP: {filepath} - doesn't exist")
        return False
    
    classname = path.stem
    
    try:
        with open(path, 'r', encoding='utf-8', errors='ignore') as f:
            content = f.read()
        
        original = content
        
        # Pattern: Find lowercase method declarations that are likely constructors
        # Match: public|private|protected lowercase_name(
        # Not match: type lowercase_name(
        pattern = r'(\s+)(public\s+|private\s+|protected\s+|)([a-z]\w*)\s*\('
        
        def replacer(match):
            indent = match.group(1)
            modifier = match.group(2)
            name = match.group(3)
            
            # Skip common keywords
            if name in ['if', 'for', 'while', 'switch', 'return', 'throw', 'super']:
                return match.group(0)
            
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
for filepath in files:
    if filepath.strip():
        if fix_file(filepath.strip()):
            fixed += 1

print(f"\nFixed {fixed} files")
