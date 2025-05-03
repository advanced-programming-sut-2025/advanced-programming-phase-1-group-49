package com.project.view;

import java.util.ArrayList;
import java.util.Scanner;

public class AvatarMenu implements AppMenu {

    private ArrayList<String> options;
    private int currentOptionIndex = 0;

    @Override
    public void check(Scanner scanner) {
        options = new ArrayList<>();
        options.add("Option 1");
        options.add("Option 2");
        options.add("Option 3");
        options.add("Back");

        System.out.println("Avatar Menu - Use 'u' for up, 'd' for down, Enter to select");

        while (true) {
            displayCurrentOption();
            String input = scanner.nextLine().trim().toLowerCase();

            switch(input) {
                case "u": // up
                    currentOptionIndex = (currentOptionIndex - 1 + options.size()) % options.size();
                    break;
                case "d": // down
                    currentOptionIndex = (currentOptionIndex + 1) % options.size();
                    break;
                case "":
                    selectOption();
                    if (options.get(currentOptionIndex).equals("Back")) {
                        return;
                    }
                    break;
                default:
                    System.out.println("Invalid input. Use 'u'/'d' to navigate, Enter to select");
            }
        }
    }

    private void displayCurrentOption() {
        System.out.print("\nCurrent selection: " + options.get(currentOptionIndex) + "\n> ");
    }

    private void selectOption() {
        System.out.println("Selected: " + options.get(currentOptionIndex));
        // Add your selection logic here
    }
}