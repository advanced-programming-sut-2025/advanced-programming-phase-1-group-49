package com.project.Models.Enums;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum LoginMenuCommands implements Commands {
    login("^\\s*login\\s+-u\\s+(?<username>\\S*)\\s+-p\\s+(?<password>\\S*)" +
            "((\\s+-stay logged in)?)\\s*$"),
    switchMenu("^\\s*menu\\s+enter\\s+(?<menu>RegisterMenu)\\s*$"),
    ShowCurrentMenu("^\\s*show\\s+current\\s+menu\\s*$"),
    exit("^\\s*exit\\s*$"),
    forgetPassword("^\\s*forget\\s+password\\s+-u\\s+(?<username>\\S*)\\s*$"),
    answer("^\\s*answer\\s+-a\\s+(?<answer>.*)$"),
    ;

    private final String pattern;

    LoginMenuCommands(String pattern) {
        this.pattern = pattern;
    }

    @Override
    public Matcher getMatcher(String input) {
        return Pattern.compile(pattern).matcher(input);
    }
}
