#!/bin/bash
# Batch format and fix Java files

set -e

SCRIPT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")" && pwd)"
PROJECT_ROOT="$(dirname "$SCRIPT_DIR")"

echo "==================================================================="
echo "Java Code Fixer & Formatter"
echo "==================================================================="

# Step 1: Run powerful Python fixer
echo ""
echo "[1/3] Running powerful Python fixer..."
cd "$PROJECT_ROOT"
python3 "$SCRIPT_DIR/powerful_java_fixer.py"

# Step 2: Format with google-java-format (if available)
if [ -f /tmp/google-java-format.jar ]; then
    echo ""
    echo "[2/3] Running google-java-format..."
    find app/src/main/java -name "*.java" | while read -r file; do
        java -jar /tmp/google-java-format.jar --replace "$file"
    done
    echo "Formatted all Java files."
else
    echo ""
    echo "[2/3] Skipping google-java-format (not downloaded)"
fi

# Step 3: Compile to check progress
echo ""
echo "[3/3] Compiling to check for errors..."
./gradlew :app:clean :app:compileJava 2>&1 | tee /tmp/compile_result.txt

# Show summary
echo ""
echo "==================================================================="
ERROR_COUNT=$(grep "^[0-9]* error" /tmp/compile_result.txt | cut -d' ' -f1 || echo "0")
echo "Compilation errors remaining: $ERROR_COUNT"
echo "==================================================================="

if [ "$ERROR_COUNT" = "0" ]; then
    echo "✅ SUCCESS! All compilation errors fixed!"
    exit 0
else
    echo "⚠️  Still have $ERROR_COUNT errors to fix"
    echo ""
    echo "Error summary:"
    grep "error:" /tmp/compile_result.txt | cut -d: -f3 | sort | uniq -c | sort -rn | head -10
    exit 1
fi
