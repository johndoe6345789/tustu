# QML Component Library

This directory contains reusable QML components for the TunerStudio MS application.

## Components

### DraggableGauge.qml
Draggable gauge component that can be repositioned on the canvas.

**Properties:**
- `title` (string): Gauge title text
- `minValue` (real): Minimum value on gauge scale
- `maxValue` (real): Maximum value on gauge scale
- `value` (real): Current gauge value
- `units` (string): Unit text displayed on gauge

**Usage:**
```qml
DraggableGauge {
    x: 20; y: 20
    title: "RPM"
    minValue: 0
    maxValue: 8000
    value: engineData.rpm
    units: "RPM"
}
```

### StatusIndicator.qml
Small status indicator rectangle for displaying engine states.

**Properties:**
- `text` (string): Status text to display
- `bgColor` (color): Background color of indicator
- `textColor` (color): Text color (default: white)

**Usage:**
```qml
StatusIndicator {
    text: "Battery OK"
    bgColor: "#27ae60"
}
```

### TopButton.qml
Toolbar button component with hover and active states.

**Properties:**
- `text` (string): Button label
- `isActive` (bool): Whether button is in active state
- Standard ToolButton properties

**Usage:**
```qml
TopButton {
    text: "Fuel Set-Up"
    onClicked: {
        // Handle click
    }
}
```

## File Structure

```
app_qml/
├── components/
│   ├── DraggableGauge.qml    # Draggable gauge component
│   ├── StatusIndicator.qml   # Status badge component
│   ├── TopButton.qml          # Toolbar button component
│   └── README.md             # This file
├── Main.qml                  # Main application window
├── GaugeClusterView.qml      # Gauge cluster view
├── RoundGauge.qml            # Round gauge widget
├── BarGauge.qml              # Bar gauge widget
└── main.py                   # Python launcher with engine simulator
```

## Integration

To use components in your QML files:

```qml
import "components"

ApplicationWindow {
    // Use components
    DraggableGauge { ... }
    StatusIndicator { ... }
    TopButton { ... }
}
```

## Engine Data

Engine data is provided by the Python `EngineSimulator` class in `main.py` and exposed to QML as `engineData`:

**Available properties:**
- `rpm` (float): Engine RPM (0-8000)
- `throttle` (float): Throttle position (0-100%)
- `temp` (float): Coolant temperature (°C)
- `afr` (float): Air/Fuel ratio (10-20)
- `boost` (float): Boost pressure (PSI)
- `voltage` (float): Battery voltage (V)
- `pulseWidth` (float): Injector pulse width (ms)
- `ignition` (float): Ignition timing (degrees)

**Example:**
```qml
DraggableGauge {
    title: "RPM"
    value: engineData.rpm  // Real-time value from Python
    minValue: 0
    maxValue: 8000
}
```
