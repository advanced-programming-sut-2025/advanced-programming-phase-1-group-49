package com.project.Models.Enums;


public enum Block {
    basic(" ", "basic"),
    water("\u001B[34m█\u001B[0m", "water"),
    home("\u001B[32mH\u001B[0m", "home"),
    homeWall("\u001B[31m|\u001B[0m", "homeWall"),
    greenhouse("\u001B[32mG\u001B[0m", "greenhouse"),
    greenhouseWall("\u001B[31m|\u001B[0m", "greenhouseWall"),
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