package com.project.Models.Map;

import com.project.Models.App;
import com.project.Models.Enums.Block;
import com.project.Models.Houses.GreenHouse;
import com.project.Models.Houses.Home;
import com.project.Models.LivingBeings.Player;

import java.util.ArrayList;
import java.util.List;

public class Map {
    static private final int mapLength = 20;
    static private final int mapWidth = 100;
    private int homeCounter = 0;
    private int greenhouseCounter = 0;

    private final ArrayList<GameObject>[][] blocks = new ArrayList[mapLength][mapWidth];

    private static final ArrayList<Class<?>> forbiddenClasses = new ArrayList<>(List.of(Home.class));

    // we should have a list from objects of game for initialize the map
    final transient private ArrayList<GameObject> objects = new ArrayList<>();

    public Map() {
        BlockWrapper basic = new BlockWrapper(Block.basic);
        BlockWrapper water = new BlockWrapper(Block.water);
        // initialize
        for (int i = 0; i < blocks.length; i++)
            for (int j = 0; j < blocks[i].length; j++) {
                blocks[i][j] = new ArrayList<>();
                blocks[i][j].add(basic);
            }

        // home
        Home home = new Home(homeCounter++);
        for (int i = home.getHomeX(); i < home.getHomeX() + home.getHomeLength(); i++)
            for (int j = home.getHomeY(); j < home.getHomeY() + home.getHomeWidth(); j++)
                blocks[i][j].add(home);

        // greenhouse
        GreenHouse greenHouse = new GreenHouse(greenhouseCounter++);
        for (int i = greenHouse.getGreenHouseX(); i < greenHouse.getGreenHouseX() + greenHouse.getGreenHouseWidth(); i++)
            for (int j = greenHouse.getGreenHouseY(); j < greenHouse.getGreenHouseY() + greenHouse.getGreenHouseLength(); j++)
                blocks[i][j].add(greenHouse);

        // leak
        int LeakX = 12;
        int LeakY = 48;
        int LeakLength = 3;
        int LeakWidth = 7;
        for (int i = LeakX; i < LeakLength + LeakX; i++)
            for (int j = LeakY; j < LeakY + LeakWidth; j++)
                blocks[i][j].add(water);


        // player
        blocks[App.getPlayer().getX()][App.getPlayer().getY()].add(App.getPlayer());

        objects.add(home);
        objects.add(greenHouse);
        objects.add(basic);
        objects.add(water);
    }

    // getter

    static public int getMapLength() {
        return mapLength;
    }

    static public int getMapWidth() {
        return mapWidth;
    }

    public ArrayList<GameObject>[][] getBlocks() {
        return blocks;
    }

    public static ArrayList<Class<?>> getForbiddenClasses() {
        return forbiddenClasses;
    }

    //

    public void initialize() {
        for (int i = 0; i < blocks.length; i++) {
            for (int j = 0; j < blocks[i].length; j++) {
                for (GameObject g : blocks[i][j]) {
                    if (g.getClass().equals(Player.class)) {
                        objects.add(App.searchPlayer(((Player) g).getUsername()));
                        blocks[i][j].set(blocks[i][j].indexOf(g), App.searchPlayer(((Player) g).getUsername()));
                    } else if (objects.contains(g)) {
                        blocks[i][j].set(blocks[i][j].indexOf(g), objects.get(objects.indexOf(g)));
                    } else {
                        objects.add(g);
                    }
                }
            }
        }
    }
}
