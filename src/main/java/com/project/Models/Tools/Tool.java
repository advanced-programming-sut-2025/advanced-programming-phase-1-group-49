package com.project.Models.Tools;

import com.project.Models.Enums.ToolLevel;
import com.project.Models.Map.GameObject;
import com.project.Models.Time.ObserveTime;

public class Tool implements ObserveTime, GameObject {
    String owner;
    String name;
    int energy;
    int complement = 0;
    ToolLevel level;
    int cost = 0;


    boolean digging = false;
    boolean breakStone = false;
    boolean undig = false;
    boolean deleteItem = false;
    boolean cutTree = false;
    boolean deleteBranches = false;
    boolean watering = false;
    boolean takeWater = false;
    boolean fishing = false;
    boolean cutWeed = false;
    boolean reap = false;
    boolean milking = false;
    boolean shearing = false;

    public String getOwner() {
        return owner;
    }

    public Tool setOwner(String owner) {
        this.owner = owner;
        return this;
    }

    public ToolLevel getLevel() {
        return level;
    }

    public Tool setLevel(ToolLevel level) {
        this.level = level;
        return this;
    }

    public String getName() {
        return name;
    }

    public Tool setName(String name) {
        this.name = name;
        return this;
    }

    public int getComplement() {
        return complement;
    }

    public Tool setComplement(int complement) {
        this.complement = complement;
        return this;
    }

    public int getEnergy() {
        return energy;
    }

    public Tool setEnergy(int energy) {
        this.energy = energy;
        return this;
    }

    public boolean isDigging() {
        return digging;
    }

    public Tool setDigging(boolean digging) {
        this.digging = digging;
        return this;
    }

    public boolean isBreakStone() {
        return breakStone;
    }

    public Tool setBreakStone(boolean breakStone) {
        this.breakStone = breakStone;
        return this;
    }

    public boolean isUndig() {
        return undig;
    }

    public Tool setUndig(boolean undig) {
        this.undig = undig;
        return this;
    }

    public boolean isCutTree() {
        return cutTree;
    }

    public Tool setCutTree(boolean cutTree) {
        this.cutTree = cutTree;
        return this;
    }

    public boolean isDeleteBranches() {
        return deleteBranches;
    }

    public Tool setDeleteBranches(boolean deleteBranches) {
        this.deleteBranches = deleteBranches;
        return this;
    }

    public boolean isDeleteItem() {
        return deleteItem;
    }

    public Tool setDeleteItem(boolean deleteItem) {
        this.deleteItem = deleteItem;
        return this;
    }

    public boolean isTakeWater() {
        return takeWater;
    }

    public Tool setTakeWater(boolean takeWater) {
        this.takeWater = takeWater;
        return this;
    }

    public boolean isWatering() {
        return watering;
    }

    public Tool setWatering(boolean watering) {
        this.watering = watering;
        return this;
    }

    public boolean isCutWeed() {
        return cutWeed;
    }

    public Tool setCutWeed(boolean cutWeed) {
        this.cutWeed = cutWeed;
        return this;
    }

    public boolean isFishing() {
        return fishing;
    }

    public Tool setFishing(boolean fishing) {
        this.fishing = fishing;
        return this;
    }

    public boolean isReap() {
        return reap;
    }

    public Tool setReap(boolean reap) {
        this.reap = reap;
        return this;
    }

    public boolean isShearing() {
        return shearing;
    }

    public Tool setShearing(boolean shearing) {
        this.shearing = shearing;
        return this;
    }

    public boolean isMilking() {
        return milking;
    }

    public Tool setMilking(boolean milking) {
        this.milking = milking;
        return this;
    }

    public Tool() {

    }

    public void decreaseEnergy() {

    }

    public void toolBehaviour() {

    }

    public int getCost() {
        return cost;
    }

    public Tool setCost(int cost) {
        this.cost = cost;
        return this;
    }

    @Override
    public void passByHour() {

    }

    @Override
    public void passByDay() {

    }

    @Override
    public String tooString() {
        return "";
    }
}