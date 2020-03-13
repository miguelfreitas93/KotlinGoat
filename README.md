# KotlinGoat

A damn vulnerable Kotlin Android Application

# Vulnerabilities

- Kotlin:
    - High:

    - Medium:
        - Privacy Violation (X results - PrivacyViolation.kt)
        - Heap Inspection (X results - MainActivity.kt, PrivacyViolation.kt)
        - Use of Native Language (4 results - UseOfNativeLanguage.kt)
        - Process Control (1 result - ProcessControl.kt)
        - Use of System Exit (2 result - UseOfSystemExit.kt)
        - Insecure Random (1 result - InsecureRandom.kt)
        - Unvalidated SSL Certificate Hostname (2 results - UnvalidatedSSLCertificateHostname.kt)
        - Unvalidated Redirects (2 results - UnvalidatedRedirects.kt)
    - Low:
        - No Installer Verification Implemented (1 result - MainActivity.kt)
        - Missing Rooted Device Check (1 result - MainActivity.kt)
        - Missing Device Lock Verification (1 result - MainActivity.kt)
        - Screen Caching (1 result - MainActivity.kt)
        - Passwords In Comments (16 results - PasswordsInComments.kt)
- Other:
    - Medium:
        - Google Play Store Config Files in Repository (1 result)
        - Keystore Files in Repository (1 result)
        - Properties Files in Repository (2 results)
        - Hardcoded Password (2 results - local.properties)
        - Hardcoded Cryptographic Key (3 results - local.properties)
- C++:
    - Medium:
        - Hardcoded Password (1 result - hello.c)
        - Hardcoded Key/Secret (2 results - hello.c)
- Gradle:
    - High:
        - Stored Dependency Injection (1 result - build.gradle)
    - Medium:
        - Privacy Violation (2 results - build.gradle)
        - Process Control (1 result - build.gradle)
        - Manifest Variable Binding Privacy Violation (1 result - build.gradle)
        - Build Config Privacy Violation (3 results - build.gradle)
        - Path Traversal (1 result - build.gradle)
        - Hardcoded Password (2 results - build.gradle)
        - Proguard Not in Use (2 results - build.gradle)
        - Proguard Disabled (2 results - build.gradle)
        - Use of Native Language (1 result - build.gradle)
    - Low:
        - Insecure SDK Version (1 result - build.gradle)
        - Debuggable App (2 results - build.gradle)
        - Debuggable Native Code (2 results - build.gradle)
        - Debuggable RenderScript Code (2 results - build.gradle)
        - Missing Signing Configuration (2 results - build.gradle)
        - Minify Disabled - Dead Code (2 results - build.gradle)
        - Unhandled Exception (4 results - build.gradle)
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
        - Hardcoded Key (2 results - AndroidManifest.xml)
    - Low:
        - Missing Input Type (7 results - activity_main.xml)
        - Allowed Backup (2 results - AndroidManifest.xml)
        - Allowed to Clear User Data (1 result - AndroidManifest.xml)
        - Debuggable App (1 result - AndroidManifest.xml)
        - Background Process Running (1 result - AndroidManifest.xml)
        - Keyboard Cache Information Leak (2 results - activity_main.xml)


# License

KotlinGoat - A damn vulnerable Kotlin Android Application

Copyright (C) 2020 Miguel Freitas

This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.

This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.

You should have received a copy of the GNU General Public License along with this program. If not, see https://www.gnu.org/licenses/.
