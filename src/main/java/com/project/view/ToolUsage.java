package com.project.view;

import com.project.Controllers.ToolController;
import com.project.Models.Enums.Commands.ToolCommands;

import java.util.Scanner;
import java.util.regex.Matcher;

public class ToolUsage implements AppMenu {
    ToolController controller;
    private boolean printMenuInfo = true;

    @Override
    public void check(Scanner scanner) {
        if (printMenuInfo) {
            System.out.println("""
                    >>> Tool Commands:
                    - tools equip <tool_name>
                    - tools show current
                    - tools show available
                    -tools upgrade <tool_name>
                    - tools tools use -d <direction>
                    - exit""");
            printMenuInfo = !printMenuInfo;
        }

        String command = scanner.nextLine();
        Matcher matcher;

        if ((matcher = ToolCommands.ToolsEquip.getMatcher(command)).find()) {

        }
    }
}
