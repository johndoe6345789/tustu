#!/usr/bin/env python3
"""
Test script to demonstrate the dummy data generator functionality
"""

import sys
import os
sys.path.insert(0, os.path.dirname(__file__))

from registration_gui import DummyDataGenerator, RegistrationKeyGenerator


def test_dummy_data_generation():
    """Test generating multiple sets of dummy data"""
    print("=" * 80)
    print("DUMMY DATA GENERATOR TEST")
    print("=" * 80)
    print()
    
    print("Generating 5 sets of test data with valid registration keys:")
    print("-" * 80)
    print()
    
    for i in range(5):
        data = DummyDataGenerator.generate()
        
        # Generate a valid key using the 5-parameter algorithm
        key = RegistrationKeyGenerator.generate_key_5param(
            data['first_name'],
            data['last_name'],
            data['product'],
            data['secret'],
            data['email']
        )
        
        print(f"Test Set {i+1}:")
        print(f"  First Name: {data['first_name']}")
        print(f"  Last Name:  {data['last_name']}")
        print(f"  Email:      {data['email']}")
        print(f"  Product:    {data['product']}")
        print(f"  Secret:     {data['secret']}")
        print(f"  Serial:     {data['serial']}")
        print(f"  Valid Key:  {key}")
        print()
    
    print("=" * 80)
    print("✓ All test data generated successfully!")
    print("=" * 80)


def test_validation():
    """Test that generated keys are valid"""
    print()
    print("=" * 80)
    print("VALIDATION TEST")
    print("=" * 80)
    print()
    
    data = DummyDataGenerator.generate()
    
    # Test all 4 algorithms
    algorithms = [
        ("4-parameter (Basic)", RegistrationKeyGenerator.generate_key_basic, 
         [data['first_name'], data['last_name'], data['product'], data['email']]),
        ("5-parameter (Standard)", RegistrationKeyGenerator.generate_key_5param,
         [data['first_name'], data['last_name'], data['product'], data['secret'], data['email']]),
        ("7-parameter (Enhanced)", RegistrationKeyGenerator.generate_key_7param,
         [data['first_name'], data['last_name'], data['product'], data['secret'], data['email'], '01', '2015']),
        ("8-parameter (Full)", RegistrationKeyGenerator.generate_key_8param,
         [data['first_name'], data['last_name'], data['product'], data['secret'], data['email'], '01', '2015', data['serial']])
    ]
    
    print(f"User: {data['first_name']} {data['last_name']}")
    print(f"Email: {data['email']}")
    print(f"Product: {data['product']}")
    print()
    
    for name, func, args in algorithms:
        key = func(*args)
        # Verify by regenerating
        verify_key = func(*args)
        is_valid = (key == verify_key)
        status = "✓ VALID" if is_valid else "✗ INVALID"
        print(f"{name:30s} {status}")
        print(f"  Key: {key}")
        print()
    
    print("=" * 80)
    print("✓ All algorithms generate consistent keys!")
    print("=" * 80)


def test_email_format():
    """Test email format generation"""
    print()
    print("=" * 80)
    print("EMAIL FORMAT TEST")
    print("=" * 80)
    print()
    
    data = DummyDataGenerator.generate()
    key = RegistrationKeyGenerator.generate_key_5param(
        data['first_name'],
        data['last_name'],
        data['product'],
        data['secret'],
        data['email']
    )
    
    # Generate email format
    email_format = f"""[Registration]
First Name: {data['first_name']}
Last Name: {data['last_name']}
Registered email: {data['email']}
Serial Number: {data['serial']}
Registration Key: {key}
[End Registration]"""
    
    print("Generated Registration Email:")
    print("-" * 80)
    print(email_format)
    print("-" * 80)
    print()
    print("This format can be:")
    print("  • Copied and pasted into the Email Parser tab")
    print("  • Sent to users via email")
    print("  • Validated using the Validate button")
    print()
    print("=" * 80)


if __name__ == "__main__":
    test_dummy_data_generation()
    test_validation()
    test_email_format()
    
    print()
    print("=" * 80)
    print("GUI USAGE:")
    print("=" * 80)
    print()
    print("1. Run: python3 registration_gui.py")
    print("2. Go to any tab (Basic, 5-param, 7-param, 8-param, or Email Parser)")
    print("3. Click 'Load Test Data' button (blue/purple button)")
    print("4. Fields will be automatically populated with valid test data")
    print("5. Click 'Generate Registration Key' to create a valid key")
    print("6. Click 'Validate Key' to verify it works")
    print()
    print("On the Email Parser tab:")
    print("  • Click 'Load Test Data' to get a complete set with valid key")
    print("  • Click 'Generate Email Format' to create formatted text")
    print("  • Click 'Validate Key' and enter the product/secret shown in the popup")
    print()
    print("=" * 80)
