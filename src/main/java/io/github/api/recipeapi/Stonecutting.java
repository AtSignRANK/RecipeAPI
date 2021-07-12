package io.github.api.recipeapi;

import org.bukkit.Bukkit;
import org.bukkit.NamespacedKey;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.inventory.StonecuttingRecipe;
import org.jetbrains.annotations.Contract;

import java.io.File;

public interface Stonecutting {
    File file = new File("RecipeData/data.yml");
    FileConfiguration namespace = YamlConfiguration.loadConfiguration(file);

    @Contract(pure = true)
    static void addRecipe(StonecuttingRecipe recipe) {
        var varNumber = namespace.get("number");
        if (!(varNumber instanceof Integer)) {
            System.out.println("RecipeLoadException");
            return;
        }
        int number = (int) varNumber + 1;
        NamespacedKey key = recipe.getKey();
        Bukkit.addRecipe(recipe);
        namespace.set(recipe.toString(), key);
        namespace.set(recipe.toString(), number);
        namespace.set("" + number, recipe);
    }

    @Contract(pure = true)
    static void removeRecipe(StonecuttingRecipe recipe) {
        NamespacedKey namespacedkey = (NamespacedKey) namespace.get(recipe.toString());
        if (namespacedkey == null) {
            System.out.println("It's invalid StonecuttingRecipe!");
            return;
        }
        Bukkit.removeRecipe(namespacedkey);
    }
}
