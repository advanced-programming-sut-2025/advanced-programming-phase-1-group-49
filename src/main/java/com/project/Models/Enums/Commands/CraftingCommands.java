package com.project.Models.Enums.Commands;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum CraftingCommands implements Commands {
    ShowRecipes("crafting\\s+show\\s+recipes"),
    Craft("^crafting\\s+craft\\s+([a-zA-Z0-9_-]+)$"),
    Place("^place\\s+item\\s+-n\\s+([a-zA-Z0-9_-]+)\\s+-d\\s+([a-zA-Z0-9_-]+)$")
    ;

    public final String pattern;

    CraftingCommands(String pattern) {
        this.pattern = pattern;
    }

    @Override
    public Matcher getMatcher(String input) {
        return Pattern.compile(pattern).matcher(input);
    }
}
