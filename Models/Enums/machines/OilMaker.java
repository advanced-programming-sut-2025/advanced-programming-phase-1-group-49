package Models.Enums.machines;

public enum OilMaker {
    TRUFFLE_OIL("Truffle Oil", "A gourmet cooking ingredient.", 38.0, "6 Hours", "Truffle", 1065),
    OIL("Oil", "All purpose cooking oil.", 13.0, "Variable", "Corn/Sunflower Seeds/Sunflower", 100);

    private final String name;
    private final String description;
    private final double energy;
    private final String processingTime;
    private final String ingredients;
    private final int sellPrice;

    OilMaker(String name, String description, double energy, String processingTime, String ingredients, int sellPrice) {
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