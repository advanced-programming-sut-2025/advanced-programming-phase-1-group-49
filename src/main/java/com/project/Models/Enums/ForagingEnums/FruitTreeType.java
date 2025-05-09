package com.project.Models.Enums.ForagingEnums;

import com.project.Models.Enums.Seasons;

public enum FruitTreeType {
    APRICOT("Apricot", 59, Seasons.Spring),
    CHERRY("Cherry", 80, Seasons.Spring),
    BANANA("Banana", 150, Seasons.Summer),
    MANGO("Mango", 130, Seasons.Summer),
    ORANGE("Orange", 100, Seasons.Summer),
    PEACH("Peach", 140, Seasons.Summer),
    POMEGRANATE("Pomegranate", 140, Seasons.Fall),
    APPLE("Apple", 100, Seasons.Fall);

    private final String fruitName;
    private final int basePrice;
    private final Seasons season;

    FruitTreeType(String fruitName, int basePrice, Seasons season) {
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

    public Seasons getSeason() {
        return season;
    }
}
