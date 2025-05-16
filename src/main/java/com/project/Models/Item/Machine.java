package com.project.Models.Item;

import com.project.Compositors.Ingredients;

import java.util.HashMap;
import java.util.Map;

public class Machine extends Crafting {
    String shop;
    Map<String, Ingredients> recipes = new HashMap<String, Ingredients>();
    int processingTime = 0;
    int energy = 0;

    public Crafting addRecipe(String name, Ingredients recipe) {
        return this;
    }

    public String getShop() {
        return shop;
    }

    public Crafting setShop(String shop) {
        this.shop = shop;
        return this;
    }

    public int getProcessingTime() {
        return processingTime;
    }

    public Crafting setProcessingTime(int processingTime) {
        this.processingTime = processingTime;
        return this;
    }


}
