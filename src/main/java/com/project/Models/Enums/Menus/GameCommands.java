package com.project.Models.Enums.Menus;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum GameCommands implements Commands {
    nextTurn("^\\s*next\\s+turn\\s*$"),
    walk("^\\s*walk\\s+\\s*([0-9]+)\\s*([0-9]+)\\s*\\s*$"),
    exitGame("^\\s*exit\\s*$"),
    time("^\\s*time\\s*$"),
    date("^\\s*date\\s*$"),
    dateTime("^\\s*datetime\\s*$"),
    day("^\\s*day\\s*$"),
    season("^\\s*season\\s*$"),
    weather("^\\s*weather\\s*$"),
    weatherForecast("^\\s*weather\\s+forecast\\s*$"),
    greenHouse("^\\s*greenhouse\\s+build\\s*$"),
    printMap(""),
    helpMap(""),
    // cheat codes :
    increaseTime(""),
    increaseDate(""),
    changeWeather(""),
    thor(""),
    // for debugging :
    gameInfo("^\\s*game\\s+info\\s*$"),
    printAllMap("^\\s*print\\s+map\\s*$");

    private final String pattern;

    GameCommands(String pattern) {
        this.pattern = pattern;
    }

    @Override
    public Matcher getMatcher(String input) {
        return Pattern.compile(pattern).matcher(input);
    }
}
