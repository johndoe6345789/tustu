import QtQuick
import QtQuick.Controls
import QtQuick.Layouts

Item {
    id: scalarEditor
    
    ColumnLayout {
        anchors.fill: parent
        anchors.margins: 20
        spacing: 15
        
        Label {
            text: "Scalar Value Editor"
            font.pixelSize: 16
            font.bold: true
        }
        
        GridLayout {
            columns: 2
            rowSpacing: 10
            columnSpacing: 15
            
            Label { text: "Value:" }
            SpinBox {
                from: 0
                to: 1000
                value: 100
                editable: true
            }
            
            Label { text: "Units:" }
            ComboBox {
                model: ["ms", "degrees", "%", "kPa"]
                Layout.preferredWidth: 150
            }
        }
        
        Item { Layout.fillHeight: true }
    }
}
