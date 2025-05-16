package com.project.Models.Item;

import com.project.Compositors.Ingredients;
import com.project.Models.Enums.Skills;

public class Crafting implements Item {
    private String name;
    private Ingredients recipe;
    private Skills skill;
    private int level;
    private int sellPrice;
    private int complement;

    // === Interface Methods ===

    @Override
    public String getID() {
        return "";
    }

    @Override
    public String tooString() {
        return "";
    }

    @Override
    public void passByHour() {
        // Implementation (if needed)
    }

    @Override
    public void passByDay() {
        // Implementation (if needed)
    }

    // === Getters ===

    public String getName() {
        return name;
    }

    public Ingredients getRecipe() {
        return recipe;
    }

    public Skills getSkill() {
        return skill;
    }

    public int getLevel() {
        return level;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public int getComplement() {
        return complement;
    }

    // === Fluent Setters ===

    public Crafting setName(String name) {
        this.name = name;
        return this;
    }

    public Crafting setRecipe(Ingredients recipe) {
        this.recipe = recipe;
        return this;
    }

    public Crafting setSkill(Skills skill) {
        this.skill = skill;
        return this;
    }

    public Crafting setLevel(int level) {
        this.level = level;
        return this;
    }

    public Crafting setSellPrice(int sellPrice) {
        this.sellPrice = sellPrice;
        return this;
    }

    public Crafting setComplement(int complement) {
        this.complement = complement;
        return this;
    }
}
