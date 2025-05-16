package com.project.Builders.BuilderEnums;

import com.project.Compositors.Ingredients;
import com.project.Compositors.Recipes;
import com.project.Models.Enums.Buffs;
import com.project.Models.Enums.Shops;
import com.project.Models.Enums.Skills;
import com.project.Models.Item.Edible;
import com.project.Models.Item.Foraging;

public enum EdibleBuilder {
    FriedEgg(new Edible()
            .setEnergyUsage(50)
            .setRecipe(new Ingredients(Recipes.FriedEgg, "FriedEgg"))
            .setShop(Shops.StarDrop)
            .setName("FriedEgg")
            .setSellPrice(35)
    ),
    BakedFish(new Edible()
            .setEnergyUsage(75)
            .setRecipe(new Ingredients(Recipes.BakedFish, "BakedFish"))
            .setShop(Shops.StarDrop)
            .setName("BakedFish")
            .setSellPrice(100)
    ),
    Salad(new Edible()
            .setEnergyUsage(113)
            .setRecipe(new Ingredients(Recipes.Salad, "Salad"))
            .setShop(Shops.StarDrop)
            .setName("Salad")
            .setSellPrice(110)
    ),
    Omelet(new Edible()
            .setEnergyUsage(100)
            .setRecipe(new Ingredients(Recipes.Omelet, "Omelet"))
            .setShop(Shops.StarDrop)
            .setName("Omelet")
            .setSellPrice(125)
    ),
    PumpkinPie(new Edible()
            .setEnergyUsage(225)
            .setRecipe(new Ingredients(Recipes.PumpkinPie, "PumpkinPie"))
            .setShop(Shops.StarDrop)
            .setName("PumpkinPie")
            .setSellPrice(385)
    ),
    Spaghetti(new Edible()
            .setEnergyUsage(75)
            .setRecipe(new Ingredients(Recipes.Spaghetti, "Spaghetti"))
            .setShop(Shops.StarDrop)
            .setName("Spaghetti")
            .setSellPrice(120)
    ),
    Pizza(new Edible()
            .setEnergyUsage(150)
            .setRecipe(new Ingredients(Recipes.Pizza, "Pizza"))
            .setShop(Shops.StarDrop)
            .setName("Pizza")
            .setSellPrice(300)
    ),
    Tortilla(new Edible()
            .setEnergyUsage(50)
            .setRecipe(new Ingredients(Recipes.Tortilla, "Tortilla"))
            .setShop(Shops.StarDrop)
            .setName("Tortilla")
            .setSellPrice(50)
    ),
    MakiRoll(new Edible()
            .setEnergyUsage(100)
            .setRecipe(new Ingredients(Recipes.MakiRoll, "MakiRoll"))
            .setShop(Shops.StarDrop)
            .setName("MakiRoll")
            .setSellPrice(220)
    ),
    TripleShotEspresso(new Edible()
            .setEnergyUsage(200)
            .setRecipe(new Ingredients(Recipes.TripleShotEspresso, "TripleShotEspresso"))
            .setBuff(Buffs.Energy)
            .setBuffValue(Edible.maxEnergy + 100)
            .setBuffDuration(5)
            .setShop(Shops.StarDrop)
            .setName("TripleShotEspresso")
            .setSellPrice(450)
    ),
    Cookie(new Edible()
            .setEnergyUsage(90)
            .setRecipe(new Ingredients(Recipes.Cookie, "Cookie"))
            .setShop(Shops.StarDrop)
            .setName("Cookie")
            .setSellPrice(140)
    ),
    HashBrowns(new Edible()
            .setEnergyUsage(90)
            .setRecipe(new Ingredients(Recipes.HashBrowns, "HashBrowns"))
            .setBuff(Buffs.Farming)
            .setBuffDuration(5)
            .setShop(Shops.StarDrop)
            .setName("HashBrowns")
            .setSellPrice(120)
    ),
    Pancakes(new Edible()
            .setEnergyUsage(90)
            .setRecipe(new Ingredients(Recipes.Pancakes, "Pancakes"))
            .setBuff(Buffs.Foraging)
            .setBuffDuration(11)
            .setShop(Shops.StarDrop)
            .setName("Pancakes")
            .setSellPrice(80)
    ),
    FruitSalad(new Edible()
            .setEnergyUsage(263)
            .setRecipe(new Ingredients(Recipes.FruitSalad, "FruitSalad"))
            .setShop(Shops.StarDrop)
            .setName("FruitSalad")
            .setSellPrice(450)
    ),
    RedPlate(new Edible()
            .setEnergyUsage(240)
            .setRecipe(new Ingredients(Recipes.RedPlate, "RedPlate"))
            .setBuff(Buffs.Energy)
            .setBuffValue(50)
            .setBuffDuration(3)
            .setShop(Shops.StarDrop)
            .setName("RedPlate")
            .setSellPrice(400)
    ),
    Bread(new Edible()
            .setEnergyUsage(50)
            .setRecipe(new Ingredients(Recipes.Bread, "Bread"))
            .setShop(Shops.StarDrop)
            .setName("Bread")
            .setSellPrice(60)
    ),
    SalmonDinner(new Edible()
            .setEnergyUsage(125)
            .setRecipe(new Ingredients(Recipes.SalmonDinner, "SalmonDinner"))
            //.setShop(Shops.Leah) I have no idea what this is :\/
            .setName("SalmonDinner")
            .setSellPrice(300)
    ),
    VegetableMedley(new Edible()
            .setEnergyUsage(165)
            .setRecipe(new Ingredients(Recipes.VegetableMedley, "VegetableMedley"))
            .setSkill(Skills.Foraging)
            .setLevel(2)
            .setName("VegetableMedley")
            .setSellPrice(120)
    ),
    FarmersLunch(new Edible()
            .setEnergyUsage(200)
            .setRecipe(new Ingredients(Recipes.FarmersLunch, "FarmersLunch"))
            .setBuff(Buffs.Farming)
            .setBuffDuration(5)
            .setSkill(Skills.Farming)
            .setLevel(1)
            .setName("FarmersLunch")
            .setSellPrice(150)
    ),
    SurvivalBurger(new Edible()
            .setEnergyUsage(125)
            .setRecipe(new Ingredients(Recipes.SurvivalBurger, "SurvivalBurger"))
            .setBuff(Buffs.Foraging)
            .setBuffDuration(5)
            .setSkill(Skills.Foraging)
            .setLevel(3)
            .setName("SurvivalBurger")
            .setSellPrice(180)
    ),
    DishOTheSea(new Edible()
            .setEnergyUsage(150)
            .setRecipe(new Ingredients(Recipes.DishOTheSea, "DishOTheSea"))
            .setBuff(Buffs.Fishing)
            .setBuffDuration(5)
            .setSkill(Skills.Fishing)
            .setLevel(2)
            .setName("DishOTheSea")
            .setSellPrice(220)
    ),
    SeafoamPudding(new Edible()
            .setEnergyUsage(175)
            .setRecipe(new Ingredients(Recipes.SeafoamPudding, "SeafoamPudding"))
            .setBuff(Buffs.Fishing)
            .setBuffDuration(10)
            .setSkill(Skills.Fishing)
            .setLevel(3)
            .setName("SeafoamPudding")
            .setSellPrice(300)
    ),
    MinersTreat(new Edible()
            .setEnergyUsage(125)
            .setRecipe(new Ingredients(Recipes.MinersTreat, "MinersTreat"))
            .setBuff(Buffs.Mining)
            .setBuffDuration(5)
            .setSkill(Skills.Mining)
            .setLevel(1)
            .setName("MinersTreat")
            .setSellPrice(200)
    );

    Foraging edible;

    EdibleBuilder(Foraging edible) {
        this.edible = edible;
    }
}
