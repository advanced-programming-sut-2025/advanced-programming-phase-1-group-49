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
        else if (GameCommands.nextTurn.getMatcher(command).find())
            System.out.println(controller.nextTurn());
        else if (GameCommands.time.getMatcher(command).find())
            System.out.println(controller.time());
        else if (GameCommands.date.getMatcher(command).find())
            System.out.println(controller.date());
        else if (GameCommands.dateTime.getMatcher(command).find())
            System.out.println(controller.dateTime());
        else if (GameCommands.day.getMatcher(command).find())
            System.out.println(controller.day());
        else if (GameCommands.season.getMatcher(command).find())
            System.out.println(controller.season());
        else if (GameCommands.weather.getMatcher(command).find())
            System.out.println(controller.weather());
        else if (GameCommands.weatherForecast.getMatcher(command).find())
            System.out.println(controller.weatherForecast());
        else if (GameCommands.greenHouse.getMatcher(command).find())
            System.out.println(controller.greenHouse());
        else if ((matcher = GameCommands.printMap.getMatcher(command)).find())
            System.out.println(controller.printMap(matcher.group(1), matcher.group(2), matcher.group(3)));
        else if (GameCommands.helpMap.getMatcher(command).find())
            System.out.println(controller.mapGuid());
        else if ((matcher = GameCommands.increaseDate.getMatcher(command)).find())
            System.out.println(controller.increaseTime(matcher.group(1)));
        else if ((matcher = GameCommands.increaseDate.getMatcher(command)).find())
            System.out.println(controller.increaseDate(matcher.group(1)));
        else if ((matcher = GameCommands.changeWeather.getMatcher(command)).find())
            System.out.println(controller.changeWeather(matcher.group(1)));
        else if (GameCommands.printAllMap.getMatcher(command).find())
            controller.printMap();
        else if (GameCommands.gameInfo.getMatcher(command).find())
            controller.gameInfo();
        else if (GameCommands.exitGame.getMatcher(command).find())
            System.out.println(controller.exit());
        else
            System.out.println("Invalid command");
    }
}
