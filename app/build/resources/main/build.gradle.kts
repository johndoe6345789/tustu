plugins {
    java
    application
}

group = "com.efianalytics"
version = "1.0.0"

java {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

// Configure source directories to use app/ directly instead of src/main/java
sourceSets {
    main {
        java {
            // Set the app folder as the source root
            srcDirs(".")
            // Exclude build and other non-source directories
            exclude("build/**", "docs/**", "lib/**", "META-INF/**", "icons/**", "themes/**")
        }
        resources {
            srcDirs(".", "icons", "themes", "META-INF")
            exclude("**/*.java", "build/**")
        }
    }
}

repositories {
    mavenCentral()
    google()
}

dependencies {
    // Add common dependencies for Swing applications
    implementation("org.jetbrains:annotations:24.0.1")
    
    // Add any JAR files from the lib directory if they exist
    implementation(fileTree(mapOf("dir" to "lib", "include" to listOf("*.jar"))))
}

application {
    // Set the main class - adjust this to your actual main class
    mainClass.set("TunerStudio")
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
    options.compilerArgs.add("-Xlint:unchecked")
    options.compilerArgs.add("-Xlint:deprecation")
    // Continue compilation despite errors in obfuscated code
    options.isFailOnError = false
    options.isFork = true
}

tasks.jar {
    manifest {
        attributes(
            "Main-Class" to "TunerStudio",
            "Implementation-Title" to "TunerStudio",
            "Implementation-Version" to project.version
        )
    }
    
    // Include all dependencies in the JAR
    from(configurations.runtimeClasspath.get().map { if (it.isDirectory) it else zipTree(it) })
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
}
