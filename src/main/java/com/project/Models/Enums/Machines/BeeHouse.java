package com.project.Models.Enums.Machines;

public enum BeeHouse {
    HONEY("Honey", "It's a sweet syrup produced by bees.", 75.0, "", "", 350);

    private final String name;
    private final String description;
    private final double energy;
    private final String processingTime;
    private final String ingredients;
    private final int sellPrice;

    BeeHouse(String name, String description, double energy, String processingTime, String ingredients, int sellPrice) {
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
    public double getEnergy() { return energy; }
    public String getProcessingTime() { return processingTime; }
    public String getIngredients() { return ingredients; }
    public int getSellPrice() { return sellPrice; }
}