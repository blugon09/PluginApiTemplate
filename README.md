# ItemHelper

[![ItemHelper](https://img.shields.io/badge/ItemHelper-1.2.8_SNAPSHOT-blue.svg)]()
<br><br>
[![Java](https://img.shields.io/badge/Java-16-FF7700.svg?logo=java)]()
[![Kotlin](https://img.shields.io/badge/Kotlin-1.5.31-186FCC.svg?logo=kotlin)]()
[![PaperMC](https://img.shields.io/badge/PaperMC-1.17-222222.svg)]()


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
