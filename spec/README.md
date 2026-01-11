# TLA+ Specification for Registration Key Algorithm

This directory contains the formal TLA+ specification for the registration key generation algorithm.

## Files

- **RegistrationKey.tla** - Main TLA+ specification module
- **RegistrationKey.cfg** - TLC model checker configuration
- **README.md** - This file

## Overview

The specification models the registration key generation as a state machine with the following phases:

1. **Init** - Initial state with input parameters
2. **Concatenate** - Combine input strings in specific order
3. **Reverse** - Reverse the byte array
4. **Transform** - Apply mathematical transformation to each byte
5. **SpecialCharHandle** - Handle special characters
6. **HashInput** - Prepare input for MD5 hashing
7. **MD5Round1-3** - Multiple rounds of MD5 updates
8. **MD5Final** - Final MD5 digest
9. **Checksum** - Generate CRC checksum
10. **Combine** - Combine checksum and hash
11. **Encode** - Base-32 encode the result
12. **Complete** - Final state with generated key

## State Variables

### Input Variables
- `firstName` - User's first name
- `lastName` - User's last name
- `productName` - Product name
- `email` - User's email address
- `secret` - Secret seed value (optional)
- `additionalField1-3` - Additional fields (optional)

### Algorithm State
- `phase` - Current phase of execution
- `byteArray` - Working byte array
- `position` - Current position in array processing
- `hashDigest` - MD5 hash result (16 bytes)
- `checksum` - CRC checksum (4 bytes)
- `registrationKey` - Final 20-character key

## Invariants

### Type Invariant
Ensures all variables maintain their correct types throughout execution.

### Phase Order
Enforces correct sequencing of algorithm phases:
- Complete phase must have 20-character key
- MD5 phases only occur when secret is provided

### Deterministic
Same inputs always produce the same registration key.

### No Empty Key
Complete phase must produce a non-empty key.

## Properties

### Correctness
The specification always maintains type invariants.

### Termination
The algorithm eventually reaches the Complete phase.

### Uniqueness
Different inputs produce different keys (with high probability due to cryptographic hash).

## Running the Model Checker

To check the specification with TLC:

```bash
tlc RegistrationKey.tla -config RegistrationKey.cfg
```

### State Space Constraints

To make model checking feasible, the configuration limits:
- firstName: ≤ 10 characters
- lastName: ≤ 10 characters  
- productName: ≤ 15 characters
- email: ≤ 20 characters

## Key Insights from Formal Specification

1. **Deterministic**: The algorithm is completely deterministic - same inputs always produce the same output.

2. **Phase-Based**: The algorithm progresses through well-defined phases in a specific order.

3. **Byte-Level Operations**: Most operations work at the byte level with mathematical transformations.

4. **Multiple Hash Rounds**: MD5 is applied multiple times (update-update-digest-update-digest) for additional complexity.

5. **Character Set Variations**: Two different base-32 character sets are used depending on whether additional fields are present.

6. **Fixed Output Length**: Always produces exactly 20 characters regardless of input length.

## Abstract vs Concrete

This TLA+ specification is more abstract than the Java implementation:

- **MD5 Hash**: Modeled abstractly as a non-deterministic choice from valid 16-byte sequences. In practice, it's the actual MD5 algorithm.

- **Checksum**: Modeled abstractly as a 4-byte sequence. In practice, it's a CRC calculation on the hash.

- **Byte Values**: Constrained to valid ranges but not modeling exact arithmetic overflow behavior.

This abstraction level is appropriate for verifying the algorithm's structure, phase ordering, and key properties without getting lost in cryptographic implementation details.

## Verification Goals

The TLA+ specification can verify:

- ✓ Algorithm always terminates
- ✓ All phases execute in correct order
- ✓ Output is always correct length (20 chars)
- ✓ Type safety throughout execution
- ✓ Deterministic behavior
- ✗ Cryptographic security (out of scope for TLA+)
- ✗ Key collision probability (requires statistical analysis)

## Extensions

Possible extensions to this specification:

1. **Multi-Algorithm Support**: Model all 4 variants (4, 5, 7, 8 parameters)
2. **Validation**: Add registration key validation logic
3. **Concurrent Usage**: Model multiple users generating keys simultaneously
4. **Key Database**: Model storage and lookup of generated keys
5. **Expiration**: Add time-based key expiration logic

## References

- [TLA+ Home](https://lamport.azurewebsites.net/tla/tla.html)
- [Learn TLA+](https://learntla.com/)
- [TLA+ Hyperbook](https://learntla.com/tla/)
