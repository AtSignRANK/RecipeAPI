# RecipeAPI
- Minecraft Paper Library
- addRecipe, removeRecipe

## 사용 방법
- addRecipe() 는 페이퍼와 동일
- removeRecipe() 는 **RecipeAPI** 의 addRecipe를 이용 했을 때 removeRecipe(Recipe) 으로도 삭제가 가능합니다.

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
- Kotlin Example Code ( Code Version 2.0.-1 )
```kt
    fun loadRecipes() {
        val varNumber = Recipe.namespace.get("number")
        if (varNumber !is Int) {
            return
        }
        val number = varNumber as Int + 1
        for (i in 1..number) {
            val recipe = Recipe.namespace.get("" + i) as org.bukkit.inventory.Recipe
            Recipe.addRecipe(recipe)
        }
    }
```
