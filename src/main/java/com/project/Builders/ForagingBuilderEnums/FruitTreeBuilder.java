package com.project.Builders.ForagingBuilderEnums;

import com.project.Models.Item.Foraging;

public enum FruitTreeBuilder {
    Apricot(new Foraging().setName("Apricot").setSource("Apricot Tree").setBaseSellPrice(59).setEdible(true).setEnergyGain(38).setSpring(true)),
    Cherry(new Foraging().setName("Cherry").setSource("Cherry Tree").setBaseSellPrice(80).setEdible(true).setEnergyGain(38).setSpring(true)),
    Banana(new Foraging().setName("Banana").setSource("Banana Tree").setBaseSellPrice(150).setEdible(true).setEnergyGain(75).setSummer(true)),
    Mango(new Foraging().setName("Mango").setSource("Mango Tree").setBaseSellPrice(130).setEdible(true).setEnergyGain(100).setSummer(true)),
    Orange(new Foraging().setName("Orange").setSource("Orange Tree").setBaseSellPrice(100).setEdible(true).setEnergyGain(38).setSummer(true)),
    Peach(new Foraging().setName("Peach").setSource("Peach Tree").setBaseSellPrice(140).setEdible(true).setEnergyGain(38).setSummer(true)),
    Apple(new Foraging().setName("Apple").setSource("Apple Tree").setBaseSellPrice(100).setEdible(true).setEnergyGain(38).setFall(true)),
    Pomegranate(new Foraging().setName("Pomegranate").setSource("Pomegranate Tree").setBaseSellPrice(140).setEdible(true).setEnergyGain(38).setFall(true)),
    OakResin(new Foraging().setName("Oak Resin").setSource("Oak Tree").setBaseSellPrice(150).setEdible(false).setSpring(true).setSummer(true).setFall(true).setWinter(true)),
    MapleSyrup(new Foraging().setName("Maple Syrup").setSource("Maple Tree").setBaseSellPrice(200).setEdible(false).setSpring(true).setSummer(true).setFall(true).setWinter(true)),
    PineTar(new Foraging().setName("Pine Tar").setSource("Pine Tree").setBaseSellPrice(100).setEdible(false).setSpring(true).setSummer(true).setFall(true).setWinter(true)),
    Sap(new Foraging().setName("Sap").setSource("Mahogany Tree").setBaseSellPrice(2).setEdible(true).setEnergyGain(-2).setSpring(true).setSummer(true).setFall(true).setWinter(true)),
    CommonMushroom(new Foraging().setName("Common Mushroom").setSource("Mushroom Tree").setBaseSellPrice(40).setEdible(true).setEnergyGain(38).setSpring(true).setSummer(true).setFall(true).setWinter(true)),
    MysticSyrup(new Foraging().setName("Mystic Syrup").setSource("Mystic Tree").setBaseSellPrice(1000).setEdible(true).setEnergyGain(500).setSpring(true).setSummer(true).setFall(true).setWinter(true));

    public final Foraging foraging;

    FruitTreeBuilder(Foraging foraging) {
        this.foraging = foraging;
    }
}
