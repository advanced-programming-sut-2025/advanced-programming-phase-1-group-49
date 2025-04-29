package com.project.Models.Enums;

public enum CraftingRecipe {
    CHERRY_BOMB("CherryBomb", "4 copper ore + 1 coal", "Mining1", 50, 3),
    BOMB("Bomb", "4 iron ore + 1 coal", "Mining2", 50, 5),
    MEGA_BOMB("MegaBomb", "4 gold ore + 1 coal", "Mining3", 50, 7),
    SPRINKLER("Sprinkler", "1 copper bar + 1 iron bar", "Farming1", null, 4),
    QUALITY_SPRINKLER("QualitySprinkler", "1 iron bar + 1 gold bar", "Farming2", null, 8),
    IRIDIUM_SPRINKLER("IridiumSprinkler", "1 gold bar + 1 iridium bar", "Farming3", null, 24),
    CHARCOAL_KILN("CharcoalKiln", "20 wood + 2 copper bar", "Foraging1", null, 0),
    FURNACE("Furnace", "20 copper ore + 25 stone", "-", null, 0),
    SCARECROW("Scarecrow", "50 wood + 1 coal + 20 fiber", "-", null, 8),
    DELUXE_SCARECROW("DeluxeScarecrow", "50 wood + 1 coal + 20 fiber + 1 iridium ore", "Farming2", null, 12),
    BEE_HOUSE("BeeHouse", "40 wood + 8 coal + 1 iron bar", "Farming1", null, 0),
    CHEESE_PRESS("CheesePress", "45 wood + 45 stone + 1 copper bar", "Farming2", null, 0),
    KEG("Keg", "30 wood + 1 copper bar + 1 iron bar", "Farming3", null, 0),
    LOOM("Loom", "60 wood + 30 fiber", "Farming3", null, 0),
    MAYONNAISE_MACHINE("MayonnaiseMachine", "15 wood + 15 stone + 1 copper bar", "-", null, 0),
    OIL_MAKER("OilMaker", "100 wood + 1 gold bar + 1 iron bar", "Farming3", null, 0),
    PRESERVES_JAR("PreservesJar", "50 wood + 40 stone + 8 coal", "Farming2", null, 0),
    DEHYDRATOR("Dehydrator", "30 wood + 20 stone + 30 fiber", "GeneralStore", null, 0),
    FISH_SMOKER("FishSmoker", "50 wood + 3 iron bar + 10 coal", "FishShop", null, 0),
    MYSTIC_TREE_SEED("MysticTreeSeed", "5 acorn + 5 maple seed + 5 pine cone + 5 mahogany seed", "Foraging4", 100, 0);

    private final String id;
    private final String ingredients;
    private final String unlockCondition;
    private final Integer sellPrice;
    private final int radius;

    CraftingRecipe(String id, String ingredients, String unlockCondition, Integer sellPrice, int radius) {
        this.id = id;
        this.ingredients = ingredients;
        this.unlockCondition = unlockCondition;
        this.sellPrice = sellPrice;
        this.radius = radius;
    }

    public String getId() {
        return id;
    }

    public String getIngredients() {
        return ingredients;
    }

    public String getUnlockCondition() {
        return unlockCondition;
    }

    public Integer getSellPrice() {
        return sellPrice;
    }

    public int getRadius() {
        return radius;
    }
}