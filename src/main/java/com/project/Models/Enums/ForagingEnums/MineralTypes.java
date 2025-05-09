package com.project.Models.Enums.ForagingEnums;

import com.project.Models.Item.Foraging;

public enum MineralTypes {
    Quartz(new Foraging().setName("Quartz").setBaseSellPrice(25)),
    EarthCrystal(new Foraging().setName("EarthCrystal").setBaseSellPrice(50)),
    FrozenTear(new Foraging().setName("FrozenTear").setBaseSellPrice(75)),
    FireQuartz(new Foraging().setName("FireQuartz").setBaseSellPrice(100)),
    Emerald(new Foraging().setName("Emerald").setBaseSellPrice(250)),
    Aquamarine(new Foraging().setName("Aquamarine").setBaseSellPrice(180)),
    Ruby(new Foraging().setName("Ruby").setBaseSellPrice(250)),
    Amethyst(new Foraging().setName("Amethyst").setBaseSellPrice(100)),
    Topaz(new Foraging().setName("Topaz").setBaseSellPrice(80)),
    Jade(new Foraging().setName("Jade").setBaseSellPrice(200)),
    Diamond(new Foraging().setName("Diamond").setBaseSellPrice(750)),
    PrismaticShard(new Foraging().setName("PrismaticShard").setBaseSellPrice(2000)),
    Copper(new Foraging().setName("Copper").setBaseSellPrice(5)),
    Iron(new Foraging().setName("Iron").setBaseSellPrice(10)),
    Gold(new Foraging().setName("Gold").setBaseSellPrice(25)),
    Iridium(new Foraging().setName("Iridium").setBaseSellPrice(100)),
    Coal(new Foraging().setName("Coal").setBaseSellPrice(15)),
    ;

    final Foraging foraging;
    MineralTypes(Foraging foraging) {
        this.foraging = foraging;
    }
}
