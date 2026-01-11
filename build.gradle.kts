plugins {
    java
}

group = "com.efianalytics"
version = "1.0.0"

repositories {
    mavenCentral()
    google()
}

// Configure all subprojects
subprojects {
    apply(plugin = "java")
    
    repositories {
        mavenCentral()
        google()
    }
}
