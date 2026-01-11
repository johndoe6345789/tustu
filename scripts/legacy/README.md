# Legacy Scripts

This folder contains the original individual scripts that have been merged into the unified `tustu_tools.py` tool.

## Purpose

These scripts are preserved for:
- **Reference** - Understanding the original implementation
- **Historical documentation** - Tracking how the code evolved
- **Backup** - In case specific functionality needs to be extracted
- **Standalone use** - Some scripts may still work independently

## Recommendation

**Use `../tustu_tools.py` instead** - It provides all functionality from these scripts through a unified command-line interface.

## Legacy Scripts

| Script | Status | Replacement |
|--------|--------|-------------|
| `registration_gui.py` | ✅ Still functional standalone | `tustu_tools.py gui` |
| `demo_test_data_ui.py` | ⚠️ Demo only | Integrated into all commands |
| `test_dummy_data.py` | ⚠️ Superseded | `tustu_tools.py test-data` |
| `test_email_generation.py` | ⚠️ Superseded | `tustu_tools.py gen-key --email-format` |
| `fix_constructors.py` | ⚠️ Superseded | `tustu_tools.py fix-constructors` |
| `fix_constructors_v2.py` | ⚠️ Superseded | `tustu_tools.py fix-constructors` |
| `reorganize_structure.py` | ⚠️ Superseded | `tustu_tools.py analyze` |
| `rename_obfuscated_files.py` | ⚠️ Partial | Core utilities in tustu_tools.py |

## Notes

### registration_gui.py
The full PyQt6 GUI is still functional and can be run standalone:
```bash
python3 registration_gui.py
```

However, you can also launch it via:
```bash
python3 ../tustu_tools.py gui
```

### Other Scripts
Most other scripts have been fully integrated into the unified tool and should not be run directly anymore.

## Migration

If you have scripts or tools that reference these files, update them to use `tustu_tools.py`:

**Before:**
```bash
python3 scripts/test_dummy_data.py
python3 scripts/fix_constructors.py
```

**After:**
```bash
python3 scripts/tustu_tools.py test-data
python3 scripts/tustu_tools.py fix-constructors
```

Or from project root:
```bash
./tustu-tools test-data
./tustu-tools fix-constructors
```

## Documentation

See the parent folder's documentation:
- `../TUSTU_TOOLS_README.md` - Complete unified tool documentation
- `../README_SCRIPTS.md` - Scripts folder overview
