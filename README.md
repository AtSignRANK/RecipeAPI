# RecipeAPI
- Minecraft Paper Library
- addRecipe, removeRecipe


- Maven (pom.xml)
```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>

<dependency>
    <groupId>com.github.AtSignRANK</groupId>
    <artifactId>RecipeAPI</artifactId>
    <version>API-VERSION</version>
</dependency>
```

- Gradle (build.gradle)
```gradle
repositories {
  maven "https://jitpack.io"
}

dependencies {
  implementation "com.github.AtSignRANK:RecipeAPI:API-VERSION"
}
```

- Gradle (build.gradle.kts)
```kts
repositories {
    maven("https://jitpack.io")
}

dependencies {
  implementation("com.github.AtSignRANK:RecipeAPI:API-VERSION")
}
```
