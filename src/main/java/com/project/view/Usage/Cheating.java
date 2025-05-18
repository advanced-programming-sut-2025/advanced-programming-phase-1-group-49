package com.project.view.Usage;

import com.project.Controllers.CraftingController;
import com.project.Controllers.ForagingController;
import com.project.Models.Enums.Commands.Commands;
import com.project.Models.Enums.Commands.CraftingCommands;
import com.project.view.AppMenu;

import java.util.Scanner;
import java.util.regex.Matcher;

public class Cheating implements AppMenu {
    ForagingController controller;
    private boolean printMenuInfo = 1 < 0;

    @Override
    public void check(Scanner scanner) {
        if (printMenuInfo) {
            System.out.println("""
                    >>> Crafting Commands:
                    - crafting show recipes
                    - crafting craft <item_name>
                    - place item -n <item_name> -d <direction>
                    - exit""");
            printMenuInfo = !printMenuInfo;
        }

        String command = scanner.nextLine();
        Matcher matcher;

        if ((matcher = CraftingCommands.ShowRecipes.getMatcher(command)).find()) {
            CraftingController.showRecipes(matcher);
        }
        else if ((matcher = CraftingCommands.Craft.getMatcher(command)).find()) {
            CraftingController.craft(matcher);
        }
        else if ((matcher = CraftingCommands.Place.getMatcher(command)).find()) {
            CraftingController.place(matcher);
        }
    }
}
