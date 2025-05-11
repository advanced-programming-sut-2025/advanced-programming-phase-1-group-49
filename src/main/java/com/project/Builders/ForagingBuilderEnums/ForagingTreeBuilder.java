package com.project.Builders.ForagingBuilderEnums;

import com.project.Models.Item.Foraging;

public enum ForagingTreeBuilder {
    OakTree(new Foraging().setName("OakTree").setSource("Forest").setBaseSellPrice(0).setEdible(false).setEnergyGain(0).setSpring(true).setSummer(true).setFall(true).setCanBecomeGiant(false)),
    MapleTree(new Foraging().setName("MapleTree").setSource("Forest").setBaseSellPrice(0).setEdible(false).setEnergyGain(0).setSpring(true).setSummer(true).setFall(true).setCanBecomeGiant(false)),
    PineTree(new Foraging().setName("PineTree").setSource("Forest").setBaseSellPrice(0).setEdible(false).setEnergyGain(0).setSpring(true).setSummer(true).setFall(true).setWinter(true).setCanBecomeGiant(false)),
    MahoganyTree(new Foraging().setName("MahoganyTree").setSource("Island").setBaseSellPrice(0).setEdible(false).setEnergyGain(0).setSpring(true).setSummer(true).setFall(true).setCanBecomeGiant(false)),
    MushroomTree(new Foraging().setName("MushroomTree").setSource("Special").setBaseSellPrice(0).setEdible(false).setEnergyGain(0).setFall(true).setCanBecomeGiant(false));

    final Foraging foraging;

    ForagingTreeBuilder(Foraging foraging) {
        this.foraging = foraging;
    }
}
