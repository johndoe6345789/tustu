import QtQuick
import QtQuick.Controls
import "components"

// Freeform gauge cluster canvas using Python engine data
Rectangle {
    id: gaugeCluster
    color: "#2c3e50"
    
    // Gauge instances - positioned manually for freeform layout
    DraggableGauge {
        id: rpmGauge
        x: 20; y: 20
        title: "RPM"
        minValue: 0
        maxValue: 8000
        value: engineData.rpm
        units: "RPM"
    }
    
    DraggableGauge {
        id: throttleGauge
        x: 240; y: 20
        title: "Throttle"
        minValue: 0
        maxValue: 100
        value: engineData.throttle
        units: "%"
    }
    
    DraggableGauge {
        id: tempGauge
        x: 460; y: 20
        title: "Coolant"
        minValue: 0
        maxValue: 120
        value: engineData.temp
        units: "°C"
    }
    
    DraggableGauge {
        id: afrGauge
        x: 680; y: 20
        title: "AFR"
        minValue: 10
        maxValue: 20
        value: engineData.afr
        units: ""
    }
    
    DraggableGauge {
        id: boostGauge
        x: 20; y: 240
        title: "Boost"
        minValue: -5
        maxValue: 20
        value: engineData.boost
        units: "PSI"
    }
    
    DraggableGauge {
        id: voltageGauge
        x: 240; y: 240
        title: "Battery"
        minValue: 10
        maxValue: 16
        value: engineData.voltage
        units: "V"
    }
    
    DraggableGauge {
        id: pulseWidthGauge
        x: 460; y: 240
        title: "Pulse Width"
        minValue: 0
        maxValue: 20
        value: engineData.pulseWidth
        units: "ms"
    }
    
    DraggableGauge {
        id: ignitionGauge
        x: 680; y: 240
        title: "Ignition"
        minValue: 0
        maxValue: 40
        value: engineData.ignition
        units: "°"
    }
    
    // "Not Connected" overlay
    Rectangle {
        anchors.centerIn: parent
        width: 200
        height: 50
        color: "#e74c3c"
        radius: 5
        opacity: 0.9
        
        Label {
            anchors.centerIn: parent
            text: "Not Connected"
            color: "white"
            font.pixelSize: 16
            font.bold: true
        }
    }
}
