#!/usr/bin/env python3
"""
QML-based Registration Key Generator
Uses Qt6 QML for the UI with Python backend
"""

import sys
import os
from pathlib import Path

# Add parent directory to path for imports
sys.path.insert(0, str(Path(__file__).parent.parent))

from PyQt6.QtCore import QObject, pyqtSlot, pyqtSignal, pyqtProperty
from PyQt6.QtGui import QGuiApplication
from PyQt6.QtQml import QQmlApplicationEngine

from registration_gui import RegistrationKeyGenerator, DummyDataGenerator


class RegistrationBackend(QObject):
    """Backend for QML UI"""
    
    keyGenerated = pyqtSignal(str)
    errorOccurred = pyqtSignal(str)
    testDataLoaded = pyqtSignal(str, str, str, str, str, str)
    
    def __init__(self):
        super().__init__()
        self.generator = RegistrationKeyGenerator()
    
    @pyqtSlot(str, str, str, str, result=str)
    def generateKey4Param(self, firstName, lastName, product, email):
        """Generate 4-parameter key"""
        try:
            key = RegistrationKeyGenerator.generate_key_basic(
                firstName, lastName, product, email
            )
            return key if key else ""
        except Exception as e:
            self.errorOccurred.emit(str(e))
            return ""
    
    @pyqtSlot(str, str, str, str, str, result=str)
    def generateKey5Param(self, firstName, lastName, product, secret, email):
        """Generate 5-parameter key"""
        try:
            key = RegistrationKeyGenerator.generate_key_5param(
                firstName, lastName, product, secret, email
            )
            return key if key else ""
        except Exception as e:
            self.errorOccurred.emit(str(e))
            return ""
    
    @pyqtSlot(str, str, str, str, str, str, str, result=str)
    def generateKey7Param(self, firstName, lastName, product, secret, email, month, year):
        """Generate 7-parameter key"""
        try:
            key = RegistrationKeyGenerator.generate_key_7param(
                firstName, lastName, product, secret, email, month, year
            )
            return key if key else ""
        except Exception as e:
            self.errorOccurred.emit(str(e))
            return ""
    
    @pyqtSlot(str, str, str, str, str, str, str, str, result=str)
    def generateKey8Param(self, firstName, lastName, product, secret, email, month, year, serial):
        """Generate 8-parameter key"""
        try:
            key = RegistrationKeyGenerator.generate_key_8param(
                firstName, lastName, product, secret, email, month, year, serial
            )
            return key if key else ""
        except Exception as e:
            self.errorOccurred.emit(str(e))
            return ""
    
    @pyqtSlot(result=str)
    def loadTestData(self):
        """Load test data and return as JSON string"""
        data = DummyDataGenerator.generate()
        
        # Emit signal with test data
        self.testDataLoaded.emit(
            data['first_name'],
            data['last_name'],
            data['email'],
            data['product'],
            data['secret'],
            data['serial']
        )
        
        return f"{data['first_name']}|{data['last_name']}|{data['email']}|{data['product']}|{data['secret']}|{data['serial']}"
    
    @pyqtSlot(str, result=str)
    def parseEmail(self, emailText):
        """Parse email text and return extracted fields"""
        lines = emailText.split('\n')
        in_registration = False
        
        result = {
            'firstName': '',
            'lastName': '',
            'email': '',
            'serial': '',
            'key': ''
        }
        
        for line in lines:
            line = line.strip()
            
            if '[Registration]' in line:
                in_registration = True
                continue
            
            if '[End Registration]' in line:
                break
            
            if in_registration:
                if line.startswith('First Name') and ':' in line:
                    result['firstName'] = line.split(':', 1)[1].strip()
                elif line.startswith('Last Name') and ':' in line:
                    result['lastName'] = line.split(':', 1)[1].strip()
                elif 'email' in line.lower() and ':' in line:
                    result['email'] = line.split(':', 1)[1].strip()
                elif 'Serial Number' in line and ':' in line:
                    result['serial'] = line.split(':', 1)[1].strip()
                elif 'Registration Key' in line and ':' in line:
                    result['key'] = line.split(':', 1)[1].strip()
        
        # Return as delimited string
        return f"{result['firstName']}|{result['lastName']}|{result['email']}|{result['serial']}|{result['key']}"
    
    @pyqtSlot(str, str, str, str, str, result=str)
    def generateEmailFormat(self, firstName, lastName, email, serial, key):
        """Generate registration email format"""
        email_format = "[Registration]\n"
        email_format += f"First Name: {firstName}\n"
        email_format += f"Last Name: {lastName}\n"
        email_format += f"Registered email: {email}\n"
        
        if serial:
            email_format += f"Serial Number: {serial}\n"
        
        email_format += f"Registration Key: {key}\n"
        email_format += "[End Registration]"
        
        return email_format


def main():
    app = QGuiApplication(sys.argv)
    app.setApplicationName("Registration Key Generator")
    app.setOrganizationName("EFI Analytics")
    
    engine = QQmlApplicationEngine()
    
    # Create backend and register it
    backend = RegistrationBackend()
    engine.rootContext().setContextProperty("backend", backend)
    
    # Load QML
    qml_file = Path(__file__).parent / "Main.qml"
    engine.load(str(qml_file))
    
    if not engine.rootObjects():
        return -1
    
    return app.exec()


if __name__ == "__main__":
    sys.exit(main())
