import QtQuick 6.5
import QtQuick.Controls 6.5
import QtQuick.Layouts 6.5

ScrollView {
    id: root
    clip: true
    
    property string algorithm: "5-param"
    property bool showSecret: true
    property bool showMonth: false
    property bool showYear: false
    property bool showSerial: false
    
    contentWidth: availableWidth
    
    ColumnLayout {
        width: parent.width
        spacing: 15
        
        // Input Group
        GroupBox {
            title: "Input Parameters"
            Layout.fillWidth: true
            
            GridLayout {
                anchors.fill: parent
                columns: 2
                columnSpacing: 10
                rowSpacing: 8
                
                Label { 
                    text: "First Name:" 
                    font.bold: true
                }
                TextField {
                    id: firstNameField
                    Layout.fillWidth: true
                    placeholderText: "Enter first name"
                }
                
                Label { 
                    text: "Last Name:" 
                    font.bold: true
                }
                TextField {
                    id: lastNameField
                    Layout.fillWidth: true
                    placeholderText: "Enter last name"
                }
                
                Label { 
                    text: "Product Name:" 
                    font.bold: true
                }
                ComboBox {
                    id: productField
                    Layout.fillWidth: true
                    editable: true
                    model: ["MegaLogViewer", "TunerStudio", "DataLogger"]
                }
                
                Label { 
                    text: "Secret Key:" 
                    font.bold: true
                    visible: showSecret
                }
                TextField {
                    id: secretField
                    Layout.fillWidth: true
                    placeholderText: "Enter secret key"
                    visible: showSecret
                }
                
                Label { 
                    text: "Email:" 
                    font.bold: true
                }
                TextField {
                    id: emailField
                    Layout.fillWidth: true
                    placeholderText: "Enter email address"
                }
                
                Label { 
                    text: "Month:" 
                    font.bold: true
                    visible: showMonth
                }
                TextField {
                    id: monthField
                    Layout.fillWidth: true
                    text: "01"
                    placeholderText: "MM"
                    visible: showMonth
                }
                
                Label { 
                    text: "Year:" 
                    font.bold: true
                    visible: showYear
                }
                TextField {
                    id: yearField
                    Layout.fillWidth: true
                    text: "2015"
                    placeholderText: "YYYY"
                    visible: showYear
                }
                
                Label { 
                    text: "Serial Number:" 
                    font.bold: true
                    visible: showSerial
                }
                TextField {
                    id: serialField
                    Layout.fillWidth: true
                    placeholderText: "Enter serial number"
                    visible: showSerial
                }
            }
        }
        
        // Buttons
        RowLayout {
            Layout.fillWidth: true
            spacing: 10
            
            Button {
                text: "Load Test Data"
                Layout.fillWidth: true
                background: Rectangle {
                    implicitHeight: 40
                    color: parent.pressed ? "#1976D2" : "#2196F3"
                    radius: 5
                }
                contentItem: Text {
                    text: parent.text
                    color: "white"
                    horizontalAlignment: Text.AlignHCenter
                    verticalAlignment: Text.AlignVCenter
                    font.bold: true
                }
                onClicked: loadTestData()
            }
            
            Button {
                text: "Generate Key"
                Layout.fillWidth: true
                background: Rectangle {
                    implicitHeight: 40
                    color: parent.pressed ? "#45a049" : "#4CAF50"
                    radius: 5
                }
                contentItem: Text {
                    text: parent.text
                    color: "white"
                    horizontalAlignment: Text.AlignHCenter
                    verticalAlignment: Text.AlignVCenter
                    font.bold: true
                }
                onClicked: generateKey()
            }
            
            Button {
                text: "Validate Key"
                Layout.fillWidth: true
                background: Rectangle {
                    implicitHeight: 40
                    color: parent.pressed ? "#F57C00" : "#FF9800"
                    radius: 5
                }
                contentItem: Text {
                    text: parent.text
                    color: "white"
                    horizontalAlignment: Text.AlignHCenter
                    verticalAlignment: Text.AlignVCenter
                    font.bold: true
                }
                onClicked: validateKey()
            }
        }
        
        // Output Group
        GroupBox {
            title: "Generated Registration Key"
            Layout.fillWidth: true
            
            ColumnLayout {
                anchors.fill: parent
                spacing: 10
                
                Rectangle {
                    Layout.fillWidth: true
                    Layout.preferredHeight: 80
                    color: "#e8f5e9"
                    border.color: "#4CAF50"
                    border.width: 2
                    radius: 5
                    
                    ScrollView {
                        anchors.fill: parent
                        anchors.margins: 5
                        
                        TextEdit {
                            id: outputField
                            width: parent.width
                            wrapMode: TextEdit.Wrap
                            readOnly: true
                            font.family: "Courier"
                            font.pixelSize: 14
                            font.bold: true
                            selectByMouse: true
                        }
                    }
                }
                
                Button {
                    text: "Copy to Clipboard"
                    Layout.fillWidth: true
                    onClicked: copyToClipboard()
                }
            }
        }
        
        Item { Layout.fillHeight: true }
    }
    
    function loadTestData() {
        // This would call Python backend
        console.log("Load test data for", algorithm)
    }
    
    function generateKey() {
        // This would call Python backend
        console.log("Generate key for", algorithm)
    }
    
    function validateKey() {
        // This would call Python backend
        console.log("Validate key for", algorithm)
    }
    
    function copyToClipboard() {
        // Copy output to clipboard
        console.log("Copy to clipboard")
    }
}
