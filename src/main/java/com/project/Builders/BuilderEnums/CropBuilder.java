package com.project.Builders.BuilderEnums;

import com.project.Models.Item.Foraging;

public enum CropBuilder {
    BlueJazz(new Foraging().setName("Blue Jazz").setSource("Jazz Seeds").setStages(1222).setGrowthTime(7).setRegrowable(false).setBaseSellPrice(50).setEdible(true).setEnergyGain(45).setSpring(true).setCanBecomeGiant(false)),
    Carrot(new Foraging().setName("Carrot").setSource("Carrot Seeds").setStages(111).setGrowthTime(3).setRegrowable(false).setBaseSellPrice(35).setEdible(true).setEnergyGain(75).setSpring(true).setCanBecomeGiant(false)),
    Cauliflower(new Foraging().setName("Cauliflower").setSource("Cauliflower Seeds").setStages(12441).setGrowthTime(12).setRegrowable(false).setBaseSellPrice(175).setEdible(true).setEnergyGain(75).setSpring(true).setCanBecomeGiant(true)),
    CoffeeBean(new Foraging().setName("Coffee Bean").setSource("Coffee Bean").setStages(12232).setGrowthTime(10).setRegrowable(true).setRegrowInterval(2).setBaseSellPrice(15).setSpring(true).setSummer(true).setCanBecomeGiant(false)),
    Garlic(new Foraging().setName("Garlic").setSource("Garlic Seeds").setStages(1111).setGrowthTime(4).setRegrowable(false).setBaseSellPrice(60).setEdible(true).setEnergyGain(20).setSpring(true).setCanBecomeGiant(false)),
    GreenBean(new Foraging().setName("Green Bean").setSource("Bean Starter").setStages(11134).setGrowthTime(10).setRegrowable(true).setRegrowInterval(3).setBaseSellPrice(40).setEdible(true).setEnergyGain(25).setSpring(true).setCanBecomeGiant(false)),
    Kale(new Foraging().setName("Kale").setSource("Kale Seeds").setStages(1221).setGrowthTime(6).setRegrowable(false).setBaseSellPrice(110).setEdible(true).setEnergyGain(50).setSpring(true).setCanBecomeGiant(false)),
    Parsnip(new Foraging().setName("Parsnip").setSource("Parsnip Seeds").setStages(1111).setGrowthTime(4).setRegrowable(false).setBaseSellPrice(35).setEdible(true).setEnergyGain(25).setSpring(true).setCanBecomeGiant(false)),
    Potato(new Foraging().setName("Potato").setSource("Potato Seeds").setStages(11121).setGrowthTime(6).setRegrowable(false).setBaseSellPrice(80).setEdible(true).setEnergyGain(25).setSpring(true).setCanBecomeGiant(false)),
    Rhubarb(new Foraging().setName("Rhubarb").setSource("Rhubarb Seeds").setStages(22234).setGrowthTime(13).setRegrowable(false).setBaseSellPrice(220).setEdible(true).setEnergyGain(0).setSpring(true).setCanBecomeGiant(false)),
    Strawberry(new Foraging().setName("Strawberry").setSource("Strawberry Seeds").setStages(11222).setGrowthTime(8).setRegrowable(true).setRegrowInterval(4).setBaseSellPrice(120).setEdible(true).setEnergyGain(50).setSpring(true).setCanBecomeGiant(false)),
    Tulip(new Foraging().setName("Tulip").setSource("Tulip Bulb").setStages(1122).setGrowthTime(6).setRegrowable(false).setBaseSellPrice(30).setEdible(true).setEnergyGain(45).setSpring(true).setCanBecomeGiant(false)),
    UnmilledRice(new Foraging().setName("Unmilled Rice").setSource("Rice Shoot").setStages(1223).setGrowthTime(8).setRegrowable(false).setBaseSellPrice(30).setEdible(true).setEnergyGain(3).setSpring(true).setCanBecomeGiant(false)),
    Blueberry(new Foraging().setName("Blueberry").setSource("Blueberry Seeds").setStages(13342).setGrowthTime(13).setRegrowable(true).setRegrowInterval(4).setBaseSellPrice(50).setEdible(true).setEnergyGain(25).setSummer(true).setCanBecomeGiant(false)),
    Corn(new Foraging().setName("Corn").setSource("Corn Seeds").setStages(23333).setGrowthTime(14).setRegrowable(true).setRegrowInterval(4).setBaseSellPrice(50).setEdible(true).setEnergyGain(25).setSummer(true).setFall(true).setCanBecomeGiant(false)),
    Hops(new Foraging().setName("Hops").setSource("Hops Starter").setStages(11234).setGrowthTime(11).setRegrowable(true).setRegrowInterval(1).setBaseSellPrice(25).setEdible(true).setEnergyGain(45).setSummer(true).setCanBecomeGiant(false)),
    HotPepper(new Foraging().setName("Hot Pepper").setSource("Pepper Seeds").setStages(11111).setGrowthTime(5).setRegrowable(true).setRegrowInterval(3).setBaseSellPrice(40).setEdible(true).setEnergyGain(13).setSummer(true).setCanBecomeGiant(false)),
    Melon(new Foraging().setName("Melon").setSource("Melon Seeds").setStages(12333).setGrowthTime(12).setRegrowable(false).setBaseSellPrice(250).setEdible(true).setEnergyGain(113).setSummer(true).setCanBecomeGiant(true)),
    Poppy(new Foraging().setName("Poppy").setSource("Poppy Seeds").setStages(1222).setGrowthTime(7).setRegrowable(false).setBaseSellPrice(140).setEdible(true).setEnergyGain(45).setSummer(true).setCanBecomeGiant(false)),
    Radish(new Foraging().setName("Radish").setSource("Radish Seeds").setStages(2121).setGrowthTime(6).setRegrowable(false).setBaseSellPrice(90).setEdible(true).setEnergyGain(45).setSummer(true).setCanBecomeGiant(false)),
    RedCabbage(new Foraging().setName("Red Cabbage").setSource("Red Cabbage Seeds").setStages(21222).setGrowthTime(9).setRegrowable(false).setBaseSellPrice(260).setEdible(true).setEnergyGain(75).setSummer(true).setCanBecomeGiant(false)),
    Starfruit(new Foraging().setName("Starfruit").setSource("Starfruit Seeds").setStages(23233).setGrowthTime(13).setRegrowable(false).setBaseSellPrice(750).setEdible(true).setEnergyGain(125).setSummer(true).setCanBecomeGiant(false)),
    SummerSpangle(new Foraging().setName("Summer Spangle").setSource("Spangle Seeds").setStages(1231).setGrowthTime(8).setRegrowable(false).setBaseSellPrice(90).setEdible(true).setEnergyGain(45).setSummer(true).setCanBecomeGiant(false)),
    SummerSquash(new Foraging().setName("Summer Squash").setSource("Summer Squash Seeds").setStages(11121).setGrowthTime(6).setRegrowable(true).setRegrowInterval(3).setBaseSellPrice(45).setEdible(true).setEnergyGain(63).setSummer(true).setCanBecomeGiant(false)),
    Sunflower(new Foraging().setName("Sunflower").setSource("Sunflower Seeds").setStages(1232).setGrowthTime(8).setRegrowable(false).setBaseSellPrice(80).setEdible(true).setEnergyGain(45).setSummer(true).setFall(true).setCanBecomeGiant(false)),
    Tomato(new Foraging().setName("Tomato").setSource("Tomato Seeds").setStages(22223).setGrowthTime(11).setRegrowable(true).setRegrowInterval(4).setBaseSellPrice(60).setEdible(true).setEnergyGain(20).setSummer(true).setCanBecomeGiant(false)),
    Wheat(new Foraging().setName("Wheat").setSource("Wheat Seeds").setStages(1111).setGrowthTime(4).setRegrowable(false).setBaseSellPrice(25).setEdible(false).setSummer(true).setFall(true).setCanBecomeGiant(false)),
    Amaranth(new Foraging().setName("Amaranth").setSource("Amaranth Seeds").setStages(1222).setGrowthTime(7).setRegrowable(false).setBaseSellPrice(150).setEdible(true).setEnergyGain(50).setFall(true).setCanBecomeGiant(false)),
    Artichoke(new Foraging().setName("Artichoke").setSource("Artichoke Seeds").setStages(22121).setGrowthTime(8).setRegrowable(false).setBaseSellPrice(160).setEdible(true).setEnergyGain(30).setFall(true).setCanBecomeGiant(false)),
    Beet(new Foraging().setName("Beet").setSource("Beet Seeds").setStages(1122).setGrowthTime(6).setRegrowable(false).setBaseSellPrice(100).setEdible(true).setEnergyGain(30).setFall(true).setCanBecomeGiant(false)),
    BokChoy(new Foraging().setName("Bok Choy").setSource("Bok Choy Seeds").setStages(1111).setGrowthTime(4).setRegrowable(false).setBaseSellPrice(80).setEdible(true).setEnergyGain(25).setFall(true).setCanBecomeGiant(false)),
    Broccoli(new Foraging().setName("Broccoli").setSource("Broccoli Seeds").setStages(2222).setGrowthTime(8).setRegrowable(true).setRegrowInterval(4).setBaseSellPrice(70).setEdible(true).setEnergyGain(63).setFall(true).setCanBecomeGiant(false)),
    Cranberries(new Foraging().setName("Cranberries").setSource("Cranberry Seeds").setStages(12112).setGrowthTime(7).setRegrowable(true).setRegrowInterval(5).setBaseSellPrice(75).setEdible(true).setEnergyGain(38).setFall(true).setCanBecomeGiant(false)),
    Eggplant(new Foraging().setName("Eggplant").setSource("Eggplant Seeds").setStages(1111).setGrowthTime(5).setRegrowable(true).setRegrowInterval(5).setBaseSellPrice(60).setEdible(true).setEnergyGain(20).setFall(true).setCanBecomeGiant(false)),
    FairyRose(new Foraging().setName("Fairy Rose").setSource("Fairy Seeds").setStages(1443).setGrowthTime(12).setRegrowable(false).setBaseSellPrice(290).setEdible(true).setEnergyGain(45).setFall(true).setCanBecomeGiant(false)),
    Grape(new Foraging().setName("Grape").setSource("Grape Starter").setStages(11233).setGrowthTime(10).setRegrowable(true).setRegrowInterval(3).setBaseSellPrice(80).setEdible(true).setEnergyGain(38).setFall(true).setCanBecomeGiant(false)),
    Pumpkin(new Foraging().setName("Pumpkin").setSource("Pumpkin Seeds").setStages(12343).setGrowthTime(13).setRegrowable(false).setBaseSellPrice(320).setEdible(false).setFall(true).setCanBecomeGiant(true)),
    Yam(new Foraging().setName("Yam").setSource("Yam Seeds").setStages(1333).setGrowthTime(10).setRegrowable(false).setBaseSellPrice(160).setEdible(true).setEnergyGain(45).setFall(true).setCanBecomeGiant(false)),
    SweetGemBerry(new Foraging().setName("Sweet Gem Berry").setSource("Rare Seed").setStages(24666).setGrowthTime(24).setRegrowable(false).setBaseSellPrice(3000).setEdible(false).setFall(true).setCanBecomeGiant(false)),
    Powdermelon(new Foraging().setName("Powdermelon").setSource("Powdermelon Seeds").setStages(12121).setGrowthTime(7).setRegrowable(false).setBaseSellPrice(60).setEdible(true).setEnergyGain(63).setWinter(true).setCanBecomeGiant(true)),
    AncientFruit(new Foraging().setName("Ancient Fruit").setSource("Ancient Seeds").setStages(27775).setGrowthTime(28).setRegrowable(true).setRegrowInterval(7).setBaseSellPrice(550).setEdible(false).setSpring(true).setSummer(true).setFall(true).setCanBecomeGiant(false));

    public final Foraging foraging;

    CropBuilder(Foraging foraging) {
        this.foraging = foraging;
    }
}
