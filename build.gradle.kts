plugins {
    kotlin("jvm") version "1.5.31"
    id("com.github.johnrengelman.shadow") version "7.0.0"
    `maven-publish`
}

group = "io.github.blugon09"
version = "0.0.1"



repositories {
    mavenCentral()
    maven("https://papermc.io/repo/repository/maven-public/")
    maven("https://oss.sonatype.org/content/groups/public/")
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.17.1-R0.1-SNAPSHOT")

    implementation("net.kyori:adventure-api:4.9.2")
}


tasks {
    create<Jar>("sourcesJar") {
        archiveClassifier.set("source")
        sourceSets["main"].allSource
    }
}

publishing {
    publications {
        create<MavenPublication>(rootProject.name) {
            artifact(tasks["sourcesJar"])
            from(components["java"])
        }
    }
}