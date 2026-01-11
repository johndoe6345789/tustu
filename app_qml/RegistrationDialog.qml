import QtQuick
import QtQuick.Controls
import QtQuick.Layouts
import QtQuick.Dialogs

ApplicationWindow {
    id: registrationDialog
    width: 600
    height: 580
    minimumWidth: 550
    minimumHeight: 520
    title: "Enter Registration Information"
    color: "#f5f5f5"
    
    // Signals
    signal registrationComplete(string firstName, string lastName, string email, string key, string edition, string serialNumber)
    signal registrationCancelled()
    
    // Properties
    property var editions: ["Standard", "Professional", "Ultra", "Lite"]
    property string productName: "TunerStudio MS"
    
    ColumnLayout {
        anchors.fill: parent
        anchors.margins: 10
        spacing: 10
        
        // Radio buttons for input method
        RowLayout {
            Layout.fillWidth: true
            Layout.alignment: Qt.AlignHCenter
            spacing: 20
            
            RadioButton {
                id: inputsRadio
                text: "Inputs"
                checked: true
                onCheckedChanged: {
                    if (checked) {
                        stackLayout.currentIndex = 0
                    }
                }
            }
            
            RadioButton {
                id: pasteEmailRadio
                text: "Paste Email"
                onCheckedChanged: {
                    if (checked) {
                        stackLayout.currentIndex = 1
                    }
                }
            }
        }
        
        // Stack layout for switching between input methods
        StackLayout {
            id: stackLayout
            Layout.fillWidth: true
            Layout.fillHeight: true
            currentIndex: 0
            
            // Page 0: Manual Inputs
            Item {
                Layout.fillWidth: true
                Layout.fillHeight: true
                
                ColumnLayout {
                    anchors.fill: parent
                    spacing: 10
                    
                    // Edition selector
                    GroupBox {
                        Layout.fillWidth: true
                        title: "Register " + productName + " (Select Edition)"
                        
                        ColumnLayout {
                            anchors.fill: parent
                            
                            ComboBox {
                                id: editionCombo
                                Layout.fillWidth: true
                                model: editions
                                currentIndex: 0
                            }
                        }
                    }
                    
                    // Registration Information
                    GroupBox {
                        Layout.fillWidth: true
                        title: "Registration Information"
                        
                        GridLayout {
                            anchors.fill: parent
                            columns: 2
                            columnSpacing: 10
                            rowSpacing: 8
                            
                            Label {
                                text: "Registered First Name:"
                                Layout.alignment: Qt.AlignRight | Qt.AlignVCenter
                            }
                            TextField {
                                id: firstNameField
                                Layout.fillWidth: true
                                placeholderText: "Enter first name"
                            }
                            
                            Label {
                                text: "Registered Last Name:"
                                Layout.alignment: Qt.AlignRight | Qt.AlignVCenter
                            }
                            TextField {
                                id: lastNameField
                                Layout.fillWidth: true
                                placeholderText: "Enter last name"
                            }
                            
                            Label {
                                text: "Registered eMail Address:"
                                Layout.alignment: Qt.AlignRight | Qt.AlignVCenter
                            }
                            TextField {
                                id: emailField
                                Layout.fillWidth: true
                                placeholderText: "your.email@example.com"
                            }
                            
                            Label {
                                text: "Registration Key:"
                                Layout.alignment: Qt.AlignRight | Qt.AlignVCenter
                            }
                            TextField {
                                id: keyField
                                Layout.fillWidth: true
                                placeholderText: "Enter registration key"
                            }
                            
                            Label {
                                text: "Serial Number:"
                                Layout.alignment: Qt.AlignRight | Qt.AlignVCenter
                            }
                            TextField {
                                id: serialNumberField
                                Layout.fillWidth: true
                                placeholderText: "Optional"
                            }
                        }
                    }
                    
                    Item {
                        Layout.fillHeight: true
                    }
                }
            }
            
            // Page 1: Paste Email
            Item {
                Layout.fillWidth: true
                Layout.fillHeight: true
                
                ColumnLayout {
                    anchors.fill: parent
                    spacing: 10
                    
                    Button {
                        text: "Paste"
                        Layout.alignment: Qt.AlignHCenter
                        onClicked: {
                            pasteEmailText.text = clipboardHelper.getClipboardText()
                            parseEmailContent()
                        }
                    }
                    
                    ScrollView {
                        Layout.fillWidth: true
                        Layout.fillHeight: true
                        
                        TextArea {
                            id: pasteEmailText
                            wrapMode: TextEdit.Wrap
                            placeholderText: "Paste your registration email here..."
                            onTextChanged: parseEmailContent()
                            
                            background: Rectangle {
                                color: "white"
                                border.color: "#ccc"
                                border.width: 1
                                radius: 3
                            }
                        }
                    }
                }
            }
        }
        
        // Buttons
        RowLayout {
            Layout.fillWidth: true
            Layout.alignment: Qt.AlignRight
            spacing: 10
            
            Button {
                text: "Ok"
                highlighted: true
                onClicked: validateAndAccept()
            }
            
            Button {
                text: "Cancel"
                onClicked: {
                    registrationCancelled()
                    registrationDialog.close()
                }
            }
        }
    }
    
    // Dialog for validation errors
    MessageDialog {
        id: errorDialog
        buttons: MessageDialog.Ok
    }
    
    // Functions
    function parseEmailContent() {
        var text = pasteEmailText.text
        var lines = text.split('\n')
        var inRegistrationSection = false
        
        for (var i = 0; i < lines.length; i++) {
            var line = lines[i].trim()
            
            if (line.startsWith("[Registration]")) {
                inRegistrationSection = true
                continue
            }
            
            if (line.startsWith("[End Registration]")) {
                inRegistrationSection = false
                continue
            }
            
            if (inRegistrationSection) {
                if (line.startsWith("First Name")) {
                    var value = line.substring(line.indexOf(":") + 1).trim()
                    firstNameField.text = value
                }
                else if (line.startsWith("Last Name")) {
                    var value = line.substring(line.indexOf(":") + 1).trim()
                    lastNameField.text = value
                }
                else if (line.startsWith("Registered email")) {
                    var value = line.substring(line.indexOf(":") + 1).trim()
                    emailField.text = value
                }
                else if (line.includes("Serial Number:")) {
                    var value = line.substring(line.indexOf(":") + 1).trim()
                    serialNumberField.text = value
                }
                else if (line.startsWith("Registration Key")) {
                    var value = line.substring(line.indexOf(":") + 1).trim()
                    keyField.text = value
                }
            }
        }
    }
    
    function validateAndAccept() {
        var errors = []
        
        if (firstNameField.text.trim() === "") {
            errors.push("First Name")
        }
        if (lastNameField.text.trim() === "") {
            errors.push("Last Name")
        }
        if (emailField.text.trim() === "") {
            errors.push("eMail Address")
        }
        if (keyField.text.trim() === "") {
            errors.push("Registration Key")
        }
        
        if (errors.length > 0) {
            errorDialog.title = "Missing Information"
            errorDialog.text = "You must provide the information used during registration for:\n" + errors.join("\n")
            errorDialog.open()
            return
        }
        
        // Emit signal with registration data
        registrationComplete(
            firstNameField.text.trim(),
            lastNameField.text.trim(),
            emailField.text.trim(),
            keyField.text.trim(),
            editionCombo.currentText,
            serialNumberField.text.trim()
        )
        
        registrationDialog.close()
    }
}
