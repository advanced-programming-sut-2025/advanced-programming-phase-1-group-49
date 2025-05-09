package com.project.Models.Enums.Machines;

public enum Keg {
    BEER("Beer", "Drink in moderation.", 50.0, "1 Day", "Wheat", 200),
    VINEGAR("Vinegar", "An aged fermented liquid.", 13.0, "10 Hours", "Rice", 100),
    COFFEE("Coffee", "It smells delicious.", 75.0, "2 Hours", "Coffee Bean (5)", 150),
    JUICE("Juice", "A sweet, nutritious beverage.", "2 × Base Energy", "4 Days", "Any Vegetable", "2.25 × Base Price"),
    MEAD("Mead", "A fermented beverage made from honey.", 100.0, "10 hours", "Honey", 300),
    PALE_ALE("Pale Ale", "Drink in moderation.", 50.0, "3 Days", "Hops", 300),
    WINE("Wine", "Drink in moderation.", "1.75 × Base Energy", "7 Days", "Any Fruit", "3 × Base Price");

    private final String name;
    private final String description;
    private final Object energy;
    private final String processingTime;
    private final String ingredients;
    private final Object sellPrice;

    Keg(String name, String description, Object energy, String processingTime, String ingredients, Object sellPrice) {
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
    public Object getEnergy() { return energy; }
    public String getProcessingTime() { return processingTime; }
    public String getIngredients() { return ingredients; }
    public Object getSellPrice() { return sellPrice; }
}