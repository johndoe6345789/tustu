import QtQuick
import QtQuick.Controls
import QtQuick.Layouts

Item {
    id: dataLoggingView
    
    ColumnLayout {
        anchors.fill: parent
        anchors.margins: 10
        spacing: 10
        
        // Control panel
        RowLayout {
            Layout.fillWidth: true
            spacing: 10
            
            Button {
                text: "Start Logging"
                highlighted: true
                onClicked: console.log("Start logging")
            }
            
            Button {
                text: "Stop Logging"
                enabled: false
            }
            
            Button {
                text: "Load Log File..."
                onClicked: console.log("Load log")
            }
            
            Item { Layout.fillWidth: true }
            
            Label {
                text: "Sample Rate:"
            }
            
            ComboBox {
                model: ["10 Hz", "20 Hz", "50 Hz", "100 Hz"]
                currentIndex: 2
            }
        }
        
        // Chart area
        Rectangle {
            Layout.fillWidth: true
            Layout.fillHeight: true
            color: "#2c3e50"
            border.color: "#34495e"
            border.width: 2
            radius: 5
            
            ColumnLayout {
                anchors.fill: parent
                anchors.margins: 10
                spacing: 5
                
                Label {
                    text: "Data Log Chart"
                    color: "white"
                    font.pixelSize: 16
                    font.bold: true
                    Layout.alignment: Qt.AlignHCenter
                }
                
                // Chart canvas
                Canvas {
                    id: chartCanvas
                    Layout.fillWidth: true
                    Layout.fillHeight: true
                    
                    property var dataPoints: []
                    
                    property int logTime: 0
                    property real logRpm: 850
                    property real logTemp: 85
                    property real logAfr: 14.7
                    
                    Timer {
                        interval: 100
                        running: true
                        repeat: true
                        onTriggered: {
                            chartCanvas.logTime++
                            var t = chartCanvas.logTime
                            
                            // Simulate driving around the block (synchronized with dashboard)
                            if (t < 30) {
                                // Idle
                                chartCanvas.logRpm = 850 + Math.sin(t * 0.5) * 30
                                chartCanvas.logAfr = 14.7
                            } else if (t < 80) {
                                // Accelerate
                                var accel = (t - 30) / 50
                                chartCanvas.logRpm = 850 + accel * 2700 + Math.sin(t * 0.3) * 100
                                chartCanvas.logAfr = 13.2 + accel * 0.8
                                chartCanvas.logTemp = Math.min(95, 85 + accel * 10)
                            } else if (t < 160) {
                                // Cruise
                                chartCanvas.logRpm = 2200 + Math.sin(t * 0.1) * 300
                                chartCanvas.logAfr = 14.5 + Math.sin(t * 0.15) * 0.3
                                chartCanvas.logTemp = Math.min(98, chartCanvas.logTemp + 0.05)
                            } else if (t < 185) {
                                // Brake
                                var brake = (t - 160) / 25
                                chartCanvas.logRpm = 2200 - brake * 1350
                                chartCanvas.logAfr = 15.5
                            } else if (t < 225) {
                                // Turn
                                chartCanvas.logRpm = 1200 + Math.sin(t * 0.2) * 200
                                chartCanvas.logAfr = 13.8
                            } else if (t < 285) {
                                // Hard accelerate
                                var hardAccel = (t - 225) / 60
                                chartCanvas.logRpm = 1500 + hardAccel * 4900 + Math.sin(t * 0.3) * 150
                                chartCanvas.logAfr = 12.8 + hardAccel * 0.5
                                chartCanvas.logTemp = Math.min(103, chartCanvas.logTemp + 0.08)
                            } else if (t < 355) {
                                // Cruise 2
                                chartCanvas.logRpm = 2500 + Math.sin(t * 0.12) * 350
                                chartCanvas.logAfr = 14.3 + Math.sin(t * 0.18) * 0.4
                            } else if (t < 375) {
                                // Brake 2
                                var brake2 = (t - 355) / 20
                                chartCanvas.logRpm = 2500 - brake2 * 1650
                                chartCanvas.logAfr = 15.2
                            } else if (t < 410) {
                                // Turn 2
                                chartCanvas.logRpm = 1400 + Math.sin(t * 0.25) * 150
                                chartCanvas.logAfr = 14.0
                            } else if (t < 450) {
                                // Decel
                                var decel = (t - 410) / 40
                                chartCanvas.logRpm = 1400 - decel * 550
                                chartCanvas.logAfr = 15.0
                                chartCanvas.logTemp = Math.max(85, chartCanvas.logTemp - 0.1)
                            } else if (t < 500) {
                                // Back to idle
                                chartCanvas.logRpm = 850 + Math.sin(t * 0.4) * 25
                                chartCanvas.logAfr = 14.7
                                chartCanvas.logTemp = Math.max(85, chartCanvas.logTemp - 0.05)
                            } else {
                                // Reset and loop
                                chartCanvas.logTime = 0
                            }
                            
                            chartCanvas.dataPoints.push({
                                rpm: chartCanvas.logRpm,
                                afr: chartCanvas.logAfr,
                                temp: chartCanvas.logTemp
                            })
                            if (chartCanvas.dataPoints.length > 100) {
                                chartCanvas.dataPoints.shift()
                            }
                            chartCanvas.requestPaint()
                        }
                    }
                    
                    onPaint: {
                        var ctx = getContext("2d")
                        ctx.reset()
                        
                        // Draw background grid
                        ctx.strokeStyle = "#34495e"
                        ctx.lineWidth = 1
                        
                        for (var i = 0; i < 10; i++) {
                            var y = height * i / 10
                            ctx.beginPath()
                            ctx.moveTo(0, y)
                            ctx.lineTo(width, y)
                            ctx.stroke()
                        }
                        
                        for (var j = 0; j < 20; j++) {
                            var x = width * j / 20
                            ctx.beginPath()
                            ctx.moveTo(x, 0)
                            ctx.lineTo(x, height)
                            ctx.stroke()
                        }
                        
                        if (dataPoints.length < 2) return
                        
                        // Draw RPM line
                        ctx.beginPath()
                        ctx.strokeStyle = "#3498db"
                        ctx.lineWidth = 2
                        
                        for (var k = 0; k < dataPoints.length; k++) {
                            var xPos = (k / dataPoints.length) * width
                            var yPos = height - (dataPoints[k].rpm / 8000 * height)
                            
                            if (k === 0) {
                                ctx.moveTo(xPos, yPos)
                            } else {
                                ctx.lineTo(xPos, yPos)
                            }
                        }
                        ctx.stroke()
                        
                        // Draw AFR line
                        ctx.beginPath()
                        ctx.strokeStyle = "#2ecc71"
                        ctx.lineWidth = 2
                        
                        for (var m = 0; m < dataPoints.length; m++) {
                            var xPos2 = (m / dataPoints.length) * width
                            var yPos2 = height - ((dataPoints[m].afr - 10) / 8 * height)
                            
                            if (m === 0) {
                                ctx.moveTo(xPos2, yPos2)
                            } else {
                                ctx.lineTo(xPos2, yPos2)
                            }
                        }
                        ctx.stroke()
                    }
                }
                
                // Legend
                RowLayout {
                    Layout.alignment: Qt.AlignHCenter
                    spacing: 20
                    
                    Row {
                        spacing: 5
                        Rectangle {
                            width: 20
                            height: 10
                            color: "#3498db"
                            anchors.verticalCenter: parent.verticalCenter
                        }
                        Label {
                            text: "RPM"
                            color: "white"
                        }
                    }
                    
                    Row {
                        spacing: 5
                        Rectangle {
                            width: 20
                            height: 10
                            color: "#2ecc71"
                            anchors.verticalCenter: parent.verticalCenter
                        }
                        Label {
                            text: "AFR"
                            color: "white"
                        }
                    }
                }
            }
        }
    }
}
