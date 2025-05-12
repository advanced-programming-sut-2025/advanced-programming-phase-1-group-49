package com.project.Builders.ForagingBuilderEnums;

import com.project.Models.Item.Foraging;

public enum ForagingSeedBuilder {
    JazzSeeds(new Foraging().setName("Jazz Seeds").setSource("Spring").setBaseSellPrice(35).setSpring(true)),
    CarrotSeeds(new Foraging().setName("Carrot Seeds").setSource("Spring").setBaseSellPrice(35).setSpring(true)),
    CauliflowerSeeds(new Foraging().setName("Cauliflower Seeds").setSource("Spring").setBaseSellPrice(175).setSpring(true)),
    CoffeeBean(new Foraging().setName("Coffee Bean").setSource("Spring").setBaseSellPrice(15).setSpring(true).setSummer(true)),
    GarlicSeeds(new Foraging().setName("Garlic Seeds").setSource("Spring").setBaseSellPrice(60).setSpring(true)),
    BeanStarter(new Foraging().setName("Bean Starter").setSource("Spring").setBaseSellPrice(40).setSpring(true)),
    KaleSeeds(new Foraging().setName("Kale Seeds").setSource("Spring").setBaseSellPrice(110).setSpring(true)),
    ParsnipSeeds(new Foraging().setName("Parsnip Seeds").setSource("Spring").setBaseSellPrice(35).setSpring(true)),
    PotatoSeeds(new Foraging().setName("Potato Seeds").setSource("Spring").setBaseSellPrice(80).setSpring(true)),
    RhubarbSeeds(new Foraging().setName("Rhubarb Seeds").setSource("Spring").setBaseSellPrice(220).setSpring(true)),
    StrawberrySeeds(new Foraging().setName("Strawberry Seeds").setSource("Spring").setBaseSellPrice(120).setSpring(true)),
    TulipBulb(new Foraging().setName("Tulip Bulb").setSource("Spring").setBaseSellPrice(30).setSpring(true)),
    RiceShoot(new Foraging().setName("Rice Shoot").setSource("Spring").setBaseSellPrice(30).setSpring(true)),
    BlueberrySeeds(new Foraging().setName("Blueberry Seeds").setSource("Summer").setBaseSellPrice(50).setSummer(true)),
    CornSeeds(new Foraging().setName("Corn Seeds").setSource("Summer").setBaseSellPrice(50).setSummer(true).setFall(true)),
    HopsStarter(new Foraging().setName("Hops Starter").setSource("Summer").setBaseSellPrice(25).setSummer(true)),
    PepperSeeds(new Foraging().setName("Pepper Seeds").setSource("Summer").setBaseSellPrice(40).setSummer(true)),
    MelonSeeds(new Foraging().setName("Melon Seeds").setSource("Summer").setBaseSellPrice(250).setSummer(true)),
    PoppySeeds(new Foraging().setName("Poppy Seeds").setSource("Summer").setBaseSellPrice(140).setSummer(true)),
    RadishSeeds(new Foraging().setName("Radish Seeds").setSource("Summer").setBaseSellPrice(90).setSummer(true)),
    RedCabbageSeeds(new Foraging().setName("Red Cabbage Seeds").setSource("Summer").setBaseSellPrice(260).setSummer(true)),
    StarfruitSeeds(new Foraging().setName("Starfruit Seeds").setSource("Summer").setBaseSellPrice(750).setSummer(true)),
    SpangleSeeds(new Foraging().setName("Spangle Seeds").setSource("Summer").setBaseSellPrice(90).setSummer(true)),
    SummerSquashSeeds(new Foraging().setName("Summer Squash Seeds").setSource("Summer").setBaseSellPrice(45).setSummer(true)),
    SunflowerSeeds(new Foraging().setName("Sunflower Seeds").setSource("Summer").setBaseSellPrice(80).setSummer(true).setFall(true)),
    TomatoSeeds(new Foraging().setName("Tomato Seeds").setSource("Summer").setBaseSellPrice(60).setSummer(true)),
    WheatSeeds(new Foraging().setName("Wheat Seeds").setSource("Summer").setBaseSellPrice(25).setSummer(true).setFall(true)),
    AmaranthSeeds(new Foraging().setName("Amaranth Seeds").setSource("Fall").setBaseSellPrice(150).setFall(true)),
    ArtichokeSeeds(new Foraging().setName("Artichoke Seeds").setSource("Fall").setBaseSellPrice(160).setFall(true)),
    BeetSeeds(new Foraging().setName("Beet Seeds").setSource("Fall").setBaseSellPrice(100).setFall(true)),
    BokChoySeeds(new Foraging().setName("Bok Choy Seeds").setSource("Fall").setBaseSellPrice(80).setFall(true)),
    BroccoliSeeds(new Foraging().setName("Broccoli Seeds").setSource("Fall").setBaseSellPrice(70).setFall(true)),
    CranberrySeeds(new Foraging().setName("Cranberry Seeds").setSource("Fall").setBaseSellPrice(75).setFall(true)),
    EggplantSeeds(new Foraging().setName("Eggplant Seeds").setSource("Fall").setBaseSellPrice(60).setFall(true)),
    FairySeeds(new Foraging().setName("Fairy Seeds").setSource("Fall").setBaseSellPrice(290).setFall(true)),
    GrapeStarter(new Foraging().setName("Grape Starter").setSource("Fall").setBaseSellPrice(80).setFall(true)),
    PumpkinSeeds(new Foraging().setName("Pumpkin Seeds").setSource("Fall").setBaseSellPrice(320).setFall(true)),
    YamSeeds(new Foraging().setName("Yam Seeds").setSource("Fall").setBaseSellPrice(160).setFall(true)),
    RareSeed(new Foraging().setName("Rare Seed").setSource("Fall").setBaseSellPrice(3000).setFall(true)),
    PowdermelonSeeds(new Foraging().setName("Powdermelon Seeds").setSource("Winter").setBaseSellPrice(60).setWinter(true)),
    AncientSeeds(new Foraging().setName("Ancient Seeds").setSource("Special").setBaseSellPrice(550).setSpring(true).setSummer(true).setFall(true)),
    MixedSeeds(new Foraging().setName("Mixed Seeds").setSource("Special").setBaseSellPrice(0).setSpring(true).setSummer(true).setFall(true).setWinter(true));

    public final Foraging foraging;

    ForagingSeedBuilder(Foraging foraging) {
        this.foraging = foraging;
    }
}
