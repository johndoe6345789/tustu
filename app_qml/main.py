#!/usr/bin/env python3
"""
TunerStudio MS QML Application Launcher
Replica of the Java/Swing TunerStudio application in QML
"""

import sys
import os
import math
import random
from pathlib import Path
from PyQt6.QtCore import QObject, pyqtSlot, QUrl, pyqtProperty, pyqtSignal, QTimer
from PyQt6.QtGui import QGuiApplication, QClipboard
from PyQt6.QtQml import QQmlApplicationEngine, qmlRegisterType


class EngineSimulator(QObject):
    """Simulates realistic engine data for the dashboard"""
    
    # Signals for property changes
    rpmChanged = pyqtSignal()
    throttleChanged = pyqtSignal()
    tempChanged = pyqtSignal()
    afrChanged = pyqtSignal()
    boostChanged = pyqtSignal()
    voltageChanged = pyqtSignal()
    pulseWidthChanged = pyqtSignal()
    ignitionChanged = pyqtSignal()
    
    def __init__(self):
        super().__init__()
        self._rpm = 850.0
        self._throttle = 0.0
        self._temp = 75.0
        self._afr = 14.7
        self._boost = 0.0
        self._voltage = 12.6
        self._pulseWidth = 2.5
        self._ignition = 15.0
        
        self._cycle_time = 0
        self._phase = 0
        
        # Timer for simulation updates (50ms = 20Hz)
        self._timer = QTimer()
        self._timer.timeout.connect(self._update_simulation)
        self._timer.start(50)
    
    def _update_simulation(self):
        """10-phase realistic driving simulation"""
        self._cycle_time += 50
        
        if self._cycle_time < 3000:  # Idle
            self._phase = 0
            self._rpm = 850 + math.sin(self._cycle_time / 100) * 50
            self._throttle = 0
            self._temp = min(self._temp + 0.01, 85)
            self._boost = 0
            self._pulseWidth = 2.5
            self._afr = 14.7
            self._ignition = 15
            
        elif self._cycle_time < 5000:  # Light acceleration
            self._phase = 1
            t = (self._cycle_time - 3000) / 2000
            self._rpm = 850 + t * 2150
            self._throttle = 20 + t * 30
            self._temp += 0.05
            self._boost = max(0, (self._rpm - 2000) / 1000 * 5)
            self._pulseWidth = 2.5 + t * 5
            self._afr = 14.7 - t * 0.5
            self._ignition = 15 + t * 10
            
        elif self._cycle_time < 8000:  # Cruising
            self._phase = 2
            self._rpm = 3000 + math.sin((self._cycle_time - 5000) / 200) * 100
            self._throttle = 45 + math.sin((self._cycle_time - 5000) / 150) * 5
            self._temp = min(self._temp + 0.02, 95)
            self._boost = 3 + math.sin((self._cycle_time - 5000) / 300) * 2
            self._pulseWidth = 7.5
            self._afr = 14.5
            self._ignition = 25
            
        elif self._cycle_time < 10000:  # WOT acceleration
            self._phase = 3
            t = (self._cycle_time - 8000) / 2000
            self._rpm = 3000 + t * 4000
            self._throttle = 50 + t * 50
            self._temp += 0.1
            self._boost = 3 + t * 12
            self._pulseWidth = 7.5 + t * 7
            self._afr = 14.7 - t * 3.2
            self._ignition = 25 - t * 8
            
        elif self._cycle_time < 11000:  # Gear shift
            self._phase = 4
            t = (self._cycle_time - 10000) / 1000
            self._rpm = 7000 - t * 3000
            self._throttle = 0
            self._boost = 15 - t * 10
            self._pulseWidth = 14 - t * 10
            self._afr = 11.5 + t * 5
            self._ignition = 17 + t * 8
            
        elif self._cycle_time < 14000:  # Acceleration in higher gear
            self._phase = 5
            t = (self._cycle_time - 11000) / 3000
            self._rpm = 4000 + t * 2500
            self._throttle = 70 + t * 30
            self._boost = 5 + t * 8
            self._pulseWidth = 4 + t * 8
            self._afr = max(11.5, 16.5 - t * 3)
            self._ignition = 25 - t * 5
            
        elif self._cycle_time < 16000:  # Deceleration
            self._phase = 6
            t = (self._cycle_time - 14000) / 2000
            self._rpm = 6500 - t * 4500
            self._throttle = 100 - t * 100
            self._boost = max(0, 13 - t * 13)
            self._pulseWidth = max(1, 12 - t * 11)
            self._afr = 11.5 + t * 7
            self._temp = max(85, self._temp - 0.05)
            self._ignition = 20 + t * 10
            
        elif self._cycle_time < 18000:  # Coasting
            self._phase = 7
            t = (self._cycle_time - 16000) / 2000
            self._rpm = 2000 - t * 500
            self._throttle = 0
            self._boost = 0
            self._pulseWidth = 1
            self._afr = 18.5 + math.sin((self._cycle_time - 16000) / 100)
            self._temp = max(85, self._temp - 0.03)
            self._ignition = 30
            
        elif self._cycle_time < 20000:  # Back to idle
            self._phase = 8
            t = (self._cycle_time - 18000) / 2000
            self._rpm = 1500 - t * 650
            self._throttle = 0
            self._boost = 0
            self._pulseWidth = 2.5
            self._afr = 14.7
            self._temp = max(85, self._temp - 0.02)
            self._ignition = 15
            
        else:  # Reset cycle
            self._cycle_time = 0
        
        # Add slight randomness
        self._rpm = max(0, self._rpm + (random.random() - 0.5) * 20)
        self._throttle = max(0, min(100, self._throttle + (random.random() - 0.5) * 2))
        self._afr = max(10, min(20, self._afr + (random.random() - 0.5) * 0.1))
        self._voltage = 12.6 + (random.random() - 0.5) * 0.4
        
        # Emit all change signals
        self.rpmChanged.emit()
        self.throttleChanged.emit()
        self.tempChanged.emit()
        self.afrChanged.emit()
        self.boostChanged.emit()
        self.voltageChanged.emit()
        self.pulseWidthChanged.emit()
        self.ignitionChanged.emit()
    
    @pyqtProperty(float, notify=rpmChanged)
    def rpm(self):
        return self._rpm
    
    @pyqtProperty(float, notify=throttleChanged)
    def throttle(self):
        return self._throttle
    
    @pyqtProperty(float, notify=tempChanged)
    def temp(self):
        return self._temp
    
    @pyqtProperty(float, notify=afrChanged)
    def afr(self):
        return self._afr
    
    @pyqtProperty(float, notify=boostChanged)
    def boost(self):
        return self._boost
    
    @pyqtProperty(float, notify=voltageChanged)
    def voltage(self):
        return self._voltage
    
    @pyqtProperty(float, notify=pulseWidthChanged)
    def pulseWidth(self):
        return self._pulseWidth
    
    @pyqtProperty(float, notify=ignitionChanged)
    def ignition(self):
        return self._ignition


class ClipboardHelper(QObject):
    """Helper class for clipboard operations accessible from QML"""
    
    def __init__(self, app):
        super().__init__()
        self.app = app
        self.clipboard = app.clipboard()
    
    @pyqtSlot(result=str)
    def getClipboardText(self):
        """Get text from system clipboard"""
        return self.clipboard.text()
    
    @pyqtSlot(str)
    def setClipboardText(self, text):
        """Set text to system clipboard"""
        self.clipboard.setText(text)
    
    @pyqtSlot(result=str)
    def getHomeDirectory(self):
        """Get user's home directory"""
        return str(Path.home())
    
    @pyqtSlot(str, str, result=bool)
    def saveTextToFile(self, file_url, content):
        """Save text content to a file"""
        try:
            # Convert QML file:// URL to path
            file_path = QUrl(file_url).toLocalFile()
            with open(file_path, 'w') as f:
                f.write(content)
            return True
        except Exception as e:
            print(f"Error saving file: {e}")
            return False
    
    @pyqtSlot(str, result=str)
    def loadTextFromFile(self, file_url):
        """Load text content from a file"""
        try:
            # Convert QML file:// URL to path
            file_path = QUrl(file_url).toLocalFile()
            with open(file_path, 'r') as f:
                return f.read()
        except Exception as e:
            print(f"Error loading file: {e}")
            return ""


def main():
    """Main application entry point"""
    
    # Set up application
    app = QGuiApplication(sys.argv)
    app.setApplicationName("TunerStudio MS")
    app.setOrganizationName("EFI Analytics")
    app.setOrganizationDomain("efianalytics.com")
    
    # Create QML engine
    engine = QQmlApplicationEngine()
    
    # Create and register engine simulator
    engine_sim = EngineSimulator()
    engine.rootContext().setContextProperty("engineData", engine_sim)
    
    # Create and register clipboard helper
    clipboard_helper = ClipboardHelper(app)
    engine.rootContext().setContextProperty("clipboardHelper", clipboard_helper)
    
    # Get the directory where this script is located
    script_dir = Path(__file__).parent
    qml_file = script_dir / "Main.qml"
    
    if not qml_file.exists():
        print(f"Error: QML file not found at {qml_file}")
        print(f"Current directory: {Path.cwd()}")
        print(f"Script directory: {script_dir}")
        sys.exit(1)
    
    # Load the main QML file
    engine.load(QUrl.fromLocalFile(str(qml_file)))
    
    if not engine.rootObjects():
        print("Error: Failed to load QML file")
        sys.exit(1)
    
    print(f"TunerStudio MS QML Application Started")
    print(f"Loaded from: {qml_file}")
    print(f"Engine simulation running at 20Hz")
    print(f"\nAvailable views:")
    print(f"  - Gauge Cluster: Draggable gauges with live engine data")
    print(f"  - Tuning & Dyno: Tuning views")
    print(f"  - Graphing & Logging: Data logging")
    print(f"  - Diagnostics: ECU status")
    
    # Run the application
    sys.exit(app.exec())


if __name__ == "__main__":
    main()
