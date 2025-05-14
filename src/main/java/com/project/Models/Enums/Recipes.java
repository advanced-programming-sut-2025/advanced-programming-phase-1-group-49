package com.project.Models.Enums;

import com.project.Builders.BuilderEnums.ForagingSeedBuilder;
import com.project.Builders.BuilderEnums.MineralBuilder;

import java.util.HashMap;
import java.util.Map;

public class Recipes {

    public static final Map<String, Integer> CherryBomb;
    public static final Map<String, Integer> Bomb;
    public static final Map<String, Integer> MegaBomb;
    public static final Map<String, Integer> Sprinkler;
    public static final Map<String, Integer> QualitySprinkler;
    public static final Map<String, Integer> IridiumSprinkler;
    public static final Map<String, Integer> CharcoalKlin;
    public static final Map<String, Integer> Furnace;
    public static final Map<String, Integer> Scarecrow;
    public static final Map<String, Integer> DeluxeScarecrow;
    public static final Map<String, Integer> BeeHouse;
    public static final Map<String, Integer> CheesePress;
    public static final Map<String, Integer> Keg;
    public static final Map<String, Integer> Loom;
    public static final Map<String, Integer> MayonnaiseMachine;
    public static final Map<String, Integer> OilMaker;
    public static final Map<String, Integer> PreservesJar;
    public static final Map<String, Integer> Dehydrator;
    public static final Map<String, Integer> GrassStarter;
    public static final Map<String, Integer> FishSmoker;
    public static final Map<String, Integer> MysticTreeSeed;

    static {
        CherryBomb = new HashMap<>();
        CherryBomb.put(MineralBuilder.Copper.foraging.getName(), 4);
        CherryBomb.put(MineralBuilder.Coal.foraging.getName(), 1);

        Bomb = new HashMap<>();
        Bomb.put(MineralBuilder.Iron.foraging.getName(), 4);
        Bomb.put(MineralBuilder.Coal.foraging.getName(), 1);

        MegaBomb = new HashMap<>();
        MegaBomb.put(MineralBuilder.Gold.foraging.getName(), 4);
        MegaBomb.put(MineralBuilder.Coal.foraging.getName(), 1);

        Sprinkler = new HashMap<>();
        Sprinkler.put(MineralBuilder.Copper.foraging.getName(), 1);
        Sprinkler.put(MineralBuilder.Iron.foraging.getName(), 1);

        QualitySprinkler = new HashMap<>();
        QualitySprinkler.put(MineralBuilder.Iron.foraging.getName(), 1);
        QualitySprinkler.put(MineralBuilder.Gold.foraging.getName(), 1);

        IridiumSprinkler = new HashMap<>();
        IridiumSprinkler.put(MineralBuilder.Gold.foraging.getName(), 1);
        IridiumSprinkler.put(MineralBuilder.Iridium.foraging.getName(), 1);

        CharcoalKlin = new HashMap<>();
        CharcoalKlin.put(MineralBuilder.Wood.foraging.getName(), 20);
        CharcoalKlin.put(MineralBuilder.Copper.foraging.getName(), 2);

        Furnace = new HashMap<>();
        Furnace.put(MineralBuilder.Copper.foraging.getName(), 20);
        Furnace.put(MineralBuilder.Stone.foraging.getName(), 25);

        Scarecrow = new HashMap<>();
        Scarecrow.put(MineralBuilder.Wood.foraging.getName(), 50);
        Scarecrow.put(MineralBuilder.Coal.foraging.getName(), 1);
        Scarecrow.put(MineralBuilder.Fiber.foraging.getName(), 20);

        DeluxeScarecrow = new HashMap<>();
        DeluxeScarecrow.put(MineralBuilder.Wood.foraging.getName(), 50);
        DeluxeScarecrow.put(MineralBuilder.Coal.foraging.getName(), 1);
        DeluxeScarecrow.put(MineralBuilder.Fiber.foraging.getName(), 20);
        DeluxeScarecrow.put(MineralBuilder.Iridium.foraging.getName(), 1);

        BeeHouse = new HashMap<>();
        BeeHouse.put(MineralBuilder.Wood.foraging.getName(), 40);
        BeeHouse.put(MineralBuilder.Coal.foraging.getName(), 8);
        BeeHouse.put(MineralBuilder.Iron.foraging.getName(), 1);

        CheesePress = new HashMap<>();
        CheesePress.put(MineralBuilder.Wood.foraging.getName(), 45);
        CheesePress.put(MineralBuilder.Stone.foraging.getName(), 45);
        CheesePress.put(MineralBuilder.Copper.foraging.getName(), 1);

        Keg = new HashMap<>();
        Keg.put(MineralBuilder.Wood.foraging.getName(), 30);
        Keg.put(MineralBuilder.Copper.foraging.getName(), 1);
        Keg.put(MineralBuilder.Iron.foraging.getName(), 1);

        Loom = new HashMap<>();
        Loom.put(MineralBuilder.Wood.foraging.getName(), 60);
        Loom.put(MineralBuilder.Fiber.foraging.getName(), 30);

        MayonnaiseMachine = new HashMap<>();
        MayonnaiseMachine.put(MineralBuilder.Wood.foraging.getName(), 15);
        MayonnaiseMachine.put(MineralBuilder.Stone.foraging.getName(), 15);
        MayonnaiseMachine.put(MineralBuilder.Copper.foraging.getName(), 1);

        OilMaker = new HashMap<>();
        OilMaker.put(MineralBuilder.Wood.foraging.getName(), 100);
        OilMaker.put(MineralBuilder.Gold.foraging.getName(), 1);
        OilMaker.put(MineralBuilder.Iron.foraging.getName(), 1);

        PreservesJar = new HashMap<>();
        PreservesJar.put(MineralBuilder.Wood.foraging.getName(), 50);
        PreservesJar.put(MineralBuilder.Stone.foraging.getName(), 40);
        PreservesJar.put(MineralBuilder.Coal.foraging.getName(), 8);

        Dehydrator = new HashMap<>();
        Dehydrator.put(MineralBuilder.Wood.foraging.getName(), 30);
        Dehydrator.put(MineralBuilder.Stone.foraging.getName(), 20);
        Dehydrator.put(MineralBuilder.Fiber.foraging.getName(), 30);

        GrassStarter = new HashMap<>();
        GrassStarter.put(MineralBuilder.Wood.foraging.getName(), 1);
        GrassStarter.put(MineralBuilder.Fiber.foraging.getName(), 1);

        FishSmoker = new HashMap<>();
        FishSmoker.put(MineralBuilder.Wood.foraging.getName(), 50);
        FishSmoker.put(MineralBuilder.Iron.foraging.getName(), 3);
        FishSmoker.put(MineralBuilder.Coal.foraging.getName(), 10);

        MysticTreeSeed = new HashMap<>();
        MysticTreeSeed.put(ForagingSeedBuilder.Acorn.foraging.getName(), 5);
        MysticTreeSeed.put(ForagingSeedBuilder.MapleSeed.foraging.getName(), 5);
        MysticTreeSeed.put(ForagingSeedBuilder.PineCone.foraging.getName(), 5);
        MysticTreeSeed.put(ForagingSeedBuilder.MahoganySeed.foraging.getName(), 5);
    }
}
