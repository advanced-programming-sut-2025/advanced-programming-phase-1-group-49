package com.project.Models.Enums;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum RegisterMenuCommands implements Commands {
    register("^(?!.*\\.\\..*)[a-zA-Z0-9][a-zA-Z0-9._-]*[a-zA-Z0-9]@[a-zA-Z0-9][a-zA-Z0-9-]*[a-zA-Z0-9]" +
            "(\\.ir|\\.com|\\.org)$"),
    USERNAME_PATTERN("^[a-zA-Z0-9-]{3,16}$"),
    NICKNAME_PATTERN("^[a-zA-Z0-9-]{3,16}$"),
    PASSWORD_PATTERN("^[a-zA-Z0-9?><,\\\"';:\\\\/|\\]\\[}{+=)(*&^%$#!]{3,16}$"),
    EMAIL_PATTERN("^(?!.*\\.\\..*)[a-zA-Z0-9][a-zA-Z0-9._-]*[a-zA-Z0-9]@[a-zA-Z0-9][a-zA-Z0-9-]*[a-zA-Z0-9]" +
            "(\\.ir|\\.com|\\.org)$"),
    GENDER_PATTERN("^female|male$"),
    ;

    private final String pattern;

    RegisterMenuCommands(String pattern) {
        this.pattern = pattern;
    }

    public Matcher getMatcher(String input) {
        return Pattern.compile(pattern).matcher(input);
    }
}
