package com.project.Builders.ForagingBuilderEnums;

import com.project.Models.Item.Foraging;

public enum ForagingCropBuilder {
    Coral(new Foraging().setName("Coral").setSource("Ocean").setBaseSellPrice(80).setEdible(false).setEnergyGain(0).setSummer(true).setCanBecomeGiant(false)),
    Seaweed(new Foraging().setName("Seaweed").setSource("Ocean").setBaseSellPrice(20).setEdible(true).setEnergyGain(13).setSummer(true).setCanBecomeGiant(false)),
    Clam(new Foraging().setName("Clam").setSource("Ocean").setBaseSellPrice(50).setEdible(true).setEnergyGain(15).setSummer(true).setCanBecomeGiant(false)),
    SeaUrchin(new Foraging().setName("SeaUrchin").setSource("Ocean").setBaseSellPrice(160).setEdible(false).setEnergyGain(0).setSummer(true).setCanBecomeGiant(false)),
    NautilusShell(new Foraging().setName("NautilusShell").setSource("Beach").setBaseSellPrice(120).setEdible(false).setEnergyGain(0).setWinter(true).setCanBecomeGiant(false)),
    CoralFan(new Foraging().setName("CoralFan").setSource("Special").setBaseSellPrice(200).setEdible(false).setEnergyGain(0).setSpring(true).setSummer(true).setFall(true).setWinter(true).setCanBecomeGiant(false));

    public final Foraging foraging;

    ForagingCropBuilder(Foraging foraging) {
        this.foraging = foraging;
    }
}
