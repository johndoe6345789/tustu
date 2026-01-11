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
    QFormLayout, QMessageBox, QInputDialog
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
    
    def __init__(self, title, fields, generator_func, supports_validation=True):
        super().__init__()
        self.fields = fields
        self.generator_func = generator_func
        self.supports_validation = supports_validation
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
        Button layout
        button_layout = QHBoxLayout()
        
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
        button_layout.addWidget(generate_btn)
        
        # Validate button (if supported)
        if self.supports_validation:
            validate_btn = QPushButton("Validate Key")
            validate_btn.setStyleSheet("""
                QPushButton {
                    background-color: #FF9800;
                    color: white;
                    padding: 10px;
                    font-size: 14px;
                    font-weight: bold;
                    border-radius: 5px;
                }
                QPushButton:hover {
                    background-color: #F57C00;
                }
            """)
            validate_btn.clicked.connect(self.validate_key)
            button_layout.addWidget(validate_btn)
        
        layout.addLayout(button_layoutself.generate_key)
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
    
    def validate_key(self):
        """Validate a registration key (mimics Java validation logic)"""
        try:
            # Get input values
            values = {key: widget.text().strip() for key, widget in self.inputs.items()}
            
            # Check if we have a key to validate
            current_key = self.output.toPlainText().strip()
            if not current_key:
                # Ask user to enter or paste a key
                key_to_validate, ok = QInputDialog.getText(
                    self, 
                    "Enter Registration Key",
                    "Enter the registration key to validate:",
                    QLineEdit.EchoMode.Normal
                )
                if not ok or not key_to_validate.strip():
                    return
                current_key = key_to_validate.strip()
            
            # Validate inputs
            if not all(values.values()):
                QMessageBox.warning(self, "Missing Input", "Please fill in all fields to validate.")
                return
            
            # Generate expected key using the same algorithm (mimics Java validation)
            expected_key = self.generator_func(**values)
            
            if expected_key is None:
                QMessageBox.error(self, "Validation Error", "Failed to generate expected key for validation.")
                return
            
            # Compare keys (case-sensitive, exact match - mimics Java equals())
            if expected_key == current_key:
                # Valid key
                self.output.setPlainText(current_key)
                self.output.setStyleSheet("background-color: #c8e6c9; color: #2e7d32; border: 3px solid #4CAF50;")
                QMessageBox.information(
                    self,
                    "✓ Valid Registration",
                    f"Registration key is VALID!\n\n"
                    f"Registered to:\n"
                    f"  Name: {values.get('first_name', '')} {values.get('last_name', '')}\n"
                    f"  Email: {values.get('email', '')}\n"
                    f"  Product: {values.get('product_name', 'N/A')}"
                )
            else:
                # Invalid key
                self.output.setPlainText(current_key)
                self.output.setStyleSheet("background-color: #ffcdd2; color: #c62828; border: 3px solid #f44336;")
                
                # Create detailed error message
                error_msg = "Registration key is INVALID!\n\n"
                error_msg += "Please check:\n"
                error_msg += "  • First name and last name are correct\n"
                error_msg += "  • Email address matches exactly\n"
                error_msg += "  • Product name is correct\n"
                error_msg += "  • Key was copied completely\n"
                error_msg += "  • Correct algorithm variant is selected\n\n"
                error_msg += "Keys are case-sensitive!"
                
                QMessageBox.warning(self, "✗ Invalid Registration", error_msg)
                
        except Exception as e:
            QMessageBox.critical(self, "Validation Error", f"An error occurred during validation: {str(e)}")
            
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


class EmailParserTab(QWidget):
    """Tab for parsing registration info from email text"""
    
    def __init__(self):
        super().__init__()
        self.init_ui()
    
    def init_ui(self):
        layout = QVBoxLayout()
        
        # Instructions
        instructions = QLabel(
            "Paste your registration email below. The system will automatically extract:\n"
            "• First Name\n"
            "• Last Name\n"
            "• Email Address\n"
            "• Registration Key\n"
            "• Serial Number (if present)"
        )
        instructions.setWordWrap(True)
        instructions.setStyleSheet("background-color: #e3f2fd; padding: 10px; border-radius: 5px;")
        layout.addWidget(instructions)
        
        # Input area
        inButton layout
        button_layout = QHBoxLayout()
        
        # Copy button
        copy_btn = QPushButton("Copy Registration Key")
        copy_btn.clicked.connect(self.copy_key)
        button_layout.addWidget(copy_btn)
        
        # Validate button
        validate_btn = QPushButton("Validate Key")
        validate_btn.setStyleSheet("""
            QPushButton {
                background-color: #FF9800;
                color: white;
                padding: 8px;
                font-size: 13px;
                font-weight: bold;
                border-radius: 3px;
            }
            QPushButton:hover {
                background-color: #F57C00;
            }
        """)
        validate_btn.clicked.connect(self.validate_parsed_key)
        button_layout.addWidget(validate_btn)
        
        layout.addLayout(button_layoutit()
        self.email_text.setPlaceholderText(
            "[Registration]\n"
            "First Name: John\n"
            "Last Name: Doe\n"
            "Registered email: john.doe@example.com\n"
            "Serial Number: ABC123\n"
            "Registration Key: XYZ789\n"
            "[End Registration]"
        )
        self.email_text.setMinimumHeight(150)
        input_layout.addWidget(self.email_text)
        
        input_group.setLayout(input_layout)
        layout.addWidget(input_group)
        
        # Parse button
        parse_btn = QPushButton("Parse Registration Information")
        parse_btn.setStyleSheet("""
            QPushButton {
                background-color: #2196F3;
                color: white;
                padding: 10px;
                font-size: 14px;
                font-weight: bold;
                border-radius: 5px;
            }
            QPushButton:hover {
                background-color: #1976D2;
            }
        """)
        parse_btn.clicked.connect(self.parse_email)
        layout.addWidget(parse_btn)
        
        # Output area
        output_group = QGroupBox("Extracted Information")
        output_layout = QFormLayout()
        
        self.first_name_output = QLineEdit()
        self.first_name_output.setReadOnly(True)
        output_layout.addRow("First Name:", self.first_name_output)
        
        self.last_name_output = QLineEdit()
        self.last_name_output.setReadOnly(True)
        output_layout.addRow("Last Name:", self.last_name_output)
        
        self.email_output = QLineEdit()
        self.email_output.setReadOnly(True)
        output_layout.addRow("Email:", self.email_output)
        
        self.serial_output = QLineEdit()
        self.serial_output.setReadOnly(True)
        output_layout.addRow("Serial Number:", self.serial_output)
        
        self.key_output = QTextEdit()
        self.key_output.setReadOnly(True)
        self.key_output.setMaximumHeight(60)
        self.key_output.setFont(QFont("Courier", 11, QFont.Weight.Bold))
        output_layout.addRow("Registration Key:", self.key_output)
        
        output_group.setLayout(output_layout)
        layout.addWidget(output_group)
        
        # Copy button
        copy_btn = QPushButton("Copy Registration Key")
    
    def validate_parsed_key(self):
        """Validate the parsed registration key"""
        first_name = self.first_name_output.text().strip()
        last_name = self.last_name_output.text().strip()
        email = self.email_output.text().strip()
        reg_key = self.key_output.toPlainText().strip()
        
        if not all([first_name, last_name, email, reg_key]):
            QMessageBox.warning(
                self,
                "Incomplete Information",
                "Please parse an email with complete registration information first."
            )
            return
        
        # Ask for product name and secret
        product_name, ok1 = QInputDialog.getText(
            self,
            "Product Name",
            "Enter product name (e.g., 'MegaLogViewer'):",
            QLineEdit.EchoMode.Normal,
            "MegaLogViewer"
        )
        if not ok1 or not product_name.strip():
            return
        
        secret, ok2 = QInputDialog.getText(
            self,
            "Secret Key",
            "Enter secret key (leave empty for 5-param algorithm):",
            QLineEdit.EchoMode.Normal,
            ""
        )
        if not ok2:
            return
        
        try:
            # Try different algorithms
            if secret.strip():
                # Try 8-param first (with fields)
                serial = self.serial_output.text().strip()
                if serial:
                    expected_key = RegistrationKeyGenerator.generate_key_8param(
                        first_name, last_name, product_name, secret, email, "01", "2015", serial
                    )
                    if expected_key == reg_key:
                        self._show_valid_result(first_name, last_name, email, product_name, "8-parameter (Full)")
                        return
                
                # Try 7-param
                expected_key = RegistrationKeyGenerator.generate_key_7param(
                    first_name, last_name, product_name, secret, email, "01", "2015"
                )
                if expected_key == reg_key:
                    self._show_valid_result(first_name, last_name, email, product_name, "7-parameter (Enhanced)")
                    return
                
                # Try 5-param
                expected_key = RegistrationKeyGenerator.generate_key_5param(
                    first_name, last_name, product_name, secret, email
                )
                if expected_key == reg_key:
                    self._show_valid_result(first_name, last_name, email, product_name, "5-parameter (Standard)")
                    return
            
            # All validation attempts failed
            self.key_output.setStyleSheet("background-color: #ffcdd2; color: #c62828; border: 3px solid #f44336;")
            QMessageBox.warning(
                self,
                "✗ Invalid Registration",
                "Registration key is INVALID!\n\n"
                "The key does not match any known algorithm variant.\n"
                "Please verify:\n"
                "  • Product name is correct\n"
                "  • Secret key is correct\n"
                "  • Name and email match exactly"
            )
            
        except Exception as e:
            QMessageBox.critical(self, "Validation Error", f"Error during validation: {str(e)}")
    
    def _show_valid_result(self, first_name, last_name, email, product, algorithm):
        """Show valid registration result"""
        self.key_output.setStyleSheet("background-color: #c8e6c9; color: #2e7d32; border: 3px solid #4CAF50;")
        QMessageBox.information(
            self,
            "✓ Valid Registration",
            f"Registration key is VALID!\n\n"
            f"Algorithm: {algorithm}\n"
            f"Registered to:\n"
            f"  Name: {first_name} {last_name}\n"
            f"  Email: {email}\n"
            f"  Product: {product}"
        )
        copy_btn.clicked.connect(self.copy_key)
        layout.addWidget(copy_btn)
        
        layout.addStretch()
        self.setLayout(layout)
    
    def parse_email(self):
        """Parse registration information from email text"""
        text = self.email_text.toPlainText()
        
        if not text.strip():
            QMessageBox.warning(self, "Empty Input", "Please paste the registration email text.")
            return
        
        try:
            # Parse the email text
            in_registration = False
            first_name = ""
            last_name = ""
            email = ""
            serial = ""
            reg_key = ""
            
            for line in text.split('\n'):
                line = line.strip()
                
                if '[Registration]' in line or line.startswith('Registration'):
                    in_registration = True
                    continue
                
                if '[End Registration]' in line or not in_registration:
                    if '[End Registration]' in line:
                        break
                    continue
                
                if in_registration:
                    # Parse different fields
                    if line.startswith('First Name') and ':' in line:
                        first_name = line.split(':', 1),
            supports_validation=False  # Obfuscation only, no key validation[1].strip()
                    elif line.startswith('Last Name') and ':' in line:
                        last_name = line.split(':', 1)[1].strip()
                    elif 'email' in line.lower() and ':' in line:
                        email = line.split(':', 1)[1].strip()
                    elif 'Serial Number' in line and ':' in line:
                        serial = line.split(':', 1)[1].strip()
                    elif 'Registration Key' in line and ':' in line:
                        key_part = line.split(':', 1)[1].strip()
                        reg_key = key_part if key_part else reg_key
                    elif reg_key and line and not ':' in line:
                        # Continue multi-line registration key
                        reg_key += line.strip()
            
            # Update output fields
            self.first_name_output.setText(first_name)
            self.last_name_output.setText(last_name)
            self.email_output.setText(email)
            self.serial_output.setText(serial)
            self.key_output.setPlainText(reg_key)
            
            if first_name or last_name or email or reg_key:
                self.key_output.setStyleSheet("background-color: #e8f5e9; color: #2e7d32;")
                QMessageBox.information(
                    self, 
                    "Success", 
                    "Registration information parsed successfully!"
                )
            else:
                QMessageBox.warning(
                    self,
                    "No Data Found",
                    "Could not find registration information in the pasted text.\n\n"
                    "Make sure the text contains fields like:\n"
                    "First Name: ...\n"
                    "Last Name: ...\n"
                    "Registered email: ...\n"
                    "Registration Key: ..."
                )
        
        except Exception as e:
            QMessageBox.critical(self, "Parse Error", f"Error parsing email: {str(e)}")
    
    def copy_key(self):
        """Copy registration key to clipboard"""
        key = self.key_output.toPlainText()
        if key:
            QApplication.clipboard().setText(key)
            QMessageBox.information(self, "Copied", "Registration key copied to clipboard!")
        else:
            QMessageBox.warning(self, "No Key", "No registration key to copy.")


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
        
        # Tab 5: Email Parser
        tab5 = EmailParserTab()
        tabs.addTab(tab5, "Parse Email 📧")
        
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
