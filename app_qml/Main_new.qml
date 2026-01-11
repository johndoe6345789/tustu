import QtQuick
import QtQuick.Controls
import QtQuick.Layouts
import QtQuick.Window

ApplicationWindow {
    id: mainWindow
    visible: true
    width: 1280
    height: 800
    title: "TunerStudio MS Lite v3.3.01 - MyCar ( Go Online for Firmware Version ) EFI Simplified"
    
    menuBar: MenuBar {
        Menu {
            title: "&File"
            MenuItem { text: "New Project..." }
            MenuItem { text: "Open Project..." }
            MenuItem { text: "Close Project" }
            MenuSeparator {}
            MenuItem { text: "Exit"; onTriggered: Qt.quit() }
        }
        
        Menu {
            title: "&Options"
            MenuItem { text: "Settings..." }
        }
        
        Menu {
            title: "&Communications"
            MenuItem { text: "Connect"; checkable: true; onTriggered: connectionDialog.open() }
            MenuItem { text: "Settings..." }
        }
        
        Menu {
            title: "&Data Logging"
            MenuItem { text: "Start Log (F2)" }
            MenuItem { text: "Stop Log (F3)" }
        }
        
        Menu {
            title: "&Help"
            MenuItem { text: "About"; onTriggered: aboutDialog.open() }
        }
    }
    
    ColumnLayout {
        anchors.fill: parent
        spacing: 0
        
        // Top button bar - project configuration
        ToolBar {
            Layout.fillWidth: true
            background: Rectangle { color: "#e0e0e0" }
            
            RowLayout {
                anchors.fill: parent
                spacing: 2
                
                ToolButton {
                    text: "🔧 Fuel Set-Up"
                    font.pixelSize: 11
                }
                ToolButton {
                    text: "⚡ Ignition Set-Up"
                    font.pixelSize: 11
                }
                ToolButton {
                    text: "📊 Basic Tables"
                    font.pixelSize: 11
                }
                ToolButton {
                    text: "📋 Other Tables"
                    font.pixelSize: 11
                }
                ToolButton {
                    text: "🎯 Tuning"
                    font.pixelSize: 11
                }
                ToolButton {
                    text: "📈 X-Tau Tuning"
                    font.pixelSize: 11
                }
                ToolButton {
                    text: "⚙️ Other Tuning"
                    font.pixelSize: 11
                }
                ToolButton {
                    text: "⬆️ Upgrade"
                    font.pixelSize: 11
                }
                Item { Layout.fillWidth: true }
            }
        }
        
        // Tab bar for views
        TabBar {
            id: mainTabBar
            Layout.fillWidth: true
            
            TabButton { text: "Gauge Cluster" }
            TabButton { text: "Tuning & Dyno Views" }
            TabButton { text: "Graphing & Logging" }
            TabButton { text: "Diagnostics & High Speed Loggers" }
            TabButton { text: "Tune Analyze Live! - Tune For You" }
            TabButton { text: "Notes" }
        }
        
        // Main content area
        StackLayout {
            Layout.fillWidth: true
            Layout.fillHeight: true
            currentIndex: mainTabBar.currentIndex
            
            GaugeClusterView {}
            Rectangle { color: "#2c3e50"; Label { anchors.centerIn: parent; text: "Tuning & Dyno Views"; color: "white" } }
            Rectangle { color: "#34495e"; Label { anchors.centerIn: parent; text: "Graphing & Logging"; color: "white" } }
            Rectangle { color: "#2c3e50"; Label { anchors.centerIn: parent; text: "Diagnostics"; color: "white" } }
            Rectangle { color: "#34495e"; Label { anchors.centerIn: parent; text: "Tune Analyze"; color: "white" } }
            Rectangle { color: "#2c3e50"; Label { anchors.centerIn: parent; text: "Notes"; color: "white" } }
        }
        
        // Status bar with engine indicators
        Rectangle {
            Layout.fillWidth: true
            Layout.preferredHeight: 30
            color: "#bdc3c7"
            
            RowLayout {
                anchors.fill: parent
                anchors.margins: 2
                spacing: 5
                
                StatusIndicator { text: "SET ECU!"; bgColor: "#e74c3c" }
                StatusIndicator { text: "Not Cranking"; bgColor: "#95a5a6" }
                StatusIndicator { text: "ASE off"; bgColor: "#95a5a6" }
                StatusIndicator { text: "WUE off"; bgColor: "#95a5a6" }
                StatusIndicator { text: "Accel Enrich"; bgColor: "#95a5a6" }
                StatusIndicator { text: "Decel Cut"; bgColor: "#95a5a6" }
                StatusIndicator { text: "Flood clear off"; bgColor: "#95a5a6" }
                StatusIndicator { text: "Battery OK"; bgColor: "#2ecc71" }
                StatusIndicator { text: "Port 0 Off"; bgColor: "#95a5a6" }
                StatusIndicator { text: "Data Logging"; bgColor: "#95a5a6" }
                StatusIndicator { text: "Not Connected"; bgColor: "#95a5a6" }
                StatusIndicator { text: "Protocol:Error"; bgColor: "#e74c3c" }
                
                Item { Layout.fillWidth: true }
            }
        }
        
        // Bottom status bar with progress
        ToolBar {
            Layout.fillWidth: true
            
            RowLayout {
                anchors.fill: parent
                spacing: 10
                
                Label {
                    id: statusLabel
                    text: "MyCar Ready"
                    font.pixelSize: 11
                }
                
                ProgressBar {
                    Layout.preferredWidth: 200
                    from: 0
                    to: 100
                    value: 0
                }
                
                Item { Layout.fillWidth: true }
                
                Label {
                    text: "Tabbed Dashboards    Learn More!"
                    font.pixelSize: 10
                    color: "#3498db"
                }
            }
        }
    }
    
    // Status indicator component
    component StatusIndicator: Rectangle {
        property string text: ""
        property color bgColor: "#95a5a6"
        
        Layout.preferredWidth: textLabel.width + 8
        Layout.preferredHeight: 24
        color: bgColor
        radius: 3
        border.color: Qt.darker(bgColor, 1.2)
        border.width: 1
        
        Label {
            id: textLabel
            anchors.centerIn: parent
            text: parent.text
            font.pixelSize: 10
            font.bold: true
            color: "white"
        }
    }
    
    // Simple connection dialog
    Dialog {
        id: connectionDialog
        title: "Connection Settings"
        modal: true
        standardButtons: Dialog.Ok | Dialog.Cancel
        
        ColumnLayout {
            Label { text: "Port:" }
            ComboBox {
                model: ["/dev/ttyUSB0", "/dev/ttyACM0", "COM3", "COM4"]
            }
            Label { text: "Baud Rate:" }
            ComboBox {
                model: ["115200", "57600", "38400", "19200"]
            }
        }
    }
    
    // About dialog
    Dialog {
        id: aboutDialog
        title: "About TunerStudio MS"
        modal: true
        standardButtons: Dialog.Close
        
        Label {
            text: "TunerStudio MS Lite v3.3.01\n\n" +
                  "Engine Management Software\n" +
                  "© 2024 EFI Analytics\n\n" +
                  "QML Version - Demo"
            horizontalAlignment: Text.AlignHCenter
        }
    }
}
