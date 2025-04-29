package com.project.Models.Enums.machines;

public enum CheesePress {
    CHEESE("Cheese", "It's your basic cheese.", 100.0, "3 Hours", "Milk/Large Milk", new int[]{230, 345}),
    GOAT_CHEESE("Goat Cheese", "Soft cheese made from goat's milk.", 100.0, "3 Hours", "Goat Milk/Large Goat Milk", new int[]{400, 600});

    private final String name;
    private final String description;
    private final double energy;
    private final String processingTime;
    private final String ingredients;
    private final int[] sellPrices;

    CheesePress(String name, String description, double energy, String processingTime, String ingredients, int[] sellPrices) {
        this.name = name;
        this.description = description;
        this.energy = energy;
        this.processingTime = processingTime;
        this.ingredients = ingredients;
        this.sellPrices = sellPrices;
    }

    // Getters
    public String getName() { return name; }
    public String getDescription() { return description; }
    public double getEnergy() { return energy; }
    public String getProcessingTime() { return processingTime; }
    public String getIngredients() { return ingredients; }
    public int[] getSellPrices() { return sellPrices; }
}