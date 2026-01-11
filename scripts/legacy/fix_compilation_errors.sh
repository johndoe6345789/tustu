#!/bin/bash
# Script to fix common Java compilation errors

cd /home/rewrich/Documents/GitHub/tustu/app/src/main/java

# Fix illegal escape sequences \BInterfaceNovember -> \\n
echo "Fixing illegal escape sequences..."
find . -name "*.java" -type f -exec sed -i 's/\\BInterfaceNovember/\\n/g' {} \;

# Fix "do" keyword usage (do -> doObj)
echo "Fixing 'do' keyword issues..."
find . -name "*.java" -type f -exec sed -i 's/\bdo paramdo\b/DoObj paramDoObj/g' {} \;
find . -name "*.java" -type f -exec sed -i 's/instanceof do\b/instanceof DoObj/g' {} \;
find . -name "*.java" -type f -exec sed -i 's/return do;/return numericTextField;/g' {} \;

# Fix Abstract keyword usage
echo "Fixing 'Abstract' keyword issues..."
find . -name "*.java" -type f -exec sed -i 's/\bAbstract paramh\b/AbstractParam paramh/g' {} \;

echo "Done! Files modified."
