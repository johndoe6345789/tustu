# QML Component Refactoring Summary

## Changes Made

### 1. Python Engine Simulator
**File:** `main.py`

Added `EngineSimulator` class that provides real-time engine data to QML:
- 10-phase driving simulation (idle → acceleration → cruise → WOT → shift → decel → coast → idle)
- Updates at 20Hz (50ms interval)
- Exposes properties via Qt signals: rpm, throttle, temp, afr, boost, voltage, pulseWidth, ignition
- Registered as `engineData` context property in QML

### 2. Component Library Structure
**Directory:** `components/`

Created reusable QML components:

#### `DraggableGauge.qml`
- Wraps RoundGauge with drag functionality
- Properties: title, minValue, maxValue, value, units
- Uses MouseArea for drag interaction
- Imports parent directory to access RoundGauge

#### `StatusIndicator.qml`
- Small badge component for engine states
- Properties: text, bgColor, textColor
- Self-contained with border and radius styling

#### `TopButton.qml`
- Toolbar button with hover/active states
- Properties: text, isActive
- Custom background coloring based on state

### 3. Main Application Updates
**File:** `Main.qml`

- Imports component library: `import "components"`
- Uses TopButton components in header toolbar
- Uses StatusIndicator components in status bar
- Simplified structure with proper anchoring

**File:** `GaugeClusterView.qml`

- Removed internal Timer simulation (now in Python)
- Uses `engineData.rpm`, `engineData.throttle`, etc. from Python
- Uses DraggableGauge components instead of inline definitions
- Much cleaner: 107 lines vs 257 lines original

## File Organization

```
app_qml/
├── components/
│   ├── DraggableGauge.qml      [NEW] 40 lines
│   ├── StatusIndicator.qml     [NEW] 25 lines
│   ├── TopButton.qml            [NEW] 27 lines
│   └── README.md               [NEW] Component documentation
├── Main.qml                    [UPDATED] Uses component library
├── GaugeClusterView.qml        [UPDATED] 107 lines (was 257)
├── RoundGauge.qml              [EXISTING] Unchanged
├── BarGauge.qml                [EXISTING] Unchanged
└── main.py                     [UPDATED] +174 lines (EngineSimulator class)
```

## Benefits

1. **Separation of Concerns**
   - Engine simulation in Python (easier to test and modify)
   - Visual components in QML
   - Reusable component library

2. **Reduced Code Duplication**
   - DraggableGauge used 8 times in GaugeClusterView
   - StatusIndicator used 12 times in Main.qml
   - TopButton used 8 times in Main.qml

3. **Maintainability**
   - Components documented in README.md
   - Clear file structure
   - Single source of truth for engine data

4. **Performance**
   - Python simulation more efficient than QML Timer
   - Proper Qt signals for property updates
   - No redundant calculations

## Running the Application

```bash
cd /home/rewrich/Documents/GitHub/tustu
python3 app_qml/main.py
```

The engine simulator starts automatically and provides live data to all gauges.

## Next Steps (Optional)

1. **Add more components**: Create BarIndicator, GraphWidget, TableEditor components
2. **Real ECU connection**: Replace EngineSimulator with actual serial port communication
3. **Save/load layouts**: Persist gauge positions to JSON file
4. **Custom themes**: Extract colors to Theme component
5. **Animation library**: Create common animation behaviors
