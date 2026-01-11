import QtQuick
import QtQuick.Controls
import QtQuick.Layouts
import QtQuick.Dialogs

ApplicationWindow {
    id: offlineActivationDialog
    width: 650
    height: 700
    minimumWidth: 600
    minimumHeight: 650
    title: "Offline Activate TunerStudio MS"
    color: "#f5f5f5"
    
    // Signals
    signal activationComplete(string activationCode)
    signal activationCancelled()
    
    // Properties
    property string productName: "TunerStudio MS"
    property string activationRequest: ""
    
    ColumnLayout {
        anchors.fill: parent
        anchors.margins: 15
        spacing: 15
        
        // Main panel
        GroupBox {
            Layout.fillWidth: true
            title: productName + " Offline Registration Activation"
            
            ColumnLayout {
                anchors.fill: parent
                spacing: 10
                
                // Instructions
                Label {
                    Layout.fillWidth: true
                    text: "<h2>5 Step Offline Activation</h2>" +
                          "<p><b>Step 1</b> - Save Activation Request to File ActivationRequest.txt on a USB drive or other medium.</p>" +
                          "<p><b>Step 2</b> - On a Computer that is connected to the Internet, open a web browser and go to<br>" +
                          "&nbsp;&nbsp;&nbsp;&nbsp;<font color=\"blue\"><u>https://www.efianalytics.com/activate</u></font></p>" +
                          "<p><b>Step 3</b> - Upload your saved ActivationRequest.txt, the site will provide you with ActivationCode.txt</p>" +
                          "<p><b>Step 4</b> - Return to TunerStudio and click Load Activation From File to load ActivationCode.txt into TunerStudio</p>" +
                          "<p><b>Step 5</b> - Click Accept</p>" +
                          "<p><b>Done!</b></p>"
                    wrapMode: Text.WordWrap
                    textFormat: Text.RichText
                    onLinkActivated: Qt.openUrlExternally(link)
                    
                    MouseArea {
                        anchors.fill: parent
                        acceptedButtons: Qt.NoButton
                        cursorShape: parent.hoveredLink ? Qt.PointingHandCursor : Qt.ArrowCursor
                    }
                }
            }
        }
        
        // Activation Request section
        GroupBox {
            Layout.fillWidth: true
            title: "Activation Request"
            
            ColumnLayout {
                anchors.fill: parent
                spacing: 10
                
                ScrollView {
                    Layout.fillWidth: true
                    Layout.preferredHeight: 120
                    Layout.minimumHeight: 60
                    
                    TextArea {
                        id: requestTextArea
                        text: activationRequest
                        readOnly: true
                        selectByMouse: true
                        wrapMode: TextEdit.Wrap
                        background: Rectangle {
                            color: "#d3d3d3"
                            border.color: "#999"
                            border.width: 1
                            radius: 3
                        }
                        
                        Component.onCompleted: {
                            selectAll()
                        }
                    }
                }
                
                RowLayout {
                    Layout.alignment: Qt.AlignRight
                    spacing: 10
                    
                    Label {
                        text: "Step 1 -->"
                        font.bold: true
                    }
                    
                    Button {
                        text: "Save Request to File"
                        onClicked: saveRequestDialog.open()
                    }
                    
                    Button {
                        text: "Copy Request to Clipboard"
                        onClicked: {
                            clipboardHelper.setClipboardText(requestTextArea.text)
                            statusLabel.text = "✓ Copied to clipboard"
                            statusTimer.start()
                        }
                    }
                }
            }
        }
        
        // Server Activation Code section
        GroupBox {
            Layout.fillWidth: true
            title: "Server Activation Code"
            
            ColumnLayout {
                anchors.fill: parent
                spacing: 10
                
                ScrollView {
                    Layout.fillWidth: true
                    Layout.preferredHeight: 120
                    Layout.minimumHeight: 60
                    
                    TextArea {
                        id: activationCodeArea
                        placeholderText: "Paste or load activation code here..."
                        selectByMouse: true
                        wrapMode: TextEdit.Wrap
                        background: Rectangle {
                            color: "white"
                            border.color: "#ccc"
                            border.width: 1
                            radius: 3
                        }
                        
                        onTextChanged: {
                            acceptButton.enabled = text.trim().length > 0
                        }
                    }
                }
                
                RowLayout {
                    Layout.alignment: Qt.AlignRight
                    spacing: 10
                    
                    Label {
                        text: "Step 4 -->"
                        font.bold: true
                    }
                    
                    Button {
                        text: "Load Activation From File"
                        onClicked: loadActivationDialog.open()
                    }
                    
                    Button {
                        text: "Paste Activation Code"
                        onClicked: {
                            activationCodeArea.text = clipboardHelper.getClipboardText()
                        }
                    }
                }
            }
        }
        
        // Status label
        Label {
            id: statusLabel
            Layout.fillWidth: true
            Layout.alignment: Qt.AlignHCenter
            color: "#4CAF50"
            font.bold: true
            visible: text.length > 0
        }
        
        Timer {
            id: statusTimer
            interval: 3000
            onTriggered: statusLabel.text = ""
        }
        
        Item {
            Layout.fillHeight: true
        }
        
        // Bottom buttons
        RowLayout {
            Layout.fillWidth: true
            Layout.alignment: Qt.AlignRight
            spacing: 10
            
            Label {
                text: "Step 5 -->"
                font.bold: true
            }
            
            Button {
                id: acceptButton
                text: "Accept"
                enabled: false
                highlighted: true
                onClicked: {
                    if (activationCodeArea.text.trim().length > 0) {
                        activationComplete(activationCodeArea.text.trim())
                        offlineActivationDialog.close()
                    }
                }
            }
            
            Button {
                text: "Cancel"
                onClicked: {
                    activationCancelled()
                    offlineActivationDialog.close()
                }
            }
        }
    }
    
    // File dialogs
    FileDialog {
        id: saveRequestDialog
        fileMode: FileDialog.SaveFile
        defaultSuffix: "txt"
        nameFilters: ["Text files (*.txt)", "All files (*)"]
        currentFolder: "file:///" + clipboardHelper.getHomeDirectory()
        
        onAccepted: {
            clipboardHelper.saveTextToFile(selectedFile.toString(), requestTextArea.text)
            statusLabel.text = "✓ Saved to file"
            statusTimer.start()
        }
    }
    
    FileDialog {
        id: loadActivationDialog
        fileMode: FileDialog.OpenFile
        nameFilters: ["Text files (*.txt)", "All files (*)"]
        currentFolder: "file:///" + clipboardHelper.getHomeDirectory()
        
        onAccepted: {
            var content = clipboardHelper.loadTextFromFile(selectedFile.toString())
            if (content) {
                activationCodeArea.text = content
                statusLabel.text = "✓ Loaded from file"
                statusTimer.start()
            }
        }
    }
    
    Component.onCompleted: {
        // Generate mock activation request on load
        generateMockActivationRequest()
    }
    
    function generateMockActivationRequest() {
        var timestamp = new Date().toISOString()
        activationRequest = "=== ACTIVATION REQUEST ===\n" +
                          "Product: " + productName + "\n" +
                          "Computer ID: ABC123XYZ789\n" +
                          "Timestamp: " + timestamp + "\n" +
                          "Request Code: 1A2B3C4D5E6F7G8H\n" +
                          "=========================\n" +
                          "Please submit this to:\n" +
                          "https://www.efianalytics.com/activate"
        requestTextArea.text = activationRequest
    }
}
