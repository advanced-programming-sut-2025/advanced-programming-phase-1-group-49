package Models.Enums.machines;

public enum MayonnaiseMachine {
    MAYONNAISE("Mayonnaise", "It looks spreadable.", 50.0, "3 Hours", "Egg/Large Egg", new int[]{190, 237}),
    DUCK_MAYONNAISE("Duck Mayonnaise", "It's a rich, yellow mayonnaise.", 75.0, "3 Hours", "Duck Egg", 375),
    DINOSAUR_MAYONNAISE("Dinosaur Mayonnaise", "It's thick and creamy, with a vivid green hue.", 125.0, "3 Hours", "Dinosaur Egg", 800);

    private final String name;
    private final String description;
    private final double energy;
    private final String processingTime;
    private final String ingredients;
    private final Object sellPrice; // int or int[]

    MayonnaiseMachine(String name, String description, double energy, String processingTime, String ingredients, Object sellPrice) {
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
    public Object getSellPrice() { return sellPrice; }
}