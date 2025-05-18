package com.project.Controllers;

import com.project.Builders.BuilderEnums.CraftingBuilder;
import com.project.Builders.BuilderEnums.ToolBuilder;
import com.project.Directors.AnimalDirector;
import com.project.Models.App;
import com.project.Models.Item.Crafting;
import com.project.Models.Item.Item;
import com.project.Models.Item.Machine;
import com.project.Models.LivingBeings.Animal;
import com.project.Models.Map.Map;
import com.project.Models.Tools.Tool;

import java.util.ArrayList;
import java.util.regex.Matcher;

public class CheatingController {

    public static void addItem(Matcher matcher) {
        Tool item = null;
        for (ToolBuilder toolBuilder : ToolBuilder.values()) {
            Tool item1 = toolBuilder.getTool();
            if (item1.getName().equals(matcher.group(1))) {
                item = item1;
                break;
            }
        }
        if (item == null) {
            System.out.println("Item not found");
            return;
        }

        App.getGame().getMainPlayer().getInventory().add(item, Integer.parseInt(matcher.group(2)));
        System.out.println("Added " + matcher.group(2) + item.getName() + " to the inventory");
    }

    public static void randomMachines(Matcher matcher) {
        ArrayList<Machine> machines = new ArrayList<>();
        int i = -1;
        for (CraftingBuilder craftingBuilder : CraftingBuilder.values()) {
            Crafting crafting = craftingBuilder.crafting;
            if (crafting.getName().contains("Machine")) {
                i++;
                machines.add((Machine) crafting);
                System.out.println("Added " + crafting.getName() + " to the inventory.");
            }
            if (i > 1) {
                break;
            }
        }
        App.getGame().getMainPlayer().getInventory().getItems().addAll(machines);
    }

    public static void useMachine(Matcher matcher) {
        String name = matcher.group(1);
        Machine machine = null;
        for (Item item : App.getGame().getMainPlayer().getInventory().getItems()) {
            if (item.getName().equals(name)) {
                machine = (Machine) item;
                break;
            }
        }
        if (machine == null) {
            System.out.println("Machine not found");
            return;
        }

        for (int i = 0; i < machine.getProducts().size(); i++) {

        }
    }

    public static void randomAnimal(Matcher matcher) {
        for (int i = 0; i < 5; i++) {
            int x = (int) (Math.random() * 1000 % Map.getMapLength());
            int y = (int) (Math.random() * 1000 % Map.getMapWidth());
            Animal animal = (Animal) AnimalDirector.randomAnimal();
            App.getGame().getMap().getBlocks()[x][y].add(animal);
            System.out.println("Added one " + animal.getName() + " to x " + x + " y " + y);
        }
    }
}
