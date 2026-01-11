# TunerStudio MS QML - Component Library

## Overview

Successfully refactored the QML application with:
1. ✅ Python engine simulator providing real-time data
2. ✅ Reusable QML component library
3. ✅ Clean separation of concerns

## What Changed

### Before Refactoring
- Engine simulation in QML (Timer with JavaScript)
- Inline component definitions repeated multiple times
- GaugeClusterView: 257 lines with embedded simulation
- No component reusability

### After Refactoring
- Engine simulation in Python (`EngineSimulator` class)
- Reusable components in `components/` directory
- GaugeClusterView: 107 lines, uses engineData from Python
- Components used across multiple files

## Component Library (`components/`)

### DraggableGauge.qml
Draggable gauge wrapper for freeform positioning.

```qml
DraggableGauge {
    x: 20; y: 20
    title: "RPM"
    minValue: 0
    maxValue: 8000
    value: engineData.rpm  // From Python
    units: "RPM"
}
```

### StatusIndicator.qml
Status badge for engine states.

```qml
StatusIndicator {
    text: "Battery OK"
    bgColor: "#27ae60"
}
```

### TopButton.qml
Toolbar button with hover/active states.

```qml
TopButton {
    text: "Fuel Set-Up"
    onClicked: { /* handle */ }
}
```

## Python Engine Simulator (`main.py`)

```python
class EngineSimulator(QObject):
    """10-phase driving simulation at 20Hz"""
    
    # Properties exposed to QML
    @pyqtProperty(float, notify=rpmChanged)
    def rpm(self): return self._rpm
    
    @pyqtProperty(float, notify=throttleChanged)
    def throttle(self): return self._throttle
    
    # ... 8 total properties
```

**Available in QML as `engineData`:**
- `engineData.rpm` - Engine RPM
- `engineData.throttle` - Throttle %
- `engineData.temp` - Coolant temp
- `engineData.afr` - Air/Fuel ratio
- `engineData.boost` - Boost pressure
- `engineData.voltage` - Battery voltage
- `engineData.pulseWidth` - Injector pulse width
- `engineData.ignition` - Ignition timing

## File Structure

```
app_qml/
├── components/              [NEW]
│   ├── DraggableGauge.qml
│   ├── StatusIndicator.qml
│   ├── TopButton.qml
│   └── README.md
│
├── Main.qml                [UPDATED - uses components]
├── GaugeClusterView.qml    [UPDATED - uses Python data]
│
├── RoundGauge.qml          [EXISTING]
├── BarGauge.qml            [EXISTING]
│
└── main.py                 [UPDATED - added EngineSimulator]
```

## Running

```bash
cd /home/rewrich/Documents/GitHub/tustu
python3 app_qml/main.py
```

**Output:**
```
TunerStudio MS QML Application Started
Loaded from: /home/rewrich/Documents/GitHub/tustu/app_qml/Main.qml
Engine simulation running at 20Hz

Available views:
  - Gauge Cluster: Draggable gauges with live engine data
  - Tuning & Dyno: Tuning views
  - Graphing & Logging: Data logging
  - Diagnostics: ECU status
```

The application window opens with:
- Top toolbar with 8 project buttons
- Tab bar with 6 views
- Gauge cluster with 8 draggable gauges
- Live engine simulation (10-phase driving cycle)
- Status bar with 12 engine indicators
- Bottom toolbar with progress bar

## Benefits

**1. Code Reusability**
- DraggableGauge: used 8 times
- StatusIndicator: used 12 times  
- TopButton: used 8 times

**2. Maintainability**
- Components documented
- Clear file organization
- Single source for engine data

**3. Performance**
- Python simulation (native code)
- Efficient Qt property bindings
- No redundant QML timers

**4. Testability**
- Engine simulation isolated in Python
- Components independently testable
- Mock engine data easily

## Development Workflow

**Adding a new gauge:**
```qml
DraggableGauge {
    x: 900; y: 20
    title: "Oil Pressure"
    value: engineData.oilPressure  // Add to EngineSimulator
    minValue: 0
    maxValue: 100
    units: "PSI"
}
```

**Adding new engine data:**
```python
# In EngineSimulator class
@pyqtProperty(float, notify=oilPressureChanged)
def oilPressure(self):
    return self._oilPressure
```

## Status

✅ Application runs successfully
✅ Python engine simulator working (20Hz updates)
✅ Component library created and documented
✅ All gauges display live data
✅ Drag-and-drop gauge positioning works
✅ Only cosmetic warnings (Arial font unavailable)

## Next Steps

1. **More components**: Create BarIndicator, GraphWidget, TableWidget
2. **Real ECU**: Replace simulator with serial communication
3. **Persistence**: Save gauge positions to JSON
4. **Themes**: Extract colors to theme system
5. **Animation**: Add smooth transitions for gauges
