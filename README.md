# PluginApiTemplate

[![PluginApiTemplate](https://img.shields.io/badge/PluginApiTemplate-1.0.0_SNAPSHOT-blue.svg)]()
<br><br>
[![Kotlin](https://img.shields.io/badge/Java-16-FF7700.svg?logo=java)]()
[![Kotlin](https://img.shields.io/badge/Kotlin-1.5.31-186FCC.svg?logo=kotlin)]()
[![PaperMC](https://img.shields.io/badge/PaperMC-1.17-222222.svg)]()


<br>
<br>
Use API

<br>

## Maven
```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>

<dependency>
    <groupId>com.github.blugon09</groupId>
    <artifactId>ProjectName</artifactId>
    <version>VERSION</version>
</dependency>
```


## Gradle
```gradle
repositories {
    ...
    maven { 'https://jitpack.io/' }
}

dependencies {
    implementation 'com.github.blugon09:ProjectName:VERSION'
}
```

## Kotlin DSL
```gradle
repositories {
    ...
    maven("https://jitpack.io/")
}

dependencies {
    implementation("com.github.blugon09:ProjectName:VERSION")
}
```