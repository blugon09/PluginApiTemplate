# PluginApiTemplate

[![ItemHelper](https://img.shields.io/badge/ItemHelper-1.0.0_SNAPSHOT-blue.svg)]()
<br><br>
[![Java](https://img.shields.io/badge/Java-17-FF7700.svg?logo=java)]()
[![Kotlin](https://img.shields.io/badge/Kotlin-1.6.0-186FCC.svg?logo=kotlin)]()
[![PaperMC](https://img.shields.io/badge/PaperMC-1.18-222222.svg)]()


<br>
<br>


### Use API


## Maven
```xml
<repositories>
    <repository>
        <id>project-central</id>
        <url>https://repo.projecttl.net/repository/maven-public/</url>
    </repository>
</repositories>

<dependency>
    <groupId>io.github.blugon09</groupId>
    <artifactId>API Name</artifactId>
    <version>VERSION</version>
</dependency>
```


## Gradle
```gradle
repositories {
    ...
    maven { 'https://repo.projecttl.net/repository/maven-public/' }
}

dependencies {
    implementation 'io.github.blugon09:API Name:VERSION'
}
```

## Kotlin DSL
```gradle
repositories {
    ...
    maven("https://repo.projecttl.net/repository/maven-public/")
}

dependencies {
    implementation("io.github.blugon09:API Name:VERSION")
}
```
