package com.project.Controllers;

import com.project.Builders.BuilderEnums.CraftingBuilder;
import com.project.Compositors.Ingredients;
import com.project.Models.App;
import com.project.Models.Item.Item;

import java.util.ArrayList;
import java.util.Map;
import java.util.regex.Matcher;

public class CraftingController {
    public static void showRecipes(Matcher matcher) {
        for (Ingredients recipe : App.getGame().getMainPlayer().getRecipes()) {
            System.out.println(recipe.getIngredients() + " ingredients:");
            for (int i = 0; i < recipe.getIngredients().size(); i++) {
                Map.Entry<String, Integer> firstEntry = recipe.getIngredients().entrySet().iterator().next();
                String key = firstEntry.getKey();
                Integer value = firstEntry.getValue();
                System.out.println(key + " x " + value);
            }
            System.out.println();
        }
    }

    public static void craft(Matcher matcher) {
        Map<String, Integer> ingredients = null;
        Ingredients myRecipe = null;
        for (Ingredients recipe : App.getGame().getMainPlayer().getRecipes()) {
            if (matcher.group(1).equals(recipe.getName())) {
                ingredients = recipe.getIngredients();
                myRecipe = recipe;
                break;
            }
        }
        if (ingredients == null) {
            System.out.println("Not found");
            return;
        }

        ArrayList<Integer> items = new ArrayList<>();
        for (int i = 0; i < ingredients.size(); i++) {
            boolean found = false;
            Map.Entry<String, Integer> firstEntry = ingredients.entrySet().iterator().next();
            String key = firstEntry.getKey();
            Integer value = firstEntry.getValue();

            int j = -1;
            for (Item item : App.getGame().getMainPlayer().getInventory().getItems()) {
                j++;
                if (item.getName().equals(key)) {
                    if (value < App.getGame().getMainPlayer().getInventory().getQuantity(item)) {
                        System.out.println("Not enough " + key + " in inventory!");
                        return;
                    }
                    items.add(j);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Not found in inventory");
                return;
            }
        }

        for (int i = 0; i < ingredients.size(); i++) {
            boolean found = false;
            Map.Entry<String, Integer> firstEntry = ingredients.entrySet().iterator().next();
            String key = firstEntry.getKey();
            Integer value = firstEntry.getValue();

            Item item = App.getGame().getMainPlayer().getInventory().getItems().get(items.get(i));
            App.getGame().getMainPlayer().getInventory().add(item, value);
        }

        for (CraftingBuilder craftingBuilder : CraftingBuilder.values()) {
            String name = craftingBuilder.crafting.toString();
            if (myRecipe.getName().equals(name)) {
                App.getGame().getMainPlayer().getInventory().add(craftingBuilder.crafting, 1);
                System.out.println("Added one " + name + " to inventory!");
                return;
            }
        }

        System.out.println("the name in recipes is not equal to the name in crafting builder enum!");
    }
}
