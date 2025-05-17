package com.project.Models.Enums;

public enum Directions {
    Up(0, -1, "up"),
    Down(0, 1, "down"),
    Left(-1, 0, "left"),
    Right(1, 0, "right"),
    UpLeft(-1, -1, "upleft"),
    UpRight(1, -1, "upright"),
    DownLeft(-1, 1, "downleft"),
    DownRight(1, 1, "downright"),;

    public final int x, y;
    public final String direction;

    Directions(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }
}
