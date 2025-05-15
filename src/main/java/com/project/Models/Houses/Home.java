package com.project.Models.Houses;

public class Home implements Building {
    private final String id;

    public Home(int id) {
        this.id = "Home" + id;
    }

    // Override

    @Override
    public String getID() {
        return id;
    }

    @Override
    public String tooString() {
        return "H";
    }

    // getter

    public int getHomeX() {
        return 1;
    }

    public int getHomeLength() {
        return 4;
    }

    public int getHomeY() {
        return 80;
    }

    public int getHomeWidth() {
        return 8;
    }
}
