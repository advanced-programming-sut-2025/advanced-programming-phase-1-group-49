package com.project.Models.Map;

public interface GameObject {
    String getID();

    String tooString();

    // Reset
    String RESET = "\u001B[0m";

    // Foreground (text) colors
    String BLACK_TEXT = "\u001B[30m";
    String RED_TEXT = "\u001B[31m";
    String GREEN_TEXT = "\u001B[32m";
    String YELLOW_TEXT = "\u001B[33m";
    String BLUE_TEXT = "\u001B[34m";
    String PURPLE_TEXT = "\u001B[35m";
    String CYAN_TEXT = "\u001B[36m";
    String WHITE_TEXT = "\u001B[37m";
    String BRIGHT_YELLOW_TEXT = "\u001B[93m";

    // Background colors
    String BLACK_BG = "\u001B[40m";
    String RED_BG = "\u001B[41m";
    String GREEN_BG = "\u001B[42m";
    String YELLOW_BG = "\u001B[43m";
    String BLUE_BG = "\u001B[44m";
    String PURPLE_BG = "\u001B[45m";
    String CYAN_BG = "\u001B[46m";
    String WHITE_BG = "\u001B[47m";
    String BRIGHT_YELLOW_BG = "\u001B[103m";
}
