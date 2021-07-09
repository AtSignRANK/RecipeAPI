plugins {
    java
    id("com.github.johnrengelman.shadow") version "6.1.0"
    `maven-publish`
}

group = properties["group"]!!
version = properties["version"]!!

repositories {
    jcenter()
    maven("https://jitpack.io")
    maven("https://papermc.io/repo/repository/maven-public/")
}

dependencies {
    compileOnly("com.destroystokyo.paper:paper-api:1.16.5-R0.1-SNAPSHOT")
}

val shade = configurations.create("shade")
shade.extendsFrom(configurations.implementation.get())

tasks {
    javadoc {
        options.encoding = "UTF-8"
    }

    compileJava {
        options.encoding = "UTF-8"
    }

    create<Jar>("sourceJar") {
        archiveClassifier.set("source")
        from(sourceSets["main"].allSource)
    }

    jar {
        from (shade.map { if (it.isDirectory) it else zipTree(it) } )
    }
}

publishing {
    publications {
        create<MavenPublication>("RecipeAPI") {
            artifact(tasks["sourceJar"])
            from(components["java"])
        }
    }
}