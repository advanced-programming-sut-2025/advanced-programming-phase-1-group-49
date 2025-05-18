package com.project.view.Usage;

import com.project.Controllers.CookingController;
import com.project.Controllers.CraftingController;
import com.project.Controllers.ForagingController;
import com.project.Models.Enums.Commands.CookingCommands;
import com.project.Models.Enums.Commands.CraftingCommands;
import com.project.view.AppMenu;

import java.util.Scanner;
import java.util.regex.Matcher;

public class CookingUsage implements AppMenu {
    ForagingController controller;
    private boolean printMenuInfo = 1 < 0;

    @Override
    public void check(Scanner scanner) {
        if (printMenuInfo) {
            System.out.println("""
                    >>> Crafting Commands:
                    - cooking show recipes
                    - cooking prepare <recipe_name>
                    - eat <food_name>
                    - exit""");
            printMenuInfo = !printMenuInfo;
        }

        String command = scanner.nextLine();
        Matcher matcher;

        if ((matcher = CookingCommands.ShowRecipes.getMatcher(command)).find()) {
            CraftingController.showRecipes(matcher);
        }
        else if ((matcher = CookingCommands.Cook.getMatcher(command)).find()) {
            CraftingController.craft(matcher);
        }
        else if ((matcher = CookingCommands.Eat.getMatcher(command)).find()) {
            CookingController.Eat(matcher);
        }
    }
}