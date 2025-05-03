package com.project.Models.Houses;

import com.project.Models.inventory;

public class Shop implements Building {
    private final inventory inventory = new inventory();

    public inventory getInventory() {
        return inventory;
    }
}
