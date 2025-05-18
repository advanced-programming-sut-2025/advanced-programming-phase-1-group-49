package com.project.Controllers;

import com.project.Builders.BuilderEnums.CraftingBuilder;
import com.project.Models.App;
import com.project.Models.Item.Crafting;
import com.project.Models.Item.Item;
import com.project.Models.Item.Machine;

import java.util.ArrayList;
import java.util.Map;
import java.util.regex.Matcher;

public class CheatingController {

    public static void addItem(Matcher matcher) {
        Item item = null;
        for (Item item1 : App.getGame().getMainPlayer().getInventory().getItems()) {
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
}
