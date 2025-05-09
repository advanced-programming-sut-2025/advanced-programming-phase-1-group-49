package com.project.Models.Item;

public class Foraging implements Item {

    private String name;
    private String source;
    private int growthStage;
    private int growthTime; // days until harvest
    private boolean regrowable = false;
    private int regrowInterval; // days between harvests if regrowable
    private int baseSellPrice;
    private boolean edible = false;
    private int energyGain;
    private String season; // e.g., "Spring", "Summer", etc.
    private boolean canBecomeGiant = false;
    private boolean isGiant = false;
    private int quality = 1;
    private boolean spring = false;
    private boolean summer = false;
    private boolean winter = false;
    private boolean fall = false;

    public Foraging() { }

    @Override
    public void passByHour() {
        // Implementation if needed
    }

    @Override
    public void passByDay() {
        // Implementation if needed
    }

    // Fluent Setters

    public Foraging setName(String name) {
        this.name = name;
        return this;
    }

    public Foraging setSource(String source) {
        this.source = source;
        return this;
    }

    public Foraging setGrowthStage(int growthStage) {
        this.growthStage = growthStage;
        return this;
    }

    public Foraging setGrowthTime(int growthTime) {
        this.growthTime = growthTime;
        return this;
    }

    public Foraging setRegrowable(boolean regrowable) {
        this.regrowable = regrowable;
        return this;
    }

    public Foraging setRegrowInterval(int regrowInterval) {
        this.regrowInterval = regrowInterval;
        return this;
    }

    public Foraging setBaseSellPrice(int baseSellPrice) {
        this.baseSellPrice = baseSellPrice;
        return this;
    }

    public Foraging setEdible(boolean edible) {
        this.edible = edible;
        return this;
    }

    public Foraging setEnergyGain(int energyGain) {
        this.energyGain = energyGain;
        return this;
    }

    public Foraging setSeason(String season) {
        this.season = season;
        return this;
    }

    public Foraging setIsGiant(boolean isGiant) {
        this.isGiant = isGiant;
        return this;
    }

    public boolean getCanBecomeGiant() {
        return canBecomeGiant;
    }

    public Foraging setCanBecomeGiant(boolean canBecomeGiant) {
        this.canBecomeGiant = canBecomeGiant;
        return this;
    }

    public Foraging setQuality(int quality) {
        this.quality = quality;
        return this;
    }

    // Getters

    public String getName() {
        return name;
    }

    public String getSource() {
        return source;
    }

    public int getGrowthStage() {
        return growthStage;
    }

    public int getGrowthTime() {
        return growthTime;
    }

    public boolean isRegrowable() {
        return regrowable;
    }

    public int getRegrowInterval() {
        return regrowInterval;
    }

    public int getBaseSellPrice() {
        return baseSellPrice;
    }

    public boolean isEdible() {
        return edible;
    }

    public int getEnergyGain() {
        return energyGain;
    }

    public String getSeason() {
        return season;
    }

    public boolean getIsGiant() {
        return isGiant;
    }

    public int getQuality() {
        return quality;
    }

    public boolean isSpring() {
        return spring;
    }

    public Foraging setSpring(boolean spring) {
        this.spring = spring;
        return this;
    }

    public boolean isSummer() {
        return summer;
    }

    public Foraging setSummer(boolean summer) {
        this.summer = summer;
        return this;
    }

    public boolean isWinter() {
        return winter;
    }

    public Foraging setWinter(boolean winter) {
        this.winter = winter;
        return this;
    }

    public boolean isFall() {
        return fall;
    }

    public Foraging setFall(boolean fall) {
        this.fall = fall;
        return this;
    }

    @Override
    public String tooString() {
        return "";
    }
}
