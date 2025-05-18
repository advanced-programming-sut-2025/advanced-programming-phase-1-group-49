package com.project.Models.Houses;

import com.project.Models.Inventory;

public class Shop implements Building {
    private final Inventory inventory = new Inventory();
    private final int x;
    private final int y;
    private final int length;
    private final int width;
    private final int startTime;
    private final int endTime;

    public Shop(int x, int y, int length, int width, int startTime, int endTime) {
        this.x = x;
        this.y = y;
        this.startTime = startTime;
        this.endTime = endTime;
        this.length = length;
        this.width = width;
    }

    // getter

    public Inventory getInventory() {
        return inventory;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public int getStartTime() {
        return startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    // Override

    @Override
    public String getID() {
        return "";
    }

    @Override
    public String tooString() {
        return YELLOW_BG + "S" + RESET;
    }
}
