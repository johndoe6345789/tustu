# Markdown Style Guide

This document describes the markdown style used in the scripts folder documentation.

## Conventions

### Headers

- Use ATX-style headers (`#` prefix)
- Add blank line before and after headers
- Use sentence case for titles

### Code Blocks

- Always specify language for syntax highlighting
- Use \`\`\`bash for shell commands
- Use \`\`\`python for Python code
- Use inline \` for command names and file names

### Lists

- Use `-` for unordered lists
- Add blank line before and after lists
- Use consistent indentation (2 spaces)

### Tables

- Use pipes (`|`) for table formatting
- Add header separator row
- Align columns for readability
- Keep tables simple (max 3-4 columns)

### Emphasis

- Use `**bold**` for important terms
- Use `*italic*` for emphasis
- Use `code` for technical terms
- Use > for blockquotes/callouts

### Links

- Use relative links within project
- Use descriptive link text
- Format: `[text](path/to/file.md)`

### Emojis

Used sparingly for visual organization:

- 🎯 Goals/objectives
- ✅ Completed items
- ⭐ Important/featured
- 📖 Documentation
- 💾 Data/storage
- 📦 Archives/legacy
- 🚀 Quick start
- ��️ Tools
- 📁 File structure

## File Types

### INDEX.md
- Quick navigation only
- Table format for clarity
- Links to all major sections

### README.md  
- Brief overview
- Quick start examples
- Links to detailed docs

### README_SCRIPTS.md
- Detailed migration guide
- Before/after comparisons
- Complete command reference

### TUSTU_TOOLS_README.md
- Complete tool documentation
- All commands with examples
- Full reference guide

## Example Patterns

### Command Reference Table

\`\`\`markdown
| Command | Description |
|---------|-------------|
| \`command\` | What it does |
\`\`\`

### Quick Start Section

\`\`\`markdown
## Quick Start

\`\`\`bash
./command --option
\`\`\`
\`\`\`

### File Structure

\`\`\`markdown
folder/
├── file1.py      # Description
├── file2.md      # Description
└── subfolder/    # Description
\`\`\`

## Validation

Files follow these principles:

1. **Clear hierarchy** - Logical header structure
2. **Scannable** - Use tables and lists
3. **Consistent** - Same patterns throughout
4. **Actionable** - Clear examples
5. **Linked** - Easy navigation

## Maintenance

When adding content:

- Match existing style
- Update table of contents if present
- Test all links
- Check code examples work
- Keep line length reasonable
