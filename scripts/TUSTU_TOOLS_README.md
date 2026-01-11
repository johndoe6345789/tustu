# TuStu Tools - Unified Command-Line Utility

A comprehensive command-line tool that consolidates all scripts from the `scripts/` folder into a single, easy-to-use utility with argparse-based interface.

> **TL;DR:** Run `./tustu-tools --help` from project root for all commands.

## Table of Contents

- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Available Commands](#available-commands)
- [Command Reference](#command-reference)
- [Examples](#examples)
- [Migration Guide](#migration-from-individual-scripts)

---

## Features

This tool combines functionality from:

| Original Script | New Command | Description |
|-----------------|-------------|-------------|
| `registration_gui.py` | `gui` | PyQt6 GUI for key generation |
| `demo_test_data_ui.py` + `test_dummy_data.py` | `test-data` | Generate test data with valid keys |
| `test_email_generation.py` | `gen-key --email-format` | Create registration emails |
| `fix_constructors.py` + `fix_constructors_v2.py` | `fix-constructors` | Fix Java constructor names |
| `reorganize_structure.py` | `analyze` | Analyze project structure |
| `rename_obfuscated_files.py` | Core utilities | File renaming functions |

## Installation

No installation needed! The tool uses Python 3 standard library.

**Optional:** For GUI support, install PyQt6:

```bash
pip install PyQt6
```

## Usage

### General Syntax
```bash
./tustu_tools.py <command> [options]
```

## Available Commands

| Command | Description |
|---------|-------------|
| `gen-key` | Generate registration keys (4/5/7/8 parameter algorithms) |
| `test-data` | Generate test data sets with valid keys |
| `fix-constructors` | Fix misnamed Java constructors |
| `analyze` | Analyze project structure and packages |
| `gui` | Launch PyQt6 registration GUI (requires PyQt6) |

**Get help for any command:**

```bash
./tustu-tools <command> --help
```

#### 1. Generate Registration Keys

Generate a registration key with test data:
```bash
./tustu_tools.py gen-key --test-data --algorithm 5param
```

Generate a key with specific parameters:
```bash
./tustu_tools.py gen-key \
  --first-name John \
  --last-name Doe \
  --email john@example.com \
  --product MegaLogViewer \
  --secret secret123
```

Generate with email format:
```bash
./tustu_tools.py gen-key --test-data --email-format
```

Algorithms available:
- `4param` - Basic obfuscation (4 parameters)
- `5param` - Standard (5 parameters) - **default**
- `7param` - Enhanced (7 parameters)
- `8param` - Full (8 parameters)

#### 2. Generate Test Data

Generate 5 test data sets with valid keys:
```bash
./tustu_tools.py test-data -n 5
```

Generate with email format:
```bash
./tustu_tools.py test-data -n 3 --email-format
```

#### 3. Fix Java Constructors

Fix misnamed constructors in the app directory:
```bash
./tustu_tools.py fix-constructors -d ./app
```

Scan a specific directory:
```bash
./tustu_tools.py fix-constructors -d /path/to/java/files
```

#### 4. Analyze Project Structure

Analyze the current project structure:
```bash
./tustu_tools.py analyze
```

Save analysis to a JSON file:
```bash
./tustu_tools.py analyze -o structure_report.json
```

Analyze a different project:
```bash
./tustu_tools.py analyze -b /path/to/project -o report.json
```

#### 5. Launch GUI

Launch the PyQt6 registration GUI (requires PyQt6):
```bash
./tustu_tools.py gui
```

## Command Reference

### `gen-key` - Generate Registration Key

| Option | Description |
|--------|-------------|
| `-f, --first-name` | First name |
| `-l, --last-name` | Last name |
| `-e, --email` | Email address |
| `-p, --product` | Product name |
| `-s, --secret` | Secret key |
| `--serial` | Serial number |
| `-a, --algorithm` | Algorithm: 4param, 5param, 7param, 8param (default: 5param) |
| `--field1` | Additional field 1 (for 7/8 param algorithms) |
| `--field2` | Additional field 2 (for 7/8 param algorithms) |
| `-t, --test-data` | Generate random test data |
| `--email-format` | Output in email format |

### `test-data` - Generate Test Data

| Option | Description |
|--------|-------------|
| `-n, --count` | Number of test data sets (default: 5) |
| `--email-format` | Output in email format |

### `fix-constructors` - Fix Java Constructors

| Option | Description |
|--------|-------------|
| `-d, --directory` | Directory to scan (default: ./app) |

### `analyze` - Analyze Project Structure

| Option | Description |
|--------|-------------|
| `-b, --base-dir` | Base directory (default: .) |
| `-o, --output` | Output JSON file |

### `gui` - Launch GUI

No options. Launches the PyQt6 registration GUI.

## Examples

### Example 1: Quick Test Key Generation
```bash
./tustu_tools.py gen-key --test-data
```

Output:
```
Generated test data:
  First Name: James
  Last Name:  Smith
  Email:      james.smith@gmail.com
  Product:    MegaLogViewer
  Secret:     secret123
  Serial:     SN001

Registration Key (5param):
  ABCD1234EFGH5678WXYZ
```

### Example 2: Generate Email-Ready Keys
```bash
./tustu_tools.py gen-key --test-data --email-format
```

Output:
```
Generated test data:
  First Name: Mary
  Last Name:  Johnson
  Email:      mary.johnson@yahoo.com
  Product:    TunerStudio
  Secret:     testkey
  Serial:     ABC123

Registration Key (5param):
  XYZ9876MNOP5432QRST

Email Format:
[Registration]
First Name: Mary
Last Name: Johnson
Registered email: mary.johnson@yahoo.com
Serial Number: ABC123
Registration Key: XYZ9876MNOP5432QRST
[End Registration]
```

### Example 3: Batch Test Data Generation
```bash
./tustu_tools.py test-data -n 10 --email-format > test_keys.txt
```

### Example 4: Project Analysis
```bash
./tustu_tools.py analyze -o structure.json
```

Output:
```
======================================================================
STRUCTURE ANALYSIS
======================================================================
Total Java files:    1247
Unique packages:     89
Package mismatches:  342

Package breakdown:
  Obfuscated (1-2 letters): 26
  Proper (com.*, org.*):    63

Analysis saved to: structure.json
```

### Example 5: Fix All Constructors
```bash
./tustu_tools.py fix-constructors -d ./app
```

Output:
```
Scanning for Java files in: ./app
  Fixed: ./app/A/File1.java:42 - A -> ClassNameA
  Fixed: ./app/B/File2.java:15 - B -> ClassNameB

✅ Fixed 23 files
```

## Migration from Individual Scripts

The unified tool replaces multiple individual scripts with a single command interface:

| Old Command | New Command |
|-------------|-------------|
| `python3 registration_gui.py` | `./tustu-tools gui` |
| `python3 test_dummy_data.py` | `./tustu-tools test-data` |
| `python3 test_email_generation.py` | `./tustu-tools gen-key --email-format` |
| `python3 fix_constructors.py` | `./tustu-tools fix-constructors` |
| `python3 reorganize_structure.py` | `./tustu-tools analyze` |

**Legacy scripts** are preserved in `legacy/` folder for reference.

## Benefits

| Benefit | Description |
|---------|-------------|
| **Unified Interface** | Single tool instead of multiple scripts |
| **Consistent CLI** | All commands use argparse with `--help` |
| **Better Discoverability** | Easy to find features via help text |
| **Less Clutter** | One script instead of 8+ files |
| **Easy to Extend** | Add new commands as needed |

## Legacy Scripts

Original scripts are preserved in the `legacy/` folder:

- **`registration_gui.py`** - Full PyQt6 GUI (still usable directly)
- **Other scripts** - Kept for reference or standalone use

To use legacy scripts:

```bash
python3 legacy/registration_gui.py  # Direct GUI launch
python3 legacy/test_dummy_data.py   # Legacy test data script
```

## Help & Support

Get detailed help for any command:

```bash
./tustu-tools --help                    # List all commands
./tustu-tools gen-key --help            # Key generation options
./tustu-tools test-data --help          # Test data options
./tustu-tools fix-constructors --help   # Constructor fix options
./tustu-tools analyze --help            # Analysis options
```

## Contributing

To add a new command to the tool:

1. Add a new subparser in the `main()` function
2. Create a `cmd_<name>(args)` handler function
3. Add dispatch logic to connect command to handler

See `tustu_tools.py` source for examples.
