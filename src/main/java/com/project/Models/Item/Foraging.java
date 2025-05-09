package com.project.Models.Item;

public class Foraging implements Item {

    private String name;
    private String source;
    private int growthTime; // days until harvest
    private boolean regrowable;
    private int regrowInterval; // days between harvests if regrowable
    private int baseSellPrice;
    private boolean edible;
    private int energyGain;
    private String season; // e.g., "Spring", "Summer", etc.
    private boolean canBecomeGiant;

    public Foraging(String name, String source, int growthTime, boolean regrowable, int regrowInterval,
                    int baseSellPrice, boolean edible, int energyGain, String season, boolean canBecomeGiant) {
        this.name = name;
        this.source = source;
        this.growthTime = growthTime;
        this.regrowable = regrowable;
        this.regrowInterval = regrowInterval;
        this.baseSellPrice = baseSellPrice;
        this.edible = edible;
        this.energyGain = energyGain;
        this.season = season;
        this.canBecomeGiant = canBecomeGiant;
    }

    @Override
    public void passByHour() {
        // Implementation if needed
    }

    @Override
    public void passByDay() {
        // Implementation if needed
    }

    // Getters and Setters

    public String getName() {
        return name;
    }

    public String getSource() {
        return source;
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

    public boolean canBecomeGiant() {
        return canBecomeGiant;
    }
}
