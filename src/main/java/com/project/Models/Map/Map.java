package com.project.Models.Map;

import com.project.Models.App;
import com.project.Models.Enums.Block;
import com.project.Models.Houses.GreenHouse;
import com.project.Models.Houses.Home;

import java.util.ArrayList;

public class Map {
    static private final int mapLength = 20;
    static private final int mapWidth = 100;
    private int homeCounter = 0;
    private int greenhouseCounter = 0;

    private final ArrayList<GameObject>[][] blocks = new ArrayList[mapLength][mapWidth];
//    private final ArrayList<String>[][] blocksID = new ArrayList[mapLength][mapWidth];

//    ArrayList<GameObject> objects = new ArrayList<>();

//    static private final ArrayList<Class<?>> forbiddenClasses = new ArrayList<>(List.of(Home.class));

    public Map() {
        BlockWrapper basic = new BlockWrapper(Block.basic);
        BlockWrapper water = new BlockWrapper(Block.water);
        // initialize
        for (int i = 0; i < blocks.length; i++)
            for (int j = 0; j < blocks[i].length; j++) {
                blocks[i][j] = new ArrayList<>();
                blocks[i][j].add(basic);
//                blocksID[i][j] = new ArrayList<>();
//                blocksID[i][j].add(Block.basic.getID());
            }

        // home
        Home home = new Home(homeCounter++);
        for (int i = home.getHomeX(); i < home.getHomeX() + home.getHomeLength(); i++)
            for (int j = home.getHomeY(); j < home.getHomeY() + home.getHomeWidth(); j++) {
                blocks[i][j].add(home);
//                blocksID[i][j].add(home.getID());
            }

        // greenhouse
        GreenHouse greenHouse = new GreenHouse(greenhouseCounter++);
        for (int i = greenHouse.getGreenHouseX(); i < greenHouse.getGreenHouseX() + greenHouse.getGreenHouseWidth(); i++)
            for (int j = greenHouse.getGreenHouseY(); j < greenHouse.getGreenHouseY() + greenHouse.getGreenHouseLength(); j++) {
                blocks[i][j].add(greenHouse);
//                blocksID[i][j].add(greenHouse.getID());
            }

        // leak
        int LeakX = 12;
        int LeakY = 48;
        int LeakLength = 3;
        int LeakWidth = 7;
        for (int i = LeakX; i < LeakLength + LeakX; i++)
            for (int j = LeakY; j < LeakY + LeakWidth; j++) {
                blocks[i][j].add(water);
//                blocksID[i][j].add(Block.water.getID());
            }


        // player
        blocks[App.getPlayer().getX()][App.getPlayer().getY()].add(App.getPlayer());
//        blocksID[App.getPlayer().getX()][App.getPlayer().getY()].add(App.getPlayer().getID());

    }

    // getter

    static public int getMapLength() {
        return mapLength;
    }

    static public int getMapWidth() {
        return mapWidth;
    }

//    public static ArrayList<Class<?>> getForbiddenClasses() {
//        return forbiddenClasses;
//    }

    public ArrayList<GameObject>[][] getBlocks() {
        return blocks;
    }

    /*
    public void initialize() {
        for (int i = 0; i < blocksID.length; i++)
            for (int j = 0; j < blocksID[i].length; j++) {
                for (int k = 0; k < blocksID[i][j].size(); k++) {
                    String target = blocksID[i][j].get(k);
                    if (target.equals(Block.basic.getID())) {
                        blocks[i][j].add(Block.basic);
                    } else if (target.equals(Block.water.getID())) {
                        blocks[i][j].add(Block.water);
                    } else if (target.equals(App.getPlayer().getID())) {
                        blocks[i][j].add(App.getPlayer());
                    } else {
                        for (GameObject gameObject : objects) {
                            if (gameObject.getID().equals(target)) {
                                blocks[i][j].add(gameObject);
                            }
                        }
                    }
                }
            }
    }
     */
}
