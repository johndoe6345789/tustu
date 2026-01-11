#!/usr/bin/env python3
"""
TuStu Tools - Unified command-line utility
Combines all scripts from the scripts folder into a single argparse-based tool.
"""

import sys
import os
import re
import json
import shutil
import random
import hashlib
from pathlib import Path
from collections import defaultdict
import argparse

# ============================================================================
# REGISTRATION KEY GENERATION (from registration_gui.py)
# ============================================================================

class DummyDataGenerator:
    """Generate realistic test data for registration"""
    
    FIRST_NAMES = [
        "James", "John", "Robert", "Michael", "William", "David", "Richard", "Joseph",
        "Mary", "Patricia", "Jennifer", "Linda", "Barbara", "Elizabeth", "Susan", "Jessica",
        "Thomas", "Charles", "Christopher", "Daniel", "Matthew", "Anthony", "Mark", "Donald",
        "Nancy", "Karen", "Betty", "Helen", "Sandra", "Donna", "Carol", "Ruth"
    ]
    
    LAST_NAMES = [
        "Smith", "Johnson", "Williams", "Brown", "Jones", "Garcia", "Miller", "Davis",
        "Rodriguez", "Martinez", "Hernandez", "Lopez", "Gonzalez", "Wilson", "Anderson", "Thomas",
        "Taylor", "Moore", "Jackson", "Martin", "Lee", "Thompson", "White", "Harris",
        "Clark", "Lewis", "Robinson", "Walker", "Young", "Allen", "King", "Wright"
    ]
    
    DOMAINS = [
        "gmail.com", "yahoo.com", "outlook.com", "hotmail.com", "icloud.com",
        "company.com", "business.net", "enterprise.org", "tech.io", "example.com"
    ]
    
    PRODUCTS = ["MegaLogViewer", "TunerStudio", "DataLogger"]
    SECRETS = ["secret123", "testkey", "demo2024", "abc123xyz"]
    SERIALS = ["SN001", "SN002", "ABC123", "XYZ789", "DEV001", "TEST99"]
    
    @staticmethod
    def generate():
        """Generate a complete set of dummy registration data"""
        first_name = random.choice(DummyDataGenerator.FIRST_NAMES)
        last_name = random.choice(DummyDataGenerator.LAST_NAMES)
        email = f"{first_name.lower()}.{last_name.lower()}@{random.choice(DummyDataGenerator.DOMAINS)}"
        product = random.choice(DummyDataGenerator.PRODUCTS)
        secret = random.choice(DummyDataGenerator.SECRETS)
        serial = random.choice(DummyDataGenerator.SERIALS)
        
        return {
            'first_name': first_name,
            'last_name': last_name,
            'email': email,
            'product': product,
            'secret': secret,
            'serial': serial
        }


class RegistrationKeyGenerator:
    """Implementation of the registration key generation algorithm"""
    
    CHARSET_BASIC = "123456789ABCDEFGHIJKLMNPQRSTUVWXYZ"
    CHARSET_ENHANCED = "23456789ABCDEFGHJKLMNPQRSTUVWXYZ"
    SPECIAL_CHARS = {96, 92, 91, 93, 59, 46}  # `, \, [, ], ;, .
    
    @staticmethod
    def obfuscate(first_name, last_name, product_name, email):
        """Basic obfuscation algorithm (Method 1)"""
        if not all([first_name, last_name, product_name, email]):
            return None
        
        combined = last_name + product_name + first_name + last_name + email
        byte_array = bytearray(combined.encode('utf-8'))
        byte_array.reverse()
        
        for i in range(len(byte_array)):
            b = byte_array[i]
            transformed = (b + ((b - 32) % 7)) - (i % 4)
            if transformed > 122:
                transformed -= 9
            byte_array[i] = transformed & 0xFF
        
        for i in range(len(byte_array)):
            if byte_array[i] in RegistrationKeyGenerator.SPECIAL_CHARS:
                byte_array[i] = (byte_array[i] + 6 + (i % 10)) & 0xFF
        
        return byte_array.decode('latin-1')
    
    @staticmethod
    def generate_key_basic(first_name, last_name, product_name, email):
        """Generate registration key (4 parameters - Method 1)"""
        return RegistrationKeyGenerator.obfuscate(first_name, last_name, product_name, email)
    
    @staticmethod
    def generate_key_5param(first_name, last_name, product_name, secret, email):
        """Generate registration key with secret (5 parameters - Method 2)"""
        if not all([first_name, last_name, product_name, secret, email]):
            return None
        
        obfuscated = RegistrationKeyGenerator.obfuscate(first_name, last_name, product_name, email)
        if not obfuscated:
            return None
        
        hash_input = (obfuscated + secret).encode('utf-8')
        md5 = hashlib.md5()
        md5.update(hash_input)
        md5.update(hash_input)
        md5.digest()
        md5.update(hash_input)
        hash_digest = md5.digest()
        
        checksum_md5 = hashlib.md5(hash_digest)
        checksum = checksum_md5.digest()[:4]
        combined = checksum + hash_digest
        
        key = ""
        for byte in combined:
            unsigned_byte = byte if byte >= 0 else byte + 256
            key += RegistrationKeyGenerator.CHARSET_BASIC[abs(unsigned_byte) % len(RegistrationKeyGenerator.CHARSET_BASIC)]
        
        return key
    
    @staticmethod
    def generate_key_7param(first_name, last_name, product_name, secret, email, field1, field2):
        """Generate enhanced registration key (7 parameters - Method 3)"""
        if not all([first_name, last_name, product_name, secret, email, field1, field2]):
            return None
        
        first_name = first_name.lower()
        last_name = last_name.lower()
        email = email.lower()
        
        obfuscated = RegistrationKeyGenerator.obfuscate(first_name, last_name, product_name, email)
        if not obfuscated:
            return None
        
        base_string = obfuscated + field1 + field2
        hash_input = (base_string + secret).encode('utf-8')
        
        md5 = hashlib.md5()
        md5.update(hash_input)
        md5.update(hash_input)
        md5.update((hash_input.decode('utf-8') + field1).encode('utf-8'))
        hash_digest = md5.digest()
        
        checksum_md5 = hashlib.md5(hash_digest)
        checksum = checksum_md5.digest()[:4]
        combined = checksum + hash_digest
        
        key = ""
        for byte in combined:
            unsigned_byte = byte if byte >= 0 else byte + 256
            key += RegistrationKeyGenerator.CHARSET_ENHANCED[abs(unsigned_byte) % len(RegistrationKeyGenerator.CHARSET_ENHANCED)]
        
        return key
    
    @staticmethod
    def generate_key_8param(first_name, last_name, product_name, secret, email, field1, field2, field3):
        """Generate full registration key (8 parameters - Method 4)"""
        if not all([first_name, last_name, product_name, secret, email, field1, field2, field3]):
            return None
        
        first_name = first_name.lower()
        last_name = last_name.lower()
        email = email.lower()
        
        obfuscated = RegistrationKeyGenerator.obfuscate(first_name, last_name, product_name, email)
        if not obfuscated:
            return None
        
        base_string = obfuscated + field1 + field2 + field3
        hash_input = (base_string + secret).encode('utf-8')
        
        md5 = hashlib.md5()
        md5.update(hash_input)
        md5.update(hash_input)
        md5.update((hash_input.decode('utf-8') + field1).encode('utf-8'))
        hash_digest = md5.digest()
        
        checksum_md5 = hashlib.md5(hash_digest)
        checksum = checksum_md5.digest()[:4]
        combined = checksum + hash_digest
        
        key = ""
        for byte in combined:
            unsigned_byte = byte if byte >= 0 else byte + 256
            key += RegistrationKeyGenerator.CHARSET_ENHANCED[abs(unsigned_byte) % len(RegistrationKeyGenerator.CHARSET_ENHANCED)]
        
        return key


def generate_registration_email(first_name, last_name, email, registration_key, serial_number=None):
    """Generate a registration email in the format expected by MegaLogViewer"""
    email_format = "[Registration]\n"
    email_format += f"First Name: {first_name}\n"
    email_format += f"Last Name: {last_name}\n"
    email_format += f"Registered email: {email}\n"
    
    if serial_number:
        email_format += f"Serial Number: {serial_number}\n"
    
    email_format += f"Registration Key: {registration_key}\n"
    email_format += "[End Registration]"
    
    return email_format


# ============================================================================
# JAVA CONSTRUCTOR FIXING (from fix_constructors.py)
# ============================================================================

def get_class_name_from_file(filepath):
    """Extract the main class name from a Java file."""
    with open(filepath, 'r', encoding='utf-8', errors='ignore') as f:
        content = f.read()
    
    match = re.search(r'\bclass\s+([A-Za-z_][A-Za-z0-9_]*)', content)
    if match:
        return match.group(1)
    return None


def fix_constructor_in_file(filepath, class_name):
    """Fix constructor names in a file."""
    with open(filepath, 'r', encoding='utf-8', errors='ignore') as f:
        lines = f.readlines()
    
    modified = False
    
    for i, line in enumerate(lines):
        match = re.match(r'^(\s*)([A-Za-z_][A-Za-z0-9_]*)\s*\([^)]*\)\s*\{\s*\}?\s*$', line)
        if match:
            indent = match.group(1)
            name = match.group(2)
            
            if name in ['public', 'private', 'protected', 'static', 'final']:
                continue
                
            if (len(name) <= 2 or name != class_name) and name[0].isupper():
                if i > 0:
                    prev_line = lines[i-1].strip()
                    if not re.search(r'\b(void|int|boolean|String|long|double|float|byte|short|char|public|private|protected)\s*$', prev_line):
                        fixed_line = re.sub(r'^(\s*)' + re.escape(name), r'\1' + class_name, line)
                        lines[i] = fixed_line
                        modified = True
                        print(f"  Fixed: {filepath}:{i+1} - {name} -> {class_name}")
    
    if modified:
        with open(filepath, 'w', encoding='utf-8') as f:
            f.writelines(lines)
        return True
    return False


# ============================================================================
# STRUCTURE REORGANIZATION (from reorganize_structure.py)
# ============================================================================

def analyze_current_structure(base_dir):
    """Analyze the current app directory structure"""
    app_dir = os.path.join(base_dir, 'app')
    
    analysis = {
        'packages': defaultdict(list),
        'mismatches': [],
        'dependencies': defaultdict(set),
        'total_files': 0
    }
    
    print("Analyzing current structure...")
    
    for root, dirs, files in os.walk(app_dir):
        for file in files:
            if not file.endswith('.java'):
                continue
                
            filepath = os.path.join(root, file)
            rel_path = os.path.relpath(filepath, base_dir)
            analysis['total_files'] += 1
            
            try:
                with open(filepath, 'r', encoding='utf-8', errors='ignore') as f:
                    content = f.read()
                
                pkg_match = re.search(r'package\s+([\w.]+);', content)
                if pkg_match:
                    declared_pkg = pkg_match.group(1)
                    analysis['packages'][declared_pkg].append(rel_path)
                    
                    dir_path = os.path.dirname(rel_path).replace('app/', '')
                    if dir_path.startswith('obfuscated_packages/'):
                        expected_pkg = dir_path.replace('obfuscated_packages/', '').replace(os.sep, '.')
                    else:
                        expected_pkg = dir_path.replace(os.sep, '.')
                    
                    if declared_pkg != expected_pkg and expected_pkg != '.':
                        analysis['mismatches'].append({
                            'file': rel_path,
                            'declared': declared_pkg,
                            'location': expected_pkg
                        })
                
                imports = re.findall(r'import\s+([\w.]+);', content)
                if pkg_match:
                    for imp in imports:
                        imp_pkg = '.'.join(imp.split('.')[:-1])
                        if imp_pkg:
                            analysis['dependencies'][declared_pkg].add(imp_pkg)
            except Exception as e:
                pass
    
    return analysis


# ============================================================================
# FILE RENAMING (from rename_obfuscated_files.py)
# ============================================================================

def extract_class_info(filepath, content):
    """Extract comprehensive information about a Java class"""
    info = {
        'filepath': filepath,
        'class_name': None,
        'is_interface': False,
        'is_enum': False,
        'extends': None,
        'implements': [],
        'key_methods': [],
        'field_types': []
    }
    
    class_match = re.search(r'(?:public\s+)?(?:abstract\s+)?(?:final\s+)?(class|interface|enum)\s+(\w+)', content)
    if class_match:
        info['class_name'] = class_match.group(2)
        info['is_interface'] = class_match.group(1) == 'interface'
        info['is_enum'] = class_match.group(1) == 'enum'
    
    extends_match = re.search(r'extends\s+([\w.]+)', content)
    if extends_match:
        info['extends'] = extends_match.group(1).split('.')[-1]
    
    implements_matches = re.findall(r'implements\s+([\w.,\s]+)', content)
    for impl_str in implements_matches:
        interfaces = [i.strip() for i in impl_str.split(',')]
        info['implements'].extend(interfaces)
    
    methods = re.findall(r'(?:public|private|protected)\s+(?:static\s+)?(?:\w+\s+)?(\w+)\s*\(', content)
    info['key_methods'] = [m for m in methods if len(m) > 2 and m not in ['get', 'set', 'is']][:10]
    
    fields = re.findall(r'(?:private|protected|public)\s+(?:static\s+)?(?:final\s+)?(\w+)\s+(\w+)\s*[;=]', content)
    java_primitives = ['int', 'long', 'boolean', 'double', 'float', 'String', 'List', 'Map', 'Object']
    info['field_types'] = [f[0] for f in fields if len(f[0]) > 2 and f[0] not in java_primitives][:5]
    
    return info


# ============================================================================
# COMMAND HANDLERS
# ============================================================================

def cmd_generate_key(args):
    """Generate a registration key"""
    data = None
    
    if args.test_data:
        data = DummyDataGenerator.generate()
        print("Generated test data:")
        print(f"  First Name: {data['first_name']}")
        print(f"  Last Name:  {data['last_name']}")
        print(f"  Email:      {data['email']}")
        print(f"  Product:    {data['product']}")
        print(f"  Secret:     {data['secret']}")
        print(f"  Serial:     {data['serial']}")
        print()
    else:
        data = {
            'first_name': args.first_name,
            'last_name': args.last_name,
            'email': args.email,
            'product': args.product,
            'secret': args.secret,
            'serial': args.serial
        }
    
    # Generate key based on algorithm
    key = None
    if args.algorithm == '4param':
        key = RegistrationKeyGenerator.generate_key_basic(
            data['first_name'], data['last_name'], data['product'], data['email']
        )
    elif args.algorithm == '5param':
        key = RegistrationKeyGenerator.generate_key_5param(
            data['first_name'], data['last_name'], data['product'], 
            data['secret'], data['email']
        )
    elif args.algorithm == '7param':
        key = RegistrationKeyGenerator.generate_key_7param(
            data['first_name'], data['last_name'], data['product'], 
            data['secret'], data['email'], args.field1 or '01', args.field2 or '2015'
        )
    elif args.algorithm == '8param':
        key = RegistrationKeyGenerator.generate_key_8param(
            data['first_name'], data['last_name'], data['product'], 
            data['secret'], data['email'], args.field1 or '01', 
            args.field2 or '2015', data['serial']
        )
    
    if key:
        print(f"Registration Key ({args.algorithm}):")
        print(f"  {key}")
        print()
        
        if args.email_format:
            email = generate_registration_email(
                data['first_name'], data['last_name'], data['email'], 
                key, data.get('serial')
            )
            print("Email Format:")
            print(email)
    else:
        print("Error: Failed to generate key. Check your inputs.")


def cmd_generate_test_data(args):
    """Generate multiple test data sets"""
    print(f"Generating {args.count} test data sets:")
    print("=" * 80)
    
    for i in range(args.count):
        data = DummyDataGenerator.generate()
        key = RegistrationKeyGenerator.generate_key_5param(
            data['first_name'], data['last_name'], data['product'],
            data['secret'], data['email']
        )
        
        print(f"\nTest Set {i+1}:")
        print(f"  Name:    {data['first_name']} {data['last_name']}")
        print(f"  Email:   {data['email']}")
        print(f"  Product: {data['product']}")
        print(f"  Secret:  {data['secret']}")
        print(f"  Serial:  {data['serial']}")
        print(f"  Key:     {key}")
        
        if args.email_format:
            print()
            email = generate_registration_email(
                data['first_name'], data['last_name'], data['email'],
                key, data['serial']
            )
            print(email)
    
    print("\n" + "=" * 80)


def cmd_fix_constructors(args):
    """Fix misnamed constructors in Java files"""
    app_dir = Path(args.directory)
    
    if not app_dir.exists():
        print(f"Error: Directory not found: {app_dir}")
        return
    
    print(f"Scanning for Java files in: {app_dir}")
    fixed_files = 0
    
    for java_file in app_dir.rglob('*.java'):
        class_name = get_class_name_from_file(java_file)
        if class_name and fix_constructor_in_file(java_file, class_name):
            fixed_files += 1
    
    print(f"\n✅ Fixed {fixed_files} files")


def cmd_analyze_structure(args):
    """Analyze the project structure"""
    base_dir = args.base_dir
    analysis = analyze_current_structure(base_dir)
    
    print(f"\n{'='*70}")
    print("STRUCTURE ANALYSIS")
    print(f"{'='*70}")
    print(f"Total Java files:    {analysis['total_files']}")
    print(f"Unique packages:     {len(analysis['packages'])}")
    print(f"Package mismatches:  {len(analysis['mismatches'])}")
    
    obfuscated_pkgs = [p for p in analysis['packages'].keys() if len(p) <= 2 and p.isalpha()]
    proper_pkgs = [p for p in analysis['packages'].keys() if p.startswith('com.') or p.startswith('org.')]
    
    print(f"\nPackage breakdown:")
    print(f"  Obfuscated (1-2 letters): {len(obfuscated_pkgs)}")
    print(f"  Proper (com.*, org.*):    {len(proper_pkgs)}")
    
    if args.output:
        output = {
            'total_files': analysis['total_files'],
            'packages': {k: len(v) for k, v in analysis['packages'].items()},
            'mismatches': len(analysis['mismatches']),
            'sample_mismatches': analysis['mismatches'][:20]
        }
        
        with open(args.output, 'w') as f:
            json.dump(output, f, indent=2)
        print(f"\nAnalysis saved to: {args.output}")


def cmd_launch_gui(args):
    """Launch the registration GUI"""
    try:
        # Import from legacy folder
        import sys
        from pathlib import Path
        legacy_path = Path(__file__).parent / 'legacy'
        sys.path.insert(0, str(legacy_path))
        from registration_gui import main as gui_main
        gui_main()
    except ImportError as e:
        if 'PyQt6' in str(e):
            print("Error: PyQt6 not installed. Install with: pip install PyQt6")
        else:
            print(f"Error: Could not import registration_gui: {e}")
    except Exception as e:
        print(f"Error launching GUI: {e}")


# ============================================================================
# MAIN
# ============================================================================

def main():
    parser = argparse.ArgumentParser(
        description='TuStu Tools - Unified command-line utility for TunerStudio project',
        formatter_class=argparse.RawDescriptionHelpFormatter,
        epilog="""
Examples:
  # Generate test data with valid keys
  %(prog)s test-data -n 5
  
  # Generate a registration key with test data
  %(prog)s gen-key --test-data --algorithm 5param
  
  # Generate key with specific parameters
  %(prog)s gen-key -f John -l Doe -e john@example.com -p MegaLogViewer -s secret123
  
  # Fix Java constructors
  %(prog)s fix-constructors -d ./app
  
  # Analyze project structure
  %(prog)s analyze -o structure_report.json
  
  # Launch GUI
  %(prog)s gui
        """
    )
    
    subparsers = parser.add_subparsers(dest='command', help='Available commands')
    
    # Generate key command
    gen_key_parser = subparsers.add_parser('gen-key', help='Generate registration key')
    gen_key_parser.add_argument('-f', '--first-name', help='First name')
    gen_key_parser.add_argument('-l', '--last-name', help='Last name')
    gen_key_parser.add_argument('-e', '--email', help='Email address')
    gen_key_parser.add_argument('-p', '--product', help='Product name')
    gen_key_parser.add_argument('-s', '--secret', help='Secret key')
    gen_key_parser.add_argument('--serial', help='Serial number')
    gen_key_parser.add_argument('-a', '--algorithm', 
                                choices=['4param', '5param', '7param', '8param'],
                                default='5param', help='Key generation algorithm')
    gen_key_parser.add_argument('--field1', help='Additional field 1 (for 7/8 param)')
    gen_key_parser.add_argument('--field2', help='Additional field 2 (for 7/8 param)')
    gen_key_parser.add_argument('-t', '--test-data', action='store_true',
                                help='Generate random test data')
    gen_key_parser.add_argument('--email-format', action='store_true',
                                help='Output in email format')
    
    # Test data command
    test_data_parser = subparsers.add_parser('test-data', help='Generate test data sets')
    test_data_parser.add_argument('-n', '--count', type=int, default=5,
                                  help='Number of test data sets to generate')
    test_data_parser.add_argument('--email-format', action='store_true',
                                  help='Output in email format')
    
    # Fix constructors command
    fix_parser = subparsers.add_parser('fix-constructors', 
                                       help='Fix misnamed Java constructors')
    fix_parser.add_argument('-d', '--directory', default='./app',
                           help='Directory to scan for Java files')
    
    # Analyze structure command
    analyze_parser = subparsers.add_parser('analyze', 
                                          help='Analyze project structure')
    analyze_parser.add_argument('-b', '--base-dir', default='.',
                               help='Base directory of the project')
    analyze_parser.add_argument('-o', '--output', 
                               help='Output file for analysis results (JSON)')
    
    # GUI command
    gui_parser = subparsers.add_parser('gui', help='Launch registration GUI')
    
    args = parser.parse_args()
    
    if not args.command:
        parser.print_help()
        return
    
    # Execute command
    if args.command == 'gen-key':
        cmd_generate_key(args)
    elif args.command == 'test-data':
        cmd_generate_test_data(args)
    elif args.command == 'fix-constructors':
        cmd_fix_constructors(args)
    elif args.command == 'analyze':
        cmd_analyze_structure(args)
    elif args.command == 'gui':
        cmd_launch_gui(args)


if __name__ == '__main__':
    main()
