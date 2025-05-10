package com.project.view;

import com.project.Controllers.GameMenuController;
import com.project.Models.Enums.Menus.GameMenuCommands;

import java.util.Scanner;
import java.util.regex.Matcher;

public class GameMenu implements AppMenu {
    GameMenuController controller = new GameMenuController();
    private boolean printMenuInfo = true;

    @Override
    public void check(Scanner scanner) {
        if (printMenuInfo) {
            System.out.println("""
                    >>> Game Menu Commands:
                    - new game -u <username1> <username2> <username3>
                    - menu enter <menu>
                    - show current menu
                    - exit""");
            printMenuInfo = false;
        }

        String command = scanner.nextLine();
        Matcher matcher;
        if ((matcher = GameMenuCommands.newGame.getMatcher(command)).find())
            System.out.println(controller.newGame(matcher.group(1), matcher.group(2), matcher.group(3)));
        else if (controller.isCreateNewGame())
            System.out.println(controller.selectMap(command));
        else if (GameMenuCommands.exitGame.getMatcher(command).find())
            System.out.println(controller.exitGame());
        else if (GameMenuCommands.loadMap.getMatcher(command).find())
            System.out.println(controller.loadGame());
        else
            System.out.println("Invalid command");
    }
}
