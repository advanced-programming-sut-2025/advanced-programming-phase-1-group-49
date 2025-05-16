package com.project.Compositors;

import com.project.Builders.BuilderEnums.ForagingSeedBuilder;
import com.project.Builders.BuilderEnums.MineralBuilder;
import com.project.Builders.BuilderEnums.OrganicProductBuilder;
import com.project.Directors.ArtisanDirector;

import java.util.HashMap;
import java.util.Map;

public class Recipes {
    //Crafting recipes
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

    // Cooking recipes
    public static final Map<String, Integer> FriedEgg;
    public static final Map<String, Integer> BakedFish;
    public static final Map<String, Integer> Salad;
    public static final Map<String, Integer> Omelet;
    public static final Map<String, Integer> PumpkinPie;
    public static final Map<String, Integer> Spaghetti;
    public static final Map<String, Integer> Pizza;
    public static final Map<String, Integer> Tortilla;
    public static final Map<String, Integer> MakiRoll;
    public static final Map<String, Integer> TripleShotEspresso;
    public static final Map<String, Integer> Cookie;
    public static final Map<String, Integer> HashBrowns;
    public static final Map<String, Integer> Pancakes;
    public static final Map<String, Integer> FruitSalad;
    public static final Map<String, Integer> RedPlate;
    public static final Map<String, Integer> Bread;
    public static final Map<String, Integer> SalmonDinner;
    public static final Map<String, Integer> VegetableMedley;
    public static final Map<String, Integer> FarmersLunch;
    public static final Map<String, Integer> SurvivalBurger;
    public static final Map<String, Integer> DishOTheSea;
    public static final Map<String, Integer> SeafoamPudding;
    public static final Map<String, Integer> MinersTreat;

    //Artisan goods
    public static final Map<String, Integer> Honey;
    public static final Map<String, Integer> Cheese;

    static {
        // Crafting recipes
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

        // Cooking recipes
        FriedEgg = Map.of("egg", 1);
        BakedFish = Map.of("sardine", 1, "salmon", 1, "wheat", 1);
        Salad = Map.of("leek", 1, "dandelion", 1);
        Omelet = Map.of("egg", 1, "milk", 1);
        PumpkinPie = Map.of("pumpkin", 1, "wheat flour", 1, "milk", 1, "sugar", 1);
        Spaghetti = Map.of("wheat flour", 1, "tomato", 1);
        Pizza = Map.of("wheat flour", 1, "tomato", 1, "cheese", 1);
        Tortilla = Map.of("corn", 1);
        MakiRoll = Map.of("any fish", 1, "rice", 1, "fiber", 1);
        TripleShotEspresso = Map.of("coffee", 3);
        Cookie = Map.of("wheat flour", 1, "sugar", 1, "egg", 1);
        HashBrowns = Map.of("potato", 1, "oil", 1);
        Pancakes = Map.of("wheat flour", 1, "egg", 1);
        FruitSalad = Map.of("blueberry", 1, "melon", 1, "apricot", 1);
        RedPlate = Map.of("red cabbage", 1, "radish", 1);
        Bread = Map.of("wheat flour", 1);
        SalmonDinner = Map.of("salmon", 1, "amaranth", 1, "kale", 1);
        VegetableMedley = Map.of("tomato", 1, "beet", 1);
        FarmersLunch = Map.of("omelet", 1, "parsnip", 1);
        SurvivalBurger = Map.of("bread", 1, "carrot", 1, "eggplant", 1);
        DishOTheSea = Map.of("sardine", 2, "hash browns", 1);
        SeafoamPudding = Map.of("flounder", 1, "midnight carp", 1);
        MinersTreat = Map.of("carrot", 2, "sugar", 1, "milk", 1);

        // Artisan goods
        Honey = new HashMap<>();
        // No ingredients listed (produced passively by Bee House)

        Cheese = new HashMap<>();
        Cheese.put(OrganicProductBuilder.WhiteMilk.product.getName(), 1);
        Cheese.put(OrganicProductBuilder.LargeWhiteMilk.product.getName(), 1);

        Map<String, Integer> LargeCheese = new HashMap<>();
        LargeCheese.put(OrganicProductBuilder.LargeWhiteMilk.product.getName(), 1);

        Map<String, Integer> GoatCheese = new HashMap<>();
        GoatCheese.put(OrganicProductBuilder.GoatMilk.product.getName(), 1);
        GoatCheese.put(OrganicProductBuilder.LargeGoatMilk.product.getName(), 1);

        Map<String, Integer> LargeGoatCheese = new HashMap<>();
        LargeGoatCheese.put(OrganicProductBuilder.LargeGoatMilk.product.getName(), 1);

        Map<String, Integer> Mayonnaise = new HashMap<>();
        Mayonnaise.put(OrganicProductBuilder.Egg.product.getName(), 1);
        Mayonnaise.put(OrganicProductBuilder.LargeEgg.product.getName(), 1);

        Map<String, Integer> LargeMayonnaise = new HashMap<>();
        LargeMayonnaise.put(OrganicProductBuilder.LargeEgg.product.getName(), 1);

        Map<String, Integer> DuckMayonnaise = new HashMap<>();
        DuckMayonnaise.put(OrganicProductBuilder.DuckEgg.product.getName(), 1);

        Map<String, Integer> DinoMayonnaise = new HashMap<>();
        DinoMayonnaise.put(OrganicProductBuilder.DinosaurEgg.product.getName(), 1);

        Map<String, Integer> Beer = new HashMap<>();
        Beer.put("Wheat", 1);

        Map<String, Integer> PaleAle = new HashMap<>();
        PaleAle.put("Hops", 1);

        Map<String, Integer> Mead = new HashMap<>();
        Mead.put(new ArtisanDirector().buildHoney().getName(), 1);

        Map<String, Integer> Vinegar = new HashMap<>();
        Vinegar.put("Rice", 1);

        Map<String, Integer> TruffleOil = new HashMap<>();
        TruffleOil.put(OrganicProductBuilder.PigTruffle.product.getName(), 1);

        Map<String, Integer> Coffee = new HashMap<>();
        Coffee.put("CoffeeBean", 5);

        Map<String, Integer> Cloth = new HashMap<>();
        Cloth.put(OrganicProductBuilder.LambWool.product.getName(), 1);
    }
}
