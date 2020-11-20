![Publish Bintray](https://github.com/vijaypatidar/AndroidWifiManager/workflows/Publish%20Bintray/badge.svg)[ ![Download](https://api.bintray.com/packages/vijaypatidar/AndroidWifiManager/APManager/images/download.svg?version=1.0.0) ](https://bintray.com/vijaypatidar/AndroidWifiManager/APManager/1.0.0/link)
# APManager - Access Point Manager
APManager is a singleton utility class that help to create mobile hotspot on android device programmatically , without taking care of android version and permission requires to do the same.It supports android 5.0 and later android version.

# Download
#### Step 1 : Add the JitPack repository to your build file
Gradle:
```gradle
allprojects {
    repositories {
        ...
        mavenLocal()
    }
}
```

#### Step 2 : Add the dependency

Gradle:
```gradle
dependencies {
    implementation 'com.vkpapps.wifimanager:APManager:1.0.0'
}
```
    
# License
Apache License

Copyright (c) 2020 Vijay Patidar
