#!/usr/bin/env python3
"""
TunerStudio MS QML Application Launcher
Replica of the Java/Swing TunerStudio application in QML
"""

import sys
import os
from pathlib import Path
from PyQt6.QtCore import QObject, pyqtSlot, QUrl
from PyQt6.QtGui import QGuiApplication, QClipboard
from PyQt6.QtQml import QQmlApplicationEngine, qmlRegisterType


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
    print(f"\nAvailable views:")
    print(f"  - Tuning: 3D tables for VE, ignition, AFR")
    print(f"  - Dashboard: Real-time gauges and indicators")
    print(f"  - Data Logging: Chart and log viewer")
    print(f"  - Table Editor: Advanced table editing")
    print(f"  - Diagnostics: ECU status and error codes")
    print(f"\nRegistration dialogs available in separate QML files:")
    print(f"  - RegistrationDialog.qml")
    print(f"  - OfflineActivationDialog.qml")
    
    # Run the application
    sys.exit(app.exec())


if __name__ == "__main__":
    main()
