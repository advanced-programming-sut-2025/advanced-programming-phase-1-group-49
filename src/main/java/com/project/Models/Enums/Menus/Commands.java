package com.project.Models.Enums.Menus;

import java.util.regex.Matcher;

public interface Commands {
    Matcher getMatcher(String input);
}
