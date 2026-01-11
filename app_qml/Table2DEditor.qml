import QtQuick
import QtQuick.Controls
import QtQuick.Layouts

Item {
    id: table2DEditor
    
    ColumnLayout {
        anchors.fill: parent
        spacing: 10
        
        Label {
            text: "2D Table Editor"
            font.pixelSize: 16
            font.bold: true
        }
        
        ScrollView {
            Layout.fillWidth: true
            Layout.fillHeight: true
            
            GridLayout {
                columns: 3
                rowSpacing: 5
                columnSpacing: 10
                
                // Header
                Label { text: "Index"; font.bold: true }
                Label { text: "X-Axis"; font.bold: true }
                Label { text: "Value"; font.bold: true }
                
                // Data rows
                Repeater {
                    model: 8
                    
                    delegate: RowLayout {
                        Label { text: index; width: 40 }
                        TextField { 
                            text: (index * 500).toFixed(0)
                            Layout.preferredWidth: 80
                        }
                        TextField { 
                            text: (50 + Math.random() * 50).toFixed(1)
                            Layout.preferredWidth: 80
                        }
                    }
                }
            }
        }
    }
}
