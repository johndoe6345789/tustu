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
            MenuItem { text: "Save Configuration"; shortcut: "Ctrl+S" }
            MenuItem { text: "Save As..." }
            MenuSeparator {}
            MenuItem { text: "Exit"; onTriggered: Qt.quit() }
        }
        
        Menu {
            title: "&Tools"
            MenuItem { text: "Calibrate TPS" }
            MenuItem { text: "Reset Control Unit" }
            MenuItem { text: "Tooth Logger" }
            MenuSeparator {}
            MenuItem { text: "Firmware Update..." }
        }
        
        Menu {
            title: "&Communications"
            MenuItem { text: "Connect"; checkable: true }
            MenuItem { text: "Settings..." }
            MenuSeparator {}
            MenuItem { text: "Detect Port" }
        }
        
        Menu {
            title: "&Tuning"
            MenuItem { text: "Open Tuning Dialog" }
            MenuItem { text: "Table Editor" }
            MenuItem { text: "3D Table View" }
        }
        
        Menu {
            title: "&Data Logging"
            MenuItem { text: "Start Log"; shortcut: "F2" }
            MenuItem { text: "Stop Log"; shortcut: "F3" }
            MenuSeparator {}
            MenuItem { text: "View Logs..." }
        }
        
        Menu {
            title: "&Help"
            MenuItem { text: "Documentation" }
            MenuItem { text: "Forum" }
            MenuSeparator {}
            MenuItem { text: "About" }
            MenuItem { text: "Register..." }
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
                onClicked: statusLabel.text = "Connecting..."
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
}
