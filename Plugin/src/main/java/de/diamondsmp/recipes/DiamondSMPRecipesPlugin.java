package de.diamondsmp.recipes;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Recipe;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class DiamondSMPRecipesPlugin extends JavaPlugin {
    private static final Set<String> DISABLED_RESULTS = new HashSet<>(Arrays.asList(
            "NETHERITE_AXE",
            "NETHERITE_SWORD",
            "NETHERITE_SPEAR",
            "NETHERITE_HELMET",
            "NETHERITE_CHESTPLATE",
            "NETHERITE_LEGGINGS",
            "NETHERITE_BOOTS"
    ));

    @Override
    public void onEnable() {
        int removed = removeDisabledNetheriteRecipes();
        getLogger().info("Disabled " + removed + " netherite smithing recipe(s).");
    }

    private int removeDisabledNetheriteRecipes() {
        int removed = 0;
        Iterator<Recipe> recipes = Bukkit.recipeIterator();

        while (recipes.hasNext()) {
            Recipe recipe = recipes.next();
            if (isSmithingRecipe(recipe) && isDisabledResult(recipe)) {
                recipes.remove();
                removed++;
            }
        }

        return removed;
    }

    private boolean isSmithingRecipe(Recipe recipe) {
        Class<?> type = recipe.getClass();
        while (type != null) {
            if (type.getSimpleName().contains("Smithing")) {
                return true;
            }
            type = type.getSuperclass();
        }
        return false;
    }

    private boolean isDisabledResult(Recipe recipe) {
        return DISABLED_RESULTS.contains(recipe.getResult().getType().name());
    }
}
