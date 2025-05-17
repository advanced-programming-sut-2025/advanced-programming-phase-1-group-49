package com.project.Directors;

import com.project.Builders.BuilderEnums.*;
import com.project.Controllers.ForagingController;
import com.project.Models.Enums.Season;
import com.project.Models.Item.Foraging;

import java.util.ArrayList;

public class ForagingDirector {
    public Foraging randomTree(Season season) {
        int i = 0;
        ArrayList<Foraging> foragings = new ArrayList<Foraging>();
        if (season == Season.Spring) {
            for (FruitTreeBuilder fruitTreeBuilder : FruitTreeBuilder.values()) {
                if (fruitTreeBuilder.foraging.isSpring()) {
                    foragings.add(fruitTreeBuilder.foraging);
                    i++;
                }
            }
        } else if (season == Season.Summer) {
            for (FruitTreeBuilder fruitTreeBuilder : FruitTreeBuilder.values()) {
                if (fruitTreeBuilder.foraging.isSummer()) {
                    foragings.add(fruitTreeBuilder.foraging);
                    i++;
                }
            }
        } else if (season == Season.Fall) {
            for (FruitTreeBuilder fruitTreeBuilder : FruitTreeBuilder.values()) {
                if (fruitTreeBuilder.foraging.isFall()) {
                    foragings.add(fruitTreeBuilder.foraging);
                    i++;
                }
            }
        } else if (season == Season.Winter) {
            for (FruitTreeBuilder fruitTreeBuilder : FruitTreeBuilder.values()) {
                if (fruitTreeBuilder.foraging.isWinter()) {
                    foragings.add(fruitTreeBuilder.foraging);
                    i++;
                }
            }
        }
        int randomFactor = (int) (Math.random() * 1000 % i);
        return foragings.get(randomFactor);
    }

    public Foraging randomForagingTree(Season season) {
        int i = 0;
        ArrayList<Foraging> foragings = new ArrayList<Foraging>();
        if (season == Season.Spring) {
            for (ForagingTreeBuilder fruitTreeBuilder : ForagingTreeBuilder.values()) {
                if (fruitTreeBuilder.foraging.isSpring()) {
                    foragings.add(fruitTreeBuilder.foraging);
                    i++;
                }
            }
        } else if (season == Season.Summer) {
            for (ForagingTreeBuilder fruitTreeBuilder : ForagingTreeBuilder.values()) {
                if (fruitTreeBuilder.foraging.isSummer()) {
                    foragings.add(fruitTreeBuilder.foraging);
                    i++;
                }
            }
        } else if (season == Season.Fall) {
            for (ForagingTreeBuilder fruitTreeBuilder : ForagingTreeBuilder.values()) {
                if (fruitTreeBuilder.foraging.isFall()) {
                    foragings.add(fruitTreeBuilder.foraging);
                    i++;
                }
            }
        } else if (season == Season.Winter) {
            for (ForagingTreeBuilder fruitTreeBuilder : ForagingTreeBuilder.values()) {
                if (fruitTreeBuilder.foraging.isWinter()) {
                    foragings.add(fruitTreeBuilder.foraging);
                    i++;
                }
            }
        }
        int randomFactor = (int) (Math.random() * 1000 % i);
        return foragings.get(randomFactor);
    }

    public Foraging randomCropsAndSeeds(Season season) {
        int i = 0;
        ArrayList<Foraging> foragings = new ArrayList<Foraging>();
        if (season == Season.Spring) {
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
        } else if (season == Season.Summer) {
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
        } else if (season == Season.Fall) {
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
        } else if (season == Season.Winter) {
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

        int randomFactor = (int) (Math.random() * 1000 % i);
        return foragings.get(randomFactor);
    }

    public Foraging randomMineral(Season season) {
        int i = 0;
        ArrayList<Foraging> foragings = new ArrayList<Foraging>();
        if (season == Season.Spring) {
            for (MineralBuilder mineralBuilder : MineralBuilder.values()) {
                if (mineralBuilder.foraging.isSpring()) {
//                    System.Fuck(you);
                    foragings.add(mineralBuilder.foraging);
                    i++;
                }
            }
        } else if (season == Season.Summer) {
            for (MineralBuilder mineralBuilder : MineralBuilder.values()) {
                if (mineralBuilder.foraging.isSummer()) {
//                    System.Fuck(you);
                    foragings.add(mineralBuilder.foraging);
                    i++;
                }
            }
        } else if (season == Season.Fall) {
            for (MineralBuilder mineralBuilder : MineralBuilder.values()) {
                if (mineralBuilder.foraging.isFall()) {
//                    System.Fuck(you);
                    foragings.add(mineralBuilder.foraging);
                    i++;
                }
            }
        } else if (season == Season.Winter) {
            for (MineralBuilder mineralBuilder : MineralBuilder.values()) {
                if (mineralBuilder.foraging.isWinter()) {
//                    System.Fuck(you);
                    foragings.add(mineralBuilder.foraging);
                    i++;
                }
            }
        }
        int randomFactor = (int) (Math.random() * 1000 % i);
        return foragings.get(randomFactor);
    }

    public Foraging randomMixedSeed(Season season) {
        if (season == Season.Spring) {
            int randomFactor = (int) (Math.random() * 1000 % 5);
            switch (randomFactor) {
                case 0:
                    return ForagingSeedBuilder.CauliflowerSeeds.foraging;
                case 1:
                    return ForagingSeedBuilder.ParsnipSeeds.foraging;
                case 2:
                    return ForagingSeedBuilder.PotatoSeeds.foraging;
                case 3:
                    return ForagingSeedBuilder.JazzSeeds.foraging;
                case 4:
                    return ForagingSeedBuilder.TulipBulb.foraging;
            }
        } else if (season == Season.Summer) {
            int randomFactor = (int) (Math.random() * 1000 % 7);
            switch (randomFactor) {
                case 0:
                    return ForagingSeedBuilder.CornSeeds.foraging;
                case 1:
                    return ForagingSeedBuilder.PepperSeeds.foraging;
                case 2:
                    return ForagingSeedBuilder.RadishSeeds.foraging;
                case 3:
                    return ForagingSeedBuilder.WheatSeeds.foraging;
                case 4:
                    return ForagingSeedBuilder.PoppySeeds.foraging;
                case 5:
                    return ForagingSeedBuilder.SunflowerSeeds.foraging;
                case 6:
                    return ForagingSeedBuilder.SpangleSeeds.foraging;
            }
        } else if (season == Season.Fall) {
            int randomFactor = (int) (Math.random() * 1000 % 6);
            switch (randomFactor) {
                case 0:
                    return ForagingSeedBuilder.ArtichokeSeeds.foraging;
                case 1:
                    return ForagingSeedBuilder.CornSeeds.foraging;
                case 2:
                    return ForagingSeedBuilder.EggplantSeeds.foraging;
                case 3:
                    return ForagingSeedBuilder.PumpkinSeeds.foraging;
                case 4:
                    return ForagingSeedBuilder.SunflowerSeeds.foraging;
                case 5:
                    return ForagingSeedBuilder.FairySeeds.foraging;
            }
        } else if (season == Season.Winter) {
            return ForagingSeedBuilder.PowdermelonSeeds.foraging;
        }

        return null;
    }
}
