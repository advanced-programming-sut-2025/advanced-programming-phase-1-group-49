package com.project.Compositors;

import com.project.Builders.BuilderEnums.MineralBuilder;
import com.project.Directors.ArtisanDirector;
import com.project.Models.Item.Item;

import java.util.LinkedHashMap;
import java.util.Map;

public class MachineProducts {
    public static final Map<Item, Integer> beeHouse = new LinkedHashMap<>();
    public static final Map<Item, Integer> keg = new LinkedHashMap<>();
    public static final Map<Item, Integer> preservesJar = new LinkedHashMap<>();
    public static final Map<Item, Integer> mayonnaiseMachine = new LinkedHashMap<>();
    public static final Map<Item, Integer> cheesePress = new LinkedHashMap<>();
    public static final Map<Item, Integer> loom = new LinkedHashMap<>();
    public static final Map<Item, Integer> oilMaker = new LinkedHashMap<>();
    public static final Map<Item, Integer> dehydrator = new LinkedHashMap<>();
    public static final Map<Item, Integer> fishSmoker = new LinkedHashMap<>();
    public static final Map<Item, Integer> charcoalKlin = new LinkedHashMap<>();

    static {
        ArtisanDirector director = new ArtisanDirector();

        beeHouse.put(director.buildHoney(), 4 * 13); // 4 days

        keg.put(director.buildBeer(), 13);                      // 1 day
        keg.put(director.buildPaleAle(), 3 * 13);               // 3 days
        keg.put(director.buildMead(), 10);                      // 10 hours
        keg.put(director.buildWine("GenericFruit", 100, 50), 7 * 13); // 7 days
        keg.put(director.buildJuice("GenericVegetable", 80, 40), 4 * 13); // 4 days
        keg.put(director.buildCoffee(), 2);                     // 2 hours

        preservesJar.put(director.buildJuice("GenericVegetable", 80, 40), 4 * 13); // same as juice fallback
        preservesJar.put(director.buildWine("GenericFruit", 100, 50), 7 * 13);     // same as wine fallback

        mayonnaiseMachine.put(director.buildMayonnaise(), 3);           // 3 hours
        mayonnaiseMachine.put(director.buildLargeMayonnaise(), 3);      // 3 hours
        mayonnaiseMachine.put(director.buildDuckMayonnaise(), 3);       // 3 hours
        mayonnaiseMachine.put(director.buildDinoMayonnaise(), 3);       // 3 hours

        cheesePress.put(director.buildCheese(), 3);                     // 3 hours
        cheesePress.put(director.buildLargeCheese(), 3);                // 3 hours
        cheesePress.put(director.buildGoatCheese(), 3);                 // 3 hours
        cheesePress.put(director.buildLargeGoatCheese(), 3);            // 3 hours

        loom.put(director.buildCloth(), 4);                             // 4 hours

        oilMaker.put(director.buildTruffleOil(), 6);                    // 6 hours
        oilMaker.put(director.buildVinegar(), 10);                      // 10 hours

        dehydrator.put(director.buildJuice("Mushroom", 20, 10), -1);    // next morning ≈ 1 day
        dehydrator.put(director.buildJuice("Fruit", 100, 40), -1);      // dried fruit
        dehydrator.put(director.buildJuice("Grapes", 80, 30), -1);      // raisins

        fishSmoker.put(director.buildJuice("Fish", 70, 50), 1);

        charcoalKlin.put(MineralBuilder.Coal.foraging, 1);
    }
}
