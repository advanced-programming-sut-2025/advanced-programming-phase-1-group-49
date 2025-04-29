package com.project.Models.Enums;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum GameMenuCommands {
    newGame("^\\s*game\\s+new\\s+-u\\s+(?<username1>\\S+)\\s+(?<username2>\\S+)\\s+(?<username3>\\S+)\\s*$"),
    selectMap("^\\s*game\\s+map\\s+(?<id>.*)\\s*$"),
    loadMap("^\\s*load\\s+game\\s*$"),
    exitGame("^\\s*exit\\s+game\\s*$"),
    nextTurn("^\\s*next\\s+turn\\s*$");

    private final String pattern;

    GameMenuCommands(String pattern) {
        this.pattern = pattern;
    }

    public Matcher getMatcher(String input) {
        return Pattern.compile(pattern).matcher(input);
    }
}
