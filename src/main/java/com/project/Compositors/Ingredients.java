package com.project.Compositors;

import java.util.HashMap;
import java.util.Map;

public class Ingredients {
    private Map<String, Integer> ingredients = new HashMap<>();
    private final String name;

    // Constructor
    public Ingredients(Map<String, Integer> ingredients, String name) {
        this.ingredients = ingredients;
        this.name = name;
    }

    // Check if the provided map exactly matches the required ingredients
    public boolean matches(Map<String, Integer> input) {
        return ingredients.equals(input);
    }

    // Optional: Getters
    public String getName() {
        return name;
    }

    public Map<String, Integer> getIngredients() {
        return ingredients;
    }
}
