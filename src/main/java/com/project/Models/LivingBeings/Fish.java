package com.project.Models.LivingBeings;

import com.project.Models.Enums.FPLevel;
import com.project.Models.Enums.Skills;

public class Fish implements LivingBeings {
    protected String name;
    protected boolean spring = false;
    protected boolean summer = false;
    protected boolean fall = false;
    protected boolean winter = false;
    protected int sellPrice;
    protected Skills skill = Skills.Fishing;
    protected int level;
    protected FPLevel fishingPole;

    public boolean isWinter() {
        return winter;
    }

    public Fish setWinter(boolean winter) {
        this.winter = winter;
        return this;
    }

    public boolean isFall() {
        return fall;
    }

    public Fish setFall(boolean fall) {
        this.fall = fall;
        return this;
    }

    public boolean isSummer() {
        return summer;
    }

    public Fish setSummer(boolean summer) {
        this.summer = summer;
        return this;
    }

    public boolean isSpring() {
        return spring;
    }

    public Fish setSpring(boolean spring) {
        this.spring = spring;
        return this;
    }

    public String getName() {
        return name;
    }

    public Fish setName(String name) {
        this.name = name;
        return this;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public Fish setSellPrice(int sellPrice) {
        this.sellPrice = sellPrice;
        return this;
    }

    public Skills getSkill() {
        return skill;
    }

    public Fish setSkill(Skills skill) {
        this.skill = skill;
        return this;
    }

    public int getLevel() {
        return level;
    }

    public Fish setLevel(int level) {
        this.level = level;
        return this;
    }

    public FPLevel getFishingPole() {
        return fishingPole;
    }

    public Fish setFishingPole(FPLevel fishingPole) {
        this.fishingPole = fishingPole;
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
