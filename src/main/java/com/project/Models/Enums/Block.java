package com.project.Models.Enums;

public enum Block {
    basic(" ", "basic"),
    water("\u001B[44m" + "\u001B[30m" + "L" + "\u001B[0m", "water"),
    dust("\u001B[103m" + " ", "dust"),
    rock("R", "rock"),
    ;

    private final String character;
    private final String id;

    Block(String character, String id) {
        this.character = character;
        this.id = id;
    }

    public String getID() {
        return id;
    }

    public String tooString() {
        return character;
    }
}