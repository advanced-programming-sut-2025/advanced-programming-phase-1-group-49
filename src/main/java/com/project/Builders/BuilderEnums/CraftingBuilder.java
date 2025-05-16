package com.project.Builders.BuilderEnums;

import com.project.Compositors.Ingredients;
import com.project.Compositors.Recipes;
import com.project.Models.Enums.Skills;
import com.project.Models.Item.Crafting;

public enum CraftingBuilder {
    CherryBomb(
            new Crafting()
                    .setName("Cherry Bomb")
                    .setRecipe(new Ingredients(Recipes.CherryBomb, "Cherry Bomb"))
                    .setSkill(Skills.Mining)
                    .setLevel(1)
                    .setSellPrice(50)
                    .setComplement(3)
    ),
    Bomb(
            new Crafting()
                    .setName("Bomb")
                    .setRecipe(new Ingredients(Recipes.Bomb, "Bomb"))
                    .setSkill(Skills.Mining)
                    .setLevel(2)
                    .setSellPrice(50)
                    .setComplement(5)
    ),
    MegaBomb(
            new Crafting()
                    .setName("Mega Bomb")
                    .setRecipe(new Ingredients(Recipes.MegaBomb, "Mega Bomb"))
                    .setSkill(Skills.Mining)
                    .setLevel(3)
                    .setSellPrice(50)
                    .setComplement(7)
    ),
    Sprinkler(
            new Crafting()
                    .setName("Sprinkler")
                    .setRecipe(new Ingredients(Recipes.Sprinkler, "Sprinkler"))
                    .setSkill(Skills.Farming)
                    .setLevel(1)
                    .setComplement(4)
    ),
    QualitySprinkler(
            new Crafting()
                    .setName("Quality Sprinkler")
                    .setRecipe(new Ingredients(Recipes.QualitySprinkler, "Quality Sprinkler"))
                    .setSkill(Skills.Farming)
                    .setLevel(2)
                    .setComplement(8)
    ),
    IridiumSprinkler(
            new Crafting()
                    .setName("Iridium Sprinkler")
                    .setRecipe(new Ingredients(Recipes.IridiumSprinkler, "Iridium Sprinkler"))
                    .setSkill(Skills.Farming)
                    .setLevel(3)
                    .setComplement(24)
    ),
    CharcoalKlin(
            new Crafting()
                    .setName("Charcoal Klin")
                    .setRecipe(new Ingredients(Recipes.CharcoalKlin, "Charcoal Klin"))
                    .setSkill(Skills.Foraging)
                    .setLevel(1)
    ),
    Furnace(
            new Crafting()
                    .setName("Furnace")
                    .setRecipe(new Ingredients(Recipes.Furnace, "Furnace"))
    ),
    Scarecrow(
            new Crafting()
                    .setName("Scarecrow")
                    .setRecipe(new Ingredients(Recipes.Scarecrow, "Scarecrow"))
    ),
    DeluxeScarecrow(
            new Crafting()
                    .setName("Deluxe Scarecrow")
                    .setRecipe(new Ingredients(Recipes.DeluxeScarecrow, "Deluxe Scarecrow"))
                    .setSkill(Skills.Farming)
                    .setLevel(2)
    ),
    BeeHouse(
            new Crafting()
                    .setName("Bee House")
                    .setRecipe(new Ingredients(Recipes.BeeHouse, "Bee House"))
                    .setSkill(Skills.Farming)
                    .setLevel(1)
    ),
    CheesePress(
            new Crafting()
                    .setName("Cheese Press")
                    .setRecipe(new Ingredients(Recipes.CheesePress, "Cheese Press"))
                    .setSkill(Skills.Farming)
                    .setLevel(2)
    ),
    Keg(
            new Crafting()
                    .setName("Keg")
                    .setRecipe(new Ingredients(Recipes.Keg, "Keg"))
                    .setSkill(Skills.Farming)
                    .setLevel(3)
    ),
    Loom(
            new Crafting()
                    .setName("Loom")
                    .setRecipe(new Ingredients(Recipes.Loom, "Loom"))
                    .setSkill(Skills.Farming)
                    .setLevel(3)
    ),
    MayonnaiseMachine(
            new Crafting()
                    .setName("Mayonnaise Machine")
                    .setRecipe(new Ingredients(Recipes.MayonnaiseMachine, "Mayonnaise Machine"))
    ),
    OilMaker(
            new Crafting()
                    .setName("Oil Maker")
                    .setRecipe(new Ingredients(Recipes.OilMaker, "Oil Maker"))
                    .setSkill(Skills.Farming)
                    .setLevel(3)
    ),
    PreservesJar(
            new Crafting()
                    .setName("Preserves Jar")
                    .setRecipe(new Ingredients(Recipes.PreservesJar, "Preserves Jar"))
                    .setSkill(Skills.Farming)
                    .setLevel(2)
    ),
    Dehydrator(
            new Crafting()
                    .setName("Dehydrator")
                    .setRecipe(new Ingredients(Recipes.Dehydrator, "Dehydrator"))
    ),
    GrassStarter(
            new Crafting()
                    .setName("Grass Starter")
                    .setRecipe(new Ingredients(Recipes.GrassStarter, "Grass Starter"))
    ),
    FishSmoker(
            new Crafting()
                    .setName("Fish Smoker")
                    .setRecipe(new Ingredients(Recipes.FishSmoker, "Fish Smoker"))
    ),
    MysticTreeSeed(
            new Crafting()
                    .setName("Mystic Tree Seed")
                    .setRecipe(new Ingredients(Recipes.MysticTreeSeed, "Mystic Tree Seed"))
                    .setSkill(Skills.Foraging)
                    .setLevel(4)
                    .setSellPrice(100)
    );

    public final Crafting crafting;

    CraftingBuilder(Crafting crafting) {
        this.crafting = crafting;
    }
}
