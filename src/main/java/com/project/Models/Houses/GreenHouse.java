package com.project.Models.Houses;

public class GreenHouse implements Building {
    private final String id;
    private boolean statement = false;

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
        if (statement)
            return GREEN_BG + RED_TEXT + "G" + RESET;
        else
            return RED_BG + BLACK_TEXT + "G" + RESET;
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

    //

    public void switchStatement() {
        statement = !statement;
    }
}
