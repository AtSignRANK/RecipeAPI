package io.github.api.recipeapi;

import org.bukkit.Bukkit;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ShapedRecipe;

public class Recipe {
    public void addRecipe(ShapedRecipe shapedrecipe) {
        NamespacedKey namespacedkey = shapedrecipe.getKey();
        Bukkit.addRecipe(shapedrecipe);
    }

    public void removeRecipe(ShapedRecipe shapedRecipe) {
        Bukkit.removeRecipe()
    }
}
