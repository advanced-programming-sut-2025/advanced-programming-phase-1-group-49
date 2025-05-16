package com.project.Builders.BuilderEnums;

import com.project.Models.Item.Foraging;

public enum ForagingSeedBuilder {
    JazzSeeds(new Foraging().setName("Jazz Seeds").setSource("Spring").setSellPrice(35).setSpring(true)),
    CarrotSeeds(new Foraging().setName("Carrot Seeds").setSource("Spring").setSellPrice(35).setSpring(true)),
    CauliflowerSeeds(new Foraging().setName("Cauliflower Seeds").setSource("Spring").setSellPrice(175).setSpring(true)),
    CoffeeBean(new Foraging().setName("Coffee Bean").setSource("Spring").setSellPrice(15).setSpring(true).setSummer(true)),
    GarlicSeeds(new Foraging().setName("Garlic Seeds").setSource("Spring").setSellPrice(60).setSpring(true)),
    BeanStarter(new Foraging().setName("Bean Starter").setSource("Spring").setSellPrice(40).setSpring(true)),
    KaleSeeds(new Foraging().setName("Kale Seeds").setSource("Spring").setSellPrice(110).setSpring(true)),
    ParsnipSeeds(new Foraging().setName("Parsnip Seeds").setSource("Spring").setSellPrice(35).setSpring(true)),
    PotatoSeeds(new Foraging().setName("Potato Seeds").setSource("Spring").setSellPrice(80).setSpring(true)),
    RhubarbSeeds(new Foraging().setName("Rhubarb Seeds").setSource("Spring").setSellPrice(220).setSpring(true)),
    StrawberrySeeds(new Foraging().setName("Strawberry Seeds").setSource("Spring").setSellPrice(120).setSpring(true)),
    TulipBulb(new Foraging().setName("Tulip Bulb").setSource("Spring").setSellPrice(30).setSpring(true)),
    RiceShoot(new Foraging().setName("Rice Shoot").setSource("Spring").setSellPrice(30).setSpring(true)),
    BlueberrySeeds(new Foraging().setName("Blueberry Seeds").setSource("Summer").setSellPrice(50).setSummer(true)),
    CornSeeds(new Foraging().setName("Corn Seeds").setSource("Summer").setSellPrice(50).setSummer(true).setFall(true)),
    HopsStarter(new Foraging().setName("Hops Starter").setSource("Summer").setSellPrice(25).setSummer(true)),
    PepperSeeds(new Foraging().setName("Pepper Seeds").setSource("Summer").setSellPrice(40).setSummer(true)),
    MelonSeeds(new Foraging().setName("Melon Seeds").setSource("Summer").setSellPrice(250).setSummer(true)),
    PoppySeeds(new Foraging().setName("Poppy Seeds").setSource("Summer").setSellPrice(140).setSummer(true)),
    RadishSeeds(new Foraging().setName("Radish Seeds").setSource("Summer").setSellPrice(90).setSummer(true)),
    RedCabbageSeeds(new Foraging().setName("Red Cabbage Seeds").setSource("Summer").setSellPrice(260).setSummer(true)),
    StarfruitSeeds(new Foraging().setName("Starfruit Seeds").setSource("Summer").setSellPrice(750).setSummer(true)),
    SpangleSeeds(new Foraging().setName("Spangle Seeds").setSource("Summer").setSellPrice(90).setSummer(true)),
    SummerSquashSeeds(new Foraging().setName("Summer Squash Seeds").setSource("Summer").setSellPrice(45).setSummer(true)),
    SunflowerSeeds(new Foraging().setName("Sunflower Seeds").setSource("Summer").setSellPrice(80).setSummer(true).setFall(true)),
    TomatoSeeds(new Foraging().setName("Tomato Seeds").setSource("Summer").setSellPrice(60).setSummer(true)),
    WheatSeeds(new Foraging().setName("Wheat Seeds").setSource("Summer").setSellPrice(25).setSummer(true).setFall(true)),
    AmaranthSeeds(new Foraging().setName("Amaranth Seeds").setSource("Fall").setSellPrice(150).setFall(true)),
    ArtichokeSeeds(new Foraging().setName("Artichoke Seeds").setSource("Fall").setSellPrice(160).setFall(true)),
    BeetSeeds(new Foraging().setName("Beet Seeds").setSource("Fall").setSellPrice(100).setFall(true)),
    BokChoySeeds(new Foraging().setName("Bok Choy Seeds").setSource("Fall").setSellPrice(80).setFall(true)),
    BroccoliSeeds(new Foraging().setName("Broccoli Seeds").setSource("Fall").setSellPrice(70).setFall(true)),
    CranberrySeeds(new Foraging().setName("Cranberry Seeds").setSource("Fall").setSellPrice(75).setFall(true)),
    EggplantSeeds(new Foraging().setName("Eggplant Seeds").setSource("Fall").setSellPrice(60).setFall(true)),
    FairySeeds(new Foraging().setName("Fairy Seeds").setSource("Fall").setSellPrice(290).setFall(true)),
    GrapeStarter(new Foraging().setName("Grape Starter").setSource("Fall").setSellPrice(80).setFall(true)),
    PumpkinSeeds(new Foraging().setName("Pumpkin Seeds").setSource("Fall").setSellPrice(320).setFall(true)),
    YamSeeds(new Foraging().setName("Yam Seeds").setSource("Fall").setSellPrice(160).setFall(true)),
    RareSeed(new Foraging().setName("Rare Seed").setSource("Fall").setSellPrice(3000).setFall(true)),
    PowdermelonSeeds(new Foraging().setName("Powdermelon Seeds").setSource("Winter").setSellPrice(60).setWinter(true)),
    AncientSeeds(new Foraging().setName("Ancient Seeds").setSource("Special").setSellPrice(550).setSpring(true).setSummer(true).setFall(true)),
    MixedSeeds(new Foraging().setName("Mixed Seeds").setSource("Special").setSellPrice(0).setSpring(true).setSummer(true).setFall(true).setWinter(true)),

    //Additional foragings
    Acorn(new Foraging().setName("Acorn")),
    MapleSeed(new Foraging().setName("Maple Seed")),
    PineCone(new Foraging().setName("Pine Cone")),
    MahoganySeed(new Foraging().setName("Mahogany Seed")),
    ;

    public final Foraging foraging;

    ForagingSeedBuilder(Foraging foraging) {
        this.foraging = foraging;
    }
}
