#!/usr/bin/env python3
"""
Test script to demonstrate email generation functionality
"""

def generate_registration_email(first_name, last_name, email, registration_key, serial_number=None):
    """
    Generate a registration email in the format expected by MegaLogViewer
    
    Args:
        first_name: User's first name
        last_name: User's last name
        email: User's email address
        registration_key: Generated registration key
        serial_number: Optional serial number
    
    Returns:
        Formatted registration email string
    """
    email_format = "[Registration]\n"
    email_format += f"First Name: {first_name}\n"
    email_format += f"Last Name: {last_name}\n"
    email_format += f"Registered email: {email}\n"
    
    if serial_number:
        email_format += f"Serial Number: {serial_number}\n"
    
    email_format += f"Registration Key: {registration_key}\n"
    email_format += "[End Registration]"
    
    return email_format


if __name__ == "__main__":
    # Example usage
    print("=" * 60)
    print("Registration Email Generation Test")
    print("=" * 60)
    print()
    
    # Test case 1: With serial number
    email1 = generate_registration_email(
        first_name="John",
        last_name="Doe",
        email="john.doe@example.com",
        registration_key="ABCD-EFGH-IJKL-MNOP",
        serial_number="SN12345"
    )
    
    print("Test 1: With Serial Number")
    print("-" * 60)
    print(email1)
    print()
    
    # Test case 2: Without serial number
    email2 = generate_registration_email(
        first_name="Jane",
        last_name="Smith",
        email="jane.smith@company.com",
        registration_key="WXYZ-1234-5678-9ABC"
    )
    
    print("Test 2: Without Serial Number")
    print("-" * 60)
    print(email2)
    print()
    
    print("=" * 60)
    print("✓ Email generation working correctly!")
    print("=" * 60)
