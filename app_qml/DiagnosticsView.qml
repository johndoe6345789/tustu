import QtQuick
import QtQuick.Controls
import QtQuick.Layouts

Item {
    id: diagnosticsView
    
    ColumnLayout {
        anchors.fill: parent
        anchors.margins: 10
        spacing: 10
        
        Label {
            text: "ECU Diagnostics"
            font.pixelSize: 18
            font.bold: true
        }
        
        GroupBox {
            Layout.fillWidth: true
            title: "Connection Status"
            
            GridLayout {
                anchors.fill: parent
                columns: 2
                rowSpacing: 8
                columnSpacing: 15
                
                Label { text: "Connection:" }
                Label { 
                    text: "Not Connected"
                    color: "#e74c3c"
                    font.bold: true
                }
                
                Label { text: "Port:" }
                Label { text: "N/A" }
                
                Label { text: "Baud Rate:" }
                Label { text: "115200" }
                
                Label { text: "ECU Type:" }
                Label { text: "MegaSquirt-II" }
                
                Label { text: "Firmware:" }
                Label { text: "v3.4.2" }
            }
        }
        
        GroupBox {
            Layout.fillWidth: true
            title: "Error Codes"
            
            ScrollView {
                anchors.fill: parent
                implicitHeight: 200
                
                ListView {
                    model: ListModel {
                        ListElement { code: "P0301"; description: "Cylinder 1 Misfire Detected" }
                        ListElement { code: "P0171"; description: "System Too Lean (Bank 1)" }
                        ListElement { code: "P0420"; description: "Catalyst System Efficiency Below Threshold" }
                    }
                    
                    delegate: ItemDelegate {
                        width: ListView.view.width
                        
                        RowLayout {
                            anchors.fill: parent
                            spacing: 10
                            
                            Label {
                                text: code
                                font.bold: true
                                color: "#e74c3c"
                            }
                            
                            Label {
                                text: description
                                Layout.fillWidth: true
                            }
                        }
                    }
                }
            }
        }
        
        RowLayout {
            Layout.fillWidth: true
            spacing: 10
            
            Button {
                text: "Clear Codes"
                onClicked: console.log("Clear error codes")
            }
            
            Button {
                text: "Refresh"
                onClicked: console.log("Refresh diagnostics")
            }
            
            Item { Layout.fillWidth: true }
        }
        
        Item { Layout.fillHeight: true }
    }
}
