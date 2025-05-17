package com.project.view.Usage;

import com.project.Controllers.CraftingController;
import com.project.Controllers.ForagingController;
import com.project.Models.Enums.Commands.CraftingCommands;
import com.project.Models.Enums.Commands.ForagingCommands;
import com.project.view.AppMenu;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CraftingUsage implements AppMenu {
    ForagingController controller;
    private boolean printMenuInfo = false;

    @Override
    public void check(Scanner scanner) {
        if (printMenuInfo) {
            System.out.println("""
                    >>> Crafting Commands:
                    - crafting show recipes
                    - exit""");
            printMenuInfo = !printMenuInfo;
        }

        String command = scanner.nextLine();
        Matcher matcher;

        if ((matcher = CraftingCommands.ShowRecipes.getMatcher(command)).find()) {
            CraftingController.showRecipes(matcher);
        }
    }
}
