package com.project.Models.Enums.Commands;

import java.util.regex.Matcher;

public enum CookingCommands implements Commands {
    ShowRecipes("^cooking\\s+show\\s+recipes$"),
    Cook("^cooking\\s+prepare\\s+([a-zA-Z0-9_-]+)$"),
    Eat("^eat\\s+([a-zA-Z0-9_-]+)$"),
    ;

    public final String pattern;

    CookingCommands(String pattern) {
        this.pattern = pattern;
    }

    @Override
    public Matcher getMatcher(String input) {
        return null;
    }
}
