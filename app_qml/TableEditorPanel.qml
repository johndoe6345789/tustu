import QtQuick
import QtQuick.Controls
import QtQuick.Layouts

Item {
    id: tableEditorPanel
    
    property var currentTable: null
    
    function loadTable(table) {
        currentTable = table
        if (table.type === "3D") {
            stackLayout.currentIndex = 0
        } else if (table.type === "2D") {
            stackLayout.currentIndex = 1
        } else {
            stackLayout.currentIndex = 2
        }
    }
    
    ColumnLayout {
        anchors.fill: parent
        anchors.margins: 10
        spacing: 10
        
        // Header
        RowLayout {
            Layout.fillWidth: true
            
            Label {
                text: currentTable ? currentTable.name : "Select a Table"
                font.pixelSize: 18
                font.bold: true
                Layout.fillWidth: true
            }
            
            Button {
                text: "Burn to ECU"
                highlighted: true
                enabled: currentTable !== null
            }
            
            Button {
                text: "Get from ECU"
                enabled: currentTable !== null
            }
        }
        
        // Table editor stack
        StackLayout {
            id: stackLayout
            Layout.fillWidth: true
            Layout.fillHeight: true
            currentIndex: 0
            
            // 3D Table Editor
            Table3DEditor {
                id: table3DEditor
            }
            
            // 2D Table Editor
            Table2DEditor {
                id: table2DEditor
            }
            
            // Scalar Editor
            ScalarEditor {
                id: scalarEditor
            }
        }
    }
}
