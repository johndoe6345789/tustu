# Dialog Updates - QML TunerStudio Replica

## Overview
This document summarizes the dialog improvements made to match the original Java/Swing TunerStudio application more closely.

## New Dialogs Added

### 1. Connection Dialog
**Trigger**: Tools → Connect button or Communications → Settings
- **Features**:
  - Serial port selection (COM1-4, /dev/ttyUSB0, /dev/ttyACM0)
  - Baud rate configuration (9600-230400)
  - Data bits, stop bits, parity settings
  - ECU type selection (MegaSquirt-II, MS-III, MS2Extra, MS3Pro, Speeduino)
  - "Detect Port" button for automatic port detection
  - "Test Connection" button for connection validation
  - Updates status bar on connection success

### 2. Calibrate TPS Dialog
**Trigger**: Tools → Calibrate TPS
- **Features**:
  - Two-step calibration wizard
  - Step 1: Capture closed throttle position (displays voltage)
  - Step 2: Capture wide-open throttle (WOT) position
  - Real-time TPS reading display (ADC, voltage, percentage)
  - "Apply Calibration" to save settings
  - "Reset to Defaults" to restore factory values
  - Visual feedback on status bar

### 3. About Dialog
**Trigger**: Help → About
- **Features**:
  - Application logo placeholder
  - TunerStudio MS version info
  - Company information (EFI Analytics)
  - Copyright notice
  - Website link

### 4. Hot Keys Dialog
**Trigger**: Help → Hot Keys
- **Features**:
  - Comprehensive keyboard shortcut reference
  - Grid layout showing Function and Key Combination
  - Common shortcuts: F2 (Start Log), F3 (Stop Log), F5 (Refresh), etc.
  - File operations: Ctrl+O (Open), Ctrl+S (Save)
  - Edit operations: Ctrl+Z (Undo), Ctrl+Y (Redo)

### 5. Reset ECU Dialog
**Trigger**: Tools → Reset Control Unit
- **Features**:
  - Warning message about resetting ECU
  - Confirmation required before reset
  - Progress indication with timer
  - Status bar update on completion

### 6. Burn to ECU Dialog
**Trigger**: Tools → Burn to ECU
- **Features**:
  - Table selection dropdown
  - "Verify after burn" checkbox option
  - Progress indication
  - Status bar feedback

### 7. Firmware Update Dialog
**Trigger**: Tools → Firmware Update
- **Features**:
  - Current firmware version display (MS2Extra 3.4.2)
  - Build date information
  - Update options:
    - Check for updates online
    - Load firmware from file
  - Browse button for local firmware files
  - Warning about power disconnection during update

## Menu Improvements

### Communications Menu
- **Connect**: Now opens connection dialog with full configuration
- **Settings**: Opens connection dialog
- **Detect Port**: Triggers automatic port detection with status feedback

### Data Logging Menu
- **Start/Stop Log**: Single toggle menu item
  - Shows "Start Log (F2)" when stopped
  - Shows "Stop Log (F3)" when active
  - Updates status bar color (orange when logging)

### Tools Menu
- All tools now connected to proper dialogs
- Status bar provides feedback for all operations

### Help Menu
- All items functional or linked to external documentation
- Registration dialog integrated
- About dialog shows application information

## Status Bar Integration

All dialogs now update the status bar with:
- Connection status (green = connected, red = disconnected)
- Operation progress (orange = in progress)
- Completion messages (green = success)

## Visual Design

All dialogs follow consistent design principles:
- Modal dialogs with appropriate dimensions (400-500px width)
- GroupBox containers for organized sections
- GridLayout for form-style inputs
- Standard dialog buttons (OK, Cancel, Close)
- Color-coded feedback (green = success, red = warning/error, orange = in progress)

## Testing Status

✅ All dialogs open correctly
✅ Connection dialog shows port/baud rate options
✅ TPS calibration captures values
✅ Reset/Burn dialogs show confirmation
✅ Firmware dialog displays version info
✅ Status bar updates properly
✅ Menu items trigger correct dialogs

## Java Source Mapping

Dialogs were created based on analysis of:
- `app/ao/cd.java` - Main frame and menu structure (lines 700-1000)
- `app/com/efiAnalytics/ui/dS.java` - Registration dialog
- `app/az/f.java` - Offline activation
- JOptionPane and JDialog patterns found throughout Java codebase

## Next Steps (Optional Enhancements)

1. Add actual serial port communication backend
2. Implement real firmware flashing capability
3. Add tooth logger visualization
4. Create more diagnostic dialogs
5. Add data logging file browser
6. Implement project file save/load functionality
