import QtQuick 6.5
import QtQuick.Controls 6.5
import QtQuick.Layouts 6.5
import QtQuick.Window 6.5

ApplicationWindow {
    id: mainWindow
    visible: true
    width: 600
    height: 700
    minimumWidth: 500
    minimumHeight: 600
    title: "Registration Key Generator"
    
    // Color scheme
    readonly property color primaryColor: "#4CAF50"
    readonly property color accentColor: "#2196F3"
    readonly property color warningColor: "#FF9800"
    readonly property color errorColor: "#f44336"
    readonly property color backgroundColor: "#f5f5f5"
    readonly property color cardColor: "#ffffff"
    
    TabBar {
        id: tabBar
        anchors.top: parent.top
        anchors.left: parent.left
        anchors.right: parent.right
        
        TabButton {
            text: "4-Parameter"
            font.pixelSize: 13
        }
        TabButton {
            text: "5-Parameter"
            font.pixelSize: 13
        }
        TabButton {
            text: "7-Parameter"
            font.pixelSize: 13
        }
        TabButton {
            text: "8-Parameter"
            font.pixelSize: 13
        }
        TabButton {
            text: "Email Parser"
            font.pixelSize: 13
        }
    }
    
    StackLayout {
        anchors.top: tabBar.bottom
        anchors.bottom: parent.bottom
        anchors.left: parent.left
        anchors.right: parent.right
        anchors.margins: 10
        currentIndex: tabBar.currentIndex
        
        // 4-Parameter Tab
        KeyGeneratorTab {
            algorithm: "4-param"
            showSecret: false
            showMonth: false
            showYear: false
            showSerial: false
        }
        
        // 5-Parameter Tab
        KeyGeneratorTab {
            algorithm: "5-param"
            showSecret: true
            showMonth: false
            showYear: false
            showSerial: false
        }
        
        // 7-Parameter Tab
        KeyGeneratorTab {
            algorithm: "7-param"
            showSecret: true
            showMonth: true
            showYear: true
            showSerial: false
        }
        
        // 8-Parameter Tab
        KeyGeneratorTab {
            algorithm: "8-param"
            showSecret: true
            showMonth: true
            showYear: true
            showSerial: true
        }
        
        // Email Parser Tab
        EmailParserTab {
        }
    }
}
