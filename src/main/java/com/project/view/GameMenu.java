package com.project.view;

import com.project.Controllers.GameMenuController;
import com.project.Models.Enums.GameMenuCommands;

import java.util.Scanner;
import java.util.regex.Matcher;

public class GameMenu implements AppMenu {
    GameMenuController controller = new GameMenuController();

    @Override
    public void check(Scanner scanner) {
        String command = scanner.nextLine();
        Matcher matcher;
        if ((matcher = GameMenuCommands.newGame.getMatcher(command)).find()) {
            System.out.println(controller.newGame(matcher.group(1), matcher.group(2), matcher.group(3)));
        } else if ((matcher = GameMenuCommands.selectMap.getMatcher(command)).find()) {
            System.out.println(controller.selectMap(matcher.group(1)));
        } else
            System.out.println("Invalid command");
    }
}
