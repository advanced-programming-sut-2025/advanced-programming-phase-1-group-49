package com.project.Builders.BuilderEnums;

import com.project.Models.Item.Foraging;

public enum MineralBuilder {
    Quartz(new Foraging().setName("Quartz").setSellPrice(25)),
    EarthCrystal(new Foraging().setName("EarthCrystal").setSellPrice(50)),
    FrozenTear(new Foraging().setName("FrozenTear").setSellPrice(75)),
    FireQuartz(new Foraging().setName("FireQuartz").setSellPrice(100)),
    Emerald(new Foraging().setName("Emerald").setSellPrice(250)),
    Aquamarine(new Foraging().setName("Aquamarine").setSellPrice(180)),
    Ruby(new Foraging().setName("Ruby").setSellPrice(250)),
    Amethyst(new Foraging().setName("Amethyst").setSellPrice(100)),
    Topaz(new Foraging().setName("Topaz").setSellPrice(80)),
    Jade(new Foraging().setName("Jade").setSellPrice(200)),
    Diamond(new Foraging().setName("Diamond").setSellPrice(750)),
    PrismaticShard(new Foraging().setName("PrismaticShard").setSellPrice(2000)),
    Copper(new Foraging().setName("Copper").setSellPrice(5)),
    Iron(new Foraging().setName("Iron").setSellPrice(10)),
    Gold(new Foraging().setName("Gold").setSellPrice(25)),
    Iridium(new Foraging().setName("Iridium").setSellPrice(100)),
    Coal(new Foraging().setName("Coal").setSellPrice(15)),

    // some additional Foragings
    Wood(new Foraging().setName("Wood")),
    Fiber(new Foraging().setName("Fiber")),
    Stone(new Foraging().setName("Stone")),
    ;

    public final Foraging foraging;
    MineralBuilder(Foraging foraging) {
        this.foraging = foraging;
    }
}
