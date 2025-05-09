package com.project.view;

import com.project.Controllers.MainMenuController;
import com.project.Models.Enums.MainMenuCommands;
import com.project.Models.Result;

import java.util.Scanner;
import java.util.regex.Matcher;

public class MainMenu implements AppMenu {
    private final MainMenuController controller = new MainMenuController();
    private boolean printMenuInfo = true;

    @Override
    public void check(Scanner scanner) {
        if (printMenuInfo) {
            System.out.println("""
                    >>> Main Menu :
                    - logout
                    - menu enter <menu>
                    """);
            printMenuInfo = false;
        }
        String command = scanner.nextLine();
        Matcher matcher;
        if (MainMenuCommands.logout.getMatcher(command).find())
            System.out.println(controller.logout());
        else if ((matcher = MainMenuCommands.switchMenu.getMatcher(command)).find()) {
            Result temp = controller.switchMenu(matcher.group(1));
            System.out.print(temp);
            printMenuInfo = temp.isSuccessfully();
        } else
            System.out.println("Invalid command");
    }
}
