# Scripts Folder - Consolidated Tool

All individual scripts have been consolidated into **`tustu_tools.py`** - a unified command-line tool with argparse interface.

## Organization

| Component | Description |
|-----------|-------------|
| **Main tool** | `tustu_tools.py` - Unified CLI with all features |
| **Documentation** | Multiple README files with complete usage information |
| **legacy/** | Original individual scripts (preserved for reference) |
| **data/** | JSON analysis and mapping files |

## Unified Tool

**Main Script:** `tustu_tools.py`

This consolidated tool provides all functionality from the following scripts:

### Merged Scripts

| Original Script | Functionality | New Command |
|----------------|---------------|-------------|
| `registration_gui.py` | PyQt6 GUI for key generation | `tustu_tools.py gui` |
| `demo_test_data_ui.py` | Demo of test data loading | Integrated into all commands |
| `test_dummy_data.py` | Test data generation | `tustu_tools.py test-data` |
| `test_email_generation.py` | Email format generation | `tustu_tools.py gen-key --email-format` |
| `fix_constructors.py` | Fix Java constructor names | `tustu_tools.py fix-constructors` |
| `fix_constructors_v2.py` | Alternative constructor fixer | Merged into fix-constructors |
| `reorganize_structure.py` | Project structure analysis | `tustu_tools.py analyze` |
| `rename_obfuscated_files.py` | Rename obfuscated Java files | Core utilities available |

### Folder Structure

```
scripts/
├── tustu_tools.py              # Main unified tool
├── TUSTU_TOOLS_README.md       # Complete documentation
├── README_SCRIPTS.md           # This file
├── data/                       # JSON data files
│   ├── README.md
│   ├── COMPLETE_RENAME_MAPPING.json
│   ├── JAVA_ANALYSIS_RESULTS.json
│   ├── PACKAGE_MAPPING.json
│   └── STRUCTURE_ANALYSIS.json
└── legacy/                     # Original individual scripts
    ├── README.md
    ├── registration_gui.py
    ├── demo_test_data_ui.py
    ├── test_dummy_data.py
    ├── test_email_generation.py
    ├── fix_constructors.py
    ├── fix_constructors_v2.py
    ├── reorganize_structure.py
    └── rename_obfuscated_files.py
```

## Quick Start

From the project root:
```bash
# Show all available commands
./tustu-tools --help

# Generate test data
./tustu-tools test-data -n 5

# Generate a registration key
./tustu-tools gen-key --test-data

# Fix Java constructors
./tustu-tools fix-constructors -d ./app

# Analyze project structure
./tustu-tools analyze
```

From the scripts folder:
```bash
# Show all available commands
python3 tustu_tools.py --help

# Generate test data
python3 tustu_tools.py test-data -n 5
```

## Folder Structure

```
scripts/
├── tustu_tools.py              # ⭐ Main unified tool
├── TUSTU_TOOLS_README.md       # Complete documentation
├── README_SCRIPTS.md           # This file
├── data/                       # JSON data files
│   ├── README.md
│   ├── COMPLETE_RENAME_MAPPING.json
│   ├── JAVA_ANALYSIS_RESULTS.json
│   ├── PACKAGE_MAPPING.json
│   └── STRUCTURE_ANALYSIS.json
└── legacy/                     # Original individual scripts
    ├── README.md
    ├── registration_gui.py
    ├── demo_test_data_ui.py
    ├── test_dummy_data.py
    ├── test_email_generation.py
    ├── fix_constructors.py
    ├── fix_constructors_v2.py
    ├── reorganize_structure.py
    └── rename_obfuscated_files.py
```

## Documentation

See **`TUSTU_TOOLS_README.md`** for complete documentation including:
- All available commands
- Detailed usage examples
- Command reference
- Migration guide from old scripts

## Legacy Scripts

The original individual scripts are preserved in this folder for reference purposes. However, **`tustu_tools.py` is now the recommended way** to access all functionality.

## Key Benefits

| Benefit | Impact |
|---------|--------|
| **Single Entry Point** | One tool instead of 8+ scripts |
| **Consistent Interface** | All commands use argparse |
| **Better Help** | `--help` for every command |
| **Easy Discovery** | Features are obvious |
| **Simple Maintenance** | One codebase to update |
| **Clean Structure** | Organized folders |

### Original Scripts Still Work

If you prefer, you can still run the original scripts directly:
```bash
python3 registration_gui.py          # Launch GUI
python3 test_dummy_data.py           # Generate test data
python3 fix_constructors.py          # Fix constructors
```

However, we recommend using `tustu_tools.py` for all new work.

## Examples

### Before (Multiple Scripts)

```bash
python3 test_dummy_data.py
python3 test_email_generation.py
python3 fix_constructors.py
python3 reorganize_structure.py
```

### After (Unified Tool)

```bash
./tustu-tools test-data -n 5
./tustu-tools gen-key --test-data --email-format
./tustu-tools fix-constructors -d ./app
./tustu-tools analyze -o report.json
```

## Commands Overview

Run from project root with `./tustu-tools` or from scripts folder with `python3 tustu_tools.py`:

| Command | Purpose |
|---------|---------|
| `gen-key` | Generate registration keys (4/5/7/8 param algorithms) |
| `test-data` | Generate test data sets with valid keys |
| `fix-constructors` | Fix misnamed Java constructors |
| `analyze` | Analyze project structure and packages |
| `gui` | Launch PyQt6 GUI (requires PyQt6) |

**Detailed help:**

```bash
./tustu-tools <command> --help
```

## Installation

No installation needed! Just run the script:
```bash
python3 scripts/tustu_tools.py [command]
```

Or use the wrapper from project root:
```bash
./tustu-tools [command]
```

## Dependencies

Core functionality requires only Python 3 standard library.

Optional dependencies:
- **PyQt6** - Required for GUI: `pip install PyQt6`

## See Also

- `TUSTU_TOOLS_README.md` - Complete documentation
- `../README.md` - Project root documentation
