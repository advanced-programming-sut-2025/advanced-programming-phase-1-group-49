package com.project.Controllers;

import com.project.Builders.BuilderEnums.FishBuilder;
import com.project.Builders.BuilderEnums.ForagingCropBuilder;
import com.project.Builders.BuilderEnums.MineralBuilder;
import com.project.Decorators.ToolDecorator;
import com.project.Directors.ForagingDirector;
import com.project.Models.App;
import com.project.Models.Enums.Block;
import com.project.Models.Enums.Directions;
import com.project.Models.Enums.Season;
import com.project.Models.Enums.Skills;
import com.project.Models.Item.Foraging;
import com.project.Models.LivingBeings.Fish;
import com.project.Models.LivingBeings.Player;
import com.project.Models.Map.BlockWrapper;
import com.project.Models.Map.GameObject;
import com.project.Models.Map.Map;
import com.project.Models.Tools.Tool;

import java.util.ArrayList;
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
        Tool current = null;
        for (Tool tool : App.getGame().getMainPlayer().getInventory().getTools()) {
            if (tool.getName().equalsIgnoreCase(matcher.group(1))) {
                current = tool;
            }
        }
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

        String direction = matcher.group(1);

        boolean success = false; //I have to check the type of the tool and then use it  !!!!
        int x = App.getGame().getMainPlayer().getX();
        int y = App.getGame().getMainPlayer().getY();
        boolean valid = false;

        for (Directions direction0 : Directions.values()) {
            if (direction0.direction.equals(matcher.group(1))) {
                x += direction0.x;
                y += direction0.y;
                valid = true;
                break;
            }
        }
        if (!valid) {
            System.out.println(
                    "Invalid direction: "
                            + matcher.group(1)
            );
            for (Directions direction1 : Directions.values()) {
                System.out.println("Valid directions: " + direction1.direction);
            }
            return;
        }
        valid = false;

        if (x < 0 || y < 0 || x >= Map.getMapLength() || y >= Map.getMapWidth()
                || !App.getGame().getMap().getBlocks()[x][y]
                .get(App.getGame().getMap().getBlocks()[x][y].size())
                .equals(new BlockWrapper(Block.diggedSoil))
        ) {
            System.out.println("Incompatible blocks!");
            return;
        }

        if (current.isCutTree() && current.isDeleteBranches()) {
            success = useAxe(x, y);
        }
        else if (current.isFishing()) {
            success = usePF(x, y);
        }
//        else if ()

        usageStatus();
        if (success) {
            System.out.println("✅ Used " + current.getName() + " to the " + direction + ".");
        } else {
            if (!current.isWatering()) {
                App.getGame().getMainPlayer().increaseEnergy(
                        current.getComplement()
                );
            }
            System.out.println("⚠ Cannot use " + current.getName() + " in direction: " + direction);
        }
    }

    private static boolean useAxe(int x, int y) {
        boolean success = false;
        if ((App.getGame().getMap().getBlocks()[x][y]
                .get(App.getGame().getMap().getBlocks()[x][y].size() -1)
                instanceof Foraging) &&
                ((Foraging) App.getGame().getMap().getBlocks()[x][y]
                .get(App.getGame().getMap().getBlocks()[x][y].size() -1))
                .getName().toLowerCase().contains("tree")
        ) {
            App.getGame().getMainPlayer().getInventory().add(MineralBuilder.Wood.foraging, 5);
            System.out.println("Added a wood to the inventory.");
            success = true;
        }
        else if ((App.getGame().getMap().getBlocks()[x][y]
                .get(App.getGame().getMap().getBlocks()[x][y].size() -1)
                instanceof Foraging) &&
                ((Foraging) App.getGame().getMap().getBlocks()[x][y]
                .get(App.getGame().getMap().getBlocks()[x][y].size() -1))
                .getName().toLowerCase().contains("branch")
        ) {
            App.getGame().getMap().getBlocks()[x][y]
                    .remove(App.getGame().getMap().getBlocks()[x][y].size() -1);
            System.out.println("Removed branch from the map.");
            success = true;
        }
        return success;
    }

    private static boolean usePF(int x, int y) {
        boolean success = false;
        boolean fishAvailable = false;
        GameObject fish = App.getGame().getMap().getBlocks()[x][y]
                .get(App.getGame().getMap().getBlocks()[x][y].size() -1);
        Tool currentTool = App.getGame().getMainPlayer().getCurrentTool();

        if (fish instanceof Fish) {
            success = true;
        }
        else {
            System.out.println("No fish here!");
            return false;
        }
        Season currentSeason = App.getGame().getTime().getCurrentSeason();

        if (!((((Fish) fish).isSpring() && currentSeason.equals(Season.Spring))
                || (((Fish) fish).isSummer() && currentSeason.equals(Season.Summer))
                || (((Fish) fish).isFall() && currentSeason.equals(Season.Fall))
                || (((Fish) fish).isWinter() && currentSeason.equals(Season.Winter)))
        ) {
            System.out.println("The fish here is not available in this season.");
            return false;
        }
        else if ((App.getGame().getTime().getCurrentSeason().toString().equals("Spring")
            && currentTool.getFPLevel().level == 0
            && !fish.equals(FishBuilder.Sunfish))
            || (App.getGame().getTime().getCurrentSeason().toString().equals("Summer")
            && currentTool.getFPLevel().level == 0
            && !fish.equals(FishBuilder.Herring))
            || (App.getGame().getTime().getCurrentSeason().toString().equals("Fall")
            && currentTool.getFPLevel().level == 0
            && !fish.equals(FishBuilder.Salmon))
            || (App.getGame().getTime().getCurrentSeason().toString().equals("Winter")
            && currentTool.getFPLevel().level == 0
            && !fish.equals(FishBuilder.Perch))
        ) {
            System.out.println("You only can hunt the least valuable fish of the season.");
            return false;
        }

        App.getGame().getMainPlayer().getInventory().add((Fish)fish, 1);
        System.out.println("Added fish " + ((Fish) fish).getName() + " to the inventory.");

        return success;
    }

    private static boolean usageStatus() {
        Tool current = App.getGame().getMainPlayer().getCurrentTool();
        int usage = current.getEnergy();
        if (current.getFPLevel() == null) {
            usage += current.getLevel().getEnergy();
        } else {
            usage += current.getFPLevel().getEnergy();
        }
        if (allowedLevel(current, Player.levelMax) && usage > 0) {
            usage--;
        }

        App.getGame().getMainPlayer().decreaseEnergy(usage);
        return true;
    }

    private static boolean allowedLevel(Tool tool, int level) {
        if (tool.getSkill().equals(Skills.Farming)) {
            return (App.getGame().getMainPlayer().getFarmingXP() >= level*Player.levelConstant);
        }
        else if (tool.getSkill().equals(Skills.Mining)) {
            return (App.getGame().getMainPlayer().getMiningXP() >= level*Player.levelConstant);
        }
        else if (tool.getSkill().equals(Skills.Fishing)) {
            return (App.getGame().getMainPlayer().getFishingXP() >= level*Player.levelConstant);
        }
        return false;
    }
}
