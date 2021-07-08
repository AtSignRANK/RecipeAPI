/*
 * Recipe API
 * Copyright (C) by At Sign RANK
 * Just for my plugin comfortable
 * This is my API! You can use when you want to use!
 * Developing API. Please Report Bug!
 */

package io.github.api.recipeapi;

import org.bukkit.Bukkit;
import org.bukkit.NamespacedKey;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;

import java.io.File;

public class Recipe {
    File file = new File("RecipeData/data.yml");
    FileConfiguration namespace = YamlConfiguration.loadConfiguration(file);

    public void addRecipe(ShapedRecipe recipe) {
        var varNumber = namespace.get("number");
        if (!(varNumber instanceof Integer)) {
            System.out.println("RecipeLoadException");
            return;
        }
        int number = (int) varNumber + 1;
        NamespacedKey namespacedkey = recipe.getKey();
        Bukkit.addRecipe(recipe);
        namespace.set(recipe.toString(), namespacedkey);
        namespace.set(recipe.toString(), number);
        namespace.set("" + number, recipe);
    }

    public void addRecipe(ShapelessRecipe recipe) {
        var varNumber = namespace.get("number");
        if (!(varNumber instanceof Integer)) {
            System.out.println("RecipeLoadException");
            return;
        }
        int number = (int) varNumber + 1;
        NamespacedKey namespacedkey = recipe.getKey();
        Bukkit.addRecipe(recipe);
        namespace.set(recipe.toString(), namespacedkey);
        namespace.set(recipe.toString(), number);
        namespace.set("" + number, recipe);
    }

    public void removeRecipe(ShapedRecipe recipe) {
        NamespacedKey namespacedkey = (NamespacedKey) namespace.get(recipe.toString());
        if (namespacedkey == null) {
            System.out.println("It's invalid ShapedRecipe!");
            return;
        }
        Bukkit.removeRecipe(namespacedkey);
    }

    public void removeRecipe(ShapelessRecipe recipe) {
        NamespacedKey namespacedkey = (NamespacedKey) namespace.get(recipe.toString());
        if (namespacedkey == null) {
            System.out.println("It's invalid ShapedRecipe!");
            return;
        }
        Bukkit.removeRecipe(namespacedkey);
    }

    public void loadRecipes() {
        var varNumber = namespace.get("number");
        if (!(varNumber instanceof Integer)) {
            System.out.println("RecipeLoadException");
            return;
        }
        int number = (int) varNumber + 1;
        for (int i = 1; i <= number; i++) {
            org.bukkit.inventory.Recipe recipe = (org.bukkit.inventory.Recipe) namespace.get("" + i);
            Bukkit.addRecipe(recipe);
        }
    }
}