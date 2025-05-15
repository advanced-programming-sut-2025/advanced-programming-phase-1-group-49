package com.project.Models.Houses;

public class GreenHouse implements Building {
    private final String id;

    public GreenHouse(int id) {
        this.id = "GreenHouse" + id;
    }

    // Override

    @Override
    public String getID() {
        return id;
    }

    @Override
    public String tooString() {
        return "G";
    }

    // getter

    public int getGreenHouseX() {
        return 2;
    }

    public int getGreenHouseY() {
        return 2;
    }

    public int getGreenHouseLength() {
        return 9;
    }

    public int getGreenHouseWidth() {
        return 4;
    }
}
