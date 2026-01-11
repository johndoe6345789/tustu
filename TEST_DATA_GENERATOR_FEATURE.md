# Test Data Generator Feature

## Summary

Added automatic test data generation with "Load Test Data" buttons on all tabs. The system generates realistic dummy credentials and **valid registration keys** that pass validation.

## Changes Made

### 1. DummyDataGenerator Class

**Location**: `registration_gui.py`, lines ~18-84

**Purpose**: Generate realistic test data for quick testing

**Data Sets**:
- **First Names**: 32 common names (James, Mary, Robert, Jennifer, etc.)
- **Last Names**: 32 common surnames (Smith, Johnson, Williams, etc.)
- **Email Domains**: 10 realistic domains (gmail.com, company.com, etc.)
- **Products**: MegaLogViewer, TunerStudio, DataLogger
- **Secrets**: secret123, testkey, demo2024, abc123xyz
- **Serials**: SN001, ABC123, XYZ789, DEV001, TEST99

**Generation Logic**:
```python
data = DummyDataGenerator.generate()
# Returns: {
#   'first_name': 'John',
#   'last_name': 'Smith',
#   'email': 'john.smith@gmail.com',
#   'product': 'MegaLogViewer',
#   'secret': 'secret123',
#   'serial': 'SN001'
# }
```

### 2. Load Test Data Buttons

#### KeyGeneratorTab (All Generation Tabs)
- **Button**: Blue "Load Test Data" button
- **Position**: Left of "Generate Registration Key" button
- **Behavior**:
  1. Generates random dummy data
  2. Populates all input fields
  3. Maps data correctly (including month='01', year='2015')
  4. Shows popup with generated data details
  5. Prompts user to click "Generate Registration Key"

#### EmailParserTab
- **Button**: Purple "Load Test Data" button
- **Position**: Left of "Parse Email" button
- **Behavior**:
  1. Generates random dummy data
  2. **Automatically generates a VALID key** using 5-param algorithm
  3. Populates all output fields (name, email, serial, key)
  4. Shows popup with data AND validation instructions
  5. Includes product/secret in message for validation testing

### 3. Validation Guarantees

**Critical Feature**: Generated keys are mathematically valid!

The EmailParserTab's `load_test_data()` method:
```python
# Generate VALID key using actual algorithm
valid_key = RegistrationKeyGenerator.generate_key_5param(
    data['first_name'],
    data['last_name'],
    data['product'],
    data['secret'],
    data['email']
)
```

This ensures:
- ✓ Keys pass exact string comparison (Java-style validation)
- ✓ Keys work with MD5 hash verification
- ✓ Keys use correct character set encoding
- ✓ Round-trip testing works (generate → parse → validate)

### 4. Java Validation Analysis

**Java Code Reviewed**:
- `bH/C0997e.java`: Key generation algorithms (4 variants)
- `com/efiAnalytics/ui/dS.java`: Registration dialog validation

**Validation Requirements Found**:
1. **Exact Match**: Keys compared with `equals()` (line 297)
2. **No Tolerance**: No fuzzy matching, must be exact
3. **Case Sensitive**: Uses exact case from MD5 hash
4. **Character Set**: Must use correct base-32 character sets
   - Basic (4-param): `"123456789ABCDEFGHIJKLMNPQRSTUVWXYZ"`
   - Enhanced (5/7/8-param): `"23456789ABCDEFGHJKLMNPQRSTUVWXYZ"` (no 1, I, O)

**Python Implementation Compliance**:
- ✓ Uses identical character sets
- ✓ Implements same MD5 hashing (multiple rounds)
- ✓ Matches byte manipulation logic
- ✓ Produces identical output for same inputs

### 5. Testing

Created `test_dummy_data.py` with three test suites:

#### Test 1: Data Generation
- Generates 5 random test sets
- Creates valid keys for each
- Displays all fields including keys

#### Test 2: Validation
- Tests all 4 algorithms
- Verifies keys are deterministic (same input → same output)
- Confirms consistency

#### Test 3: Email Format
- Generates complete registration email
- Shows proper format with markers
- Demonstrates round-trip capability

**All tests passing ✓**

## Usage Examples

### Scenario 1: Quick Test on Any Tab

1. Open GUI: `python3 registration_gui.py`
2. Go to any tab (e.g., "5-Parameter Standard")
3. Click blue **"Load Test Data"** button
4. See popup: "Test Data Loaded" with details
5. Click **"Generate Registration Key"**
6. Click **"Validate Key"** to verify it works
7. Result: ✓ Valid registration confirmed

### Scenario 2: Email Parser with Pre-Generated Key

1. Open GUI → **Email Parser** tab
2. Click purple **"Load Test Data"** button
3. See popup with product and secret (e.g., "Product: MegaLogViewer, Secret: secret123")
4. All fields now populated with valid data + key
5. Click **"Generate Email Format"** → formatted email created
6. Click **"Validate Key"**
7. Enter product="MegaLogViewer", secret="secret123" (from popup)
8. Result: ✓ Valid registration confirmed

### Scenario 3: Round-Trip Testing

1. **Generate Tab**: Load test data → Generate key → Copy
2. **Email Tab**: Load test data → Paste key → Generate email format
3. **Validation**: Parse email → Validate with correct product/secret
4. Result: Full workflow validated

## Technical Details

### Random Selection
```python
random.choice(DummyDataGenerator.FIRST_NAMES)  # Picks one randomly
random.choice(DummyDataGenerator.PRODUCTS)     # Ensures variety
```

### Email Construction
```python
email = f"{first_name.lower()}.{last_name.lower()}@{domain}"
# Example: "john.smith@gmail.com"
```

### Key Generation
```python
# EmailParserTab generates valid keys automatically
key = RegistrationKeyGenerator.generate_key_5param(
    first_name, last_name, product, secret, email
)
# This key WILL pass validation with matching inputs
```

### Field Mapping
```python
field_mapping = {
    'first_name': data['first_name'],
    'last_name': data['last_name'],
    'email': data['email'],
    'product_name': data['product'],
    'secret': data['secret'],
    'serial': data['serial'],
    'month': '01',      # Fixed for 7/8-param algorithms
    'year': '2015'      # Fixed for 7/8-param algorithms
}
```

## Benefits

1. **Speed**: No manual data entry for testing
2. **Accuracy**: Generated keys are guaranteed valid
3. **Variety**: Random selection provides different test cases
4. **Realism**: Names, emails look authentic
5. **Consistency**: Fixed secrets/serials for reproducibility
6. **Education**: Popup messages explain next steps
7. **Validation**: Can immediately test validation workflow

## Files Modified

- `registration_gui.py`:
  - Added `DummyDataGenerator` class (lines ~18-84)
  - Added `load_test_data()` method to `KeyGeneratorTab` (lines ~379-413)
  - Added "Load Test Data" button to `KeyGeneratorTab` (lines ~277-294)
  - Added `load_test_data()` method to `EmailParserTab` (lines ~872-907)
  - Added "Load Test Data" button to `EmailParserTab` (lines ~596-612)
  - Added `import random` (line 9)

- Created `test_dummy_data.py`: Comprehensive test suite demonstrating functionality

## Security Note

**Test Data Only**: This is for testing/development. The fixed secrets (secret123, testkey, etc.) should never be used in production. Real implementations should use:
- Secure random secret generation
- Per-customer unique secrets
- Proper key management systems

## Java Compatibility Verification

Checked against Java source code:

**✓ Character Sets Match**:
```java
// Java (C0997e.java line 64)
"123456789ABCDEFGHIJKLMNPQRSTUVWXYZ"  // Basic
"23456789ABCDEFGHJKLMNPQRSTUVWXYZ"   // Enhanced

// Python (registration_gui.py lines 87-88)
CHARSET_BASIC = "123456789ABCDEFGHIJKLMNPQRSTUVWXYZ"
CHARSET_ENHANCED = "23456789ABCDEFGHJKLMNPQRSTUVWXYZ"
```

**✓ MD5 Hashing Matches**:
```java
// Java: messageDigest.update(bytes2); messageDigest.update(bytes2);
// Python: Uses identical double-update pattern
```

**✓ Validation Logic Matches**:
```java
// Java (dS.java line 297)
if (str2 != null && !str2.isEmpty() && str2.equals(strTrim4)) {
    // Valid registration
}

// Python: Uses string comparison: expected_key == reg_key
```

**Result**: Generated keys will be accepted by actual Java application.
