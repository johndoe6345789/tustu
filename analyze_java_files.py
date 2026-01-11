#!/usr/bin/env python3
"""
Heuristic Java file analyzer to suggest descriptive names for obfuscated classes.
Analyzes code patterns, imports, methods, and class structure to infer purpose.
"""

import os
import re
import json
from collections import defaultdict
from pathlib import Path

class JavaFileAnalyzer:
    def __init__(self):
        self.patterns = {
            'factory': re.compile(r'(public\s+static\s+\w+\s+create|getInstance|factory|new\s+\w+\()', re.IGNORECASE),
            'builder': re.compile(r'\.builder\(\)|\.with\w+\(', re.IGNORECASE),
            'manager': re.compile(r'(manage|handle|oversee|coordinate)', re.IGNORECASE),
            'listener': re.compile(r'(Listener|Observer|Handler|Callback)', re.IGNORECASE),
            'exception': re.compile(r'extends\s+Exception|extends\s+\w*Error', re.IGNORECASE),
            'interface': re.compile(r'public\s+interface\s+', re.IGNORECASE),
            'abstract': re.compile(r'public\s+abstract\s+', re.IGNORECASE),
            'enum': re.compile(r'public\s+(enum|final)\s+', re.IGNORECASE),
            'dao': re.compile(r'(select|insert|update|delete|query|fetch|retrieve)', re.IGNORECASE),
            'util': re.compile(r'(parse|convert|transform|format|validate|encode|decode)', re.IGNORECASE),
            'serializer': re.compile(r'(Serializable|serialize|deserialize|toJson|fromJson|toXml|fromXml)', re.IGNORECASE),
            'provider': re.compile(r'Provider|provide|supply|offer', re.IGNORECASE),
            'service': re.compile(r'Service|serve|request|response', re.IGNORECASE),
            'controller': re.compile(r'(Controller|control|dispatch|route|handle.*request)', re.IGNORECASE),
            'repository': re.compile(r'(Repository|persist|store|save|load)', re.IGNORECASE),
            'cache': re.compile(r'(cache|Cache|buffer|Buffer)', re.IGNORECASE),
            'thread': re.compile(r'(Thread|Runnable|execute|concurrent|async|parallel)', re.IGNORECASE),
            'timer': re.compile(r'(Timer|Schedule|delay|interval|periodic)', re.IGNORECASE),
            'pool': re.compile(r'(Pool|pool|ObjectPool|resource.*pool)', re.IGNORECASE),
            'renderer': re.compile(r'(render|paint|draw|display|Graphics)', re.IGNORECASE),
            'parser': re.compile(r'(parse|Parser|read.*format|parse.*xml|parse.*json)', re.IGNORECASE),
            'validator': re.compile(r'(validate|Validator|check.*valid|constraint)', re.IGNORECASE),
            'converter': re.compile(r'(convert|Convert|transform|Transform|map.*to)', re.IGNORECASE),
            'builder_pattern': re.compile(r'public\s+\w+\s+with\w+\(', re.IGNORECASE),
            'singleton': re.compile(r'private\s+static\s+\w+\s+instance|getInstance\(\)', re.IGNORECASE),
        }
    
    def analyze_file(self, filepath, filename=None):
        """Analyze a single Java file and return heuristic name suggestions"""
        try:
            with open(filepath, 'r', encoding='utf-8', errors='ignore') as f:
                content = f.read()
        except:
            return None
        
        if not content.strip():
            return None
        
        # Skip if already renamed (multi-character class names, CamelCase, etc.)
        basename = filename or os.path.basename(filepath).replace('.java', '')
        if len(basename) > 1 and basename[0].isupper():
            # Already renamed (CamelCase names like "Matrix", "Repository", etc.)
            return None
        
        scores = defaultdict(int)
        details = {
            'imports': [],
            'methods': [],
            'extends': None,
            'implements': [],
            'pattern_matches': []
        }
        
        # Extract class name
        class_match = re.search(r'public\s+(?:abstract\s+)?(?:final\s+)?class\s+(\w+)', content)
        if not class_match:
            class_match = re.search(r'public\s+(?:abstract\s+)?(?:final\s+)?interface\s+(\w+)', content)
        
        class_name = class_match.group(1) if class_match else None
        
        # Extract imports
        imports = re.findall(r'import\s+([\w.]+(?:\.\*)?)', content)
        details['imports'] = imports
        
        # Analyze import packages for hints
        for imp in imports:
            if 'listener' in imp.lower() or 'observer' in imp.lower():
                scores['listener'] += 3
            if 'model' in imp.lower():
                scores['model'] += 2
            if 'service' in imp.lower():
                scores['service'] += 3
            if 'dao' in imp.lower() or 'repository' in imp.lower():
                scores['repository'] += 3
            if 'util' in imp.lower():
                scores['util'] += 2
            if 'factory' in imp.lower():
                scores['factory'] += 3
        
        # Extract extends
        extends_match = re.search(r'extends\s+(\w+)', content)
        if extends_match:
            details['extends'] = extends_match.group(1)
            extends_name = extends_match.group(1).lower()
            if 'exception' in extends_name or 'error' in extends_name:
                scores['exception'] += 5
                return {'name': f"{class_name or 'Custom'}Exception", 'score': 10, 'reason': 'Extends Exception/Error', 'details': details}
        
        # Extract implements
        implements_match = re.findall(r'implements\s+([\w,\s]+)', content)
        if implements_match:
            for impl in implements_match:
                interfaces = [i.strip() for i in impl.split(',')]
                details['implements'].extend(interfaces)
                for iface in interfaces:
                    iface_lower = iface.lower()
                    if 'listener' in iface_lower:
                        scores['listener'] += 3
                    if 'callback' in iface_lower:
                        scores['listener'] += 2
                    if 'serializable' in iface_lower:
                        scores['serializer'] += 2
        
        # Extract method names and analyze
        methods = re.findall(r'public\s+(?:static\s+)?(?:synchronized\s+)?(\w+)\s+(\w+)\s*\(', content)
        for ret_type, method_name in methods:
            details['methods'].append(method_name)
            method_lower = method_name.lower()
            
            # Factory pattern
            if method_name in ['create', 'getInstance', 'newInstance', 'of']:
                scores['factory'] += 3
            if 'create' in method_lower:
                scores['factory'] += 2
            
            # Builder pattern
            if method_lower.startswith('with'):
                scores['builder'] += 2
            
            # Manager/Handler
            if method_lower.startswith('manage') or method_lower.startswith('handle'):
                scores['manager'] += 2
            
            # Validation
            if method_lower in ['validate', 'isValid', 'check']:
                scores['validator'] += 2
            
            # Conversion
            if 'convert' in method_lower or 'transform' in method_lower or 'map' in method_lower:
                scores['converter'] += 2
            
            # Parsing
            if 'parse' in method_lower or 'read' in method_lower:
                scores['parser'] += 2
            
            # Rendering
            if method_lower in ['render', 'paint', 'draw', 'display']:
                scores['renderer'] += 2
            
            # Service/Repository
            if method_lower in ['save', 'persist', 'fetch', 'query', 'retrieve', 'load']:
                scores['repository'] += 2
            if method_lower in ['start', 'stop', 'execute', 'run']:
                scores['service'] += 2
        
        # Pattern matching
        for pattern_name, pattern in self.patterns.items():
            if pattern.search(content):
                details['pattern_matches'].append(pattern_name)
                if pattern_name == 'factory':
                    scores['factory'] += 3
                elif pattern_name == 'builder':
                    scores['builder'] += 3
                elif pattern_name == 'exception':
                    scores['exception'] += 5
                elif pattern_name == 'interface':
                    scores['interface'] += 2
                elif pattern_name == 'abstract':
                    scores['abstract'] += 2
                elif pattern_name == 'dao':
                    scores['repository'] += 3
                elif pattern_name == 'util':
                    scores['util'] += 2
                elif pattern_name == 'serializer':
                    scores['serializer'] += 2
                elif pattern_name == 'provider':
                    scores['provider'] += 2
                elif pattern_name == 'service':
                    scores['service'] += 2
                elif pattern_name == 'controller':
                    scores['controller'] += 3
                elif pattern_name == 'repository':
                    scores['repository'] += 3
                elif pattern_name == 'cache':
                    scores['cache'] += 2
                elif pattern_name == 'thread':
                    scores['thread'] += 2
                elif pattern_name == 'timer':
                    scores['timer'] += 2
                elif pattern_name == 'pool':
                    scores['pool'] += 2
                elif pattern_name == 'renderer':
                    scores['renderer'] += 2
                elif pattern_name == 'parser':
                    scores['parser'] += 3
                elif pattern_name == 'validator':
                    scores['validator'] += 2
                elif pattern_name == 'converter':
                    scores['converter'] += 2
        
        # Singleton pattern
        if 'getInstance' in content or 'instance' in content.lower():
            scores['singleton'] += 1
        
        # Field count analysis
        field_count = len(re.findall(r'(public|private|protected)\s+(?:static\s+)?(?:final\s+)?\w+\s+\w+\s*[;=]', content))
        if field_count > 20:
            scores['model'] += 2
        
        # Get top scores
        if not scores:
            return None
        
        sorted_scores = sorted(scores.items(), key=lambda x: x[1], reverse=True)
        top_suggestion = sorted_scores[0][0]
        top_score = sorted_scores[0][1]
        
        # Generate name
        suffix_map = {
            'factory': 'Factory',
            'builder': 'Builder',
            'manager': 'Manager',
            'listener': 'Listener',
            'exception': 'Exception',
            'interface': 'Interface',
            'abstract': 'Abstract',
            'enum': 'Enum',
            'dao': 'DAO',
            'util': 'Utils',
            'serializer': 'Serializer',
            'provider': 'Provider',
            'service': 'Service',
            'controller': 'Controller',
            'repository': 'Repository',
            'cache': 'Cache',
            'thread': 'Thread',
            'timer': 'Timer',
            'pool': 'Pool',
            'renderer': 'Renderer',
            'parser': 'Parser',
            'validator': 'Validator',
            'converter': 'Converter',
            'model': 'Model',
            'singleton': 'Singleton',
        }
        
        generated_name = suffix_map.get(top_suggestion, top_suggestion.title())
        
        return {
            'class_name': class_name,
            'suggested_name': f"{generated_name}.java",
            'confidence': top_score,
            'top_pattern': top_suggestion,
            'all_patterns': dict(sorted_scores[:5]),
            'reason': f"Detected {top_suggestion} pattern (score: {top_score})",
            'details': details
        }
    
    def analyze_package(self, package_dir, pkg_name):
        """Analyze all Java files in a package and suggest names"""
        results = {}
        
        for file in sorted(os.listdir(package_dir)):
            if file.endswith('.java'):
                filepath = os.path.join(package_dir, file)
                # Only analyze single-letter or very short filenames
                basename = file.replace('.java', '')
                if len(basename) > 2:
                    # Skip already-renamed files
                    continue
                analysis = self.analyze_file(filepath, file)
                if analysis:
                    results[file] = analysis
        
        return results


def main():
    analyzer = JavaFileAnalyzer()
    base_path = "/home/rewrich/Documents/GitHub/tustu/app/obfuscated_packages"
    
    # Analyze some sample packages to demonstrate
    sample_packages = ['A', 'B', 'G', 'L', 'M', 'aa', 'ac', 'ae', 'af']
    
    output = {}
    
    for pkg in sample_packages:
        pkg_path = os.path.join(base_path, pkg)
        if os.path.isdir(pkg_path):
            print(f"\n{'='*60}")
            print(f"Analyzing package: {pkg}")
            print('='*60)
            
            results = analyzer.analyze_package(pkg_path, pkg)
            output[pkg] = results
            
            for filename, analysis in sorted(results.items()):
                if analysis and 'suggested_name' in analysis:
                    print(f"\n{filename:15} → {analysis['suggested_name']:25} (confidence: {analysis['confidence']})")
                    print(f"  Pattern: {analysis['top_pattern']}")
                    print(f"  Reason:  {analysis['reason']}")
                    if analysis['details']['methods']:
                        print(f"  Methods: {', '.join(analysis['details']['methods'][:5])}")
                    if analysis['details']['pattern_matches']:
                        print(f"  Matches: {', '.join(analysis['details']['pattern_matches'][:5])}")
    
    # Save detailed results to JSON
    output_file = "/home/rewrich/Documents/GitHub/tustu/JAVA_ANALYSIS_RESULTS.json"
    with open(output_file, 'w') as f:
        json.dump(output, f, indent=2, default=str)
    
    print(f"\n\nDetailed analysis saved to: {output_file}")


if __name__ == '__main__':
    main()
