package com.project.Models.Enums.Commands;

import java.util.regex.Matcher;

public interface Commands {
    Matcher getMatcher(String input);
}
