package com.project.Models.Enums;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum MainMenuCommands implements Commands {
    logout("^\\s*user\\s+logout\\s*$"),
    switchMenu("^\\s*menu\\s+enter\\s+(?<menu>GameMenu|ProfileMenu)\\s*$"),
    ShowCurrentMenu("^\\s*show\\s+current\\s+menu\\s*$"),
    exit("^\\s*exit\\s*$"),
    ;

    private final String pattern;

    MainMenuCommands(String pattern) {
        this.pattern = pattern;
    }

    @Override
    public Matcher getMatcher(String input) {
        return Pattern.compile(pattern).matcher(input);
    }
}
