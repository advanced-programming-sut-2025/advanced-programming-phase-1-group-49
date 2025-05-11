package com.project.Directors;

import com.project.Builders.ForagingBuilderEnums.ForagingCropBuilder;
import com.project.Builders.ForagingBuilderEnums.ForagingSeedBuilder;
import com.project.Builders.ForagingBuilderEnums.FruitTreeBuilder;
import com.project.Builders.ForagingBuilderEnums.MineralBuilder;
import com.project.Models.Enums.Seasons;
import com.project.Models.Item.Foraging;

import java.util.ArrayList;

public class ForagingDirector {
    public Foraging randomForagingTree(Seasons season) {
        int i = 0;
        ArrayList<Foraging> foragings = new ArrayList<Foraging>();
        if (season == Seasons.Spring) {
            for (FruitTreeBuilder fruitTreeBuilder : FruitTreeBuilder.values()) {
                if (fruitTreeBuilder.foraging.isSpring()) {
                    foragings.add(fruitTreeBuilder.foraging);
                    i++;
                }
            }
        }
        else if (season == Seasons.Summer) {
            for (FruitTreeBuilder fruitTreeBuilder : FruitTreeBuilder.values()) {
                if (fruitTreeBuilder.foraging.isSummer()) {
                    foragings.add(fruitTreeBuilder.foraging);
                    i++;
                }
            }
        }
        else if (season == Seasons.Fall) {
            for (FruitTreeBuilder fruitTreeBuilder : FruitTreeBuilder.values()) {
                if (fruitTreeBuilder.foraging.isFall()) {
                    foragings.add(fruitTreeBuilder.foraging);
                    i++;
                }
            }
        }
        else if (season == Seasons.Winter) {
            for (FruitTreeBuilder fruitTreeBuilder : FruitTreeBuilder.values()) {
                if (fruitTreeBuilder.foraging.isWinter()) {
                    foragings.add(fruitTreeBuilder.foraging);
                    i++;
                }
            }
        }
        int randomFactor = (int)(Math.random()*1000%i);
        return foragings.get(randomFactor);
    }

    public Foraging randomCropsSeeds(Seasons season) {
        int i = 0;
        ArrayList<Foraging> foragings = new ArrayList<Foraging>();
        if (season == Seasons.Spring) {
            for (ForagingCropBuilder foragingCropBuilder : ForagingCropBuilder.values()) {
                if (foragingCropBuilder.foraging.isSpring()) {
                    foragings.add(foragingCropBuilder.foraging);
                    i++;
                }
            }
            for (ForagingSeedBuilder foragingSeedBuilder : ForagingSeedBuilder.values()) {
                if (foragingSeedBuilder.foraging.isSpring()) {
                    foragings.add(foragingSeedBuilder.foraging);
                    i++;
                }
            }
        }
        else if (season == Seasons.Summer) {
            for (ForagingCropBuilder foragingCropBuilder : ForagingCropBuilder.values()) {
                if (foragingCropBuilder.foraging.isSummer()) {
                    foragings.add(foragingCropBuilder.foraging);
                    i++;
                }
            }
            for (ForagingSeedBuilder foragingSeedBuilder : ForagingSeedBuilder.values()) {
                if (foragingSeedBuilder.foraging.isSummer()) {
                    foragings.add(foragingSeedBuilder.foraging);
                    i++;
                }
            }
        }
        else if (season == Seasons.Fall) {
            for (ForagingCropBuilder foragingCropBuilder : ForagingCropBuilder.values()) {
                if (foragingCropBuilder.foraging.isFall()) {
                    foragings.add(foragingCropBuilder.foraging);
                    i++;
                }
            }
            for (ForagingSeedBuilder foragingSeedBuilder : ForagingSeedBuilder.values()) {
                if (foragingSeedBuilder.foraging.isFall()) {
                    foragings.add(foragingSeedBuilder.foraging);
                    i++;
                }
            }
        }
        else if (season == Seasons.Winter) {
            for (ForagingCropBuilder foragingCropBuilder : ForagingCropBuilder.values()) {
                if (foragingCropBuilder.foraging.isWinter()) {
                    foragings.add(foragingCropBuilder.foraging);
                    i++;
                }
            }
            for (ForagingSeedBuilder foragingSeedBuilder : ForagingSeedBuilder.values()) {
                if (foragingSeedBuilder.foraging.isWinter()) {
                    foragings.add(foragingSeedBuilder.foraging);
                    i++;
                }
            }
        }

        int randomFactor = (int)(Math.random()*1000%i);
        return foragings.get(randomFactor);
    }

    public Foraging randomMineral(Seasons season) {
        int i = 0;
        ArrayList<Foraging> foragings = new ArrayList<Foraging>();
        if (season == Seasons.Spring) {
            for (MineralBuilder mineralBuilder : MineralBuilder.values()) {
                if (mineralBuilder.foraging.isSpring()) {
//                    System.Fuck(you);
                    foragings.add(mineralBuilder.foraging);
                    i++;
                }
            }
        }
        else if (season == Seasons.Summer) {
            for (MineralBuilder mineralBuilder : MineralBuilder.values()) {
                if (mineralBuilder.foraging.isSummer()) {
//                    System.Fuck(you);
                    foragings.add(mineralBuilder.foraging);
                    i++;
                }
            }
        }
        else if (season == Seasons.Fall) {
            for (MineralBuilder mineralBuilder : MineralBuilder.values()) {
                if (mineralBuilder.foraging.isFall()) {
//                    System.Fuck(you);
                    foragings.add(mineralBuilder.foraging);
                    i++;
                }
            }
        }
        else if (season == Seasons.Winter) {
            for (MineralBuilder mineralBuilder : MineralBuilder.values()) {
                if (mineralBuilder.foraging.isWinter()) {
//                    System.Fuck(you);
                    foragings.add(mineralBuilder.foraging);
                    i++;
                }
            }
        }
        int randomFactor = (int)(Math.random()*1000%i);
        return foragings.get(randomFactor);
    }

    public Foraging randomMixedSeed (Seasons season) {
        int i = 0;
        ArrayList<Foraging> foragings = new ArrayList<Foraging>();
        if (season == Seasons.Spring) {
            for () {

            }
        }
        return randomCropsSeeds(season);
    }
}
