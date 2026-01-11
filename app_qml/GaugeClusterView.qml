import QtQuick
import QtQuick.Controls

// Freeform gauge cluster canvas - gauges can be positioned anywhere
Rectangle {
    id: gaugeCluster
    color: "#2c3e50"
    
    // Simulated engine data
    property real rpm: 0
    property real throttle: 0
    property real temp: 75
    property real afr: 14.7
    property real boost: 0
    property real voltage: 12.6
    property real pulseWidth: 0
    property real exhaustTemp: 300
    
    // Driving simulation timer
    Timer {
        running: true
        repeat: true
        interval: 50
        property int phase: 0
        property int cycleTime: 0
        
        onTriggered: {
            cycleTime += interval
            
            // 10-phase realistic driving simulation
            if (cycleTime < 3000) { // Idle
                phase = 0
                rpm = 850 + Math.sin(cycleTime / 100) * 50
                throttle = 0
                temp = Math.min(temp + 0.01, 85)
                boost = 0
                pulseWidth = 2.5
            } else if (cycleTime < 5000) { // Light acceleration
                phase = 1
                var t = (cycleTime - 3000) / 2000
                rpm = 850 + t * 2150
                throttle = 20 + t * 30
                temp += 0.05
                boost = Math.max(0, (rpm - 2000) / 1000 * 5)
                pulseWidth = 2.5 + t * 5
            } else if (cycleTime < 8000) { // Cruising
                phase = 2
                rpm = 3000 + Math.sin((cycleTime - 5000) / 200) * 100
                throttle = 45 + Math.sin((cycleTime - 5000) / 150) * 5
                temp = Math.min(temp + 0.02, 95)
                boost = 3 + Math.sin((cycleTime - 5000) / 300) * 2
                pulseWidth = 7.5
            } else if (cycleTime < 10000) { // WOT acceleration
                phase = 3
                var t2 = (cycleTime - 8000) / 2000
                rpm = 3000 + t2 * 4000
                throttle = 50 + t2 * 50
                temp += 0.1
                boost = 3 + t2 * 12
                pulseWidth = 7.5 + t2 * 7
                afr = 14.7 - t2 * 1.5
                exhaustTemp = 300 + t2 * 600
            } else if (cycleTime < 11000) { // Gear shift
                phase = 4
                rpm = 7000 - ((cycleTime - 10000) / 1000) * 3000
                throttle = 0
                boost = 15 - ((cycleTime - 10000) / 1000) * 10
                pulseWidth = 14 - ((cycleTime - 10000) / 1000) * 10
                afr = 13.2 + ((cycleTime - 10000) / 1000) * 3
                exhaustTemp = Math.max(300, 900 - ((cycleTime - 10000) / 1000) * 300)
            } else if (cycleTime < 14000) { // Acceleration in higher gear
                phase = 5
                var t3 = (cycleTime - 11000) / 3000
                rpm = 4000 + t3 * 2500
                throttle = 70 + t3 * 30
                boost = 5 + t3 * 8
                pulseWidth = 4 + t3 * 8
                afr = Math.max(11.5, 16.5 - t3 * 3)
                exhaustTemp = 600 + t3 * 200
            } else if (cycleTime < 16000) { // Deceleration
                phase = 6
                var t4 = (cycleTime - 14000) / 2000
                rpm = 6500 - t4 * 4500
                throttle = 100 - t4 * 100
                boost = Math.max(0, 13 - t4 * 13)
                pulseWidth = Math.max(1, 12 - t4 * 11)
                afr = 11.5 + t4 * 7
                temp = Math.max(85, temp - 0.05)
                exhaustTemp = Math.max(300, 800 - t4 * 400)
            } else if (cycleTime < 18000) { // Coasting
                phase = 7
                rpm = 2000 - ((cycleTime - 16000) / 2000) * 500
                throttle = 0
                boost = 0
                pulseWidth = 1
                afr = 18.5 + Math.sin((cycleTime - 16000) / 100) * 1
                temp = Math.max(85, temp - 0.03)
                exhaustTemp = Math.max(300, exhaustTemp - 10)
            } else if (cycleTime < 20000) { // Back to idle
                phase = 8
                rpm = 1500 - ((cycleTime - 18000) / 2000) * 650
                throttle = 0
                boost = 0
                pulseWidth = 2.5
                afr = 14.7
                temp = Math.max(85, temp - 0.02)
                exhaustTemp = Math.max(300, exhaustTemp - 8)
            } else { // Reset cycle
                cycleTime = 0
            }
            
            // Add slight randomness
            rpm = Math.max(0, rpm + (Math.random() - 0.5) * 20)
            throttle = Math.max(0, Math.min(100, throttle + (Math.random() - 0.5) * 2))
            afr = Math.max(10, Math.min(20, afr + (Math.random() - 0.5) * 0.1))
            voltage = 12.6 + (Math.random() - 0.5) * 0.4
        }
    }
    
    // Draggable gauge component
    component DraggableGauge: MouseArea {
        id: dragArea
        property alias gauge: gaugeLoader.item
        property string gaugeType: "rpm"
        
        width: 200
        height: 200
        drag.target: dragArea
        drag.axis: Drag.XAndYAxis
        drag.minimumX: 0
        drag.maximumX: gaugeCluster.width - width
        drag.minimumY: 0
        drag.maximumY: gaugeCluster.height - height
        
        Loader {
            id: gaugeLoader
            anchors.fill: parent
            sourceComponent: RoundGauge {
                property string type: dragArea.gaugeType
                label: type === "rpm" ? "Engine Speed" :
                       type === "throttle" ? "Throttle Position" :
                       type === "temp" ? "Engine MAP" :
                       type === "afr" ? "Exhaust Gas Oxygen" :
                       type === "boost" ? "X-Tau Correction1" :
                       type === "voltage" ? "Battery Voltage" :
                       type === "pulse" ? "Pulse Width 1" :
                       "Ignition Advance"
                       
                minValue: type === "rpm" ? 0 :
                         type === "throttle" ? 0 :
                         type === "temp" ? 0 :
                         type === "afr" ? 0 :
                         type === "boost" ? 0 :
                         type === "voltage" ? 0 :
                         type === "pulse" ? 0 :
                         -15
                         
                maxValue: type === "rpm" ? 8000 :
                         type === "throttle" ? 100 :
                         type === "temp" ? 240 :
                         type === "afr" ? 1.0 :
                         type === "boost" ? 200 :
                         type === "voltage" ? 18 :
                         type === "pulse" ? 24 :
                         45
                         
                value: type === "rpm" ? gaugeCluster.rpm :
                       type === "throttle" ? gaugeCluster.throttle :
                       type === "temp" ? gaugeCluster.temp :
                       type === "afr" ? gaugeCluster.afr / 14.7 : // Normalized
                       type === "boost" ? gaugeCluster.boost * 10 :
                       type === "voltage" ? gaugeCluster.voltage :
                       type === "pulse" ? gaugeCluster.pulseWidth :
                       5.0 // Default ignition
                       
                unit: type === "rpm" ? "x1000\nRPM" :
                     type === "throttle" ? "%\n" :
                     type === "temp" ? "kPa" :
                     type === "afr" ? "volts\n" :
                     type === "boost" ? "%\n" :
                     type === "voltage" ? "volts\n" :
                     type === "pulse" ? "mSec\n" :
                     "degrees"
            }
        }
    }
    
    // 8 gauges positioned like in screenshot (4x2 grid but draggable)
    DraggableGauge {
        gaugeType: "rpm"
        x: 20
        y: 20
    }
    
    DraggableGauge {
        gaugeType: "throttle"
        x: 240
        y: 20
    }
    
    DraggableGauge {
        gaugeType: "pulse"
        x: 460
        y: 20
    }
    
    DraggableGauge {
        gaugeType: "afr"
        x: 680
        y: 20
    }
    
    DraggableGauge {
        gaugeType: "temp"
        x: 20
        y: 240
    }
    
    DraggableGauge {
        gaugeType: "temp" // Duplicate for intake temp
        x: 240
        y: 240
    }
    
    DraggableGauge {
        gaugeType: "boost"
        x: 460
        y: 240
    }
    
    DraggableGauge {
        gaugeType: "voltage"
        x: 680
        y: 240
    }
    
    // Connection status overlay
    Rectangle {
        anchors.centerIn: parent
        width: 200
        height: 60
        color: "#34495e"
        border.color: "white"
        border.width: 2
        radius: 5
        opacity: 0.9
        
        Label {
            anchors.centerIn: parent
            text: "Not Connected"
            font.pixelSize: 18
            font.bold: true
            color: "white"
        }
    }
}
