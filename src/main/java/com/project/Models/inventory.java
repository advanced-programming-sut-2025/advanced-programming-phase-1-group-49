package com.project.Models;

import com.project.Models.Item.Item;
import com.project.Models.Tools.Tool;

import java.util.ArrayList;

public class inventory {
    private final ArrayList<Item> items = new ArrayList<>();
    private final ArrayList<Integer> itemQuantity = new ArrayList<>();
    private final ArrayList<Tool> tools = new ArrayList<>();
    private final ArrayList<Integer> toolQuantity = new ArrayList<>();

    // getter

    public ArrayList<Tool> getTools() {
        return tools;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public int getQuantity(Item item) {
        if (!items.contains(item))
            return itemQuantity.get(items.indexOf(item));
        return 0;
    }

    public int getQuantity(Tool tool) {
        if (!tools.contains(tool))
            return toolQuantity.get(tools.indexOf(tool));
        return 0;
    }

    // add

    public void add(Tool tool, int quantity) {
        if (!tools.contains(tool)) {
            tools.add(tool);
            toolQuantity.add(quantity);
        } else
            toolQuantity.set(tools.indexOf(tool), quantity);
    }

    public void add(Item item, int quantity) {
        if (!items.contains(item)) {
            items.add(item);
            itemQuantity.add(quantity);
        } else
            itemQuantity.set(items.indexOf(item), quantity);
    }
}
