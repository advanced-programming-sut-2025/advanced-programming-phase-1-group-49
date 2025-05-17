package com.project.Controllers;

import com.project.Builders.BuilderEnums.*;
import com.project.Directors.ForagingDirector;
import com.project.Models.App;
import com.project.Models.Item.Foraging;

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

}
