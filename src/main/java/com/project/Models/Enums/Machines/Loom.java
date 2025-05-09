package com.project.Models.Enums.Machines;

public enum Loom {
    CLOTH("Cloth", "A bolt of fine wool cloth.", "Inedible", "4 Hours", "Wool", 470);

    private final String name;
    private final String description;
    private final String energy;
    private final String processingTime;
    private final String ingredients;
    private final int sellPrice;

    Loom(String name, String description, String energy, String processingTime, String ingredients, int sellPrice) {
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
    public int getSellPrice() { return sellPrice; }
}