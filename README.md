# KotlinGoat

A damn vulnerable Kotlin Android Application

# Vulnerabilities

- Gradle:
    - High:
        - Stored Dependency Injection (1 result - build.gradle)
    - Medium:
        - Privacy Violation (2 results - build.gradle)
        - Process Control (1 result - build.gradle)
        - Manifest Variable Binding Privacy Violation (1 result - build.gradle)
        - Build Config Privacy Violation (3 results - build.gradle)
        - Path Traversal (2 results - build.gradle)
        - Hardcoded Password (2 results - build.gradle)
        - Proguard Not in Use (2 results - build.gradle)
        - Proguard Disabled (2 results - build.gradle)
    - Low:
        - Insecure SDK Version (1 result - build.gradle)
        - Debuggable App (2 results - build.gradle)
        - Debuggable Native Code (2 results - build.gradle)
        - Debuggable RenderScript Code (2 results - build.gradle)
        - Missing Signing Configuration (2 results - build.gradle)
        - Minify Disabled - Dead Code (2 results - build.gradle)
        - Unhandled Exception (6 results - build.gradle)
        - Stored Path Traversal (1 result - build.gradle)
- XML:
    - High:
        - Malware Injection into File System (1 result - AndroidManifest.xml)
    - Medium:
        - Uncontrolled Memory Allocation (1 result - AndroidManifest.xml)
        - Failure To Implement Least Privilege (1 result - AndroidManifest.xml)
        - Insecure Transport Layer (2 results - network_security_config.xml, AndroidManifest.xml)
        - Exported Service Without Permissions (2 results - AndroidManifest.xml)
        - Exported Content Provider Without Permissions (2 results - AndroidManifest.xml)
        - Overly Permitted Domain (1 result - network_security_config.xml)
        - Missing Certificate Pinning (1 result - network_security_config.xml)
    - Low:
        - Missing Input Type (7 results - activity_main.xml)
        - Allowed Backup (2 results - AndroidManifest.xml)
        - Allowed to Clear User Data (1 result - AndroidManifest.xml)
        - Debuggable App (1 result - AndroidManifest.xml)
        - Background Process Running (1 result - AndroidManifest.xml)
        - Keyboard Cache Information Leak (2 results - activity_main.xml)
- Kotlin:
    - High:

    - Medium:

    - Low:
        - No Installer Verification Implemented (1 result)
        - Missing Rooted Device Check (1 result)
        - Missing Device Lock Verification (1 result)
        - Screen Caching (1 result)
- Other:
    - Medium:
        - Google Play Store Config Files in Repository (1 result)
        - Keystore Files in Repository (1 result)
        - Properties Files in Repository (2 results)


# License

MIT License

Copyright (c) 2020 Miguel Freitas
