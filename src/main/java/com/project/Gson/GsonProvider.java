package com.project.Gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.project.Models.Enums.Block;
import com.project.Models.Houses.Building;
import com.project.Models.Houses.GreenHouse;
import com.project.Models.Houses.Home;
import com.project.Models.Houses.Shop;
import com.project.Models.Item.*;
import com.project.Models.LivingBeings.*;
import com.project.Models.Map.BlockWrapper;
import com.project.Models.Map.GameObject;
import com.project.Models.Tools.Tool;

public class GsonProvider {

    private static final Gson gson = createGson();

    private static Gson createGson() {
        RuntimeTypeAdapterFactory<GameObject> factory =
                RuntimeTypeAdapterFactory
                        .of(GameObject.class, "type")
                        .registerSubtype(Player.class, "player")
                        .registerSubtype(Artisan.class, "artisan")
                        .registerSubtype(Crafting.class, "crafting")
                        .registerSubtype(Edible.class, "edible")
                        .registerSubtype(Fish.class, "fish")
                        .registerSubtype(Foraging.class, "foraging")
                        .registerSubtype(GreenHouse.class, "greenhouse")
                        .registerSubtype(Home.class, "home")
                        .registerSubtype(Machine.class, "machine")
                        .registerSubtype(NPC.class, "npc")
                        .registerSubtype(Tool.class, "tool")
                        .registerSubtype(Shop.class, "shop")
                        .registerSubtype(BlockWrapper.class, "block");

        return new GsonBuilder()
                .registerTypeAdapterFactory(factory)
                .create();
    }

    public static Gson getGson() {
        return gson;
    }
}
