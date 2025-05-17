package com.project.Models.Houses;

public class Home implements Building {
    private final String idString;
    private final int[][] homePositions = new int[][]{{1, 80}, {1, 220}, {50, 80}, {50, 220}};
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
        return homePositions[id][0];
    }

    public int getHomeY() {
        return homePositions[id][0];
    }

    public int getHomeLength() {
        return 4;
    }

    public int getHomeWidth() {
        return 8;
    }
}
