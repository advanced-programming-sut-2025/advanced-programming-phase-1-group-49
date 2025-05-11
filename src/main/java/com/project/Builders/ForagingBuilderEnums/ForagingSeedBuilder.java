package com.project.Builders.ForagingBuilderEnums;

import com.project.Models.Item.Foraging;

public enum ForagingSeedBuilder {
    JAZZSEEDS(new Foraging().setName("Jazz Seeds").setSource("Spring").setBaseSellPrice(35).setSpring(true)),
    CARROTSEEDS(new Foraging().setName("Carrot Seeds").setSource("Spring").setBaseSellPrice(35).setSpring(true)),
    CAULIFLOWERSEEDS(new Foraging().setName("Cauliflower Seeds").setSource("Spring").setBaseSellPrice(175).setSpring(true)),
    COFFEEBEAN(new Foraging().setName("Coffee Bean").setSource("Spring").setBaseSellPrice(15).setSpring(true).setSummer(true)),
    GARLICSEEDS(new Foraging().setName("Garlic Seeds").setSource("Spring").setBaseSellPrice(60).setSpring(true)),
    BEANSTARTER(new Foraging().setName("Bean Starter").setSource("Spring").setBaseSellPrice(40).setSpring(true)),
    KALESEEDS(new Foraging().setName("Kale Seeds").setSource("Spring").setBaseSellPrice(110).setSpring(true)),
    PARSNIPSEEDS(new Foraging().setName("Parsnip Seeds").setSource("Spring").setBaseSellPrice(35).setSpring(true)),
    POTATOSEEDS(new Foraging().setName("Potato Seeds").setSource("Spring").setBaseSellPrice(80).setSpring(true)),
    RHUBARBSEEDS(new Foraging().setName("Rhubarb Seeds").setSource("Spring").setBaseSellPrice(220).setSpring(true)),
    STRAWBERRYSEEDS(new Foraging().setName("Strawberry Seeds").setSource("Spring").setBaseSellPrice(120).setSpring(true)),
    TULIPBULB(new Foraging().setName("Tulip Bulb").setSource("Spring").setBaseSellPrice(30).setSpring(true)),
    RICESHOOT(new Foraging().setName("Rice Shoot").setSource("Spring").setBaseSellPrice(30).setSpring(true)),
    BLUEBERRYSEEDS(new Foraging().setName("Blueberry Seeds").setSource("Summer").setBaseSellPrice(50).setSummer(true)),
    CORNSEEDS(new Foraging().setName("Corn Seeds").setSource("Summer").setBaseSellPrice(50).setSummer(true).setFall(true)),
    HOPSSTARTER(new Foraging().setName("Hops Starter").setSource("Summer").setBaseSellPrice(25).setSummer(true)),
    PEPPERSEEDS(new Foraging().setName("Pepper Seeds").setSource("Summer").setBaseSellPrice(40).setSummer(true)),
    MELONSEEDS(new Foraging().setName("Melon Seeds").setSource("Summer").setBaseSellPrice(250).setSummer(true)),
    POPPYSEEDS(new Foraging().setName("Poppy Seeds").setSource("Summer").setBaseSellPrice(140).setSummer(true)),
    RADISHSEEDS(new Foraging().setName("Radish Seeds").setSource("Summer").setBaseSellPrice(90).setSummer(true)),
    REDCABBAGESEEDS(new Foraging().setName("Red Cabbage Seeds").setSource("Summer").setBaseSellPrice(260).setSummer(true)),
    STARFRUITSEEDS(new Foraging().setName("Starfruit Seeds").setSource("Summer").setBaseSellPrice(750).setSummer(true)),
    SPANGLESEEDS(new Foraging().setName("Spangle Seeds").setSource("Summer").setBaseSellPrice(90).setSummer(true)),
    SUMMERSQUASHSEEDS(new Foraging().setName("Summer Squash Seeds").setSource("Summer").setBaseSellPrice(45).setSummer(true)),
    SUNFLOWERSEEDS(new Foraging().setName("Sunflower Seeds").setSource("Summer").setBaseSellPrice(80).setSummer(true).setFall(true)),
    TOMATOSEEDS(new Foraging().setName("Tomato Seeds").setSource("Summer").setBaseSellPrice(60).setSummer(true)),
    WHEATSEEDS(new Foraging().setName("Wheat Seeds").setSource("Summer").setBaseSellPrice(25).setSummer(true).setFall(true)),
    AMARANTHSEEDS(new Foraging().setName("Amaranth Seeds").setSource("Fall").setBaseSellPrice(150).setFall(true)),
    ARTICHOKESEEDS(new Foraging().setName("Artichoke Seeds").setSource("Fall").setBaseSellPrice(160).setFall(true)),
    BEETSEEDS(new Foraging().setName("Beet Seeds").setSource("Fall").setBaseSellPrice(100).setFall(true)),
    BOKCHOYSEEDS(new Foraging().setName("Bok Choy Seeds").setSource("Fall").setBaseSellPrice(80).setFall(true)),
    BROCCOLISEEDS(new Foraging().setName("Broccoli Seeds").setSource("Fall").setBaseSellPrice(70).setFall(true)),
    CRANBERRYSEEDS(new Foraging().setName("Cranberry Seeds").setSource("Fall").setBaseSellPrice(75).setFall(true)),
    EGGPLANTSEEDS(new Foraging().setName("Eggplant Seeds").setSource("Fall").setBaseSellPrice(60).setFall(true)),
    FAIRYSEEDS(new Foraging().setName("Fairy Seeds").setSource("Fall").setBaseSellPrice(290).setFall(true)),
    GRAPESTARTER(new Foraging().setName("Grape Starter").setSource("Fall").setBaseSellPrice(80).setFall(true)),
    PUMPKINSEEDS(new Foraging().setName("Pumpkin Seeds").setSource("Fall").setBaseSellPrice(320).setFall(true)),
    YAMSEEDS(new Foraging().setName("Yam Seeds").setSource("Fall").setBaseSellPrice(160).setFall(true)),
    RARESEED(new Foraging().setName("Rare Seed").setSource("Fall").setBaseSellPrice(3000).setFall(true)),
    POWDERMELONSEEDS(new Foraging().setName("Powdermelon Seeds").setSource("Winter").setBaseSellPrice(60).setWinter(true)),
    ANCIENTSEEDS(new Foraging().setName("Ancient Seeds").setSource("Special").setBaseSellPrice(550).setSpring(true).setSummer(true).setFall(true)),
    MIXEDSEEDS(new Foraging().setName("Mixed Seeds").setSource("Special").setBaseSellPrice(0).setSpring(true).setSummer(true).setFall(true).setWinter(true));

    public final Foraging foraging;
    ForagingSeedBuilder(Foraging foraging) { this.foraging = foraging; }
}