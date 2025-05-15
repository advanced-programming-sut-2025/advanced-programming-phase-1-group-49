package com.project.Models.Item;

import com.project.Models.Enums.Skills;

public class Foraging implements Item {

    protected String name;
    protected String source;
    protected int growthStage;
    protected int growthTime; // days until harvest
    protected boolean regrowable = false;
    protected int regrowInterval; // days between harvests if regrowable
    protected int sellPrice;
    protected boolean edible = false;
    protected int energyGain;
    protected String season; // e.g., "Spring", "Summer", etc.
    protected boolean canBecomeGiant = false;
    protected boolean isGiant = false;
    protected int quality = 1;
    protected boolean spring = false;
    protected boolean summer = false;
    protected boolean winter = false;
    protected boolean fall = false;
    protected int stages;
    protected int level = 0;
    protected Skills skill;

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

    public Foraging setSellPrice(int sellPrice) {
        this.sellPrice = sellPrice;
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

    public Foraging setSkill(Skills skill) {
        this.skill = skill;
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

    public int getSellPrice() {
        return sellPrice;
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

    public Skills getSkill() {
        return skill;
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

    public Foraging setStages(int stages) {
        this.stages = stages;
        return this;
    }

    public int getStages() {
        return stages;
    }

    public int getLevel() {
        return level;
    }

    public Foraging  setLevel(int level) {
        this.level = level;
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
}
