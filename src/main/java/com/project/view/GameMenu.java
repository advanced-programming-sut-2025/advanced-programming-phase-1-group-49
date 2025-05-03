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
        if ((matcher = GameMenuCommands.newGame.getMatcher(command)).find())
            System.out.println(controller.newGame(matcher.group(1), matcher.group(2), matcher.group(3)));
        else if (GameMenuCommands.printMap.getMatcher(command).find())
            controller.printMap();
        else if ((matcher = GameMenuCommands.selectMap.getMatcher(command)).find())
            System.out.println(controller.selectMap(matcher.group(1)));
        else if (GameMenuCommands.gameInfo.getMatcher(command).find())
            controller.gameInfo();
        else if (GameMenuCommands.nextTurn.getMatcher(command).find())
            System.out.println(controller.nextTurn());
        else if(GameMenuCommands.exitGame.getMatcher(command).find())
            System.out.println(controller.exitGame());
        else if (GameMenuCommands.loadMap.getMatcher(command).find())
            System.out.println(controller.loadGame());
        else
            System.out.println("Invalid command");
    }
}
