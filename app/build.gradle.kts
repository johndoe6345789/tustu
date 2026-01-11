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

// Use standard Gradle directory structure
sourceSets {
    main {
        java {
            srcDirs("src/main/java")
        }
        resources {
            srcDirs("src/main/resources")
        }
    }
    test {
        java {
            srcDirs("src/test/java")
        }
    }
}

tasks.test {
    useJUnitPlatform()
    testLogging {
        events("passed", "skipped", "failed")
    }
}


tasks.withType<ProcessResources> {
    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
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
    
    // Testing dependencies
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.10.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.10.1")
    testImplementation("org.assertj:assertj-swing-junit:3.17.1")
    testImplementation("org.awaitility:awaitility:4.2.0")
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
