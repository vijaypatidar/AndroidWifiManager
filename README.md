<img src="logo.png" alt="drawing" width="200" /><br><br>
![Publish Bintray](https://github.com/vijaypatidar/AndroidWifiManager/workflows/Publish%20Bintray/badge.svg)[ ![Download](https://api.bintray.com/packages/vijaypatidar/AndroidWifiManager/APManager/images/download.svg?version=1.0.0) ](https://bintray.com/vijaypatidar/AndroidWifiManager/APManager/1.0.0/link)
# APManager - Access Point Manager
APManager is a singleton utility class that help to create mobile hotspot on android device programmatically , without taking care of android version and permission requires to do the same.It supports android 5.0 and later android version.

# Download
#### Step 1 : Add the jcenter repository to your build file

```gradle
allprojects {
    repositories {
        ...
        jcenter()
    }
}
```

#### Step 2 : Add the dependency
```gradle
dependencies {
    implementation 'com.vkpapps.wifimanager:APManager:1.0.0'
}
```
# Step 3 : Use in your app
```java
APManager apManager = APManager.getApManager(this);
apManager.turnOnHotspot(this, new APManager.OnSuccessListener() {

    @Override
    public void onSuccess(String ssid, String password) {
        //write your logic
    }

}, new APManager.OnFailureListener() {

    @Override
    public void onFailure(int failureCode, @Nullable Exception e) {
        //handle error like give access to location permission,write system setting permission,
        //disconnect wifi,turn off already created hotspot,enable GPS provider
        
        //or use DefaultFailureListener class to handle automatically
    }

});

//use this line to turn off Hotspot
//apManager.disableWifiAp();
```
# License
```txt
Apache License

Copyright (c) 2020 Vijay Patidar

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```