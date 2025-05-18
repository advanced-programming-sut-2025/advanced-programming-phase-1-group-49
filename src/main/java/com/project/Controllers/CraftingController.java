package com.project.Controllers;

import com.project.Builders.BuilderEnums.CraftingBuilder;
import com.project.Compositors.Ingredients;
import com.project.Models.App;
import com.project.Models.Enums.Block;
import com.project.Models.Enums.Directions;
import com.project.Models.Item.Item;
import com.project.Models.Map.BlockWrapper;

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

    public static boolean place(Matcher matcher) {
        int x = App.getGame().getMainPlayer().getX();
        int y = App.getGame().getMainPlayer().getY();
        boolean valid = false;

        for (Directions direction : Directions.values()) {
            if (direction.direction.equals(matcher.group(2))) {
                x += direction.x;
                y += direction.y;
                valid = true;
                break;
            }
        }
        if (!valid) {
            System.out.println(
                    "Invalid direction: "
                            + matcher.group(2)
            );
            for (Directions direction : Directions.values()) {
                System.out.println("Valid directions: " + direction.direction);
            }
            return false;
        }
        valid = false;

        if (x < 0 || y < 0
                || x >= com.project.Models.Map.Map.getMapLength()
                || y >= com.project.Models.Map.Map.getMapWidth()
                || !App.getGame().getMap().getBlocks()[x][y]
                .get(App.getGame().getMap().getBlocks()[x][y].size())
                .equals(new BlockWrapper(Block.soil))
        ) {
            System.out.println("Incompatible blocks!");
            return false;
        }

        Item item = null;
        for (Item item1 : App.getGame().getMainPlayer().getInventory().getItems()) {
            if (item1.getName().equals(matcher.group(1))) {
                item = item1;
                valid = true;
            }
        }
        if (!valid) {
            System.out.println("Item not found!");
            return false;
        }

        App.getGame().getMainPlayer().getInventory().add(item, -1);
        App.getGame().getMap().getBlocks()[x][y].add(item);

        System.out.println("Added one " + item.getName() + " to the map!");

        return true;
    }
}
