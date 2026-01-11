import QtQuick
import QtQuick.Controls
import QtQuick.Layouts

Item {
    id: tableEditorView
    
    ColumnLayout {
        anchors.fill: parent
        anchors.margins: 10
        spacing: 10
        
        Label {
            text: "Advanced Table Editor"
            font.pixelSize: 18
            font.bold: true
        }
        
        // Same as tuning view but with additional tools
        TuningView {
            Layout.fillWidth: true
            Layout.fillHeight: true
        }
    }
}
