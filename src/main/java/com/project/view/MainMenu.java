package com.project.view;

import com.project.Controllers.MainMenuController;
import com.project.Models.App;
import com.project.Models.Enums.Menu;
import com.project.Models.Enums.Menus.MainMenuCommands;

import java.util.Scanner;
import java.util.regex.Matcher;

public class MainMenu implements AppMenu {
    private final MainMenuController controller = new MainMenuController();
    private boolean printMenuInfo = true;

    @Override
    public void check(Scanner scanner) {
        if (printMenuInfo) {
            System.out.println("""
                    >>> Main Menu :
                    - logout
                    - menu enter <menu>
                    game menu, tool, foraging, crafting""");
            printMenuInfo = false;
        }
        String command = scanner.nextLine();
        Matcher matcher;
        if (MainMenuCommands.logout.getMatcher(command).find()) {
            System.out.println(controller.logout());
            printMenuInfo = true;
        } else if ((matcher = MainMenuCommands.switchMenu.getMatcher(command)).find()) {
            System.out.print(controller.switchMenu(matcher.group(1)));
            printMenuInfo = true;
        } else if (MainMenuCommands.craftingMenu.getMatcher(command).find())
            App.setCurrentMenu(Menu.crafting);
        else if (MainMenuCommands.foragingMenu.getMatcher(command).find())
            App.setCurrentMenu(Menu.foraging);
        else if (MainMenuCommands.toolsMenu.getMatcher(command).find())
            App.setCurrentMenu(Menu.tool);
        else if (MainMenuCommands.cookingMenu.getMatcher(command).find())
            App.setCurrentMenu(Menu.cookingMenu);
        else if (MainMenuCommands.cheatingMenu.getMatcher(command).find())
            App.setCurrentMenu(Menu.cheating);
        else
            System.out.println("Invalid command");
    }
}
