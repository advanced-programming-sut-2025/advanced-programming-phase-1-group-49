package com.project.Builders.ForagingBuilderEnums;

import com.project.Models.Item.Foraging;

public enum ForagingTreeBuilder {
    APRICOTTREE(new Foraging().setName("Apricot Tree").setSource("Apricot Sapling").setStages(7777).setGrowthTime(28).setRegrowable(true).setRegrowInterval(1).setSpring(true)),
    CHERRYTREE(new Foraging().setName("Cherry Tree").setSource("Cherry Sapling").setStages(7777).setGrowthTime(28).setRegrowable(true).setRegrowInterval(1).setSpring(true)),
    BANANATREE(new Foraging().setName("Banana Tree").setSource("Banana Sapling").setStages(7777).setGrowthTime(28).setRegrowable(true).setRegrowInterval(1).setSummer(true)),
    MANGOTREE(new Foraging().setName("Mango Tree").setSource("Mango Sapling").setStages(7777).setGrowthTime(28).setRegrowable(true).setRegrowInterval(1).setSummer(true)),
    ORANGETREE(new Foraging().setName("Orange Tree").setSource("Orange Sapling").setStages(7777).setGrowthTime(28).setRegrowable(true).setRegrowInterval(1).setSummer(true)),
    PEACHTREE(new Foraging().setName("Peach Tree").setSource("Peach Sapling").setStages(7777).setGrowthTime(28).setRegrowable(true).setRegrowInterval(1).setSummer(true)),
    APPLETREE(new Foraging().setName("Apple Tree").setSource("Apple Sapling").setStages(7777).setGrowthTime(28).setRegrowable(true).setRegrowInterval(1).setFall(true)),
    POMEGRANATETREE(new Foraging().setName("Pomegranate Tree").setSource("Pomegranate Sapling").setStages(7777).setGrowthTime(28).setRegrowable(true).setRegrowInterval(1).setFall(true)),
    OAKTREE(new Foraging().setName("Oak Tree").setSource("Acorns").setStages(7777).setGrowthTime(28).setRegrowable(true).setRegrowInterval(7).setSpring(true).setSummer(true).setFall(true).setWinter(true)),
    MAPLETREE(new Foraging().setName("Maple Tree").setSource("Maple Seeds").setStages(7777).setGrowthTime(28).setRegrowable(true).setRegrowInterval(9).setSpring(true).setSummer(true).setFall(true).setWinter(true)),
    PINETREE(new Foraging().setName("Pine Tree").setSource("Pine Cones").setStages(7777).setGrowthTime(28).setRegrowable(true).setRegrowInterval(5).setSpring(true).setSummer(true).setFall(true).setWinter(true)),
    MAHOGANYTREE(new Foraging().setName("Mahogany Tree").setSource("Mahogany Seeds").setStages(7777).setGrowthTime(28).setRegrowable(true).setRegrowInterval(1).setSpring(true).setSummer(true).setFall(true).setWinter(true)),
    MUSHROOMTREE(new Foraging().setName("Mushroom Tree").setSource("Mushroom Tree Seeds").setStages(7777).setGrowthTime(28).setRegrowable(true).setRegrowInterval(1).setSpring(true).setSummer(true).setFall(true).setWinter(true)),
    MYSTICTREE(new Foraging().setName("Mystic Tree").setSource("Mystic Tree Seeds").setStages(7777).setGrowthTime(28).setRegrowable(true).setRegrowInterval(7).setSpring(true).setSummer(true).setFall(true).setWinter(true));

    public final Foraging foraging;
    ForagingTreeBuilder(Foraging foraging) { this.foraging = foraging; }
}