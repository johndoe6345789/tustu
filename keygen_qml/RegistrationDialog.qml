// Registration Dialog based on Java dS.java
import QtQuick 6.5
import QtQuick.Controls 6.5
import QtQuick.Layouts 6.5
import QtQuick.Window 6.5

Dialog {
    id: registrationDialog
    title: "Enter Registration Information"
    width: 500
    height: 600
    modal: true
    standardButtons: Dialog.Ok | Dialog.Cancel
    
    property string productName: "MegaLogViewer"
    property var editions: ["Standard", "Pro", "Enterprise"]
    
    ColumnLayout {
        anchors.fill: parent
        spacing: 10
        
        // Radio buttons for input method
        ButtonGroup {
            id: inputMethodGroup
            buttons: [inputsRadio, pasteEmailRadio]
        }
        
        RowLayout {
            Layout.fillWidth: true
            spacing: 20
            
            RadioButton {
                id: inputsRadio
                text: "Inputs"
                checked: true
                onClicked: stackLayout.currentIndex = 0
            }
            
            RadioButton {
                id: pasteEmailRadio
                text: "Paste Email"
                onClicked: stackLayout.currentIndex = 1
            }
        }
        
        Rectangle {
            Layout.fillWidth: true
            Layout.fillHeight: true
            border.color: "#ccc"
            border.width: 1
            radius: 5
            
            StackLayout {
                id: stackLayout
                anchors.fill: parent
                anchors.margins: 10
                currentIndex: 0
                
                // Inputs View
                ScrollView {
                    Layout.fillWidth: true
                    Layout.fillHeight: true
                    
                    ColumnLayout {
                        width: parent.width
                        spacing: 10
                        
                        // Edition Selector
                        GroupBox {
                            title: "Register " + productName + " (Select Edition)"
                            Layout.fillWidth: true
                            
                            ComboBox {
                                id: editionCombo
                                anchors.fill: parent
                                model: editions
                            }
                        }
                        
                        // Registration Information
                        GroupBox {
                            title: "Registration Information"
                            Layout.fillWidth: true
                            
                            GridLayout {
                                anchors.fill: parent
                                columns: 2
                                columnSpacing: 10
                                rowSpacing: 8
                                
                                Label { text: "Registered First Name:" }
                                TextField {
                                    id: firstNameField
                                    Layout.fillWidth: true
                                }
                                
                                Label { text: "Registered Last Name:" }
                                TextField {
                                    id: lastNameField
                                    Layout.fillWidth: true
                                }
                                
                                Label { text: "Registered eMail Address:" }
                                TextField {
                                    id: emailField
                                    Layout.fillWidth: true
                                }
                                
                                Label { text: "Registration Key:" }
                                TextField {
                                    id: registrationKeyField
                                    Layout.fillWidth: true
                                    font.family: "Courier"
                                }
                                
                                Label { text: "Serial Number:" }
                                TextField {
                                    id: serialField
                                    Layout.fillWidth: true
                                }
                            }
                        }
                    }
                }
                
                // Paste Email View
                ColumnLayout {
                    Layout.fillWidth: true
                    Layout.fillHeight: true
                    spacing: 10
                    
                    Button {
                        text: "Paste"
                        Layout.alignment: Qt.AlignHCenter
                        onClicked: pasteFromClipboard()
                    }
                    
                    ScrollView {
                        Layout.fillWidth: true
                        Layout.fillHeight: true
                        
                        TextArea {
                            id: pasteTextArea
                            placeholderText: "Paste registration email here..."
                            wrapMode: TextArea.Wrap
                            font.family: "Monospace"
                            onTextChanged: parseEmailText()
                        }
                    }
                }
            }
        }
    }
    
    onAccepted: {
        // Validate and process registration
        console.log("Registration submitted")
        console.log("First Name:", firstNameField.text)
        console.log("Last Name:", lastNameField.text)
        console.log("Email:", emailField.text)
        console.log("Key:", registrationKeyField.text)
    }
    
    function pasteFromClipboard() {
        // Get text from clipboard
        pasteTextArea.text = ""; // Would paste from actual clipboard
    }
    
    function parseEmailText() {
        var text = pasteTextArea.text
        var lines = text.split('\n')
        var inRegistration = false
        
        for (var i = 0; i < lines.length; i++) {
            var line = lines[i].trim()
            
            if (line.includes('[Registration]')) {
                inRegistration = true
                continue
            }
            
            if (line.includes('[End Registration]')) {
                break
            }
            
            if (inRegistration) {
                if (line.startsWith('First Name')) {
                    firstNameField.text = line.substring(line.indexOf(':') + 1).trim()
                }
                else if (line.startsWith('Last Name')) {
                    lastNameField.text = line.substring(line.indexOf(':') + 1).trim()
                }
                else if (line.startsWith('Registered email')) {
                    emailField.text = line.substring(line.indexOf(':') + 1).trim()
                }
                else if (line.includes('Serial Number')) {
                    serialField.text = line.substring(line.indexOf(':') + 1).trim()
                }
                else if (line.startsWith('Registration Key')) {
                    registrationKeyField.text = line.substring(line.indexOf(':') + 1).trim()
                }
            }
        }
    }
}
