package com.project.Models.Houses;

public class Home implements Building {
    private final String idString;
    private final int id;

    public Home(int id) {
        if (id >= 4 || id < 0)
            throw new IllegalArgumentException();
        this.idString = "Home" + id;
        this.id = id;
    }

    // Override

    @Override
    public String getID() {
        return idString;
    }

    @Override
    public String tooString() {
        return YELLOW_BG + BLACK_TEXT + "H" + RESET;
    }

    // getter

    public int getHomeX() {
        return 1;
    }

    public int getHomeY() {
        return 80;
    }

    public int getHomeLength() {
        return 4;
    }

    public int getHomeWidth() {
        return 8;
    }
}
