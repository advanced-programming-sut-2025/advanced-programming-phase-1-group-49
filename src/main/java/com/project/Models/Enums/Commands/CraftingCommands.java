package com.project.Models.Enums.Commands;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum CraftingCommands implements Commands {
    ShowRecipes("crafting\\s+show\\s+recipes");

    public final String pattern;

    CraftingCommands(String pattern) {
        this.pattern = pattern;
    }

    @Override
    public Matcher getMatcher(String input) {
        return Pattern.compile(pattern).matcher(input);
    }
}
