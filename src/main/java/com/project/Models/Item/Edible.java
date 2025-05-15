package com.project.Models.Item;

import com.project.Compositors.Ingredients;
import com.project.Models.Enums.Buffs;
import com.project.Models.Enums.Shops;

public class Edible extends Foraging {
    {
        edible = true;
    }
    public static int maxEnergy = 100;
    protected Ingredients recipe;
    protected int energyUsage;
    protected int buffDuration;
    protected int buffValue;
    protected Buffs buff;
    protected Shops shop;


    public Edible() {
        this.maxEnergy = maxEnergy;
    }

    public Edible setRecipe(Ingredients recipe) {
        this.recipe = recipe;
        return this;
    }
    public Ingredients getRecipe() {
        return recipe;
    }

    public Edible setEnergyUsage(int energyUsage) {
        this.energyUsage = energyUsage;
        return this;
    }
    public int getEnergyUsage() {
        return energyUsage;
    }

    public Edible setBuffDuration(int buffDuration) {
        this.buffDuration = buffDuration;
        return this;
    }
    public int getBuffDuration() {
        return buffDuration;
    }

    public Edible setBuff(Buffs buff) {
        this.buff = buff;
        return this;
    }
    public Buffs getBuff() {
        return buff;
    }

    public Edible setShop(Shops shop) {
        this.shop = shop;
        return this;
    }
    public Shops getShop() {
        return shop;
    }

    public Edible setBuffValue(int buffValue) {
        this.buffValue = buffValue;
        return this;
    }
    public int getBuffValue() {
        return buffValue;
    }

}
