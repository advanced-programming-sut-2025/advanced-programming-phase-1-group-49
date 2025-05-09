package com.project.Models.Enums;

import com.project.Models.Map.GameObject;

public enum Block implements GameObject {
    basic,
    water,
    home,
    homeWall,
    greenhouse,
    greenhouseWall,
    rock,
    ;

    @Override
    public String tooString() {
        return "";
    }
}