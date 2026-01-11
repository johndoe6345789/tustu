# TunerStudio MS QML Application

A modern QML/Qt6 replica of the TunerStudio MS engine management software, originally implemented in Java/Swing.

## Features

### Main Application
- **Tuning View**: 3D table editors for VE tables, ignition timing, air/fuel ratios
- **Dashboard**: Real-time animated gauges including:
  - RPM gauge (analog)
  - Coolant temperature
  - Air/Fuel ratio
  - Boost/vacuum pressure
  - Throttle position (bar gauge)
  - Battery voltage (bar gauge)
- **Data Logging**: Real-time chart with multiple channels
- **Table Editor**: Advanced table editing with color-coded cells
- **Diagnostics**: ECU connection status and error codes

### Registration System
- Registration dialog with manual input and email parsing
- Offline activation system with 5-step process
- Support for multiple editions (Standard, Professional, Ultra, Lite)

## Installation

```bash
# Install PyQt6
pip install PyQt6

# Or use the requirements file
pip install -r requirements.txt
```

## Running the Application

```bash
cd app_qml
python3 main.py
```

## File Structure

```
app_qml/
├── main.py                      # Python launcher script
├── Main.qml                     # Main application window
├── TuningView.qml              # Tuning tables view
├── TableEditorPanel.qml        # Table editor component
├── Table3DEditor.qml           # 3D table editor
├── Table2DEditor.qml           # 2D table editor
├── ScalarEditor.qml            # Scalar value editor
├── TableEditorView.qml         # Advanced table editor view
├── DashboardView.qml           # Dashboard with gauges
├── RoundGauge.qml              # Analog gauge component
├── BarGauge.qml                # Bar gauge component
├── DataLoggingView.qml         # Data logging and charts
├── DiagnosticsView.qml         # ECU diagnostics
├── RegistrationDialog.qml      # Registration input dialog
└── OfflineActivationDialog.qml # Offline activation dialog
```

## Java/Swing to QML Mapping

| Java Swing Component | QML Component | Used In |
|---------------------|---------------|---------|
| `JFrame` | `ApplicationWindow` | Main.qml |
| `JMenuBar` | `MenuBar` | Main.qml |
| `JTabbedPane` | `TabBar` + `StackLayout` | Main.qml |
| `JPanel` | `Item` / `Rectangle` | All views |
| `JButton` | `Button` | All views |
| `JTextField` | `TextField` | Tables, dialogs |
| `JLabel` | `Label` | All views |
| `JTable` | `GridLayout` + `TextField` | Table editors |
| `JDialog` | `ApplicationWindow` | Registration dialogs |
| `JRadioButton` | `RadioButton` | Registration dialog |
| `JComboBox` | `ComboBox` | Various views |
| `JScrollPane` | `ScrollView` | Various views |
| `JTextPane` | `TextArea` | Offline activation |
| Custom Gauge | `Canvas` with painting | Dashboard gauges |

## Features Replicated from Java/Swing

### Main Application (cd.java)
- Menu bar with File, Tools, Communications, Tuning, Data Logging, Help
- Toolbar with connection and data logging controls
- Tabbed interface for different views
- Status bar showing connection info

### Dashboard (Gauge.java)
- Analog gauges with configurable ranges
- Color zones (green/yellow/red)
- Digital value display
- Warning and danger thresholds
- Animated needle movement

### Table Editor (SelectableTable.java)
- 3D table editing with color coding
- 2D curve editing
- Scalar value editing
- Axis labels and values
- Cell-by-cell editing

### Registration (dS.java, f.java)
- Manual registration input
- Email parsing for auto-fill
- Edition selection
- Offline activation workflow
- Clipboard operations
- File save/load for activation codes

## Simulated Data

The application includes simulated data for demonstration:
- Gauges update with random values in realistic ranges
- Data logging charts show simulated sensor data
- Table cells contain sample tuning values

## Notes

This is a faithful UI recreation of the TunerStudio MS application. The backend ECU communication logic would need to be implemented separately using appropriate serial communication libraries and the MegaSquirt protocol.

## Original Java Application

The original application structure from `app/`:
- Main frame: `ao/cd.java`
- Dashboard components: `com/efiAnalytics/apps/ts/dashboard/`
- Tuning views: `com/efiAnalytics/apps/ts/tuningViews/`
- Registration: `com/efiAnalytics/ui/dS.java`, `az/f.java`
