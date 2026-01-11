import QtQuick
import QtQuick.Controls

// Status indicator component for engine states
Rectangle {
    id: root
    height: 22
    width: labelText.width + 16
    radius: 3
    
    property string text: ""
    property color bgColor: "#444"
    property color textColor: "#fff"
    
    color: bgColor
    border.color: Qt.darker(bgColor, 1.2)
    border.width: 1
    
    Label {
        id: labelText
        anchors.centerIn: parent
        text: root.text
        color: root.textColor
        font.pixelSize: 11
        font.family: "monospace"
    }
}
