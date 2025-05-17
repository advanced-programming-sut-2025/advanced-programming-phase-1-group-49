package com.project.Controllers;

import com.project.Compositors.Ingredients;
import com.project.Compositors.Recipes;
import com.project.Models.App;
import com.project.Models.Enums.Commands.CraftingCommands;

import java.util.Map;
import java.util.regex.Matcher;

public class CraftingController {
    public static void showRecipes(Matcher matcher) {
        for (Ingredients recipe : App.getGame().getMainPlayer().getRecipes()) {
            System.out.println(recipe.getIngredients() + " ingredients:");
            for (int i = 0; i < recipe.getIngredients().size(); i++) {
                Map.Entry<String, Integer> firstEntry = recipe.getIngredients().entrySet().iterator().next();
                String key = firstEntry.getKey();
                Object value = firstEntry.getValue();
                System.out.println(key + " x " + value);
            }
            System.out.println();
        }
    }
}
