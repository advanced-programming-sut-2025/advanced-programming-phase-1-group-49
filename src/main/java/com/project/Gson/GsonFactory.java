package com.project.Gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.project.Models.Houses.GreenHouse;
import com.project.Models.Houses.Home;
import com.project.Models.Houses.Shop;
import com.project.Models.Item.*;
import com.project.Models.LivingBeings.*;
import com.project.Models.Map.GameObject;
import com.project.Models.Tools.Tool;

public class GsonFactory {
    public static Gson create() {
        RuntimeTypeAdapterFactory<GameObject> gameObjectAdapter =
                RuntimeTypeAdapterFactory.of(GameObject.class, "type")
                        .registerSubtype(Player.class, "player")
                        .registerSubtype(Home.class, "home")
                        .registerSubtype(Artisan.class, "artisan")
                        .registerSubtype(Bird.class, "bird")
                        .registerSubtype(Crafting.class, "crafting")
                        .registerSubtype(Foraging.class, "foraging")
                        .registerSubtype(GreenHouse.class, "greenHouse")
                        .registerSubtype(Machine.class, "machine")
                        .registerSubtype(Mammal.class, "mammal")
                        .registerSubtype(NPC.class, "NPC")
                        .registerSubtype(Shop.class, "shop")
                        .registerSubtype(Stone.class, "stone")
                        .registerSubtype(Tool.class, "tool");

        RuntimeTypeAdapterFactory<Item> itemAdapter =
                RuntimeTypeAdapterFactory.of(Item.class, "type")
                        .registerSubtype(Artisan.class, "artisan")
                        .registerSubtype(Crafting.class, "crafting")
                        .registerSubtype(Foraging.class, "foraging")
                        .registerSubtype(Machine.class, "machine")
                        .registerSubtype(Stone.class, "stone")
                        .registerSubtype(Tree.class, "tree");


        return new GsonBuilder()
                .registerTypeAdapterFactory(gameObjectAdapter)
                .registerTypeAdapterFactory(itemAdapter)
                .create();
    }
}