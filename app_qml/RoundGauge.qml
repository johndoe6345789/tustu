import QtQuick
import QtQuick.Controls

Item {
    id: roundGauge
    
    property string title: "Gauge"
    property real minValue: 0
    property real maxValue: 100
    property real value: 0
    property real warningValue: 85
    property real dangerValue: 95
    property string units: ""
    property int majorTicks: 11
    property int minorTicks: 5
    
    width: 300
    height: 300
    
    Canvas {
        id: canvas
        anchors.fill: parent
        antialiasing: true
        
        onPaint: {
            var ctx = getContext("2d")
            ctx.reset()
            
            var centerX = width / 2
            var centerY = height / 2
            var radius = Math.min(width, height) / 2 - 30
            
            // Background circle
            ctx.beginPath()
            ctx.arc(centerX, centerY, radius, 0, 2 * Math.PI)
            ctx.fillStyle = "#2c3e50"
            ctx.fill()
            
            // Outer rim
            ctx.beginPath()
            ctx.arc(centerX, centerY, radius, 0, 2 * Math.PI)
            ctx.strokeStyle = "#34495e"
            ctx.lineWidth = 8
            ctx.stroke()
            
            // Draw ticks
            var startAngle = 0.75 * Math.PI
            var endAngle = 2.25 * Math.PI
            var angleRange = endAngle - startAngle
            
            for (var i = 0; i <= majorTicks; i++) {
                var angle = startAngle + (i / majorTicks) * angleRange
                var innerRadius = radius - 15
                var outerRadius = radius - 5
                
                var x1 = centerX + innerRadius * Math.cos(angle)
                var y1 = centerY + innerRadius * Math.sin(angle)
                var x2 = centerX + outerRadius * Math.cos(angle)
                var y2 = centerY + outerRadius * Math.sin(angle)
                
                ctx.beginPath()
                ctx.moveTo(x1, y1)
                ctx.lineTo(x2, y2)
                ctx.strokeStyle = "#ecf0f1"
                ctx.lineWidth = 3
                ctx.stroke()
                
                // Tick labels
                var tickValue = minValue + (i / majorTicks) * (maxValue - minValue)
                var labelRadius = radius - 40
                var labelX = centerX + labelRadius * Math.cos(angle)
                var labelY = centerY + labelRadius * Math.sin(angle)
                
                ctx.font = "12px Arial"
                ctx.fillStyle = "#ecf0f1"
                ctx.textAlign = "center"
                ctx.textBaseline = "middle"
                ctx.fillText(Math.round(tickValue), labelX, labelY)
            }
            
            // Color zones
            var normalZone = (warningValue - minValue) / (maxValue - minValue)
            var warningZone = (dangerValue - minValue) / (maxValue - minValue)
            
            // Green zone
            ctx.beginPath()
            ctx.arc(centerX, centerY, radius - 20, startAngle, 
                    startAngle + normalZone * angleRange, false)
            ctx.strokeStyle = "#2ecc71"
            ctx.lineWidth = 10
            ctx.stroke()
            
            // Yellow zone
            ctx.beginPath()
            ctx.arc(centerX, centerY, radius - 20, 
                    startAngle + normalZone * angleRange,
                    startAngle + warningZone * angleRange, false)
            ctx.strokeStyle = "#f39c12"
            ctx.lineWidth = 10
            ctx.stroke()
            
            // Red zone
            ctx.beginPath()
            ctx.arc(centerX, centerY, radius - 20, 
                    startAngle + warningZone * angleRange,
                    endAngle, false)
            ctx.strokeStyle = "#e74c3c"
            ctx.lineWidth = 10
            ctx.stroke()
            
            // Needle
            var valueAngle = startAngle + ((value - minValue) / (maxValue - minValue)) * angleRange
            var needleLength = radius - 30
            
            ctx.save()
            ctx.translate(centerX, centerY)
            ctx.rotate(valueAngle)
            
            // Needle shadow
            ctx.beginPath()
            ctx.moveTo(0, 0)
            ctx.lineTo(needleLength + 2, 2)
            ctx.strokeStyle = "rgba(0,0,0,0.3)"
            ctx.lineWidth = 4
            ctx.stroke()
            
            // Needle
            ctx.beginPath()
            ctx.moveTo(0, 0)
            ctx.lineTo(needleLength, 0)
            ctx.strokeStyle = "#e74c3c"
            ctx.lineWidth = 3
            ctx.stroke()
            
            ctx.restore()
            
            // Center cap
            ctx.beginPath()
            ctx.arc(centerX, centerY, 10, 0, 2 * Math.PI)
            ctx.fillStyle = "#34495e"
            ctx.fill()
            
            ctx.beginPath()
            ctx.arc(centerX, centerY, 8, 0, 2 * Math.PI)
            ctx.fillStyle = "#e74c3c"
            ctx.fill()
        }
        
        Connections {
            target: roundGauge
            function onValueChanged() { canvas.requestPaint() }
        }
    }
    
    // Title
    Label {
        anchors.horizontalCenter: parent.horizontalCenter
        anchors.top: parent.top
        anchors.topMargin: 15
        text: title
        font.pixelSize: 16
        font.bold: true
        color: "#ecf0f1"
    }
    
    // Digital value
    Label {
        anchors.horizontalCenter: parent.horizontalCenter
        anchors.bottom: parent.bottom
        anchors.bottomMargin: 50
        text: value.toFixed(1) + " " + units
        font.pixelSize: 24
        font.bold: true
        color: "#ecf0f1"
    }
}
