#!/usr/bin/env python3
"""
Registration Key Generator - PyQt6 GUI
Implements the registration key generation algorithm with a graphical interface.
"""

import sys
import hashlib
from PyQt6.QtWidgets import (
    QApplication, QMainWindow, QWidget, QVBoxLayout, QHBoxLayout,
    QLabel, QLineEdit, QPushButton, QTextEdit, QTabWidget, QGroupBox,
    QFormLayout, QMessageBox
)
from PyQt6.QtCore import Qt
from PyQt6.QtGui import QFont


class RegistrationKeyGenerator:
    """Implementation of the registration key generation algorithm"""
    
    CHARSET_BASIC = "123456789ABCDEFGHIJKLMNPQRSTUVWXYZ"
    CHARSET_ENHANCED = "23456789ABCDEFGHJKLMNPQRSTUVWXYZ"
    SPECIAL_CHARS = {96, 92, 91, 93, 59, 46}  # `, \, [, ], ;, .
    
    @staticmethod
    def obfuscate(first_name, last_name, product_name, email):
        """
        Basic obfuscation algorithm (Method 1)
        Returns obfuscated string from input parameters
        """
        if not all([first_name, last_name, product_name, email]):
            return None
        
        # Step 1: Concatenate in specific order
        combined = last_name + product_name + first_name + last_name + email
        byte_array = bytearray(combined.encode('utf-8'))
        
        # Step 2: Reverse the byte array
        byte_array.reverse()
        
        # Step 3: Character transformation
        for i in range(len(byte_array)):
            b = byte_array[i]
            transformed = (b + ((b - 32) % 7)) - (i % 4)
            if transformed > 122:
                transformed -= 9
            byte_array[i] = transformed & 0xFF
        
        # Step 4: Special character handling
        for i in range(len(byte_array)):
            if byte_array[i] in RegistrationKeyGenerator.SPECIAL_CHARS:
                byte_array[i] = (byte_array[i] + 6 + (i % 10)) & 0xFF
        
        return byte_array.decode('latin-1')
    
    @staticmethod
    def generate_key_basic(first_name, last_name, product_name, email):
        """
        Generate registration key (4 parameters - Method 1)
        Returns the obfuscated string only
        """
        return RegistrationKeyGenerator.obfuscate(first_name, last_name, product_name, email)
    
    @staticmethod
    def generate_key_5param(first_name, last_name, product_name, secret, email):
        """
        Generate registration key with secret (5 parameters - Method 2)
        Returns 20-character key using basic charset
        """
        if not all([first_name, last_name, product_name, secret, email]):
            return None
        
        # Get obfuscated base string
        obfuscated = RegistrationKeyGenerator.obfuscate(first_name, last_name, product_name, email)
        if not obfuscated:
            return None
        
        # Prepare input for hashing
        hash_input = (obfuscated + secret).encode('utf-8')
        
        # MD5 hashing with multiple rounds
        md5 = hashlib.md5()
        md5.update(hash_input)
        md5.update(hash_input)
        md5.digest()  # Discard first digest
        md5.update(hash_input)
        hash_digest = md5.digest()
        
        # Generate checksum (simplified - using first 4 bytes of another hash)
        checksum_md5 = hashlib.md5(hash_digest)
        checksum = checksum_md5.digest()[:4]
        
        # Combine checksum and hash (4 + 16 = 20 bytes)
        combined = checksum + hash_digest
        
        # Base-32 encode
        key = ""
        for byte in combined:
            # Handle signed byte by converting to unsigned
            unsigned_byte = byte if byte >= 0 else byte + 256
            key += RegistrationKeyGenerator.CHARSET_BASIC[abs(unsigned_byte) % len(RegistrationKeyGenerator.CHARSET_BASIC)]
        
        return key
    
    @staticmethod
    def generate_key_7param(first_name, last_name, product_name, secret, email, field1, field2):
        """
        Generate enhanced registration key (7 parameters - Method 3)
        Returns 20-character key using enhanced charset
        """
        if not all([first_name, last_name, product_name, secret, email, field1, field2]):
            return None
        
        # Convert to lowercase
        first_name = first_name.lower()
        last_name = last_name.lower()
        email = email.lower()
        
        # Get obfuscated base string and add additional fields
        obfuscated = RegistrationKeyGenerator.obfuscate(first_name, last_name, product_name, email)
        if not obfuscated:
            return None
        
        base_string = obfuscated + field1 + field2
        
        # Prepare input for hashing
        hash_input = (base_string + secret).encode('utf-8')
        
        # MD5 hashing with modified rounds
        md5 = hashlib.md5()
        md5.update(hash_input)
        md5.update(hash_input)
        md5.update((hash_input.decode('utf-8') + field1).encode('utf-8'))
        hash_digest = md5.digest()
        
        # Generate checksum
        checksum_md5 = hashlib.md5(hash_digest)
        checksum = checksum_md5.digest()[:4]
        
        # Combine checksum and hash
        combined = checksum + hash_digest
        
        # Base-32 encode with enhanced charset
        key = ""
        for byte in combined:
            unsigned_byte = byte if byte >= 0 else byte + 256
            key += RegistrationKeyGenerator.CHARSET_ENHANCED[abs(unsigned_byte) % len(RegistrationKeyGenerator.CHARSET_ENHANCED)]
        
        return key
    
    @staticmethod
    def generate_key_8param(first_name, last_name, product_name, secret, email, field1, field2, field3):
        """
        Generate full registration key (8 parameters - Method 4)
        Returns 20-character key using enhanced charset
        """
        if not all([first_name, last_name, product_name, secret, email, field1, field2, field3]):
            return None
        
        # Convert to lowercase
        first_name = first_name.lower()
        last_name = last_name.lower()
        email = email.lower()
        
        # Get obfuscated base string and add additional fields
        obfuscated = RegistrationKeyGenerator.obfuscate(first_name, last_name, product_name, email)
        if not obfuscated:
            return None
        
        base_string = obfuscated + field1 + field2 + field3
        
        # Prepare input for hashing
        hash_input = (base_string + secret).encode('utf-8')
        
        # MD5 hashing with modified rounds
        md5 = hashlib.md5()
        md5.update(hash_input)
        md5.update(hash_input)
        md5.update((hash_input.decode('utf-8') + field1).encode('utf-8'))
        hash_digest = md5.digest()
        
        # Generate checksum
        checksum_md5 = hashlib.md5(hash_digest)
        checksum = checksum_md5.digest()[:4]
        
        # Combine checksum and hash
        combined = checksum + hash_digest
        
        # Base-32 encode with enhanced charset
        key = ""
        for byte in combined:
            unsigned_byte = byte if byte >= 0 else byte + 256
            key += RegistrationKeyGenerator.CHARSET_ENHANCED[abs(unsigned_byte) % len(RegistrationKeyGenerator.CHARSET_ENHANCED)]
        
        return key


class KeyGeneratorTab(QWidget):
    """Base class for key generator tabs"""
    
    def __init__(self, title, fields, generator_func):
        super().__init__()
        self.fields = fields
        self.generator_func = generator_func
        self.init_ui()
    
    def init_ui(self):
        layout = QVBoxLayout()
        
        # Input group
        input_group = QGroupBox("Input Parameters")
        input_layout = QFormLayout()
        
        self.inputs = {}
        for field_name, label in self.fields.items():
            line_edit = QLineEdit()
            line_edit.setPlaceholderText(f"Enter {label.lower()}")
            self.inputs[field_name] = line_edit
            input_layout.addRow(label + ":", line_edit)
        
        input_group.setLayout(input_layout)
        layout.addWidget(input_group)
        
        # Generate button
        generate_btn = QPushButton("Generate Registration Key")
        generate_btn.setStyleSheet("""
            QPushButton {
                background-color: #4CAF50;
                color: white;
                padding: 10px;
                font-size: 14px;
                font-weight: bold;
                border-radius: 5px;
            }
            QPushButton:hover {
                background-color: #45a049;
            }
        """)
        generate_btn.clicked.connect(self.generate_key)
        layout.addWidget(generate_btn)
        
        # Output group
        output_group = QGroupBox("Generated Registration Key")
        output_layout = QVBoxLayout()
        
        self.output = QTextEdit()
        self.output.setReadOnly(True)
        self.output.setMaximumHeight(100)
        self.output.setFont(QFont("Courier", 12, QFont.Weight.Bold))
        output_layout.addWidget(self.output)
        
        # Copy button
        copy_btn = QPushButton("Copy to Clipboard")
        copy_btn.clicked.connect(self.copy_to_clipboard)
        output_layout.addWidget(copy_btn)
        
        output_group.setLayout(output_layout)
        layout.addWidget(output_group)
        
        layout.addStretch()
        self.setLayout(layout)
    
    def generate_key(self):
        """Generate the registration key"""
        try:
            # Get input values
            values = {key: widget.text().strip() for key, widget in self.inputs.items()}
            
            # Validate inputs
            if not all(values.values()):
                QMessageBox.warning(self, "Missing Input", "Please fill in all fields.")
                return
            
            # Generate key
            key = self.generator_func(**values)
            
            if key:
                self.output.setPlainText(key)
                self.output.setStyleSheet("background-color: #e8f5e9; color: #2e7d32;")
            else:
                QMessageBox.error(self, "Generation Failed", "Failed to generate registration key.")
                
        except Exception as e:
            QMessageBox.critical(self, "Error", f"An error occurred: {str(e)}")
    
    def copy_to_clipboard(self):
        """Copy the generated key to clipboard"""
        text = self.output.toPlainText()
        if text:
            QApplication.clipboard().setText(text)
            QMessageBox.information(self, "Copied", "Registration key copied to clipboard!")


class MainWindow(QMainWindow):
    """Main application window"""
    
    def __init__(self):
        super().__init__()
        self.init_ui()
    
    def init_ui(self):
        self.setWindowTitle("Registration Key Generator")
        self.setGeometry(100, 100, 700, 600)
        
        # Central widget
        central_widget = QWidget()
        self.setCentralWidget(central_widget)
        
        # Main layout
        main_layout = QVBoxLayout()
        
        # Title
        title = QLabel("Registration Key Generator")
        title.setFont(QFont("Arial", 18, QFont.Weight.Bold))
        title.setAlignment(Qt.AlignmentFlag.AlignCenter)
        title.setStyleSheet("color: #1976D2; padding: 10px;")
        main_layout.addWidget(title)
        
        # Tab widget
        tabs = QTabWidget()
        
        # Tab 1: Basic (4 parameters)
        tab1 = KeyGeneratorTab(
            "Basic",
            {
                "first_name": "First Name",
                "last_name": "Last Name",
                "product_name": "Product Name",
                "email": "Email"
            },
            RegistrationKeyGenerator.generate_key_basic
        )
        tabs.addTab(tab1, "Basic (Obfuscate)")
        
        # Tab 2: Standard (5 parameters)
        tab2 = KeyGeneratorTab(
            "Standard",
            {
                "first_name": "First Name",
                "last_name": "Last Name",
                "product_name": "Product Name",
                "secret": "Secret",
                "email": "Email"
            },
            RegistrationKeyGenerator.generate_key_5param
        )
        tabs.addTab(tab2, "Standard (5 Params)")
        
        # Tab 3: Enhanced (7 parameters)
        tab3 = KeyGeneratorTab(
            "Enhanced",
            {
                "first_name": "First Name",
                "last_name": "Last Name",
                "product_name": "Product Name",
                "secret": "Secret",
                "email": "Email",
                "field1": "Additional Field 1",
                "field2": "Additional Field 2"
            },
            RegistrationKeyGenerator.generate_key_7param
        )
        tabs.addTab(tab3, "Enhanced (7 Params)")
        
        # Tab 4: Full (8 parameters)
        tab4 = KeyGeneratorTab(
            "Full",
            {
                "first_name": "First Name",
                "last_name": "Last Name",
                "product_name": "Product Name",
                "secret": "Secret",
                "email": "Email",
                "field1": "Additional Field 1",
                "field2": "Additional Field 2",
                "field3": "Additional Field 3"
            },
            RegistrationKeyGenerator.generate_key_8param
        )
        tabs.addTab(tab4, "Full (8 Params)")
        
        main_layout.addWidget(tabs)
        
        # Info label
        info = QLabel("Note: This tool implements the registration key algorithm for educational purposes.")
        info.setWordWrap(True)
        info.setStyleSheet("color: #666; font-style: italic; padding: 10px;")
        info.setAlignment(Qt.AlignmentFlag.AlignCenter)
        main_layout.addWidget(info)
        
        central_widget.setLayout(main_layout)
        
        # Apply stylesheet
        self.setStyleSheet("""
            QMainWindow {
                background-color: #f5f5f5;
            }
            QGroupBox {
                font-weight: bold;
                border: 2px solid #ccc;
                border-radius: 5px;
                margin-top: 10px;
                padding-top: 10px;
            }
            QGroupBox::title {
                subcontrol-origin: margin;
                left: 10px;
                padding: 0 5px;
            }
            QLineEdit {
                padding: 5px;
                border: 1px solid #ccc;
                border-radius: 3px;
            }
            QLineEdit:focus {
                border: 2px solid #1976D2;
            }
            QPushButton {
                padding: 8px;
                border-radius: 3px;
            }
        """)


def main():
    app = QApplication(sys.argv)
    app.setStyle('Fusion')
    window = MainWindow()
    window.show()
    sys.exit(app.exec())


if __name__ == "__main__":
    main()
