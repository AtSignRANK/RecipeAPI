# RecipeAPI
- Minecraft Paper Library
- addRecipe, removeRecipe


- Maven (.xml)
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

- Gradle (.gradle)
```gradle
repositories {
  maven "https://jitpack.io"
}

dependencies {
  implementation "com.github.AtSignRANK:RecipeAPI:API-VERSION"
}
```

- Gradle (.kts)
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
    fun loadRecipes() {
        val varNumber = Recipe.namespace.get("number")
        if (varNumber !is Int) {
            return
        }
        val number = varNumber as Int + 1
        for (i in 1..number) {
            val recipe = Recipe.namespace.get("" + i) as org.bukkit.inventory.Recipe
            Bukkit.addRecipe(recipe)
        }
    }
```
