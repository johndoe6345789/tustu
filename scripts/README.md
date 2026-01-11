# Scripts Folder

Clean, organized tool collection for the TuStu project.

> **Quick Start:** `./tustu-tools gen-key --test-data` (from project root)  
> **Full Docs:** [TUSTU_TOOLS_README.md](TUSTU_TOOLS_README.md)

## 📁 Structure

```
scripts/
├── tustu_tools.py           ⭐ Main unified tool
├── TUSTU_TOOLS_README.md    📖 Complete documentation
├── README_SCRIPTS.md        📋 Overview (detailed)
├── data/                    💾 Analysis & mapping data
└── legacy/                  📦 Original individual scripts
```

## 🚀 Quick Start

```bash
# From project root
./tustu-tools gen-key --test-data
./tustu-tools test-data -n 5

# From scripts folder
python3 tustu_tools.py gen-key --test-data
python3 tustu_tools.py --help
```

## 📚 Documentation

- **TUSTU_TOOLS_README.md** - Complete usage guide with examples
- **README_SCRIPTS.md** - Detailed overview and migration guide
- **legacy/README.md** - Info about original scripts
- **data/README.md** - JSON data files documentation

## 🛠️ Main Tool

**File:** `tustu_tools.py` (executable)

Unified command-line interface providing:

- **Registration key generation** - All algorithms (4/5/7/8 param)
- **Test data creation** - Realistic dummy data with valid keys
- **Java constructor fixing** - Automated code repairs
- **Project structure analysis** - Package and file organization
- **GUI launcher** - PyQt6 registration interface

Run `./tustu-tools --help` for full command list.

## 📦 Subfolders

| Folder | Contents | Purpose |
|--------|----------|---------|
| **legacy/** | 8 original Python scripts | Preserved for reference; use `tustu_tools.py` instead |
| **data/** | 4 JSON analysis files | Generated mapping/analysis data (not version controlled) |

## 💡 Examples

```bash
# Generate 10 test registration keys
./tustu-tools test-data -n 10 --email-format > keys.txt

# Fix Java constructors in app directory
./tustu-tools fix-constructors -d ./app

# Analyze project structure
./tustu-tools analyze -o structure.json

# Launch GUI
./tustu-tools gui
```

For more examples, see `TUSTU_TOOLS_README.md`
