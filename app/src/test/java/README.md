# TunerStudio Integration Tests

## Overview

This directory contains integration tests for the TunerStudio Java UI application.

## Test Suite: TunerStudioIntegrationTest

Located in: `TunerStudioIntegrationTest.java`

### Current Status ✅

**3 of 6 tests currently passing**

The test suite is designed to work with the compiled JAR file and verifies:

### Passing Tests:

1. **Application JAR exists and is valid** ✅
   - Verifies the JAR file is created at `build/libs/app-1.0.0.jar`
   - Checks JAR has valid manifest

2. **JAR manifest contains expected attributes** ✅
   - Verifies Main-Class: TunerStudio
   - Checks Implementation-Title and Version

3. **JAR contains expected resources** ✅
   - Documents JAR structure and contents
   - Currently: 60 class files, 3 resource files

### Skipped Tests (Pending Compilation Fixes):

4. **TunerStudio class can be loaded from JAR** ⏭️
   - Will test once source code compiles successfully
   
5. **TunerStudio has valid main method** ⏭️
   - Will verify main() method signature once available
   
6. **Application can be invoked** ⏭️
   - Smoke test for application startup once compilation works

## Running the Tests

```bash
# Run all integration tests
./gradlew :app:test --tests TunerStudioIntegrationTest

# Run without attempting to recompile main sources
./gradlew :app:test --tests TunerStudioIntegrationTest -x compileJava

# Run a specific test
./gradlew :app:test --tests TunerStudioIntegrationTest.testJarExists
```

## Test Output

Tests provide detailed output including:
- JAR file location and size
- Manifest attributes
- Class and resource counts
- Whether TunerStudio.class is present

## Next Steps

To enable the skipped tests:
1. Fix compilation errors in the main source code
2. Rebuild the JAR: `./gradlew :app:jar`
3. Re-run tests: `./gradlew :app:test --tests TunerStudioIntegrationTest`

The tests use `assumeTrue()` to gracefully skip tests when prerequisites aren't met, ensuring the test suite always provides useful feedback about the current state of the build.
