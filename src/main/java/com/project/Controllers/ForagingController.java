package com.project.Controllers;

import com.project.Builders.BuilderEnums.*;
import com.project.Directors.ForagingDirector;
import com.project.Models.App;
import com.project.Models.Enums.Block;
import com.project.Models.Enums.Directions;
import com.project.Models.Item.Foraging;
import com.project.Models.Item.Item;
import com.project.Models.Map.BlockWrapper;
import com.project.Models.Map.GameObject;
import com.project.Models.Map.Map;

import java.util.regex.Matcher;

public class ForagingController {
    public static void randomCrop(Matcher matcher) {
        for (int i = 0; i < 5; i++) {
            Foraging crop = new ForagingDirector().randomCropsAndSeeds(App.getGame().getTime().getCurrentSeason());
            System.out.println((i+1) + "- Name: " + crop.getName() +
                            "\nSource: " + crop.getSource() +
                            "\nStages: " + crop.getStages() +
                            "\nTotal Harvest Time: " + crop.getGrowthTime() +
                            "\nOne Time: " + !crop.isRegrowable() +
                            "\nRegrowth Time:" + (crop.isRegrowable()? crop.getRegrowInterval() + "":"-") +
                            "\nBase Sell Price: " + crop.getSellPrice() +
                            "\nIs Edible: " + crop.isEdible() +
                            "\nBase Energy: " + crop.getEnergyGain() +
                            "\nBase Health: " + //BS
                            "\nSeason: " + (crop.isSpring()? "spring ": "")
                            + (crop.isSummer()? "summer ": "")
                            + (crop.isFall()? "fall ": "")
                            + (crop.isWinter()? "winter ": "") +
                            "\nCan Become Giant: " + crop.getCanBecomeGiant()
            );
            System.out.println();
        }
        for (int i = 0; i < 2; i++) {
            Foraging crop = new ForagingDirector().randomForagingTree(App.getGame().getTime().getCurrentSeason());
            System.out.println((i+1) + "- Name: " + crop.getName() +
                            "\nSource: " + crop.getSource() +
                            "\nStages: " + crop.getStages() +
                            "\nTotal Harvest Time: " + crop.getGrowthTime() +
                            "\nOne Time: " + !crop.isRegrowable() +
                            "\nRegrowth Time:" + (crop.isRegrowable()? crop.getRegrowInterval() + "":"-") +
                            "\nBase Sell Price: " + crop.getSellPrice() +
                            "\nIs Edible: " + crop.isEdible() +
                            "\nBase Energy: " + crop.getEnergyGain() +
                            "\nBase Health: " + //BS
                            "\nSeason: " + (crop.isSpring()? "spring ": "")
                            + (crop.isSummer()? "summer ": "")
                            + (crop.isFall()? "fall ": "")
                            + (crop.isWinter()? "winter ": "") +
                            "\nCan Become Giant: " + crop.getCanBecomeGiant()
            );
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            Foraging crop = new ForagingDirector().randomTree(App.getGame().getTime().getCurrentSeason());
            System.out.println((i+1) + "- Name: " + crop.getName() +
                            "\nSource: " + crop.getSource() +
                            "\nStages: " + crop.getStages() +
                            "\nTotal Harvest Time: " + crop.getGrowthTime() +
                            "\nOne Time: " + !crop.isRegrowable() +
                            "\nRegrowth Time:" + (crop.isRegrowable()? crop.getRegrowInterval() + "":"-") +
                            "\nBase Sell Price: " + crop.getSellPrice() +
                            "\nIs Edible: " + crop.isEdible() +
                            "\nBase Energy: " + crop.getEnergyGain() +
                            "\nBase Health: " + //BS
                            "\nSeason: " + (crop.isSpring()? "spring ": "")
                            + (crop.isSummer()? "summer ": "")
                            + (crop.isFall()? "fall ": "")
                            + (crop.isWinter()? "winter ": "") +
                            "\nCan Become Giant: " + crop.getCanBecomeGiant()
            );
        }
    }

    public static void craftInfo(Matcher matcher) {
        Foraging crop = null;
        for (ForagingCropBuilder cropBuilder : ForagingCropBuilder.values()) {
            crop = cropBuilder.foraging;
            if (crop.getName().equalsIgnoreCase(matcher.group(1))) {
                System.out.println("Name: " + crop.getName() +
                                "\nSource: " + crop.getSource() +
                                "\nStages: " + crop.getStages() +
                                "\nTotal Harvest Time: " + crop.getGrowthTime() +
                                "\nOne Time: " + !crop.isRegrowable() +
                                "\nRegrowth Time:" + (crop.isRegrowable()? crop.getRegrowInterval() + "":"-") +
                                "\nBase Sell Price: " + crop.getSellPrice() +
                                "\nIs Edible: " + crop.isEdible() +
                                "\nBase Energy: " + crop.getEnergyGain() +
                                "\nBase Health: " + //؟؟؟؟؟؟؟؟؟
                                "\nSeason: " + (crop.isSpring()? "spring ": "")
                                + (crop.isSummer()? "summer ": "")
                                + (crop.isFall()? "fall ": "")
                                + (crop.isWinter()? "winter ": "") +
                                "\nCan Become Giant: " + crop.getCanBecomeGiant()
                );
                return;
            }
            else {
                crop = null;
            }
        }
        for (CropBuilder cropBuilder : CropBuilder.values()) {
            crop = cropBuilder.foraging;
            if (crop.getName().equalsIgnoreCase(matcher.group(1))) {
                System.out.println("Name: " + crop.getName() +
                                "\nSource: " + crop.getSource() +
                                "\nStages: " + crop.getStages() +
                                "\nTotal Harvest Time: " + crop.getGrowthTime() +
                                "\nOne Time: " + !crop.isRegrowable() +
                                "\nRegrowth Time:" + (crop.isRegrowable()? crop.getRegrowInterval() + "":"-") +
                                "\nBase Sell Price: " + crop.getSellPrice() +
                                "\nIs Edible: " + crop.isEdible() +
                                "\nBase Energy: " + crop.getEnergyGain() +
                                "\nBase Health: " + //؟؟؟؟؟؟؟؟؟
                                "\nSeason: " + (crop.isSpring()? "spring ": "")
                                + (crop.isSummer()? "summer ": "")
                                + (crop.isFall()? "fall ": "")
                                + (crop.isWinter()? "winter ": "") +
                                "\nCan Become Giant: " + crop.getCanBecomeGiant()
                );
                return;
            }
            else {
                crop = null;
            }
        }
        for (ForagingSeedBuilder cropBuilder : ForagingSeedBuilder.values()) {
            crop = cropBuilder.foraging;
            if (crop.getName().equalsIgnoreCase(matcher.group(1))) {
                System.out.println("Name: " + crop.getName() +
                                "\nSource: " + crop.getSource() +
                                "\nStages: " + crop.getStages() +
                                "\nTotal Harvest Time: " + crop.getGrowthTime() +
                                "\nOne Time: " + !crop.isRegrowable() +
                                "\nRegrowth Time:" + (crop.isRegrowable()? crop.getRegrowInterval() + "":"-") +
                                "\nBase Sell Price: " + crop.getSellPrice() +
                                "\nIs Edible: " + crop.isEdible() +
                                "\nBase Energy: " + crop.getEnergyGain() +
                                "\nBase Health: " + //؟؟؟؟؟؟؟؟؟
                                "\nSeason: " + (crop.isSpring()? "spring ": "")
                                + (crop.isSummer()? "summer ": "")
                                + (crop.isFall()? "fall ": "")
                                + (crop.isWinter()? "winter ": "") +
                                "\nCan Become Giant: " + crop.getCanBecomeGiant()
                );
                return;
            }
            else {
                crop = null;
            }
        }
        for (ForagingTreeBuilder cropBuilder : ForagingTreeBuilder.values()) {
            crop = cropBuilder.foraging;
            if (crop.getName().equalsIgnoreCase(matcher.group(1))) {
                System.out.println("Name: " + crop.getName() +
                                "\nSource: " + crop.getSource() +
                                "\nStages: " + crop.getStages() +
                                "\nTotal Harvest Time: " + crop.getGrowthTime() +
                                "\nOne Time: " + !crop.isRegrowable() +
                                "\nRegrowth Time:" + (crop.isRegrowable()? crop.getRegrowInterval() + "":"-") +
                                "\nBase Sell Price: " + crop.getSellPrice() +
                                "\nIs Edible: " + crop.isEdible() +
                                "\nBase Energy: " + crop.getEnergyGain() +
                                "\nBase Health: " + //؟؟؟؟؟؟؟؟؟
                                "\nSeason: " + (crop.isSpring()? "spring ": "")
                                + (crop.isSummer()? "summer ": "")
                                + (crop.isFall()? "fall ": "")
                                + (crop.isWinter()? "winter ": "") +
                                "\nCan Become Giant: " + crop.getCanBecomeGiant()
                );
                return;
            }
            else {
                crop = null;
            }
        }
        for (FruitTreeBuilder cropBuilder : FruitTreeBuilder.values()) {
            crop = cropBuilder.foraging;
            if (crop.getName().equalsIgnoreCase(matcher.group(1))) {
                System.out.println("Name: " + crop.getName() +
                                "\nSource: " + crop.getSource() +
                                "\nStages: " + crop.getStages() +
                                "\nTotal Harvest Time: " + crop.getGrowthTime() +
                                "\nOne Time: " + !crop.isRegrowable() +
                                "\nRegrowth Time:" + (crop.isRegrowable()? crop.getRegrowInterval() + "":"-") +
                                "\nBase Sell Price: " + crop.getSellPrice() +
                                "\nIs Edible: " + crop.isEdible() +
                                "\nBase Energy: " + crop.getEnergyGain() +
                                "\nBase Health: " + //؟؟؟؟؟؟؟؟؟
                                "\nSeason: " + (crop.isSpring()? "spring ": "")
                                + (crop.isSummer()? "summer ": "")
                                + (crop.isFall()? "fall ": "")
                                + (crop.isWinter()? "winter ": "") +
                                "\nCan Become Giant: " + crop.getCanBecomeGiant()
                );
                return;
            }
            else {
                crop = null;
            }
        }
    }

    public static void craftInfo(String craftName) {
        Foraging crop = null;
        for (ForagingCropBuilder cropBuilder : ForagingCropBuilder.values()) {
            crop = cropBuilder.foraging;
            if (crop.getName().equalsIgnoreCase(craftName)) {
                System.out.println("Name: " + crop.getName() +
                                   "\nSource: " + crop.getSource() +
                                   "\nStages: " + crop.getStages() +
                                   "\nTotal Harvest Time: " + crop.getGrowthTime() +
                                   "\nOne Time: " + !crop.isRegrowable() +
                                   "\nRegrowth Time:" + (crop.isRegrowable()? crop.getRegrowInterval() + "":"-") +
                                   "\nBase Sell Price: " + crop.getSellPrice() +
                                   "\nIs Edible: " + crop.isEdible() +
                                   "\nBase Energy: " + crop.getEnergyGain() +
                                   "\nBase Health: " + //؟؟؟؟؟؟؟؟؟
                                   "\nSeason: " + (crop.isSpring()? "spring ": "")
                                   + (crop.isSummer()? "summer ": "")
                                   + (crop.isFall()? "fall ": "")
                                   + (crop.isWinter()? "winter ": "") +
                                   "\nCan Become Giant: " + crop.getCanBecomeGiant()
                );
                return;
            }
            else {
                crop = null;
            }
        }
        for (CropBuilder cropBuilder : CropBuilder.values()) {
            crop = cropBuilder.foraging;
            if (crop.getName().equalsIgnoreCase(craftName)) {
                System.out.println("Name: " + crop.getName() +
                                   "\nSource: " + crop.getSource() +
                                   "\nStages: " + crop.getStages() +
                                   "\nTotal Harvest Time: " + crop.getGrowthTime() +
                                   "\nOne Time: " + !crop.isRegrowable() +
                                   "\nRegrowth Time:" + (crop.isRegrowable()? crop.getRegrowInterval() + "":"-") +
                                   "\nBase Sell Price: " + crop.getSellPrice() +
                                   "\nIs Edible: " + crop.isEdible() +
                                   "\nBase Energy: " + crop.getEnergyGain() +
                                   "\nBase Health: " + //؟؟؟؟؟؟؟؟؟
                                   "\nSeason: " + (crop.isSpring()? "spring ": "")
                                   + (crop.isSummer()? "summer ": "")
                                   + (crop.isFall()? "fall ": "")
                                   + (crop.isWinter()? "winter ": "") +
                                   "\nCan Become Giant: " + crop.getCanBecomeGiant()
                );
                return;
            }
            else {
                crop = null;
            }
        }
        for (ForagingSeedBuilder cropBuilder : ForagingSeedBuilder.values()) {
            crop = cropBuilder.foraging;
            if (crop.getName().equalsIgnoreCase(craftName)) {
                System.out.println("Name: " + crop.getName() +
                                   "\nSource: " + crop.getSource() +
                                   "\nStages: " + crop.getStages() +
                                   "\nTotal Harvest Time: " + crop.getGrowthTime() +
                                   "\nOne Time: " + !crop.isRegrowable() +
                                   "\nRegrowth Time:" + (crop.isRegrowable()? crop.getRegrowInterval() + "":"-") +
                                   "\nBase Sell Price: " + crop.getSellPrice() +
                                   "\nIs Edible: " + crop.isEdible() +
                                   "\nBase Energy: " + crop.getEnergyGain() +
                                   "\nBase Health: " + //؟؟؟؟؟؟؟؟؟
                                   "\nSeason: " + (crop.isSpring()? "spring ": "")
                                   + (crop.isSummer()? "summer ": "")
                                   + (crop.isFall()? "fall ": "")
                                   + (crop.isWinter()? "winter ": "") +
                                   "\nCan Become Giant: " + crop.getCanBecomeGiant()
                );
                return;
            }
            else {
                crop = null;
            }
        }
        for (ForagingTreeBuilder cropBuilder : ForagingTreeBuilder.values()) {
            crop = cropBuilder.foraging;
            if (crop.getName().equalsIgnoreCase(craftName)) {
                System.out.println("Name: " + crop.getName() +
                                   "\nSource: " + crop.getSource() +
                                   "\nStages: " + crop.getStages() +
                                   "\nTotal Harvest Time: " + crop.getGrowthTime() +
                                   "\nOne Time: " + !crop.isRegrowable() +
                                   "\nRegrowth Time:" + (crop.isRegrowable()? crop.getRegrowInterval() + "":"-") +
                                   "\nBase Sell Price: " + crop.getSellPrice() +
                                   "\nIs Edible: " + crop.isEdible() +
                                   "\nBase Energy: " + crop.getEnergyGain() +
                                   "\nBase Health: " + //؟؟؟؟؟؟؟؟؟
                                   "\nSeason: " + (crop.isSpring()? "spring ": "")
                                   + (crop.isSummer()? "summer ": "")
                                   + (crop.isFall()? "fall ": "")
                                   + (crop.isWinter()? "winter ": "") +
                                   "\nCan Become Giant: " + crop.getCanBecomeGiant()
                );
                return;
            }
            else {
                crop = null;
            }
        }
        for (FruitTreeBuilder cropBuilder : FruitTreeBuilder.values()) {
            crop = cropBuilder.foraging;
            if (crop.getName().equalsIgnoreCase(craftName)) {
                System.out.println("Name: " + crop.getName() +
                                   "\nSource: " + crop.getSource() +
                                   "\nStages: " + crop.getStages() +
                                   "\nTotal Harvest Time: " + crop.getGrowthTime() +
                                   "\nOne Time: " + !crop.isRegrowable() +
                                   "\nRegrowth Time:" + (crop.isRegrowable()? crop.getRegrowInterval() + "":"-") +
                                   "\nBase Sell Price: " + crop.getSellPrice() +
                                   "\nIs Edible: " + crop.isEdible() +
                                   "\nBase Energy: " + crop.getEnergyGain() +
                                   "\nBase Health: " + //؟؟؟؟؟؟؟؟؟
                                   "\nSeason: " + (crop.isSpring()? "spring ": "")
                                   + (crop.isSummer()? "summer ": "")
                                   + (crop.isFall()? "fall ": "")
                                   + (crop.isWinter()? "winter ": "") +
                                   "\nCan Become Giant: " + crop.getCanBecomeGiant()
                );
                return;
            }
            else {
                crop = null;
            }
        }
    }

    public static boolean plant(Matcher matcher) {
        int x = App.getGame().getMainPlayer().getX();
        int y = App.getGame().getMainPlayer().getY();
        boolean valid = false;

        for (Directions direction : Directions.values()) {
            if (direction.direction.equals(matcher.group(2))) {
                x += direction.x;
                y += direction.y;
                valid = true;
                break;
            }
        }
        if (!valid) {
            System.out.println(
                    "Invalid direction: "
                    + matcher.group(2)
            );
            for (Directions direction : Directions.values()) {
                System.out.println("Valid directions: " + direction.direction);
            }
            return false;
        }
        valid = false;

        if (x < 0 || y < 0 || x >= Map.getMapLength() || y >= Map.getMapWidth()
                || !App.getGame().getMap().getBlocks()[x][y]
                .get(App.getGame().getMap().getBlocks()[x][y].size())
                .equals(new BlockWrapper(Block.diggedSoil))
                ) {
            System.out.println("Incompatible blocks!");
            return false;
        }

        int i = -1;
        for (Item item : App.getGame().getMainPlayer().getInventory().getItems()) {
            i++;
            if (item.getName().equalsIgnoreCase(matcher.group(1))) {
                if (App.getGame().getMainPlayer().getInventory().getQuantity(item) < 1) {
                    System.out.println("You don't have enough materials!");
                }
                App.getGame().getMainPlayer().getInventory().removeItem(i);
                valid = true;
                App.getGame().getMap().getBlocks()[x][y].add(item);
                System.out.println("Added item: " + item.getName() + " on x: " + x + " y: " + y);
                return true;
            }
        }
        System.out.println("You don't have enough materials!");
        return false;
    }

    public static void ShowPlant(Matcher matcher) {
        int x = Integer.parseInt(matcher.group(1));
        int y = Integer.parseInt(matcher.group(2));
        boolean valid = false;
        GameObject obj = App.getGame().getMap().getBlocks()[x][y]
                .get(App.getGame().getMap().getBlocks()[x][y].size() -1)
        ;
        if (!(obj instanceof Foraging)) {
            System.out.println("Nothing here!");
            return;
        }
        craftInfo(((Foraging) obj).getName());
    }

    public static void Fertilize(Matcher matcher) {
        if (!plant(matcher)) {
            return;
        }

    }
}
