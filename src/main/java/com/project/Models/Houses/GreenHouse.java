package com.project.Models.Houses;

public class GreenHouse implements Building {
    private final int greenHouseX = 2;
    private final int greenHouseY = 2;
    private final int greenHouseLength = 9;
    private final int greenHouseWidth = 4;

    @Override
    public String getID() {
        return "";
    }

    @Override
    public String tooString() {
        return "G";
    }

    public int getGreenHouseX() {
        return greenHouseX;
    }

    public int getGreenHouseY() {
        return greenHouseY;
    }

    public int getGreenHouseLength() {
        return greenHouseLength;
    }

    public int getGreenHouseWidth() {
        return greenHouseWidth;
    }
}
