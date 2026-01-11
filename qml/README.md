# QML Registration GUI

Modern QML-based user interface for the Registration Key Generator, based on the original Java Swing GUI (`com/efiAnalytics/ui/dS.java`).

## Features

### QML Implementation
- **Main.qml** - Main application window with tab navigation
- **KeyGeneratorTab.qml** - Reusable tab component for key generation (4/5/7/8-parameter variants)
- **EmailParserTab.qml** - Email parsing and generation functionality
- **RegistrationDialog.qml** - Registration dialog matching Java `dS.java` design
- **main.py** - Python backend connecting QML to registration algorithms

### UI Components

#### Main Window
- Tab-based navigation (matches PyQt6 GUI structure)
- 5 tabs: 4-Parameter, 5-Parameter, 7-Parameter, 8-Parameter, Email Parser
- Modern Material Design color scheme
- Responsive layout

#### Key Generator Tabs
Based on Java Swing input panels from `dS.java`:
- Input fields for first name, last name, product, email
- Conditional fields (secret, month, year, serial) based on algorithm
- "Load Test Data" button (blue) - auto-populate with valid test data
- "Generate Key" button (green) - create registration key
- "Validate Key" button (orange) - verify key correctness
- Output area with monospace font
- Copy to clipboard functionality

#### Email Parser Tab
Based on Java "Paste Email" functionality from `dS.java`:
- Text area for pasting registration emails
- Parse button to extract fields from `[Registration]...[End Registration]` format
- Editable extracted fields (first name, last name, email, serial, key)
- "Load Test Data" button (purple) - generates complete valid registration
- "Generate Email Format" button (green) - creates formatted email text
- Validation support

#### Registration Dialog
Matches Java `dS.java` dialog structure:
- Radio buttons to switch between "Inputs" and "Paste Email" views
- CardLayout equivalent using QML StackLayout
- Edition selector (ComboBox)
- Registration information fields
- Email paste and parse functionality
- OK/Cancel standard dialog buttons

## Architecture

### QML Frontend
- Declarative UI using QtQuick 6.5
- Material Design styling
- Signal/slot connections to Python backend
- Responsive layouts with GridLayout, RowLayout, ColumnLayout

### Python Backend (main.py)
- `RegistrationBackend` class exposes methods to QML
- Uses `@pyqtSlot` decorators for QML-callable methods
- Imports from `registration_gui.py` for algorithm implementations
- Signal emissions for async operations

### Backend Methods
- `generateKey4Param()` - 4-parameter algorithm
- `generateKey5Param()` - 5-parameter algorithm
- `generateKey7Param()` - 7-parameter algorithm
- `generateKey8Param()` - 8-parameter algorithm
- `loadTestData()` - Generate dummy test data
- `parseEmail()` - Extract fields from email text
- `generateEmailFormat()` - Create formatted registration email

## Running the QML GUI

```bash
# Install Qt6 for Python
pip install PyQt6

# Run the QML application
cd qml
python3 main.py
```

## Comparison: Java Swing vs QML

### Java Swing (Original)
```java
// dS.java - Registration Dialog
JPanel panel = new JPanel();
panel.setLayout(new GridLayout(0, 1, 3, 3));
ea firstNameField = new ea(this, "Registered First Name:", k.b());
panel.add(firstNameField);
```

### QML (Modern)
```qml
// RegistrationDialog.qml
GridLayout {
    columns: 2
    Label { text: "Registered First Name:" }
    TextField {
        id: firstNameField
        Layout.fillWidth: true
    }
}
```

## Advantages of QML

1. **Declarative Syntax** - Easier to read and maintain than imperative Java Swing
2. **Modern Look** - Material Design colors and styling
3. **Responsive** - Automatic layout adjustment
4. **Animation Support** - Built-in property animations
5. **Hardware Acceleration** - Qt Quick Scene Graph for smooth rendering
6. **Cross-Platform** - Same QML runs on Windows, macOS, Linux, mobile
7. **Separation of Concerns** - UI in QML, logic in Python
8. **Hot Reload** - Can reload QML without restarting (in development)

## Java GUI Elements Mapped to QML

| Java Swing Component | QML Component | Location |
|---------------------|---------------|----------|
| `JDialog` | `Dialog` | RegistrationDialog.qml |
| `JPanel` | `Rectangle` + Layout | All files |
| `JTextField` | `TextField` | KeyGeneratorTab.qml, etc. |
| `JTextArea` / `JTextPane` | `TextArea` / `TextEdit` | EmailParserTab.qml |
| `JButton` | `Button` | All files |
| `JRadioButton` | `RadioButton` | RegistrationDialog.qml |
| `ButtonGroup` | `ButtonGroup` | RegistrationDialog.qml |
| `JComboBox` | `ComboBox` | KeyGeneratorTab.qml |
| `GridLayout` | `GridLayout` | KeyGeneratorTab.qml |
| `BorderLayout` | `ColumnLayout` + anchors | Main.qml |
| `CardLayout` | `StackLayout` | RegistrationDialog.qml |
| `JScrollPane` | `ScrollView` | EmailParserTab.qml |
| `GroupBox` (titled border) | `GroupBox` | All tabs |

## File Structure

```
qml/
├── Main.qml                    # Main application window
├── KeyGeneratorTab.qml         # Reusable key generation tab
├── EmailParserTab.qml          # Email parsing/generation tab
├── RegistrationDialog.qml      # Registration dialog (matches dS.java)
├── main.py                     # Python backend + QML loader
└── README.md                   # This file
```

## Next Steps

To fully connect the QML UI to the Python backend:

1. **Implement Backend Calls** - Connect QML button clicks to Python slots
2. **Add Clipboard Support** - Use `QClipboard` for copy/paste
3. **Error Handling** - Display validation errors in QML dialogs
4. **Styling** - Add custom Material Design theme
5. **Animations** - Add smooth transitions between tabs
6. **Testing** - Create QML test cases

## Color Scheme

```qml
primaryColor: "#4CAF50"    // Green - Generate buttons
accentColor: "#2196F3"     // Blue - Load Test Data
warningColor: "#FF9800"    // Orange - Validate buttons
errorColor: "#f44336"      // Red - Errors
backgroundColor: "#f5f5f5" // Light gray
cardColor: "#ffffff"       // White
```

## Dependencies

- Python 3.6+
- PyQt6 6.5.0+
- Qt 6.5+ (included with PyQt6)
- registration_gui.py (from parent directory)

## License

Same as parent project - for educational and testing purposes.
