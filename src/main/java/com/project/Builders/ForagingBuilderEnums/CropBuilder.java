package com.project.Builders.ForagingBuilderEnums;

import com.project.Models.Item.Foraging;

public enum CropBuilder {
    BlueJazz(new Foraging().setName("BlueJazz").setSource("JazzSeeds").setBaseSellPrice(50).setEdible(true).setEnergyGain(45).setSpring(true).setCanBecomeGiant(false)),
    Carrot(new Foraging().setName("Carrot").setSource("CarrotSeeds").setBaseSellPrice(35).setEdible(true).setEnergyGain(75).setSpring(true).setCanBecomeGiant(false)),
    Cauliflower(new Foraging().setName("Cauliflower").setSource("CauliflowerSeeds").setBaseSellPrice(175).setEdible(true).setEnergyGain(75).setSpring(true).setCanBecomeGiant(true)),
    CoffeeBean(new Foraging().setName("CoffeeBean").setSource("CoffeeBean").setBaseSellPrice(15).setEdible(false).setEnergyGain(0).setSpring(true).setSummer(true).setCanBecomeGiant(false)),
    Garlic(new Foraging().setName("Garlic").setSource("GarlicSeeds").setBaseSellPrice(60).setEdible(true).setEnergyGain(20).setSpring(true).setCanBecomeGiant(false)),
    GreenBean(new Foraging().setName("GreenBean").setSource("BeanStarter").setBaseSellPrice(40).setEdible(true).setEnergyGain(20).setSpring(true).setCanBecomeGiant(false)),
    Kale(new Foraging().setName("Kale").setSource("KaleSeeds").setBaseSellPrice(110).setEdible(true).setEnergyGain(50).setSpring(true).setCanBecomeGiant(false)),
    Parsnip(new Foraging().setName("Parsnip").setSource("ParsnipSeeds").setBaseSellPrice(35).setEdible(true).setEnergyGain(25).setSpring(true).setCanBecomeGiant(false)),
    Potato(new Foraging().setName("Potato").setSource("PotatoSeeds").setBaseSellPrice(80).setEdible(true).setEnergyGain(25).setSpring(true).setCanBecomeGiant(false)),
    Rhubarb(new Foraging().setName("Rhubarb").setSource("RhubarbSeeds").setBaseSellPrice(220).setEdible(true).setEnergyGain(15).setSpring(true).setCanBecomeGiant(false)),
    Strawberry(new Foraging().setName("Strawberry").setSource("StrawberrySeeds").setBaseSellPrice(120).setEdible(true).setEnergyGain(25).setSpring(true).setCanBecomeGiant(false)),
    Tulip(new Foraging().setName("Tulip").setSource("TulipBulb").setBaseSellPrice(30).setEdible(false).setEnergyGain(0).setSpring(true).setCanBecomeGiant(false)),
    Blueberry(new Foraging().setName("Blueberry").setSource("BlueberrySeeds").setBaseSellPrice(50).setEdible(true).setEnergyGain(20).setSummer(true).setCanBecomeGiant(false)),
    Corn(new Foraging().setName("Corn").setSource("CornSeeds").setBaseSellPrice(50).setEdible(true).setEnergyGain(25).setSummer(true).setFall(true).setCanBecomeGiant(false)),
    Hops(new Foraging().setName("Hops").setSource("HopsStarter").setBaseSellPrice(25).setEdible(true).setEnergyGain(10).setSummer(true).setCanBecomeGiant(false)),
    HotPepper(new Foraging().setName("HotPepper").setSource("PepperSeeds").setBaseSellPrice(40).setEdible(true).setEnergyGain(5).setSummer(true).setCanBecomeGiant(false)),
    Melon(new Foraging().setName("Melon").setSource("MelonSeeds").setBaseSellPrice(250).setEdible(true).setEnergyGain(75).setSummer(true).setCanBecomeGiant(true)),
    Poppy(new Foraging().setName("Poppy").setSource("PoppySeeds").setBaseSellPrice(140).setEdible(true).setEnergyGain(15).setSummer(true).setCanBecomeGiant(false)),
    Radish(new Foraging().setName("Radish").setSource("RadishSeeds").setBaseSellPrice(90).setEdible(true).setEnergyGain(18).setSummer(true).setCanBecomeGiant(false)),
    RedCabbage(new Foraging().setName("RedCabbage").setSource("RedCabbageSeeds").setBaseSellPrice(260).setEdible(true).setEnergyGain(30).setSummer(true).setCanBecomeGiant(false)),
    Starfruit(new Foraging().setName("Starfruit").setSource("StarfruitSeeds").setBaseSellPrice(750).setEdible(true).setEnergyGain(125).setSummer(true).setCanBecomeGiant(false)),
    SummerSpangle(new Foraging().setName("SummerSpangle").setSource("SpangleSeeds").setBaseSellPrice(90).setEdible(false).setEnergyGain(0).setSummer(true).setCanBecomeGiant(false)),
    Sunflower(new Foraging().setName("Sunflower").setSource("SunflowerSeeds").setBaseSellPrice(80).setEdible(false).setEnergyGain(0).setSummer(true).setFall(true).setCanBecomeGiant(false)),
    Tomato(new Foraging().setName("Tomato").setSource("TomatoSeeds").setBaseSellPrice(60).setEdible(true).setEnergyGain(20).setSummer(true).setCanBecomeGiant(false)),
    Wheat(new Foraging().setName("Wheat").setSource("WheatSeeds").setBaseSellPrice(25).setEdible(false).setEnergyGain(0).setSummer(true).setFall(true).setCanBecomeGiant(false)),
    Amaranth(new Foraging().setName("Amaranth").setSource("AmaranthSeeds").setBaseSellPrice(150).setEdible(true).setEnergyGain(40).setFall(true).setCanBecomeGiant(false)),
    Artichoke(new Foraging().setName("Artichoke").setSource("ArtichokeSeeds").setBaseSellPrice(160).setEdible(true).setEnergyGain(35).setFall(true).setCanBecomeGiant(false)),
    Beet(new Foraging().setName("Beet").setSource("BeetSeeds").setBaseSellPrice(100).setEdible(true).setEnergyGain(27).setFall(true).setCanBecomeGiant(false)),
    BokChoy(new Foraging().setName("BokChoy").setSource("BokChoySeeds").setBaseSellPrice(80).setEdible(true).setEnergyGain(22).setFall(true).setCanBecomeGiant(false)),
    Cranberries(new Foraging().setName("Cranberries").setSource("CranberrySeeds").setBaseSellPrice(75).setEdible(true).setEnergyGain(15).setFall(true).setCanBecomeGiant(false)),
    Eggplant(new Foraging().setName("Eggplant").setSource("EggplantSeeds").setBaseSellPrice(60).setEdible(true).setEnergyGain(20).setFall(true).setCanBecomeGiant(false)),
    FairyRose(new Foraging().setName("FairyRose").setSource("FairySeeds").setBaseSellPrice(290).setEdible(false).setEnergyGain(0).setFall(true).setCanBecomeGiant(false)),
    Grape(new Foraging().setName("Grape").setSource("GrapeStarter").setBaseSellPrice(80).setEdible(true).setEnergyGain(20).setFall(true).setCanBecomeGiant(false)),
    Pumpkin(new Foraging().setName("Pumpkin").setSource("PumpkinSeeds").setBaseSellPrice(320).setEdible(true).setEnergyGain(75).setFall(true).setCanBecomeGiant(true)),
    Yam(new Foraging().setName("Yam").setSource("YamSeeds").setBaseSellPrice(160).setEdible(true).setEnergyGain(40).setFall(true).setCanBecomeGiant(false)),
    AncientFruit(new Foraging().setName("AncientFruit").setSource("AncientSeeds").setBaseSellPrice(550).setEdible(true).setEnergyGain(100).setSpring(true).setSummer(true).setFall(true).setCanBecomeGiant(false)),
    SweetGemBerry(new Foraging().setName("SweetGemBerry").setSource("RareSeed").setBaseSellPrice(3000).setEdible(false).setEnergyGain(0).setFall(true).setCanBecomeGiant(false)),
    CactusFruit(new Foraging().setName("CactusFruit").setSource("CactusSeeds").setBaseSellPrice(75).setEdible(true).setEnergyGain(30).setSummer(true).setFall(true).setCanBecomeGiant(false)),
    Pineapple(new Foraging().setName("Pineapple").setSource("PineappleSeeds").setBaseSellPrice(300).setEdible(true).setEnergyGain(75).setSummer(true).setFall(true).setCanBecomeGiant(false)),
    TaroRoot(new Foraging().setName("TaroRoot").setSource("TaroTuber").setBaseSellPrice(100).setEdible(true).setEnergyGain(25).setSummer(true).setFall(true).setCanBecomeGiant(false)),
    Mango(new Foraging().setName("Mango").setSource("MangoSapling").setBaseSellPrice(130).setEdible(true).setEnergyGain(45).setSummer(true).setCanBecomeGiant(false)),
    ;

    CropBuilder(Foraging foraging) {
    }
}
