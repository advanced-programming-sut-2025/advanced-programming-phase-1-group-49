package com.project.Builders.ForagingBuilderEnums;

import com.project.Models.Item.Foraging;

public enum ForagingCropBuilder {
    Coral(new Foraging().setName("Coral").setSource("Ocean").setBaseSellPrice(80).setEdible(false).setEnergyGain(0).setSummer(true).setCanBecomeGiant(false)),
    Seaweed(new Foraging().setName("Seaweed").setSource("Ocean").setBaseSellPrice(20).setEdible(true).setEnergyGain(13).setSummer(true).setCanBecomeGiant(false)),
    Clam(new Foraging().setName("Clam").setSource("Ocean").setBaseSellPrice(50).setEdible(true).setEnergyGain(15).setSummer(true).setCanBecomeGiant(false)),
    SeaUrchin(new Foraging().setName("Sea Urchin").setSource("Ocean").setBaseSellPrice(160).setEdible(false).setEnergyGain(0).setSummer(true).setCanBecomeGiant(false)),
    NautilusShell(new Foraging().setName("Nautilus Shell").setSource("Beach").setBaseSellPrice(120).setEdible(false).setEnergyGain(0).setWinter(true).setCanBecomeGiant(false)),
    CoralFan(new Foraging().setName("Coral Fan").setSource("Special").setBaseSellPrice(200).setEdible(false).setEnergyGain(0).setSpring(true).setSummer(true).setFall(true).setWinter(true).setCanBecomeGiant(false)),
    CommonMushroom(new Foraging().setName("Common Mushroom").setSource("Special").setBaseSellPrice(40).setEdible(true).setEnergyGain(38).setSpring(true).setSummer(true).setFall(true).setWinter(true).setCanBecomeGiant(false)),
    Daffodil(new Foraging().setName("Daffodil").setSource("Spring").setBaseSellPrice(30).setEdible(false).setEnergyGain(0).setSpring(true).setCanBecomeGiant(false)),
    Dandelion(new Foraging().setName("Dandelion").setSource("Spring").setBaseSellPrice(40).setEdible(true).setEnergyGain(25).setSpring(true).setCanBecomeGiant(false)),
    Leek(new Foraging().setName("Leek").setSource("Spring").setBaseSellPrice(60).setEdible(true).setEnergyGain(40).setSpring(true).setCanBecomeGiant(false)),
    Morel(new Foraging().setName("Morel").setSource("Spring").setBaseSellPrice(150).setEdible(true).setEnergyGain(20).setSpring(true).setCanBecomeGiant(false)),
    Salmonberry(new Foraging().setName("Salmonberry").setSource("Spring").setBaseSellPrice(5).setEdible(true).setEnergyGain(25).setSpring(true).setCanBecomeGiant(false)),
    SpringOnion(new Foraging().setName("Spring Onion").setSource("Spring").setBaseSellPrice(8).setEdible(true).setEnergyGain(13).setSpring(true).setCanBecomeGiant(false)),
    WildHorseradish(new Foraging().setName("Wild Horseradish").setSource("Spring").setBaseSellPrice(50).setEdible(true).setEnergyGain(13).setSpring(true).setCanBecomeGiant(false)),
    FiddleheadFern(new Foraging().setName("Fiddlehead Fern").setSource("Summer").setBaseSellPrice(90).setEdible(true).setEnergyGain(25).setSummer(true).setCanBecomeGiant(false)),
    Grape(new Foraging().setName("Grape").setSource("Summer").setBaseSellPrice(80).setEdible(true).setEnergyGain(38).setSummer(true).setCanBecomeGiant(false)),
    RedMushroom(new Foraging().setName("Red Mushroom").setSource("Summer").setBaseSellPrice(75).setEdible(true).setEnergyGain(-50).setSummer(true).setCanBecomeGiant(false)),
    SpiceBerry(new Foraging().setName("Spice Berry").setSource("Summer").setBaseSellPrice(80).setEdible(true).setEnergyGain(25).setSummer(true).setCanBecomeGiant(false)),
    SweetPea(new Foraging().setName("Sweet Pea").setSource("Summer").setBaseSellPrice(50).setEdible(false).setEnergyGain(0).setSummer(true).setCanBecomeGiant(false)),
    Blackberry(new Foraging().setName("Blackberry").setSource("Fall").setBaseSellPrice(25).setEdible(true).setEnergyGain(25).setFall(true).setCanBecomeGiant(false)),
    Chanterelle(new Foraging().setName("Chanterelle").setSource("Fall").setBaseSellPrice(160).setEdible(true).setEnergyGain(75).setFall(true).setCanBecomeGiant(false)),
    Hazelnut(new Foraging().setName("Hazelnut").setSource("Fall").setBaseSellPrice(40).setEdible(true).setEnergyGain(38).setFall(true).setCanBecomeGiant(false)),
    PurpleMushroom(new Foraging().setName("Purple Mushroom").setSource("Fall").setBaseSellPrice(90).setEdible(true).setEnergyGain(30).setFall(true).setCanBecomeGiant(false)),
    WildPlum(new Foraging().setName("Wild Plum").setSource("Fall").setBaseSellPrice(80).setEdible(true).setEnergyGain(25).setFall(true).setCanBecomeGiant(false)),
    Crocus(new Foraging().setName("Crocus").setSource("Winter").setBaseSellPrice(60).setEdible(false).setEnergyGain(0).setWinter(true).setCanBecomeGiant(false)),
    CrystalFruit(new Foraging().setName("Crystal Fruit").setSource("Winter").setBaseSellPrice(150).setEdible(true).setEnergyGain(63).setWinter(true).setCanBecomeGiant(false)),
    Holly(new Foraging().setName("Holly").setSource("Winter").setBaseSellPrice(80).setEdible(true).setEnergyGain(-37).setWinter(true).setCanBecomeGiant(false)),
    SnowYam(new Foraging().setName("Snow Yam").setSource("Winter").setBaseSellPrice(100).setEdible(true).setEnergyGain(30).setWinter(true).setCanBecomeGiant(false)),
    WinterRoot(new Foraging().setName("Winter Root").setSource("Winter").setBaseSellPrice(70).setEdible(true).setEnergyGain(25).setWinter(true).setCanBecomeGiant(false));

    public final Foraging foraging;

    ForagingCropBuilder(Foraging foraging) {
        this.foraging = foraging;
    }
}
