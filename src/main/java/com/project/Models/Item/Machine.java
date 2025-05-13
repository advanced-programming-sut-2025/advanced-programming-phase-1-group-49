package com.project.Models.Item;

import com.project.Compositors.Recipe;

import java.util.HashMap;
import java.util.Map;

public class Machine extends Crafting {
    String shop;
    Map<String, Recipe> recipes = new HashMap<String, Recipe>();
    int processingTime = 0;
    int energy = 0;

    public Crafting addRecipe(String name, Recipe recipe) {
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
