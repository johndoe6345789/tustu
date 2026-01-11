import QtQuick
import QtQuick.Controls
import ".." // Import parent directory for RoundGauge

// Draggable gauge component - can be moved around the canvas
Rectangle {
    id: root
    width: 200
    height: 200
    color: "transparent"
    
    property alias title: gauge.title
    property alias minValue: gauge.minValue
    property alias maxValue: gauge.maxValue
    property alias value: gauge.value
    property alias units: gauge.units
    
    // Make draggable
    MouseArea {
        id: dragArea
        anchors.fill: parent
        drag.target: root
        drag.axis: Drag.XAndYAxis
        cursorShape: Qt.OpenHandCursor
        
        onPressed: {
            cursorShape = Qt.ClosedHandCursor
        }
        
        onReleased: {
            cursorShape = Qt.OpenHandCursor
        }
        
        // Load gauge component
        RoundGauge {
            id: gauge
            anchors.fill: parent
        }
    }
}
