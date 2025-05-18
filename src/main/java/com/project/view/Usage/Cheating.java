package com.project.view.Usage;

import com.project.Controllers.CheatingController;
import com.project.Controllers.CraftingController;
import com.project.Controllers.ForagingController;
import com.project.Models.Enums.Commands.CheatCodes;
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
                    - cheat add item -n <item_name> -c <count>
                    - cheat random machines
                    - use machine -m <machine-name>
                    - creat random animal
                    - exit""");
            printMenuInfo = !printMenuInfo;
        }

        String command = scanner.nextLine();
        Matcher matcher;

        if ((matcher = CheatCodes.AddItems.getMatcher(command)).find()) {
            CheatingController.addItem(matcher);
        }
        else if ((matcher = CheatCodes.RandomMachine.getMatcher(command)).find()) {
            CheatingController.randomMachines(matcher);
        }
        else if ((matcher = CheatCodes.RandomMachine.getMatcher(command)).find()) {
            CheatingController.useMachine(matcher);
        }
        else if ((matcher = CheatCodes.RandomAnimal.getMatcher(command)).find()) {
            CheatingController.randomAnimal(matcher);
        }
    }
}
