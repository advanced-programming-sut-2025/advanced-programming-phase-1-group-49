package com.project.Models.Item;

import com.project.Builders.ArtisanBuilder;
import com.project.Compositors.Ingredients;

import java.util.ArrayList;

public class Artisan implements Item {
    String name;
    String description;
    int energy;
    int processingTime;

    int sellPrice;
    Ingredients recipe;

    public Artisan(ArtisanBuilder builder) {
        this.name = builder.getName();
        if (builder.getDescription() != null) this.description = builder.getDescription();
        this.energy = builder.getEnergy();
        this.processingTime = builder.getProcessingTime();
        this.sellPrice = builder.getSellPrice();
        if (builder.getRecipe() != null) this.recipe = builder.getRecipe();
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getProcessingTime() {
        return processingTime;
    }

    public int getEnergy() {
        return energy;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public Ingredients getRecipe() {
        return recipe;
    }

    @Override
    public void passByHour() {

    }

    @Override
    public void passByDay() {

    }

    @Override
    public String getID() {
        return "";
    }

    @Override
    public String tooString() {
        return "";
    }
}
