package com.project.Models.Enums;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum RegisterMenuCommands implements Commands {
    register("^\\s*register\\s+-u\\s+(?<username>\\S+)\\s+-p\\s+(?<password>\\S+)\\s+(?<password_confirm>\\S+)\\s+-n\\s+(?<nickname>\\S+)\\s+-e\\s+(?<email>\\S+)\\s+-g\\s+(?<gender>\\S+)\\s*$"),
    USERNAME_PATTERN("^[a-zA-Z0-9-]{3,16}$"),
    PASSWORD_PATTERN("^(?=.*[?><,\"';:\\/|\\]\\[}{+=)(*&^%$#!])(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])[a-zA-Z0-9?><,\"';:\\/|\\]\\[}{+=)(*&^%$#!]{8,16}$"),
    EMAIL_PATTERN("^(?!.*\\.\\..*)[a-zA-Z0-9][a-zA-Z0-9._-]*[a-zA-Z0-9]@[a-zA-Z0-9][a-zA-Z0-9-]*[a-zA-Z0-9]" +
                  "(\\.ir|\\.com|\\.org)$"),
    GENDER_PATTERN("^female|male$"),
    switchMenu("^\\s*menu\\s+enter\\s+(?<menu>.\\S+)\\s*$"),
    ShowCurrentMenu("^\\s*show\\s+current\\s+menu\\s*$");

    private final String pattern;

    RegisterMenuCommands(String pattern) {
        this.pattern = pattern;
    }

    public Matcher getMatcher(String input) {
        return Pattern.compile(pattern).matcher(input);
    }
}
