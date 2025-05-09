package com.project.Models.Enums.ForagingEnums;

import com.project.Models.Item.Foraging;

public enum ForagingSeedTypes {
    SpringSeeds(new Foraging().setName("SpringSeeds").setSource("WildSeeds").setBaseSellPrice(35).setEdible(false).setEnergyGain(0).setSpring(true).setCanBecomeGiant(false)),
    SummerSeeds(new Foraging().setName("SummerSeeds").setSource("WildSeeds").setBaseSellPrice(55).setEdible(false).setEnergyGain(0).setSummer(true).setCanBecomeGiant(false)),
    FallSeeds(new Foraging().setName("FallSeeds").setSource("WildSeeds").setBaseSellPrice(62).setEdible(false).setEnergyGain(0).setFall(true).setCanBecomeGiant(false)),
    WinterSeeds(new Foraging().setName("WinterSeeds").setSource("WildSeeds").setBaseSellPrice(100).setEdible(false).setEnergyGain(0).setWinter(true).setCanBecomeGiant(false)),
    AncientSeeds(new Foraging().setName("AncientSeeds").setSource("Artifact").setBaseSellPrice(550).setEdible(false).setEnergyGain(0).setSpring(true).setSummer(true).setFall(true).setCanBecomeGiant(false)),
    RareSeed(new Foraging().setName("RareSeed").setSource("TravelingCart").setBaseSellPrice(1000).setEdible(false).setEnergyGain(0).setFall(true).setCanBecomeGiant(false));

    final Foraging foraging;

    ForagingSeedTypes(Foraging foraging) {
        this.foraging = foraging;
    }
}
