import QtQuick
import QtQuick.Controls
import QtQuick.Layouts

Item {
    id: tuningView
    
    SplitView {
        anchors.fill: parent
        orientation: Qt.Horizontal
        
        // Left panel - Table selector
        Item {
            SplitView.minimumWidth: 200
            SplitView.preferredWidth: 250
            SplitView.maximumWidth: 400
            
            ColumnLayout {
                anchors.fill: parent
                anchors.margins: 10
                spacing: 10
                
                Label {
                    text: "Tables"
                    font.pixelSize: 16
                    font.bold: true
                }
                
                ScrollView {
                    Layout.fillWidth: true
                    Layout.fillHeight: true
                    
                    ListView {
                        id: tableListView
                        model: tableModel
                        clip: true
                        
                        delegate: ItemDelegate {
                            width: ListView.view.width
                            text: modelData.name
                            highlighted: ListView.isCurrentItem
                            onClicked: {
                                tableListView.currentIndex = index
                                tableEditorPanel.loadTable(modelData)
                            }
                        }
                    }
                }
                
                Button {
                    Layout.fillWidth: true
                    text: "New Table"
                    onClicked: console.log("Create new table")
                }
            }
        }
        
        // Right panel - Table editor
        TableEditorPanel {
            id: tableEditorPanel
            SplitView.fillWidth: true
        }
    }
    
    ListModel {
        id: tableModel
        ListElement { name: "VE Table"; type: "3D"; rows: 12; cols: 12 }
        ListElement { name: "Ignition Advance"; type: "3D"; rows: 12; cols: 12 }
        ListElement { name: "Air/Fuel Ratio"; type: "3D"; rows: 12; cols: 12 }
        ListElement { name: "Boost Target"; type: "2D"; rows: 8; cols: 1 }
        ListElement { name: "Idle Target RPM"; type: "2D"; rows: 8; cols: 1 }
        ListElement { name: "Warmup Enrichment"; type: "2D"; rows: 10; cols: 1 }
        ListElement { name: "Acceleration Enrichment"; type: "Scalar" }
        ListElement { name: "Cranking Pulse"; type: "2D"; rows: 6; cols: 1 }
    }
}
