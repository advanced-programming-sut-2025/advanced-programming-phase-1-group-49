package com.project.Models.Enums;

import com.project.Models.Map.GameObject;

public enum Block implements GameObject {
    basic(" "),
    water("\u001B[34m█\u001B[0m"),
    home("\u001B[32mH\u001B[0m"),
    homeWall("\u001B[31m|\u001B[0m"),
    greenhouse("\u001B[32mG\u001B[0m"),
    greenhouseWall("\u001B[31m|\u001B[0m"),
    rock("R");

    private final String character;

    Block(String character) {
        this.character = character;
    }

    @Override
    public String tooString() {
        return character;
    }
}