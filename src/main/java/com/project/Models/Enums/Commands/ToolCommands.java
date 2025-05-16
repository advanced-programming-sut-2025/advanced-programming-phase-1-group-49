package com.project.Models.Enums.Commands;

import com.project.Models.Enums.Menus.Commands;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum ToolCommands implements Commands {
    ToolsEquip("^tools\\s+equip\\s+([a-zA-Z0-9_-]+)$"),
    ToolsShowCurrent("^tools\\s+show\\s+current$"),
    ToolsShowAvailable("^tools\\s+show\\s+available$"),
    ToolsUpgrade("^tools\\s+upgrade\\s+([a-zA-Z0-9_-]+)$"),
    ToolsDirection("^tools\\s+direction\\s+([a-zA-Z0-9_-]+)$"),

        ;
    private final String pattern;

    ToolCommands(String pattern) {
        this.pattern = pattern;
    }

    @Override
    public Matcher getMatcher(String input) {
        return Pattern.compile(pattern).matcher(input);
    }
}
