package com.project.Models.Item;

import com.project.Models.Enums.Skills;

public class Foraging implements Item {
    protected String name = "";
    protected String source = "";
    protected int growthStage = -1;
    protected int growthTime = -1; // days until harvest
    protected boolean regrowable = false;
    protected int regrowInterval = -1; // days between harvests if regrowable
    protected int sellPrice = -1;
    protected boolean edible = false;
    protected int energyGain = -1;
    protected String season = null; // e.g., "Spring", "Summer", etc.
    protected boolean canBecomeGiant = false;
    protected boolean isGiant = false;
    protected int quality = 1;
    protected boolean spring = false;
    protected boolean summer = false;
    protected boolean winter = false;
    protected boolean fall = false;
    protected int stages = -1;
    protected int level = 0;
    protected Skills skill;

    public Foraging() {
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

    public Foraging setSpring(boolean spring) {
        this.spring = spring;
        return this;
    }

    public Foraging setSummer(boolean summer) {
        this.summer = summer;
        return this;
    }

    public Foraging setWinter(boolean winter) {
        this.winter = winter;
        return this;
    }

    public Foraging setLevel(int level) {
        this.level = level;
        return this;
    }

    public Foraging setFall(boolean fall) {
        this.fall = fall;
        return this;
    }

    public Foraging setStages(int stages) {
        this.stages = stages;
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

    public Skills getSkill() {
        return skill;
    }

    public int getStages() {
        return stages;
    }

    public int getLevel() {
        return level;
    }

    // check

    public boolean isEdible() {
        return edible;
    }

    public boolean isSpring() {
        return spring;
    }

    public boolean isSummer() {
        return summer;
    }

    public boolean isWinter() {
        return winter;
    }

    public boolean isFall() {
        return fall;
    }

    // Override

    @Override
    public void passByHour() {
        // Implementation if needed
    }

    @Override
    public void passByDay() {
        // Implementation if needed
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
