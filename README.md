# left-pad-kotlin
[![Build Status](https://travis-ci.org/IvBaranov/left-pad-kotlin.svg?branch=master)](https://travis-ci.org/IvBaranov/left-pad-kotlin)

Kotlin implementation of the famous npm [left-pad](http://left-pad.io/) package

Usage
-----

```kotlin
"foo".leftPad(5)
// => "  foo"

"foobar".leftPad(6)
// => "foobar"

"1".leftPad(2, "0")
// => "01"
```

Download
--------
```groovy
allprojects {
    repositories {
        maven { url "https://jitpack.io" }
    }
}
```
```groovy
dependencies {
    compile 'com.github.IvBaranov:left-pad-kotlin:1.0.0'
}
```	

Developed By
------------
Ivan Baranov

License
-------

```
Copyright 2015 Ivan Baranov

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
