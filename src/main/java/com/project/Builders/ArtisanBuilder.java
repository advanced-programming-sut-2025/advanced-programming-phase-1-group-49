package com.project.Builders;

import com.project.Compositors.Ingredients;
import com.project.Models.Item.Artisan;
import com.project.Models.Item.Item;

import java.util.ArrayList;

public class ArtisanBuilder extends Builder {
    String name;
    String description = null;
    int energy;
    int sellPrice;
    int processingTime;
    Ingredients recipe = null;

    public ArtisanBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public ArtisanBuilder setProcessingTime(int processingTime) {
        this.processingTime = processingTime;
        return this;
    }

    public ArtisanBuilder setEnergy(int energy) {
        this.energy = energy;
        return this;
    }

    public ArtisanBuilder setSellPrice(int sellPrice) {
        this.sellPrice = sellPrice;
        return this;
    }

    public ArtisanBuilder setDescription(String description) {
        this.description = description;
        return this;
    }
    public ArtisanBuilder setRecipe(Ingredients recipe) {
        this.recipe = recipe;
        return this;
    }

    public String getName() {
        return name;
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

    public Ingredients getRecipe() {
        return recipe;
    }



    @Override
    public Item build() {
        return new Artisan(this);
    }
}
