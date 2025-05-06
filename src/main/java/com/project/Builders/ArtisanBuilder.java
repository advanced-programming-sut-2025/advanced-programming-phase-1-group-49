package com.project.Builders;

import com.project.Models.Item.Artisan;
import com.project.Models.Item.Item;

import java.util.ArrayList;

public class ArtisanBuilder extends Builder {
    String name;
    String description = null;
    int energy;
    int sellPrice;
    int processingTime;
    ArrayList<String> ingredients = new ArrayList<>();

    public ArtisanBuilder (String name, String description, int energy, int sellPrice, int processingTime, ArrayList<String> ingredients) {
        this.name = name;
        this.description = description;
        this.energy = energy;
        this.sellPrice = sellPrice;
        this.processingTime = processingTime;
        this.ingredients = ingredients;
    }
    public ArtisanBuilder (String name, String description, int energy, int sellPrice, int processingTime) {
        this.name = name;
        this.description = description;
        this.energy = energy;
        this.sellPrice = sellPrice;
        this.processingTime = processingTime;
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public int getProcessingTime() {
        return processingTime;
    }

    public int getEnergy() {
        return energy;
    }

    public String getDescription() {
        return description;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    @Override
    public Item build() {
        return new Artisan(this);
    }
}
