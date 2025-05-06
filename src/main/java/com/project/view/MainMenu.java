package com.project.view;

import com.project.Controllers.MainMenuController;
import com.project.Models.Enums.MainMenuCommands;

import java.util.Scanner;
import java.util.regex.Matcher;

public class MainMenu implements AppMenu {
    private final MainMenuController controller = new MainMenuController();
    private boolean printMenuInfo = true;

    @Override
    public void check(Scanner scanner) {
        if (printMenuInfo) {
            printMenuInfo = false;
        }

        String command = scanner.nextLine();
        Matcher matcher;
        if (MainMenuCommands.logout.getMatcher(command).find())
            System.out.println(controller.logout());
        else
            System.out.println("Invalid command");
    }
}
