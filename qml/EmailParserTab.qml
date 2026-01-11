import QtQuick 6.5
import QtQuick.Controls 6.5
import QtQuick.Layouts 6.5

ScrollView {
    id: root
    clip: true
    contentWidth: availableWidth
    
    ColumnLayout {
        width: parent.width
        spacing: 15
        
        // Instructions
        Rectangle {
            Layout.fillWidth: true
            Layout.preferredHeight: instructionsText.height + 20
            color: "#e3f2fd"
            radius: 5
            
            Text {
                id: instructionsText
                anchors.fill: parent
                anchors.margins: 10
                text: "Parse or Generate Registration Emails:\n\n" +
                      "• PARSE: Paste a registration email and click 'Parse Email' to extract fields\n" +
                      "• GENERATE: Fill in the fields below and click 'Generate Email Format' to create formatted text\n" +
                      "• VALIDATE: Click 'Validate Key' to check if the registration key is correct"
                wrapMode: Text.WordWrap
                font.pixelSize: 12
            }
        }
        
        // Email Input Area
        GroupBox {
            title: "Paste Registration Email Here"
            Layout.fillWidth: true
            
            ColumnLayout {
                anchors.fill: parent
                spacing: 10
                
                ScrollView {
                    Layout.fillWidth: true
                    Layout.preferredHeight: 150
                    
                    TextArea {
                        id: emailTextArea
                        placeholderText: "[Registration]\n" +
                                       "First Name: John\n" +
                                       "Last Name: Doe\n" +
                                       "Registered email: john.doe@example.com\n" +
                                       "Serial Number: ABC123\n" +
                                       "Registration Key: XYZ789\n" +
                                       "[End Registration]"
                        wrapMode: TextArea.Wrap
                        font.family: "Monospace"
                    }
                }
                
                Button {
                    text: "Parse Registration Information"
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
                    onClicked: parseEmail()
                }
            }
        }
        
        // Extracted Information
        GroupBox {
            title: "Extracted Information"
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
                    id: firstNameOutput
                    Layout.fillWidth: true
                    placeholderText: "Enter or parse first name"
                }
                
                Label { 
                    text: "Last Name:" 
                    font.bold: true
                }
                TextField {
                    id: lastNameOutput
                    Layout.fillWidth: true
                    placeholderText: "Enter or parse last name"
                }
                
                Label { 
                    text: "Email:" 
                    font.bold: true
                }
                TextField {
                    id: emailOutput
                    Layout.fillWidth: true
                    placeholderText: "Enter or parse email address"
                }
                
                Label { 
                    text: "Serial Number:" 
                    font.bold: true
                }
                TextField {
                    id: serialOutput
                    Layout.fillWidth: true
                    placeholderText: "Optional serial number"
                }
                
                Label { 
                    text: "Registration Key:" 
                    font.bold: true
                    Layout.alignment: Qt.AlignTop
                }
                Rectangle {
                    Layout.fillWidth: true
                    Layout.preferredHeight: 60
                    color: "#ffffff"
                    border.color: "#ccc"
                    border.width: 1
                    radius: 3
                    
                    ScrollView {
                        anchors.fill: parent
                        anchors.margins: 5
                        
                        TextEdit {
                            id: keyOutput
                            width: parent.width
                            wrapMode: TextEdit.Wrap
                            font.family: "Courier"
                            font.pixelSize: 11
                            font.bold: true
                            selectByMouse: true
                        }
                    }
                }
            }
        }
        
        // Action Buttons
        RowLayout {
            Layout.fillWidth: true
            spacing: 10
            
            Button {
                text: "Load Test Data"
                Layout.fillWidth: true
                background: Rectangle {
                    implicitHeight: 35
                    color: parent.pressed ? "#7B1FA2" : "#9C27B0"
                    radius: 3
                }
                contentItem: Text {
                    text: parent.text
                    color: "white"
                    horizontalAlignment: Text.AlignHCenter
                    verticalAlignment: Text.AlignVCenter
                    font.bold: true
                    font.pixelSize: 13
                }
                onClicked: loadTestData()
            }
            
            Button {
                text: "Parse Email"
                Layout.fillWidth: true
                onClicked: parseEmail()
            }
            
            Button {
                text: "Generate Email Format"
                Layout.fillWidth: true
                background: Rectangle {
                    implicitHeight: 35
                    color: parent.pressed ? "#45a049" : "#4CAF50"
                    radius: 3
                }
                contentItem: Text {
                    text: parent.text
                    color: "white"
                    horizontalAlignment: Text.AlignHCenter
                    verticalAlignment: Text.AlignVCenter
                    font.bold: true
                    font.pixelSize: 13
                }
                onClicked: generateEmail()
            }
            
            Button {
                text: "Copy Key"
                Layout.fillWidth: true
                onClicked: copyKey()
            }
            
            Button {
                text: "Validate Key"
                Layout.fillWidth: true
                background: Rectangle {
                    implicitHeight: 35
                    color: parent.pressed ? "#F57C00" : "#FF9800"
                    radius: 3
                }
                contentItem: Text {
                    text: parent.text
                    color: "white"
                    horizontalAlignment: Text.AlignHCenter
                    verticalAlignment: Text.AlignVCenter
                    font.bold: true
                    font.pixelSize: 13
                }
                onClicked: validateKey()
            }
        }
        
        Item { Layout.fillHeight: true }
    }
    
    function loadTestData() {
        console.log("Load test data")
    }
    
    function parseEmail() {
        console.log("Parse email")
    }
    
    function generateEmail() {
        console.log("Generate email format")
    }
    
    function copyKey() {
        console.log("Copy key to clipboard")
    }
    
    function validateKey() {
        console.log("Validate key")
    }
}
