package com.project.Models.Item;

import com.project.Builders.ArtisanBuilder;

import java.util.ArrayList;

public class Artisan implements Item {
    String name;
    String description;
    int energy;
    int processingTime;
    ArrayList<String> ingredients = new ArrayList<String>();
    int sellPrice;

    public Artisan(ArtisanBuilder builder) {
        this.name = builder.getName();
        if (builder.getDescription() != null) this.description = builder.getDescription();
        this.energy = builder.getEnergy();
        this.processingTime = builder.getProcessingTime();
        this.sellPrice = builder.getSellPrice();
        if (builder.getIngredients().size() != 0) this.ingredients = builder.getIngredients();
    }

    @Override
    public void passByHour() {

    }

    @Override
    public void passByDay() {

    }

    @Override
    public String tooString() {
        return "";
    }
}
