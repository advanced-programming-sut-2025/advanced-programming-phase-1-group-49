package Models.Enums;

public enum CookingRecipe {
    FRIED_EGG("FriedEgg", "1 egg", "Starter", 35, 50.0, ""),
    BAKED_FISH("BakedFish", "1 Sardine + 1 Salmon + 1 wheat", "Starter", 100, 75.0, ""),
    SALAD("Salad", "1 leek + 1 dandelion", "Starter", 110, 113.0, ""),
    OMELET("Omelet", "1 egg + 1 milk", "StardropSaloon", 125, 100.0, ""),
    PUMPKIN_PIE("PumpkinPie", "1 pumpkin + 1 wheat flour + 1 milk + 1 sugar", "StardropSaloon", 385, 225.0, ""),
    SPAGHETTI("Spaghetti", "1 wheat flour + 1 tomato", "StardropSaloon", 120, 75.0, ""),
    PIZZA("Pizza", "1 wheat flour + 1 tomato + 1 cheese", "StardropSaloon", 300, 150.0, ""),
    TORTILLA("Tortilla", "1 corn", "StardropSaloon", 50, 50.0, ""),
    MAKI_ROLL("MakiRoll", "1 any fish + 1 rice + 1 fiber", "StardropSaloon", 220, 100.0, ""),
    TRIPLE_SHOT_ESPRESSO("TripleShotEspresso", "3 coffee", "StardropSaloon", 450, 200.0, "MaxEnergy+100(5h)"),
    COOKIE("Cookie", "1 wheat flour + 1 sugar + 1 egg", "StardropSaloon", 140, 90.0, ""),
    HASH_BROWNS("HashBrowns", "1 potato + 1 oil", "StardropSaloon", 120, 90.0, "Farming(5h)"),
    PANCAKES("Pancakes", "1 wheat flour + 1 egg", "StardropSaloon", 80, 90.0, "Foraging(11h)"),
    FRUIT_SALAD("FruitSalad", "1 blueberry + 1 melon + 1 apricot", "StardropSaloon", 450, 263.0, ""),
    RED_PLATE("RedPlate", "1 red cabbage + 1 radish", "StardropSaloon", 400, 240.0, "MaxEnergy+50(3h)"),
    BREAD("Bread", "1 wheat flour", "StardropSaloon", 60, 50.0, ""),
    SALMON_DINNER("SalmonDinner", "1 salmon + 1 Amaranth + 1 Kale", "LeahReward", 300, 125.0, ""),
    VEGETABLE_MEDLEY("VegetableMedley", "1 tomato + 1 beet", "Foraging2", 120, 165.0, ""),
    FARMERS_LUNCH("FarmersLunch", "1 omelet + 1 parsnip", "Farming1", 150, 200.0, "Farming(5h)"),
    SURVIVAL_BURGER("SurvivalBurger", "1 bread + 1 carrot + 1 eggplant", "Foraging3", 180, 125.0, "Foraging(5h)"),
    DISH_O_THE_SEA("DishOTheSea", "2 sardines + 1 hash browns", "Fishing2", 220, 150.0, "Fishing(5h)"),
    SEAFOAM_PUDDING("SeafoamPudding", "1 Flounder + 1 midnight carp", "Fishing3", 300, 175.0, "Fishing(10h)"),
    MINERS_TREAT("MinersTreat", "2 carrot + 1 sugar + 1 milk", "Mining1", 200, 125.0, "Mining(5h)");

    private final String id;
    private final String ingredients;
    private final String source;
    private final int sellPrice;
    private final double energy;
    private final String buff;

    CookingRecipe(String id, String ingredients, String source, int sellPrice, double energy, String buff) {
        this.id = id;
        this.ingredients = ingredients;
        this.source = source;
        this.sellPrice = sellPrice;
        this.energy = energy;
        this.buff = buff;
    }

    public String getId() {
        return id;
    }

    public String getIngredients() {
        return ingredients;
    }

    public String getSource() {
        return source;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public double getEnergy() {
        return energy;
    }

    public String getBuff() {
        return buff;
    }
}