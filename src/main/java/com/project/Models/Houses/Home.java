package com.project.Models.Houses;

public class Home implements Building {
    private final int homeX = 1;
    private final int homeLength = 4;
    private final int homeY = 80;
    private final int homeWidth = 8;

    @Override
    public String getID() {
        return "Home";
    }

    @Override
    public String tooString() {
        return "H";
    }

    public int getHomeX() {
        return homeX;
    }

    public int getHomeLength() {
        return homeLength;
    }

    public int getHomeY() {
        return homeY;
    }

    public int getHomeWidth() {
        return homeWidth;
    }
}
