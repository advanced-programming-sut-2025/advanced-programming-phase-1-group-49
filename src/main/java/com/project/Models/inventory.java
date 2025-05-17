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

    //remove

    public void removeTool(int i) {
        toolQuantity.set(i, toolQuantity.get(i) - 1);
    }

    public void removeItem(int i) {
        itemQuantity.set(i, itemQuantity.get(i) - 1);
    }

    //change

    public void change(Tool newTool, int i) {
        tools.set(i, newTool);
    }

    // search

    public Item searchItem(String itemName) {
        for (Item item : items) {
            if (item.getName().equals(itemName))
                return item;
        }
        return null;
    }

    public Tool searchTool(String toolName) {
        for (Tool tool : tools) {
            if (tool.getName().equals(toolName))
                return tool;
        }
        return null;
    }

}
