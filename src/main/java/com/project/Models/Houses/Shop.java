package com.project.Models.Houses;

import com.project.Models.Inventory;

public class Shop implements Building {
    private final Inventory inventory = new Inventory();

    public Inventory getInventory() {
        return inventory;
    }

    @Override
    public String getID() {
        return "";
    }

    @Override
    public String tooString() {
        return "";
    }
}
