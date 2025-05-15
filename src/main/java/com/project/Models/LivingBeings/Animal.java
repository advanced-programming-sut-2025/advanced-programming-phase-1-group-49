package com.project.Models.LivingBeings;

import com.project.Models.Enums.BarnTypes;
import com.project.Models.Item.Item;

import java.util.ArrayList;

public class Animal implements LivingBeings {
    protected int cost;
    protected String name;
    protected ArrayList<Item> products;
    protected BarnTypes barnType;
    protected boolean isBarnAnimal;
    protected boolean wellBeing;
    protected int cycleDays;
    protected int cycleHour;



    public int getCost() {
        return cost;
    }

    public Animal setCost(int cost) {
        this.cost = cost;
        return this;
    }

    public String getName() {
        return name;
    }

    public Animal setName(String name) {
        this.name = name;
        return this;
    }

    public ArrayList<Item> getProducts() {
        return products;
    }

    public Animal addProducts(Item product) {
        this.products.add(product);
        return this;
    }

    public BarnTypes getBarnType() {
        return barnType;
    }

    public Animal setBarnType(BarnTypes barnType) {
        this.barnType = barnType;
        return this;
    }

    public boolean isBarnAnimal() {
        return isBarnAnimal;
    }

    public Animal setBarnAnimal(boolean barnAnimal) {
        isBarnAnimal = barnAnimal;
        return this;
    }

    public boolean isWellBeing() {
        return wellBeing;
    }

    public Animal setWellBeing(boolean wellBeing) {
        this.wellBeing = wellBeing;
        return this;
    }

    public int getCycleDays() {
        return cycleDays;
    }

    public Animal setCycleDays(int cycleDays) {
        this.cycleDays = cycleDays;
        return this;
    }

    public int getCycleHour() {
        return cycleHour;
    }

    public Animal setCycleHour(int cycleHour) {
        this.cycleHour = cycleHour;
        return this;
    }

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

    }

    @Override
    public void passByDay() {

    }
}

