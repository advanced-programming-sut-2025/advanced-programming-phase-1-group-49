package com.project.Models.Enums.ForagingEnums;

import com.project.Models.Item.Foraging;

public enum MineralTypes {
    Quartz(new Foraging().setName("Quartz").setBaseSellPrice(25)),
    EarthCrystal(new Foraging().setName("EarthCrystal").setBaseSellPrice(50)),
    FrozenTear(new Foraging().setName("FrozenTear").setBaseSellPrice(75)),
    FireQuartz(new Foraging().setName("FireQuartz")),
    Emerald(new Foraging().setName("Emerald")),
    Aquamarine(new Foraging().setName("Aquamarine")),
    Ruby(new Foraging().setName("Ruby")),
    Amethyst(new Foraging().setName("Amethyst")),
    Topaz(new Foraging().setName("Topaz")),
    Jade(new Foraging().setName("Jade")),
    Diamond(new Foraging().setName("Diamond")),
    PrismaticShard(new Foraging().setName("PrismaticShard")),
    Copper(new Foraging().setName("Copper")),
    Iron(new Foraging().setName("Iron")),
    Gold(new Foraging().setName("Gold")),
    Iridium(new Foraging().setName("Iridium")),
    Coal(new Foraging().setName("Coal")),
    ;

    final Foraging foraging;
    MineralTypes(Foraging foraging) {
        this.foraging = foraging;
    }
}
