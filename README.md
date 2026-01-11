# Registration Key Algorithm

This document describes the registration key generation algorithm found in `app/bH/f.java` (previously `app/src/main/java/bH/C0997e.java`).

## Overview

The algorithm generates registration keys for product licensing using a multi-step process that combines user information, applies various transformations, and generates a cryptographic hash.

## Algorithm Steps

### Method 1: Basic Obfuscation
`a(String str, String str2, String str3, String str4)`

Parameters:
- `str` - First name
- `str2` - Last name  
- `str3` - Product name
- `str4` - Email address

**Process:**

1. **Input Validation** - Check all parameters are non-null and non-empty

2. **Concatenation** - Create byte array by concatenating:
   ```
   lastName + productName + firstName + lastName + email
   ```

3. **Byte Reversal** - Reverse the entire byte array
   ```java
   for (int i = 0; i < bArr.length / 2; i++) {
       byte temp = bArr[i];
       bArr[i] = bArr[(bArr.length - 1) - i];
       bArr[(bArr.length - 1) - i] = temp;
   }
   ```

4. **Character Transformation** - Apply mathematical formula to each byte:
   ```java
   for (int i = 0; i < bArr.length; i++) {
       byte b = bArr[i];
       int transformed = (b + ((b - 32) % 7)) - (i % 4);
       if (transformed > 122) {
           transformed -= 9;
       }
       bArr[i] = (byte) transformed;
   }
   ```

5. **Special Character Handling** - Modify specific ASCII codes:
   ```java
   for (int i = 0; i < bArr.length; i++) {
       if (bArr[i] == 96 || bArr[i] == 92 || bArr[i] == 91 || 
           bArr[i] == 93 || bArr[i] == 59 || bArr[i] == 46) {
           bArr[i] = (byte) (bArr[i] + 6 + (i % 10));
       }
   }
   ```
   Special characters affected: `` ` `` (96), `\` (92), `[` (91), `]` (93), `;` (59), `.` (46)

6. **Return** - Convert byte array to string

### Method 2: Registration Key Generation (5 Parameters)
`a(String str, String str2, String str3, String str4, String str5)`

Parameters:
- `str` - First name
- `str2` - Last name
- `str3` - Product name
- `str4` - Secret/seed value
- `str5` - Email address

**Process:**

1. **Get Obfuscated String** - Call Method 1 to get obfuscated base string

2. **MD5 Hashing** - Create MD5 hash:
   ```java
   MessageDigest md5 = MessageDigest.getInstance("MD5");
   byte[] input = (obfuscatedString + secret).getBytes();
   md5.update(input);
   md5.update(input);  // Update twice
   md5.digest();       // Digest once (discarded)
   md5.update(input);  // Update again
   byte[] hash = md5.digest();  // Final digest
   ```

3. **Checksum Generation** - Create 4-byte checksum using custom algorithm

4. **Combine Checksum and Hash**:
   ```
   result = checksum (4 bytes) + hash (16 bytes) = 20 bytes total
   ```

5. **Base-32 Encoding** - Convert to custom base-32 string:
   ```
   Charset: "123456789ABCDEFGHIJKLMNPQRSTUVWXYZ" (33 characters, no 'O')
   ```
   Each byte is mapped to a character: `char = charset[abs(byte) % 33]`

### Method 3: Enhanced Registration Key (7 Parameters)
`a(String str, String str2, String str3, String str4, String str5, String str6, String str7)`

Additional parameters:
- `str6` - Additional field 1
- `str7` - Additional field 2

**Changes from Method 2:**

1. **Lowercase Conversion** - firstName, lastName, and email are converted to lowercase

2. **Extended Base String**:
   ```
   obfuscated(firstName.toLowerCase(), lastName.toLowerCase(), product, email.toLowerCase()) + field1 + field2
   ```

3. **Modified MD5 Process**:
   ```java
   md5.update(input);
   md5.update(input);
   md5.update((input + field1).getBytes());  // Additional update with field1
   byte[] hash = md5.digest();
   ```

4. **Different Character Set**:
   ```
   Charset: "23456789ABCDEFGHJKLMNPQRSTUVWXYZ" (31 characters, no '1', 'I', 'O')
   char = charset[abs(byte) % 31]
   ```

### Method 4: Full Registration Key (8 Parameters)
`a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8)`

Additional parameter:
- `str8` - Additional field 3

**Changes:**

- Base string includes all three additional fields: `field1 + field2 + field3`
- Same character set as Method 3

## Usage Context

The registration dialog calls these methods (found in `app/src/main/java/ao/dQ.java`):

```java
String calculatedKey = C0997e.a(firstName, lastName, "MegaLogViewer", email);

if (calculatedKey != null && calculatedKey.equals(userEnteredKey) && !alreadyRegistered(userEnteredKey)) {
    // Registration successful
}
```

## Key Properties

- **Character Sets**: Custom base-32 encoding (excludes ambiguous characters like 'O', '1', 'I')
- **Output Length**: 20 characters (from 20 bytes)
- **Hash Algorithm**: MD5
- **Deterministic**: Same inputs always produce same key
- **Case Handling**: Methods 3 & 4 normalize to lowercase for consistency

## Security Notes

- Uses MD5 hashing (considered weak by modern standards)
- Obfuscation through byte manipulation
- No salt/random component (deterministic output)
- Multiple hash iterations for additional complexity
- Custom encoding prevents simple reverse engineering

## GUI Application

The PyQt6 GUI (`registration_gui.py`) provides an intuitive interface for:

### Key Generation
- **Basic Tab**: 4-parameter algorithm (first name, last name, product, email)
- **5-Parameter Tab**: Standard algorithm with secret key
- **7-Parameter Tab**: Enhanced algorithm with date fields (month, year)
- **8-Parameter Tab**: Full algorithm with serial number support

### Email Parser Tab
The Email Parser tab provides bi-directional functionality:

#### Parse Mode
- Paste a registration email in `[Registration]...[End Registration]` format
- Click "Parse Email" to extract:
  - First Name
  - Last Name
  - Email Address
  - Serial Number (if present)
  - Registration Key

#### Generate Mode
- Manually enter or edit registration information in the fields
- Click "Generate Email Format" to create formatted registration text
- The generated email is automatically:
  - Displayed in the text area
  - Copied to clipboard
- Format matches MegaLogViewer's expected structure:
  ```
  [Registration]
  First Name: John
  Last Name: Doe
  Registered email: john.doe@example.com
  Serial Number: ABC123
  Registration Key: XYZ789...
  [End Registration]
  ```

#### Test Data Generator
- Click **"Load Test Data"** button on any tab (blue/purple button)
- Automatically populates fields with realistic dummy data
- Generates **valid registration keys** that pass validation
- Includes first/last names, emails, products, secrets, and serials
- EmailParser tab: generates complete set including valid key
- Saves time during testing and development

**Available Test Data**:
- 32 first names (James, Mary, Robert, Jennifer, etc.)
- 32 last names (Smith, Johnson, Williams, etc.)
- 10 email domains (gmail.com, company.com, etc.)
- 3 products: MegaLogViewer, TunerStudio, DataLogger
- 4 secrets: secret123, testkey, demo2024, abc123xyz
- 6 serial numbers: SN001, ABC123, XYZ789, etc.

**Validation Guarantee**: Keys generated with test data are mathematically valid and will pass validation using the correct product/secret combination.

```

### Requirements
- Python 3.6+
- PyQt6 6.6.0+

Install dependencies:
```bash
pip install PyQt6
```
