import QtQuick
import QtQuick.Controls
import QtQuick.Layouts
import "components"

ApplicationWindow {
    id: mainWindow
    visible: true
    width: 1280
    height: 800
    title: "TunerStudio MS - Engine Management"
    
    color: "#34495e"
    
    // Top button bar (Fuel, Ignition, Tables, etc.)
    header: ToolBar {
        background: Rectangle {
            color: "#2c3e50"
            Rectangle {
                width: parent.width
                height: 1
                anchors.bottom: parent.bottom
                color: "#1a252f"
            }
        }
        
        RowLayout {
            anchors.fill: parent
            spacing: 2
            
            TopButton { text: "Fuel Set-Up"; onClicked: {} }
            TopButton { text: "Ignition Set-Up"; onClicked: {} }
            TopButton { text: "Basic Tables"; onClicked: {} }
            TopButton { text: "Other Tables"; onClicked: {} }
            TopButton { text: "Tuning"; onClicked: {} }
            TopButton { text: "X-Tau Tuning"; onClicked: {} }
            TopButton { text: "Other Tuning"; onClicked: {} }
            TopButton { text: "Upgrade"; onClicked: {} }
            
            Item { Layout.fillWidth: true }
        }
    }
    
    // Tab bar below buttons
    TabBar {
        id: tabBar
        width: parent.width
        
        TabButton {
            text: "Gauge Cluster"
            font.pixelSize: 12
        }
        TabButton {
            text: "Tuning & Dyno Views"
            font.pixelSize: 12
        }
        TabButton {
            text: "Graphing & Logging"
            font.pixelSize: 12
        }
        TabButton {
            text: "Diagnostics & High Speed Loggers"
            font.pixelSize: 12
        }
        TabButton {
            text: "Tune Analyze Live!"
            font.pixelSize: 12
        }
        TabButton {
            text: "Notes"
            font.pixelSize: 12
        }
    }
    
    // Main content area with tab views
    StackLayout {
        anchors.top: tabBar.bottom
        anchors.left: parent.left
        anchors.right: parent.right
        anchors.bottom: statusBar.top
        currentIndex: tabBar.currentIndex
        
        // Tab 0: Gauge Cluster
        GaugeClusterView {
            id: gaugeView
        }
        
        // Tab 1: Tuning & Dyno
        Rectangle {
            color: "#34495e"
            Label {
                anchors.centerIn: parent
                text: "Tuning & Dyno Views"
                color: "#ecf0f1"
                font.pixelSize: 24
            }
        }
        
        // Tab 2: Graphing & Logging
        Rectangle {
            color: "#34495e"
            Label {
                anchors.centerIn: parent
                text: "Graphing & Logging"
                color: "#ecf0f1"
                font.pixelSize: 24
            }
        }
        
        // Tab 3: Diagnostics
        Rectangle {
            color: "#34495e"
            Label {
                anchors.centerIn: parent
                text: "Diagnostics & High Speed Loggers"
                color: "#ecf0f1"
                font.pixelSize: 24
            }
        }
        
        // Tab 4: Tune Analyze
        Rectangle {
            color: "#34495e"
            Label {
                anchors.centerIn: parent
                text: "Tune Analyze Live!"
                color: "#ecf0f1"
                font.pixelSize: 24
            }
        }
        
        // Tab 5: Notes
        Rectangle {
            color: "#34495e"
            Label {
                anchors.centerIn: parent
                text: "Notes"
                color: "#ecf0f1"
                font.pixelSize: 24
            }
        }
    }
    
    // Engine status indicators (bottom status bar)
    Rectangle {
        id: statusBar
        anchors.left: parent.left
        anchors.right: parent.right
        anchors.bottom: parent.bottom
        anchors.bottomMargin: 40  // Space for footer
        height: 30
        color: "#2c3e50"
        
        Rectangle {
            width: parent.width
            height: 1
            color: "#1a252f"
        }
        
        Row {
            anchors.verticalCenter: parent.verticalCenter
            anchors.left: parent.left
            anchors.leftMargin: 8
            spacing: 4
            
            StatusIndicator { text: "SET ECU!"; bgColor: "#e74c3c" }
            StatusIndicator { text: "Not Cranking"; bgColor: "#555" }
            StatusIndicator { text: "ASE off"; bgColor: "#555" }
            StatusIndicator { text: "WUE off"; bgColor: "#555" }
            StatusIndicator { text: "Accel Enrich"; bgColor: "#555" }
            StatusIndicator { text: "Decel Cut"; bgColor: "#555" }
            StatusIndicator { text: "Flood clear off"; bgColor: "#555" }
            StatusIndicator { text: "Battery OK"; bgColor: "#27ae60" }
            StatusIndicator { text: "Port 0 Off"; bgColor: "#555" }
            StatusIndicator { text: "Data Logging"; bgColor: "#f39c12" }
            StatusIndicator { text: "Not Connected"; bgColor: "#e74c3c" }
            StatusIndicator { text: "Protocol:Error"; bgColor: "#e74c3c" }
        }
    }
    
    // Bottom toolbar with project name and progress
    footer: ToolBar {
        id: bottomToolbar
        background: Rectangle {
            color: "#2c3e50"
            Rectangle {
                width: parent.width
                height: 1
                anchors.top: parent.top
                color: "#1a252f"
            }
        }
        
        RowLayout {
            anchors.fill: parent
            
            Label {
                text: "MyCar Ready"
                color: "#ecf0f1"
                font.pixelSize: 12
                Layout.leftMargin: 8
            }
            
            ProgressBar {
                Layout.fillWidth: true
                Layout.preferredHeight: 16
                Layout.leftMargin: 8
                Layout.rightMargin: 8
                value: 0.0
            }
            
            Label {
                text: '<a href="#">Tabbed Dashboards Learn More!</a>'
                color: "#3498db"
                font.pixelSize: 11
                onLinkActivated: console.log("Learn more clicked")
                Layout.rightMargin: 8
                
                MouseArea {
                    anchors.fill: parent
                    cursorShape: Qt.PointingHandCursor
                    onClicked: parent.linkActivated("")
                }
            }
        }
    }
    
    // Menu bar
    menuBar: MenuBar {
        Menu {
            title: "&File"
            MenuItem { text: "New Project..."; }
            MenuItem { text: "Open Project..."; }
            MenuSeparator { }
            MenuItem { text: "Exit"; onTriggered: Qt.quit() }
        }
        
        Menu {
            title: "&Tools"
            MenuItem { text: "Burn to ECU"; }
            MenuItem { text: "Reset ECU"; }
            MenuItem { text: "Calibrate TPS..."; }
        }
        
        Menu {
            title: "&Help"
            MenuItem { text: "About"; }
            MenuItem { text: "Hot Keys..."; }
        }
    }
}
