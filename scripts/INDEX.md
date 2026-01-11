# Scripts Folder - Quick Index

Quick navigation guide for the scripts folder.

## 🎯 What You Need

| I want to... | Go to... |
|--------------|----------|
| Generate registration keys, test data, or use tools | `tustu_tools.py` - [Documentation](TUSTU_TOOLS_README.md) |
| Understand the folder organization | [README_SCRIPTS.md](README_SCRIPTS.md) |
| Access original scripts | [legacy/](legacy/) folder - [Details](legacy/README.md) |
| View analysis data | [data/](data/) folder - [Details](data/README.md) |

## 📖 Documentation Files

| File | Purpose |
|------|---------|
| `README.md` | Quick overview and examples |
| `README_SCRIPTS.md` | Detailed migration guide |
| `TUSTU_TOOLS_README.md` | Complete tool documentation |
| `INDEX.md` | This file (quick navigation) |

## 🔧 Main Tool

**File:** `tustu_tools.py`

**Quick Commands:**
```bash
python3 tustu_tools.py --help        # Show all commands
python3 tustu_tools.py gen-key -t    # Generate key with test data
python3 tustu_tools.py test-data -n 5  # Generate 5 test sets
python3 tustu_tools.py gui           # Launch GUI
```

**From project root:**
```bash
./tustu-tools --help
./tustu-tools gen-key --test-data
```

## 📂 Folder Contents

### Main Files (scripts/)
- ⭐ `tustu_tools.py` - Unified command-line tool
- 📖 `*.md` - Documentation files

### legacy/
- All original individual Python scripts
- Preserved for reference
- See [legacy/README.md](legacy/README.md)

### data/
- JSON mapping and analysis files
- Generated data files
- See [data/README.md](data/README.md)

## 🚦 Getting Started

1. **First time?** Start with [README.md](README.md)
2. **Need examples?** Check [TUSTU_TOOLS_README.md](TUSTU_TOOLS_README.md)
3. **Migrating code?** Read [README_SCRIPTS.md](README_SCRIPTS.md)

## 🔗 Quick Links

- [Complete Documentation](TUSTU_TOOLS_README.md)
- [Legacy Scripts Info](legacy/README.md)
- [Data Files Info](data/README.md)
- [Project Root](../)
