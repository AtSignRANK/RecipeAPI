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

Example Code
- Kotlin Plugin
```kt
    public void loadRecipes() {
        var varNumber = Recipe.namespace.get("number");
        if (!(varNumber instanceof Integer)) {
            System.out.println("RecipeLoadException");
            return;
        }
        int number = (int) varNumber + 1;
        for (int i = 1; i <= number; i++) {
            org.bukkit.inventory.Recipe recipe = (org.bukkit.inventory.Recipe) Recipe.namespace.get("" + i);
            Bukkit.addRecipe(recipe);
        }
    }
```
