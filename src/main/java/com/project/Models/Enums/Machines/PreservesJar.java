package com.project.Models.Enums.Machines;

public enum PreservesJar {
    PICKLES("Pickles", "A jar of home-made pickles.", "1.75 × Base Energy", "6 Hours", "Any Vegetable", "2 × Base + 50"),
    JELLY("Jelly", "Gooey.", "2 × Base Energy", "3 Days", "Any Fruit", "2 × Base + 50");

    private final String name;
    private final String description;
    private final String energy;
    private final String processingTime;
    private final String ingredients;
    private final String sellPrice;

    PreservesJar(String name, String description, String energy, String processingTime, String ingredients, String sellPrice) {
        this.name = name;
        this.description = description;
        this.energy = energy;
        this.processingTime = processingTime;
        this.ingredients = ingredients;
        this.sellPrice = sellPrice;
    }

    // Getters
    public String getName() { return name; }
    public String getDescription() { return description; }
    public String getEnergy() { return energy; }
    public String getProcessingTime() { return processingTime; }
    public String getIngredients() { return ingredients; }
    public String getSellPrice() { return sellPrice; }
}