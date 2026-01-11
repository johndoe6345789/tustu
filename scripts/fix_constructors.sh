#!/bin/bash
# Fix all constructor errors by matching class names with lowercase method declarations

# Read the list of files from the compile error output
FILES=$(grep "error: invalid method declaration" /tmp/compile_output3.txt | sed 's/:.*error.*//' | sort -u)

count=0
for file in $FILES; do
    if [ ! -f "$file" ]; then
        continue
    fi
    
    # Extract class name from file
    classname=$(basename "$file" .java)
    
    # Find lines with lowercase method that looks like constructor
    # Pattern: lowercase_name(params) {
    # Replace with: ClassName(params) {
    
    # Use awk to find and fix constructor declarations
    awk -v classname="$classname" '
    {
        # Match lines like: lowercase_name(params) {
        # But not lines with return types like: void lowercase_name(params) {
        if (match($0, /^[[:space:]]*(public|private|protected)?[[:space:]]+([a-z][a-zA-Z0-9_]*)[[:space:]]*\(/)) {
            # Extract the method name
            line = $0
            # Check if there is NO return type keyword before
            if (!match($0, /[[:space:]]+(void|int|boolean|String|double|float|long|short|byte|char|Object|List|Map)[[:space:]]+[a-z]/)) {
                # Replace lowercase method name with class name
                gsub(/([[:space:]]+|^)(public|private|protected)?[[:space:]]+([a-z][a-zA-Z0-9_]*)[[:space:]]*\(/, "\\1\\2 " classname "(")
                count++
            }
        }
        print
    }
    ' "$file" > "$file.tmp" && mv "$file.tmp" "$file"
    
    if [ $? -eq 0 ]; then
        ((count++))
        echo "Fixed: $file"
    fi
done

echo "Processed $count files"
