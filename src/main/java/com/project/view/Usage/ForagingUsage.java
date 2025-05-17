package com.project.view.Usage;

import com.project.Controllers.ForagingController;
import com.project.Controllers.ToolController;
import com.project.Models.Enums.Commands.ForagingCommands;
import com.project.Models.Enums.Commands.ToolCommands;
import com.project.view.AppMenu;

import java.util.Scanner;
import java.util.regex.Matcher;

public class ForagingUsage implements AppMenu {
    ForagingController controller;
    private boolean printMenuInfo = false;

    @Override
    public void check(Scanner scanner) {
        if (printMenuInfo) {
            System.out.println("""
                    >>> Tool Commands:
                    - info
                    - craftinfo -n <craft_name>
                    - plant -s <seed> -d <direction>
                    - exit""");
            printMenuInfo = !printMenuInfo;
        }

        String command = scanner.nextLine();
        Matcher matcher;

        if ((matcher = ForagingCommands.RandomInfo.getMatcher(command)).find()) {
            ForagingController.randomCrop(matcher);
        } else if ((matcher = ForagingCommands.CraftInfo.getMatcher(command)).find()) {
            ForagingController.craftInfo(matcher);
        } else if ((matcher = ForagingCommands.Plant.getMatcher(command)).find()) {
            ForagingController.plant(matcher);
        }
    }
}
