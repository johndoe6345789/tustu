import QtQuick
import QtQuick.Controls

// Top toolbar button component
ToolButton {
    id: root
    text: ""
    flat: true
    font.pixelSize: 12
    
    property bool isActive: false
    
    background: Rectangle {
        color: root.isActive ? "#3498db" : (root.hovered ? "#34495e" : "#2c3e50")
        border.color: root.isActive ? "#2980b9" : "#1a252f"
        border.width: 1
    }
    
    contentItem: Text {
        text: root.text
        font: root.font
        color: root.isActive ? "#fff" : (root.hovered ? "#ecf0f1" : "#bdc3c7")
        horizontalAlignment: Text.AlignHCenter
        verticalAlignment: Text.AlignVCenter
    }
}
