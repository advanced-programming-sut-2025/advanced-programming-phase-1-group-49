package com.project.Models.Enums.Commands;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum CheatCodes implements Commands {
    AddItems("^cheat\\s+add\\s+item\\s+-n\\s+(.+)\\s+-c\\s+(\\d+)$"),
    RandomMachine("^cheat\\s+random\\s+machines$"),
    useMachine("^use\\s+machine\\s+-m\\s+(.+)$"),
    RandomAnimal("^cheat\\s+random\\s+animal$"),
    ;

    public final String pattern;

    CheatCodes(String pattern) {
        this.pattern = pattern;
    }

    @Override
    public Matcher getMatcher(String input) {
        return Pattern.compile(pattern).matcher(input);
    }
}
