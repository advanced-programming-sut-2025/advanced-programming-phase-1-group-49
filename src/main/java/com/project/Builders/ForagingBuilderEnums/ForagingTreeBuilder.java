package com.project.Builders.ForagingBuilderEnums;

import com.project.Models.Item.Foraging;

public enum ForagingTreeBuilder {
    ApricotTree(new Foraging().setName("Apricot Tree").setSource("Apricot Sapling").setStages(7777).setGrowthTime(28).setRegrowable(true).setRegrowInterval(1).setSpring(true)),
    CherryTree(new Foraging().setName("Cherry Tree").setSource("Cherry Sapling").setStages(7777).setGrowthTime(28).setRegrowable(true).setRegrowInterval(1).setSpring(true)),
    BananaTree(new Foraging().setName("Banana Tree").setSource("Banana Sapling").setStages(7777).setGrowthTime(28).setRegrowable(true).setRegrowInterval(1).setSummer(true)),
    MangoTree(new Foraging().setName("Mango Tree").setSource("Mango Sapling").setStages(7777).setGrowthTime(28).setRegrowable(true).setRegrowInterval(1).setSummer(true)),
    OrangeTree(new Foraging().setName("Orange Tree").setSource("Orange Sapling").setStages(7777).setGrowthTime(28).setRegrowable(true).setRegrowInterval(1).setSummer(true)),
    PeachTree(new Foraging().setName("Peach Tree").setSource("Peach Sapling").setStages(7777).setGrowthTime(28).setRegrowable(true).setRegrowInterval(1).setSummer(true)),
    AppleTree(new Foraging().setName("Apple Tree").setSource("Apple Sapling").setStages(7777).setGrowthTime(28).setRegrowable(true).setRegrowInterval(1).setFall(true)),
    PomegranateTree(new Foraging().setName("Pomegranate Tree").setSource("Pomegranate Sapling").setStages(7777).setGrowthTime(28).setRegrowable(true).setRegrowInterval(1).setFall(true)),
    OakTree(new Foraging().setName("Oak Tree").setSource("Acorns").setStages(7777).setGrowthTime(28).setRegrowable(true).setRegrowInterval(7).setSpring(true).setSummer(true).setFall(true).setWinter(true)),
    MapleTree(new Foraging().setName("Maple Tree").setSource("Maple Seeds").setStages(7777).setGrowthTime(28).setRegrowable(true).setRegrowInterval(9).setSpring(true).setSummer(true).setFall(true).setWinter(true)),
    PineTree(new Foraging().setName("Pine Tree").setSource("Pine Cones").setStages(7777).setGrowthTime(28).setRegrowable(true).setRegrowInterval(5).setSpring(true).setSummer(true).setFall(true).setWinter(true)),
    MahoganyTree(new Foraging().setName("Mahogany Tree").setSource("Mahogany Seeds").setStages(7777).setGrowthTime(28).setRegrowable(true).setRegrowInterval(1).setSpring(true).setSummer(true).setFall(true).setWinter(true)),
    MushroomTree(new Foraging().setName("Mushroom Tree").setSource("Mushroom Tree Seeds").setStages(7777).setGrowthTime(28).setRegrowable(true).setRegrowInterval(1).setSpring(true).setSummer(true).setFall(true).setWinter(true)),
    MysticTree(new Foraging().setName("Mystic Tree").setSource("Mystic Tree Seeds").setStages(7777).setGrowthTime(28).setRegrowable(true).setRegrowInterval(7).setSpring(true).setSummer(true).setFall(true).setWinter(true));

    public final Foraging foraging;

    ForagingTreeBuilder(Foraging foraging) {
        this.foraging = foraging;
    }
}
