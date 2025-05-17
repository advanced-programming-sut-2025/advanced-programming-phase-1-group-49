package com.project.Models.Item;

import com.project.Compositors.Ingredients;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Machine extends Crafting {
    Map<String, Ingredients> recipes = new HashMap<>();
    Map<Item, Integer> products = new HashMap<>();
    String shop;
    int processingTime = 0;
    int energy = 0;

    public Machine setProducts(Map<Item, Integer> products) {
        this.products = products;
        return this;
    }

    // getter

    public Crafting addRecipe(String name, Ingredients recipe) {
        return this;
    }

    public String getShop() {
        return shop;
    }

    public int getProcessingTime() {
        return processingTime;
    }

    public Map<Item, Integer> getProducts() {
        return products;
    }

    // setter

    public Crafting setShop(String shop) {
        this.shop = shop;
        return this;
    }

    public Crafting setProcessingTime(int processingTime) {
        this.processingTime = processingTime;
        return this;
    }
}
