package Models.Enums;

public enum FruitTreeType {
    APRICOT("Apricot", 59, "Spring"),
    CHERRY("Cherry", 80, "Spring"),
    BANANA("Banana", 150, "Summer"),
    MANGO("Mango", 130, "Summer"),
    ORANGE("Orange", 100, "Summer"),
    PEACH("Peach", 140, "Summer"),
    POMEGRANATE("Pomegranate", 140, "Fall"),
    APPLE("Apple", 100, "Fall");

    private final String fruitName;
    private final int basePrice;
    private final String season;

    FruitTreeType(String fruitName, int basePrice, String season) {
        this.fruitName = fruitName;
        this.basePrice = basePrice;
        this.season = season;
    }

    public String getFruitName() {
        return fruitName;
    }

    public int getBasePrice() {
        return basePrice;
    }

    public String getSeason() {
        return season;
    }
}
