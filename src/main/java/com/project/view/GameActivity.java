package com.project.view;

import com.project.Controllers.PlayerController.ActivityController;
import com.project.Models.Enums.Menus.GameCommands;

import java.util.Scanner;
import java.util.regex.Matcher;

public class GameActivity implements AppMenu {
    ActivityController controller = new ActivityController();
    private boolean printMenuInfo = true;

    @Override
    public void check(Scanner scanner) {
        if (printMenuInfo) {
            System.out.println("""
                    >>> Game Commands:
                    - walk
                    - print map
                    - game info
                    - exit""");
            printMenuInfo = false;
            controller.initialize();
        }

        String command = scanner.nextLine();
        Matcher matcher;

        if ((matcher = GameCommands.walk.getMatcher(command)).find())
            System.out.println(controller.walk(matcher.group(1), matcher.group(2)));
        else if (GameCommands.printMap.getMatcher(command).find())
            controller.printMap();
        else if (GameCommands.gameInfo.getMatcher(command).find())
            controller.gameInfo();
        else if (GameCommands.exitGame.getMatcher(command).find())
            System.out.println(controller.exit());
        else
            System.out.println("Invalid command");
    }
}
