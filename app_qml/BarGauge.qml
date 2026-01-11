import QtQuick
import QtQuick.Controls

Item {
    id: barGauge
    
    property string title: "Gauge"
    property real minValue: 0
    property real maxValue: 100
    property real value: 50
    property real warningValue: 85
    property real dangerValue: 95
    property string units: ""
    
    width: 300
    height: 300
    
    Rectangle {
        anchors.fill: parent
        color: "#2c3e50"
        border.color: "#34495e"
        border.width: 3
        radius: 10
        
        Column {
            anchors.fill: parent
            anchors.margins: 20
            spacing: 15
            
            // Title
            Label {
                width: parent.width
                text: title
                font.pixelSize: 18
                font.bold: true
                color: "#ecf0f1"
                horizontalAlignment: Text.AlignHCenter
            }
            
            // Digital value
            Label {
                width: parent.width
                text: value.toFixed(1) + " " + units
                font.pixelSize: 32
                font.bold: true
                color: {
                    if (value >= dangerValue) return "#e74c3c"
                    if (value >= warningValue) return "#f39c12"
                    return "#2ecc71"
                }
                horizontalAlignment: Text.AlignHCenter
            }
            
            // Bar graph
            Item {
                width: parent.width
                height: parent.height - 120
                
                // Background
                Rectangle {
                    anchors.fill: parent
                    color: "#34495e"
                    radius: 5
                }
                
                // Value bar
                Rectangle {
                    anchors.left: parent.left
                    anchors.bottom: parent.bottom
                    width: parent.width
                    height: parent.height * ((value - minValue) / (maxValue - minValue))
                    radius: 5
                    
                    gradient: Gradient {
                        GradientStop {
                            position: 0.0
                            color: {
                                if (value >= dangerValue) return "#c0392b"
                                if (value >= warningValue) return "#d68910"
                                return "#27ae60"
                            }
                        }
                        GradientStop {
                            position: 1.0
                            color: {
                                if (value >= dangerValue) return "#e74c3c"
                                if (value >= warningValue) return "#f39c12"
                                return "#2ecc71"
                            }
                        }
                    }
                    
                    Behavior on height {
                        NumberAnimation { duration: 100 }
                    }
                }
                
                // Scale marks
                Column {
                    anchors.fill: parent
                    Repeater {
                        model: 11
                        Rectangle {
                            width: parent.width
                            height: 1
                            color: "#7f8c8d"
                            opacity: 0.5
                        }
                    }
                }
            }
            
            // Min/Max labels
            Row {
                width: parent.width
                Label {
                    width: parent.width / 2
                    text: minValue.toFixed(0)
                    color: "#95a5a6"
                    font.pixelSize: 12
                }
                Label {
                    width: parent.width / 2
                    text: maxValue.toFixed(0)
                    color: "#95a5a6"
                    font.pixelSize: 12
                    horizontalAlignment: Text.AlignRight
                }
            }
        }
    }
}
