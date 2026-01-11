import QtQuick
import QtQuick.Controls
import QtQuick.Layouts

Item {
    id: dashboardView
    
    // Driving simulation state
    property int drivePhase: 0  // 0=idle, 1=accelerate, 2=cruise, 3=brake, 4=turn, 5=stop
    property real currentSpeed: 0
    property real targetRpm: 800
    property real currentRpm: 800
    property real currentThrottle: 0
    property real currentTemp: 85
    property real currentAfr: 14.7
    property real currentBoost: -10
    property real currentVoltage: 14.2
    property int phaseTimer: 0
    
    // Realistic driving simulation around the block
    Timer {
        interval: 50  // 20 Hz update
        running: true
        repeat: true
        onTriggered: {
            phaseTimer++
            
            // Drive cycle phases (simulating driving around a block)
            if (drivePhase === 0) {
                // Idle at start
                targetRpm = 850
                currentThrottle = Math.max(0, currentThrottle - 2)
                currentAfr = 14.7
                currentBoost = -10
                
                if (phaseTimer > 30) {  // ~1.5 seconds
                    drivePhase = 1
                    phaseTimer = 0
                }
            }
            else if (drivePhase === 1) {
                // Accelerate from stop - pulling away
                currentThrottle = Math.min(45, currentThrottle + 3)
                targetRpm = 800 + currentThrottle * 60  // Up to ~3500 RPM
                currentAfr = 13.2 + (currentThrottle / 100) * 0.8  // Richer under load
                currentBoost = -8 + (currentThrottle / 100) * 8  // Light positive boost
                
                if (phaseTimer > 50) {  // ~2.5 seconds of acceleration
                    drivePhase = 2
                    phaseTimer = 0
                }
            }
            else if (drivePhase === 2) {
                // Cruise at steady speed down the street
                currentThrottle = 25 + Math.sin(phaseTimer * 0.1) * 3
                targetRpm = 2200 + Math.sin(phaseTimer * 0.05) * 200
                currentAfr = 14.5 + Math.sin(phaseTimer * 0.08) * 0.3
                currentBoost = -2 + Math.sin(phaseTimer * 0.1) * 2
                
                if (phaseTimer > 80) {  // ~4 seconds cruising
                    drivePhase = 3
                    phaseTimer = 0
                }
            }
            else if (drivePhase === 3) {
                // Braking for turn
                currentThrottle = Math.max(0, currentThrottle - 4)
                targetRpm = Math.max(850, targetRpm - 80)
                currentAfr = 15.5  // Lean on decel
                currentBoost = -12
                
                if (phaseTimer > 25) {  // ~1.25 seconds braking
                    drivePhase = 4
                    phaseTimer = 0
                }
            }
            else if (drivePhase === 4) {
                // Turn corner - light acceleration
                currentThrottle = Math.min(35, currentThrottle + 2)
                targetRpm = 1200 + currentThrottle * 40
                currentAfr = 13.8
                currentBoost = -5 + (currentThrottle / 100) * 5
                
                if (phaseTimer > 40) {  // ~2 seconds through turn
                    drivePhase = 5
                    phaseTimer = 0
                }
            }
            else if (drivePhase === 5) {
                // Accelerate harder - straightaway
                currentThrottle = Math.min(70, currentThrottle + 4)
                targetRpm = 1500 + currentThrottle * 70  // Up to ~6400 RPM
                currentAfr = 12.8 + (currentThrottle / 100) * 0.5  // Richer for power
                currentBoost = -3 + (currentThrottle / 100) * 18  // Build boost
                
                if (phaseTimer > 60) {  // ~3 seconds hard acceleration
                    drivePhase = 6
                    phaseTimer = 0
                }
            }
            else if (drivePhase === 6) {
                // Cruise again on next street
                currentThrottle = 30 + Math.sin(phaseTimer * 0.15) * 5
                targetRpm = 2500 + Math.sin(phaseTimer * 0.1) * 300
                currentAfr = 14.3 + Math.sin(phaseTimer * 0.12) * 0.4
                currentBoost = 0 + Math.sin(phaseTimer * 0.08) * 3
                
                if (phaseTimer > 70) {  // ~3.5 seconds
                    drivePhase = 7
                    phaseTimer = 0
                }
            }
            else if (drivePhase === 7) {
                // Braking for another turn
                currentThrottle = Math.max(0, currentThrottle - 5)
                targetRpm = Math.max(850, targetRpm - 100)
                currentAfr = 15.2
                currentBoost = -11
                
                if (phaseTimer > 20) {
                    drivePhase = 8
                    phaseTimer = 0
                }
            }
            else if (drivePhase === 8) {
                // Final turn back home
                currentThrottle = Math.min(30, currentThrottle + 2)
                targetRpm = 1400 + currentThrottle * 35
                currentAfr = 14.0
                currentBoost = -6
                
                if (phaseTimer > 35) {
                    drivePhase = 9
                    phaseTimer = 0
                }
            }
            else if (drivePhase === 9) {
                // Approaching home - gentle decel
                currentThrottle = Math.max(0, currentThrottle - 2)
                targetRpm = Math.max(850, targetRpm - 50)
                currentAfr = 15.0
                currentBoost = -10
                
                if (phaseTimer > 40) {
                    drivePhase = 10
                    phaseTimer = 0
                }
            }
            else {
                // Coming to stop - back to idle
                currentThrottle = 0
                targetRpm = 850
                currentAfr = 14.7
                currentBoost = -10
                
                if (phaseTimer > 50) {  // Wait at idle
                    drivePhase = 0  // Start over
                    phaseTimer = 0
                }
            }
            
            // Smooth RPM transition
            currentRpm += (targetRpm - currentRpm) * 0.15
            
            // Temperature gradually increases with driving, decreases at idle
            if (currentThrottle > 20) {
                currentTemp = Math.min(105, currentTemp + 0.03)
            } else {
                currentTemp = Math.max(85, currentTemp - 0.02)
            }
            
            // Voltage drops slightly under load
            var targetVoltage = 14.2 - (currentThrottle / 100) * 0.8
            currentVoltage += (targetVoltage - currentVoltage) * 0.1
            
            // Add small random variations for realism
            rpm.value = currentRpm + (Math.random() - 0.5) * 50
            temp.value = currentTemp + (Math.random() - 0.5) * 0.5
            afr.value = currentAfr + (Math.random() - 0.5) * 0.2
            boost.value = currentBoost + (Math.random() - 0.5) * 0.5
            throttle.value = currentThrottle + (Math.random() - 0.5) * 2
            voltage.value = currentVoltage + (Math.random() - 0.5) * 0.1
        }
    }
    
    ScrollView {
        anchors.fill: parent
        
        ColumnLayout {
            width: dashboardView.width - 20
            anchors.left: parent.left
            anchors.leftMargin: 20
            anchors.topMargin: 20
            spacing: 20
            
            // Driving status indicator
            Rectangle {
                Layout.fillWidth: true
                Layout.preferredHeight: 60
                color: "#34495e"
                radius: 10
                border.color: "#1976D2"
                border.width: 2
                
                RowLayout {
                    anchors.fill: parent
                    anchors.margins: 15
                    spacing: 15
                    
                    Rectangle {
                        width: 30
                        height: 30
                        radius: 15
                        color: {
                            if (drivePhase <= 0) return "#95a5a6"  // Gray - idle
                            if (drivePhase === 1 || drivePhase === 5) return "#2ecc71"  // Green - accelerating
                            if (drivePhase === 2 || drivePhase === 6) return "#3498db"  // Blue - cruising
                            if (drivePhase === 3 || drivePhase === 7) return "#e74c3c"  // Red - braking
                            if (drivePhase === 4 || drivePhase === 8) return "#f39c12"  // Orange - turning
                            return "#95a5a6"  // Gray - stopping
                        }
                        
                        SequentialAnimation on opacity {
                            running: drivePhase > 0 && drivePhase < 10
                            loops: Animation.Infinite
                            NumberAnimation { to: 0.3; duration: 500 }
                            NumberAnimation { to: 1.0; duration: 500 }
                        }
                    }
                    
                    Label {
                        text: {
                            if (drivePhase === 0) return "🏠 Idle at Start"
                            if (drivePhase === 1) return "🚀 Accelerating from Stop"
                            if (drivePhase === 2) return "🛣️ Cruising Down Street"
                            if (drivePhase === 3) return "🛑 Braking for Turn"
                            if (drivePhase === 4) return "↪️ Turning Corner"
                            if (drivePhase === 5) return "⚡ Hard Acceleration"
                            if (drivePhase === 6) return "🛣️ Cruising Next Street"
                            if (drivePhase === 7) return "🛑 Braking for Turn"
                            if (drivePhase === 8) return "↩️ Final Turn Home"
                            if (drivePhase === 9) return "🏁 Approaching Home"
                            return "🏠 Coming to Stop"
                        }
                        font.pixelSize: 18
                        font.bold: true
                        color: "white"
                        Layout.fillWidth: true
                    }
                    
                    Label {
                        text: "Speed: " + Math.round(currentRpm / 50) + " mph"
                        font.pixelSize: 14
                        color: "#ecf0f1"
                    }
                }
            }
            
            GridLayout {
                Layout.fillWidth: true
                columns: 3
                rowSpacing: 20
                columnSpacing: 20
            
            // RPM Gauge
            RoundGauge {
                id: rpm
                Layout.preferredWidth: 300
                Layout.preferredHeight: 300
                title: "RPM"
                minValue: 0
                maxValue: 8000
                warningValue: 6500
                dangerValue: 7500
                units: "rpm"
                majorTicks: 9
                minorTicks: 5
            }
            
            // Coolant Temp Gauge
            RoundGauge {
                id: temp
                Layout.preferredWidth: 300
                Layout.preferredHeight: 300
                title: "Coolant Temp"
                minValue: 0
                maxValue: 120
                warningValue: 95
                dangerValue: 105
                units: "°C"
                majorTicks: 7
                minorTicks: 4
            }
            
            // AFR Gauge
            RoundGauge {
                id: afr
                Layout.preferredWidth: 300
                Layout.preferredHeight: 300
                title: "Air/Fuel Ratio"
                minValue: 10
                maxValue: 18
                warningValue: 12
                dangerValue: 11
                units: ":1"
                majorTicks: 9
                minorTicks: 2
                value: 14.7
            }
            
            // Boost/Vacuum Gauge
            RoundGauge {
                id: boost
                Layout.preferredWidth: 300
                Layout.preferredHeight: 300
                title: "Boost"
                minValue: -15
                maxValue: 30
                warningValue: 20
                dangerValue: 25
                units: "psi"
                majorTicks: 10
                minorTicks: 5
            }
            
            // Throttle Position Bar
            BarGauge {
                id: throttle
                Layout.preferredWidth: 300
                Layout.preferredHeight: 300
                title: "Throttle Position"
                minValue: 0
                maxValue: 100
                units: "%"
            }
            
            // Battery Voltage
            BarGauge {
                id: voltage
                Layout.preferredWidth: 300
                Layout.preferredHeight: 300
                title: "Battery Voltage"
                minValue: 10
                maxValue: 16
                warningValue: 11.5
                dangerValue: 11
                units: "V"
            }
            }
        }
    }
}
