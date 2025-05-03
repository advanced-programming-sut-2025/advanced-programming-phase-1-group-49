package com.project.Models.Enums;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum GameCommands implements Commands {
    walk("^\\s*walk\\s+-l\\s+<\\s*([0-9]+)\\s*,\\s*([0-9]+)\\s*>\\s*$"),
    gameInfo("^\\s*game\\s+info\\s*$"),
    printMap("^\\s*print\\s+map\\s*$");

    private final String pattern;

    GameCommands(String pattern) {
        this.pattern = pattern;
    }

    @Override
    public Matcher getMatcher(String input) {
        return Pattern.compile(pattern).matcher(input);
    }
}
