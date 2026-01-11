import QtQuick
import QtQuick.Controls
import QtQuick.Layouts

Item {
    id: table3DEditor
    
    ColumnLayout {
        anchors.fill: parent
        spacing: 10
        
        // Axis labels
        RowLayout {
            Layout.fillWidth: true
            spacing: 10
            
            Label {
                text: "RPM →"
                font.bold: true
            }
            
            Item { Layout.fillWidth: true }
            
            Label {
                text: "↓ MAP (kPa)"
                font.bold: true
            }
        }
        
        // Table grid
        ScrollView {
            Layout.fillWidth: true
            Layout.fillHeight: true
            
            GridLayout {
                id: tableGrid
                columns: 13
                rowSpacing: 2
                columnSpacing: 2
                
                // Header row (RPM values)
                Repeater {
                    model: 13
                    
                    Rectangle {
                        width: 60
                        height: 30
                        color: "#e0e0e0"
                        border.color: "#999"
                        border.width: 1
                        
                        Label {
                            anchors.centerIn: parent
                            text: index === 0 ? "MAP\\RPM" : (500 + index * 500)
                            font.bold: true
                            font.pixelSize: 10
                        }
                    }
                }
                
                // Data rows
                Repeater {
                    model: 12 * 13
                    
                    Rectangle {
                        width: 60
                        height: 35
                        color: {
                            if (index % 13 === 0) return "#e0e0e0"
                            var value = parseFloat(cellField.text)
                            if (value < 50) return "#4dabf7"
                            if (value < 70) return "#51cf66"
                            if (value < 85) return "#ffd43b"
                            return "#ff6b6b"
                        }
                        border.color: cellMouseArea.containsMouse ? "#1976D2" : "#666"
                        border.width: cellMouseArea.containsMouse ? 2 : 1
                        
                        Label {
                            id: cellLabel
                            anchors.centerIn: parent
                            text: {
                                if (index % 13 === 0) {
                                    return (20 + Math.floor(index / 13) * 10)
                                }
                                return ""
                            }
                            font.bold: index % 13 === 0
                            font.pixelSize: 10
                            visible: index % 13 === 0
                        }
                        
                        TextField {
                            id: cellField
                            anchors.fill: parent
                            anchors.margins: 2
                            text: (45 + Math.random() * 50).toFixed(1)
                            horizontalAlignment: Text.AlignHCenter
                            verticalAlignment: Text.AlignVCenter
                            font.pixelSize: 11
                            font.bold: true
                            visible: index % 13 !== 0
                            
                            background: Rectangle {
                                color: "transparent"
                            }
                            
                            onEditingFinished: {
                                parent.color = Qt.binding(function() {
                                    var value = parseFloat(cellField.text)
                                    if (value < 50) return "#4dabf7"
                                    if (value < 70) return "#51cf66"
                                    if (value < 85) return "#ffd43b"
                                    return "#ff6b6b"
                                })
                            }
                        }
                        
                        MouseArea {
                            id: cellMouseArea
                            anchors.fill: parent
                            hoverEnabled: true
                            acceptedButtons: Qt.NoButton
                            z: -1
                        }
                    }
                }
            }
        }
        
        // 3D visualization placeholder
        Rectangle {
            Layout.fillWidth: true
            Layout.preferredHeight: 200
            color: "#2c3e50"
            border.color: "#34495e"
            border.width: 2
            radius: 5
            
            Label {
                anchors.centerIn: parent
                text: "3D Visualization"
                color: "white"
                font.pixelSize: 16
            }
        }
    }
}
