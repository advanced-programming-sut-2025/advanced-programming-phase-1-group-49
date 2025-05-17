package com.project.Models.Enums.Commands;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum ForagingCommands implements Commands {
    RandomInfo("^info\\s+$"),
    CraftInfo("^craftinfo\\s+-n\\s+([a-zA-Z0-9_-]+)$"),
    Plant("^plant\\s+-s\\s+([a-zA-Z0-9_-]+)\\s+-d\\s+([a-zA-Z0-9_-]+)$")

    ;
    private final String pattern;

    ForagingCommands(String pattern) {
        this.pattern = pattern;
    }

    @Override
    public Matcher getMatcher(String input) {
        return Pattern.compile(pattern).matcher(input);
    }
}
