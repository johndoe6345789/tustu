import QtQuick
import QtQuick.Controls
import QtQuick.Layouts

ApplicationWindow {
    id: mainWindow
    width: 1200
    height: 800
    visible: true
    title: "TunerStudio MS - Engine Management System"
    
    // Menu bar
    menuBar: MenuBar {
        Menu {
            title: "&File"
            MenuItem { text: "Open Project..."; onTriggered: console.log("Open") }
            MenuItem { text: "Recent Projects" }
            MenuSeparator {}
            MenuItem { text: "Save Configuration" }
            MenuItem { text: "Save As..." }
            MenuSeparator {}
            MenuItem { text: "Exit"; onTriggered: Qt.quit() }
        }
        
        Menu {
            title: "&Tools"
            MenuItem { text: "Calibrate TPS"; onTriggered: statusLabel.text = "TPS Calibration Started" }
            MenuItem { text: "Reset Control Unit"; onTriggered: resetDialog.open() }
            MenuItem { text: "Tooth Logger"; onTriggered: statusLabel.text = "Tooth Logger Active" }
            MenuSeparator {}
            MenuItem { text: "Burn to ECU"; onTriggered: burnDialog.open() }
            MenuItem { text: "Get from ECU" }
            MenuSeparator {}
            MenuItem { text: "Firmware Update..."; onTriggered: firmwareDialog.open() }
        }
        
        Menu {
            title: "&Communications"
            MenuItem { 
                text: "Connect"; 
                checkable: true 
                onTriggered: {
                    if (checked) {
                        connectionDialog.open()
                    } else {
                        statusLabel.text = "Disconnected"
                        statusLabel.color = "#ff6b6b"
                    }
                }
            }
            MenuItem { text: "Settings..."; onTriggered: connectionDialog.open() }
            MenuSeparator {}
            MenuItem { 
                text: "Detect Port"
                onTriggered: {
                    statusLabel.text = "Detecting ports..."
                    detectTimer.start()
                }
            }
        }
        
        Menu {
            title: "&Tuning"
            MenuItem { text: "Open Tuning Dialog" }
            MenuItem { text: "Table Editor" }
            MenuItem { text: "3D Table View" }
        }
        
        Menu {
            title: "&Data Logging"
            MenuItem { 
                id: startLogMenuItem
                text: "Start Log (F2)" 
                onTriggered: {
                    text = "Stop Log (F3)"
                    statusLabel.text = "Logging Active..."
                    statusLabel.color = "#f39c12"
                }
            }
            MenuSeparator {}
            MenuItem { text: "View Logs..." }
            MenuItem { text: "Log Settings..." }
        }
        
        Menu {
            title: "&Help"
            MenuItem { text: "Hot Keys"; onTriggered: hotKeysDialog.open() }
            MenuItem { text: "Help Topics"; onTriggered: Qt.openUrlExternally("https://www.efianalytics.com/TunerStudio/help/") }
            MenuItem { text: "Online Help"; onTriggered: Qt.openUrlExternally("https://www.efianalytics.com/TunerStudio/") }
            MenuSeparator {}
            MenuItem { text: "Check for Updates" }
            MenuSeparator {}
            MenuItem { text: "Purchase Registration"; onTriggered: Qt.openUrlExternally("https://www.efianalytics.com/register/") }
            MenuItem { text: "Enter Registration..."; onTriggered: registrationDialog.open() }
            MenuSeparator {}
            MenuItem { text: "About"; onTriggered: aboutDialog.open() }
        }
    }
    
    // Tool bar
    header: ToolBar {
        RowLayout {
            anchors.fill: parent
            spacing: 5
            
            ToolButton {
                text: "Connect"
                icon.source: "qrc:/icons/connect.png"
                checkable: true
                checked: false
                onClicked: {
                    if (checked) {
                        connectionDialog.open()
                    } else {
                        statusLabel.text = "Disconnected"
                        statusLabel.color = "#ff6b6b"
                    }
                }
            }
            
            ToolSeparator {}
            
            ToolButton {
                text: "Upload"
                icon.source: "qrc:/icons/upload.png"
                enabled: false
            }
            
            ToolButton {
                text: "Download"
                icon.source: "qrc:/icons/download.png"
                enabled: false
            }
            
            ToolSeparator {}
            
            ToolButton {
                text: "Start Log"
                icon.source: "qrc:/icons/log.png"
            }
            
            ToolButton {
                text: "Stop Log"
                icon.source: "qrc:/icons/stop.png"
                enabled: false
            }
            
            ToolSeparator {}
            
            ToolButton {
                text: "Dashboard"
                icon.source: "qrc:/icons/dashboard.png"
                onClicked: tabBar.currentIndex = 1
            }
            
            Item { Layout.fillWidth: true }
            
            Label {
                text: "Status: "
                font.bold: true
            }
            
            Label {
                id: statusLabel
                text: "Simulation Running - Driving Around Block"
                color: "#2ecc71"
            }
        }
    }
    
    // Main content with tab bar
    ColumnLayout {
        anchors.fill: parent
        spacing: 0
        
        TabBar {
            id: tabBar
            Layout.fillWidth: true
            
            TabButton {
                text: "Tuning"
                width: implicitWidth
            }
            TabButton {
                text: "Dashboard"
                width: implicitWidth
            }
            TabButton {
                text: "Data Logging"
                width: implicitWidth
            }
            TabButton {
                text: "Table Editor"
                width: implicitWidth
            }
            TabButton {
                text: "Diagnostics"
                width: implicitWidth
            }
        }
        
        StackLayout {
            Layout.fillWidth: true
            Layout.fillHeight: true
            currentIndex: tabBar.currentIndex
            
            // Tab 0: Tuning View
            TuningView {
                id: tuningView
            }
            
            // Tab 1: Dashboard with gauges
            DashboardView {
                id: dashboardView
            }
            
            // Tab 2: Data Logging
            DataLoggingView {
                id: dataLoggingView
            }
            
            // Tab 3: Table Editor
            TableEditorView {
                id: tableEditorView
            }
            
            // Tab 4: Diagnostics
            DiagnosticsView {
                id: diagnosticsView
            }
        }
    }
    
    // Status bar
    footer: ToolBar {
        RowLayout {
            anchors.fill: parent
            spacing: 10
            
            Label {
                text: "Port: COM3"
                font.pixelSize: 11
            }
            
            Rectangle {
                width: 1
                height: 15
                color: "#ccc"
            }
            
            Label {
                text: "Baud: 115200"
                font.pixelSize: 11
            }
            
            Rectangle {
                width: 1
                height: 15
                color: "#ccc"
            }
            
            Label {
                text: "ECU: MegaSquirt-II"
                font.pixelSize: 11
            }
            
            Item { Layout.fillWidth: true }
            
            Label {
                text: "Ready"
                font.pixelSize: 11
                color: "#4CAF50"
            }
        }
    }
    
    // About Dialog
    Dialog {
        id: aboutDialog
        title: "About TunerStudio MS"
        modal: true
        anchors.centerIn: parent
        standardButtons: Dialog.Ok
        
        ColumnLayout {
            spacing: 15
            width: 400
            
            Image {
                Layout.alignment: Qt.AlignHCenter
                source: "data:image/svg+xml,%3Csvg width='64' height='64' xmlns='http://www.w3.org/2000/svg'%3E%3Crect fill='%231976D2' width='64' height='64' rx='8'/%3E%3Ctext x='50%25' y='50%25' font-size='32' fill='white' text-anchor='middle' dy='.3em'%3ETS%3C/text%3E%3C/svg%3E"
                width: 64
                height: 64
            }
            
            Label {
                text: "TunerStudio MS"
                font.pixelSize: 24
                font.bold: true
                Layout.alignment: Qt.AlignHCenter
            }
            
            Label {
                text: "Version 3.1.06 (Build Date: 2025.01.11)"
                font.pixelSize: 12
                Layout.alignment: Qt.AlignHCenter
            }
            
            Rectangle {
                Layout.fillWidth: true
                height: 1
                color: "#ccc"
            }
            
            Label {
                text: "© 2006-2026 EFI Analytics, LLC"
                Layout.alignment: Qt.AlignHCenter
            }
            
            Label {
                text: "Engine Management & Data Logging Software"
                font.italic: true
                Layout.alignment: Qt.AlignHCenter
            }
            
            Label {
                text: "www.efianalytics.com"
                color: "#1976D2"
                Layout.alignment: Qt.AlignHCenter
                
                MouseArea {
                    anchors.fill: parent
                    cursorShape: Qt.PointingHandCursor
                    onClicked: Qt.openUrlExternally("https://www.efianalytics.com")
                }
            }
        }
    }
    
    // Hot Keys Dialog
    Dialog {
        id: hotKeysDialog
        title: "Hot Keys"
        modal: true
        width: 500
        height: 400
        standardButtons: Dialog.Ok
        
        ScrollView {
            anchors.fill: parent
            
            GridLayout {
                columns: 2
                rowSpacing: 8
                columnSpacing: 20
                
                Label { text: "Ctrl+O"; font.bold: true }
                Label { text: "Open Log File" }
                
                Label { text: "Ctrl+S"; font.bold: true }
                Label { text: "Save Configuration" }
                
                Label { text: "F2"; font.bold: true }
                Label { text: "Start Data Logging" }
                
                Label { text: "F3"; font.bold: true }
                Label { text: "Stop Data Logging" }
                
                Label { text: "Space"; font.bold: true }
                Label { text: "Pause/Resume Playback" }
                
                Label { text: "Left Arrow"; font.bold: true }
                Label { text: "Step Backward" }
                
                Label { text: "Right Arrow"; font.bold: true }
                Label { text: "Step Forward" }
                
                Label { text: "Home"; font.bold: true }
                Label { text: "Jump to Start" }
                
                Label { text: "End"; font.bold: true }
                Label { text: "Jump to End" }
                
                Label { text: "Ctrl+A"; font.bold: true }
                Label { text: "About" }
                
                Label { text: "Ctrl+Q"; font.bold: true }
                Label { text: "Quit" }
            }
        }
    }
    
    // Registration Dialog Loader
    Loader {
        id: registrationDialogLoader
        active: false
        source: "RegistrationDialog.qml"
        
        onLoaded: {
            item.visible = true
            item.registrationComplete.connect(function(firstName, lastName, email, key, edition, serial) {
                statusLabel.text = "Registration accepted for " + firstName + " " + lastName
                statusLabel.color = "#2ecc71"
            })
        }
    }
    
    function registrationDialog_open() {
        registrationDialogLoader.active = true
    }
    
    property var registrationDialog: QtObject {
        function open() {
            registrationDialogLoader.active = true
        }
    }
    
    // Reset ECU Dialog
    Dialog {
        id: resetDialog
        title: "Reset ECU"
        modal: true
        standardButtons: Dialog.Yes | Dialog.No
        
        Label {
            text: "Are you sure you want to reset the ECU?\n\nThis will restart the controller."
            wrapMode: Text.WordWrap
        }
        
        onAccepted: {
            statusLabel.text = "ECU Reset Command Sent"
        }
    }
    
    // Burn to ECU Dialog
    Dialog {
        id: burnDialog
        title: "Burn to ECU"
        modal: true
        standardButtons: Dialog.Ok | Dialog.Cancel
        
        ColumnLayout {
            spacing: 10
            
            Label {
                text: "Burn current table values to ECU?"
                font.bold: true
            }
            
            Label {
                text: "This will write all modified table values\nto the ECU's non-volatile memory."
                wrapMode: Text.WordWrap
            }
            
            CheckBox {
                text: "Verify after burn"
                checked: true
            }
        }
        
        onAccepted: {
            statusLabel.text = "Burning to ECU..."
            burnTimer.start()
        }
        
        Timer {
            id: burnTimer
            interval: 2000
            onTriggered: {
                statusLabel.text = "Burn Complete"
                statusLabel.color = "#2ecc71"
            }
        }
    }
    
    // Firmware Update Dialog  
    Dialog {
        id: firmwareDialog
        title: "Firmware Update"
        modal: true
        width: 500
        standardButtons: Dialog.Close
        
        ColumnLayout {
            anchors.fill: parent
            spacing: 15
            
            Label {
                text: "Firmware Update Manager"
                font.pixelSize: 18
                font.bold: true
            }
            
            GroupBox {
                title: "Current Firmware"
                Layout.fillWidth: true
                
                GridLayout {
                    columns: 2
                    rowSpacing: 5
                    columnSpacing: 10
                    
                    Label { text: "Version:" }
                    Label { text: "MS2Extra 3.4.2"; font.bold: true }
                    
                    Label { text: "Build Date:" }
                    Label { text: "2024-12-15" }
                }
            }
            
            GroupBox {
                title: "Update Options"
                Layout.fillWidth: true
                
                ColumnLayout {
                    spacing: 10
                    
                    RadioButton {
                        text: "Check for updates online"
                        checked: true
                    }
                    
                    RadioButton {
                        text: "Load firmware from file"
                    }
                    
                    Button {
                        text: "Browse..."
                        enabled: false
                    }
                }
            }
            
            Label {
                text: "⚠️ Warning: Never disconnect power during firmware update!"
                color: "#e74c3c"
                font.bold: true
                Layout.fillWidth: true
                wrapMode: Text.WordWrap
            }
        }
    }
    
    // Connection Dialog
    Dialog {
        id: connectionDialog
        title: "Connection Settings"
        modal: true
        width: 450
        standardButtons: Dialog.Ok | Dialog.Cancel
        
        ColumnLayout {
            spacing: 15
            width: parent.width
            
            GroupBox {
                title: "Serial Port Configuration"
                Layout.fillWidth: true
                
                GridLayout {
                    columns: 2
                    rowSpacing: 10
                    columnSpacing: 10
                    anchors.fill: parent
                    
                    Label { text: "Port:" }
                    ComboBox {
                        id: portCombo
                        Layout.fillWidth: true
                        model: ["COM1", "COM3", "COM4", "/dev/ttyUSB0", "/dev/ttyACM0"]
                        currentIndex: 1
                    }
                    
                    Label { text: "Baud Rate:" }
                    ComboBox {
                        id: baudCombo
                        Layout.fillWidth: true
                        model: ["9600", "19200", "38400", "57600", "115200", "230400"]
                        currentIndex: 4
                    }
                    
                    Label { text: "Data Bits:" }
                    ComboBox {
                        Layout.fillWidth: true
                        model: ["8", "7"]
                        currentIndex: 0
                    }
                    
                    Label { text: "Stop Bits:" }
                    ComboBox {
                        Layout.fillWidth: true
                        model: ["1", "2"]
                        currentIndex: 0
                    }
                    
                    Label { text: "Parity:" }
                    ComboBox {
                        Layout.fillWidth: true
                        model: ["None", "Even", "Odd"]
                        currentIndex: 0
                    }
                }
            }
            
            GroupBox {
                title: "ECU Type"
                Layout.fillWidth: true
                
                ComboBox {
                    anchors.fill: parent
                    model: ["MegaSquirt-II", "MegaSquirt-III", "MS2Extra", "MS3Pro", "Speeduino"]
                    currentIndex: 0
                }
            }
            
            RowLayout {
                Layout.fillWidth: true
                
                Button {
                    text: "Detect Port"
                    onClicked: {
                        statusLabel.text = "Detecting ports..."
                        detectTimer.start()
                    }
                }
                
                Button {
                    text: "Test Connection"
                    onClicked: {
                        statusLabel.text = "Testing connection..."
                        testTimer.start()
                    }
                }
                
                Item { Layout.fillWidth: true }
            }
        }
        
        onAccepted: {
            statusLabel.text = "Connected to " + portCombo.currentText + " @ " + baudCombo.currentText
            statusLabel.color = "#2ecc71"
        }
        
        Timer {
            id: detectTimer
            interval: 1500
            onTriggered: statusLabel.text = "Port detection complete"
        }
        
        Timer {
            id: testTimer
            interval: 1000
            onTriggered: {
                statusLabel.text = "Connection OK"
                statusLabel.color = "#2ecc71"
            }
        }
    }
    
    // Calibrate TPS Dialog
    Dialog {
        id: calibrateTpsDialog
        title: "Throttle Position Sensor Calibration"
        modal: true
        width: 450
        standardButtons: Dialog.Close
        
        ColumnLayout {
            spacing: 15
            width: parent.width
            
            Label {
                text: "TPS Calibration Wizard"
                font.pixelSize: 18
                font.bold: true
            }
            
            Label {
                text: "This wizard will guide you through calibrating the throttle position sensor."
                wrapMode: Text.WordWrap
                Layout.fillWidth: true
            }
            
            GroupBox {
                title: "Step 1: Closed Throttle"
                Layout.fillWidth: true
                
                ColumnLayout {
                    spacing: 10
                    
                    Label {
                        text: "1. Make sure throttle is fully closed\n2. Click 'Capture Closed' button"
                        wrapMode: Text.WordWrap
                    }
                    
                    RowLayout {
                        Label { text: "Closed Value:" }
                        TextField {
                            id: tpsClosedField
                            text: "0.45V"
                            readOnly: true
                            Layout.preferredWidth: 100
                        }
                        Button {
                            text: "Capture Closed"
                            onClicked: {
                                tpsClosedField.text = (Math.random() * 0.5 + 0.3).toFixed(2) + "V"
                            }
                        }
                    }
                }
            }
            
            GroupBox {
                title: "Step 2: Open Throttle"
                Layout.fillWidth: true
                
                ColumnLayout {
                    spacing: 10
                    
                    Label {
                        text: "1. Press throttle to fully open (WOT)\n2. Click 'Capture Open' button"
                        wrapMode: Text.WordWrap
                    }
                    
                    RowLayout {
                        Label { text: "Open Value:" }
                        TextField {
                            id: tpsOpenField
                            text: "4.52V"
                            readOnly: true
                            Layout.preferredWidth: 100
                        }
                        Button {
                            text: "Capture Open"
                            onClicked: {
                                tpsOpenField.text = (Math.random() * 0.5 + 4.3).toFixed(2) + "V"
                            }
                        }
                    }
                }
            }
            
            GroupBox {
                title: "Current Reading"
                Layout.fillWidth: true
                
                GridLayout {
                    columns: 2
                    rowSpacing: 5
                    columnSpacing: 10
                    
                    Label { text: "Raw ADC:" }
                    Label { text: "512"; font.bold: true }
                    
                    Label { text: "Voltage:" }
                    Label { text: "2.50V"; font.bold: true }
                    
                    Label { text: "TPS %:" }
                    Label { text: "50%"; font.bold: true; color: "#2ecc71" }
                }
            }
            
            RowLayout {
                Layout.fillWidth: true
                
                Button {
                    text: "Apply Calibration"
                    highlighted: true
                    onClicked: {
                        statusLabel.text = "TPS Calibration Applied"
                        statusLabel.color = "#2ecc71"
                        calibrateTpsDialog.close()
                    }
                }
                
                Button {
                    text: "Reset to Defaults"
                    onClicked: {
                        tpsClosedField.text = "0.45V"
                        tpsOpenField.text = "4.52V"
                    }
                }
                
                Item { Layout.fillWidth: true }
            }
        }
    }
}
