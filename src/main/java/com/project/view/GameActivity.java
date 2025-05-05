package com.project.view;

import com.project.Controllers.PlayerController.ActivityController;
import com.project.Models.Enums.GameCommands;

import java.util.Scanner;
import java.util.regex.Matcher;

public class GameActivity implements AppMenu {
    ActivityController controller = new ActivityController();

    @Override
    public void check(Scanner scanner) {
        String command = scanner.nextLine();
        Matcher matcher;

        if ((matcher = GameCommands.walk.getMatcher(command)).find())
            System.out.println(controller.walk(matcher.group(1), matcher.group(2)));
        else if (GameCommands.printMap.getMatcher(command).find())
            controller.printMap();
        else
            System.out.println("Invalid command");
    }
}
