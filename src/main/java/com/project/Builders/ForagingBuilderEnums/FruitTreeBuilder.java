package com.project.Builders.ForagingBuilderEnums;

import com.project.Models.Item.Foraging;

public enum FruitTreeBuilder {
    Acorn(new Foraging().setName("Acorn").setSpring(true).setSummer(true).setFall(true).setWinter(true)),
    MapleSeeds(new Foraging().setName("MapleSeeds").setSpring(true).setSummer(true).setFall(true).setWinter(true)),
    PineCones(new Foraging().setName("PineCones").setSpring(true).setSummer(true).setFall(true)),
    MahoganySeeds(new Foraging().setName("MahoganySeeds").setSpring(true).setSummer(true).setFall(true)),
    MushroomTreeSeeds(new Foraging().setName("MushroomTreeSeeds").setSpring(true).setSummer(true).setFall(true)),
    ;

    public final Foraging foraging;

    FruitTreeBuilder(Foraging foraging) {
        this.foraging = foraging;
    }
}
