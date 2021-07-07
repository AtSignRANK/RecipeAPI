package io.github.api.recipeapi;

import org.bukkit.Bukkit;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

public class Recipe {
    File file = File("RecipeNamespacedKeys/namespacedkey.yml")
    FileConfiguration namespace;

    public void addRecipe(ShapedRecipe shapedrecipe) {
        int number = namespace.get("number") + 1
        NamespacedKey namespacedkey = shapedrecipe.getKey();
        Bukkit.addRecipe(shapedrecipe);
        namespace.set(shapedrecipe.toString(), namespacedkey)
    }

    public void removeRecipe(ShapedRecipe shapedrecipe) {
        NamespacedKey namespacedkey = namespace.get(shapedrecipe.toString())
        Bukkit.removeRecipe(namespacedkey)
    }
}
