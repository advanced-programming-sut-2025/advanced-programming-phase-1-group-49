package com.project.Controllers;

import com.project.Decorators.ToolDecorator;
import com.project.Models.App;
import com.project.Models.Tools.Tool;

import java.util.regex.Matcher;

public class ToolController {

    public static void equip(Matcher matcher) {
        int i = -1;
        for (Tool tool : App.getGame().getMainPlayer().getInventory().getTools()) {
            i++;
            if (App.getGame().getMainPlayer().getInventory().getQuantity(tool) < 1) {
                if (App.getGame().getMainPlayer().getInventory().getTools().get(
                        App.getGame().getMainPlayer().getInventory().getTools().size() - 1
                ).equals(tool)) {
                    System.out.println("⚠ Tool not found or not in inventory.");
                    return;
                }
                continue;
            }
            if (matcher.group(1).equalsIgnoreCase(tool.getName())) {
                App.getGame().getMainPlayer().setCurrentToolIndex(i);
                System.out.println("✅ Equipped tool: " + tool.getName());
                return;
            }
        }
        System.out.println("⚠ Tool not found or not in inventory.");
    }

    public static void showCurrent() {
        Tool current = App.getGame().getMainPlayer().getCurrentTool();
        if (current == null) {
            System.out.println("⚠ No tool is currently equipped.");
        } else {
            System.out.println("Current Tool: " + current.getName());
        }
    }

    public static void showAvailable(Matcher matcher) {
        boolean found = false;
        for (Tool tool : App.getGame().getMainPlayer().getInventory().getTools()) {
            if (App.getGame().getMainPlayer().getInventory().getQuantity(tool) < 1) {
                if (App.getGame().getMainPlayer().getInventory().getTools().get(
                        App.getGame().getMainPlayer().getInventory().getTools().size() - 1
                ).equals(tool)) {
                    System.out.println("⚠ Tool not found or not in inventory.");
                    return;
                }
                continue;
            }

            if (matcher.group(1).equalsIgnoreCase(tool.getName())) {
                found = true;
                if (tool.equals(App.getGame().getMainPlayer().getCurrentTool())) {
                    System.out.println("- " + tool.getName() + " (Current)");
                } else {
                    System.out.println("- " + tool.getName());
                }
            }
        }

        if (!found) {
            System.out.println("⚠ No matching tools found in inventory.");
        }
    }

    public static void upgrade(Matcher matcher) {
        Tool current = App.getGame().getMainPlayer().getCurrentTool();
        if (current == null) {
            System.out.println("⚠ No tool is currently equipped.");
            return;
        }
        Tool upgraded = new ToolDecorator(current).upgrade();
        App.getGame().getMainPlayer().resetCurrentTool(upgraded);
        System.out.println("✅ Tool upgraded to: " + upgraded.getName());
    }

    public static void use(Matcher matcher) {
        Tool current = App.getGame().getMainPlayer().getCurrentTool();
        if (current == null) {
            System.out.println("⚠ No tool is currently equipped.");
            return;
        }

        String direction = matcher.group(1).toLowerCase();
        boolean success = true; //I have to check the type of the tool and then use it  !!!!
        if (success) {
            System.out.println("✅ Used " + current.getName() + " to the " + direction + ".");
        } else {
            System.out.println("⚠ Cannot use " + current.getName() + " in direction: " + direction);
        }
    }
}
