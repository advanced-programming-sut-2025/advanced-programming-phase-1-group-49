package com.project.Models.Map;

import com.project.Models.App;
import com.project.Models.Enums.Block;
import com.project.Models.Houses.GreenHouse;
import com.project.Models.Houses.Home;

import java.util.ArrayList;

public class Map {
    private final ArrayList<GameObject>[][] blocks = new ArrayList[20][100];

    public Map() {
        // initialize
        for (int i = 0; i < blocks.length; i++)
            for (int j = 0; j < blocks[i].length; j++) {
                blocks[i][j] = new ArrayList<>();
                blocks[i][j].add(Block.basic);
            }

        // home
        Home home = new Home();
        for (int i = home.getHomeX(); i < home.getHomeX() + home.getHomeLength(); i++)
            for (int j = home.getHomeY(); j < home.getHomeY() + home.getHomeWidth(); j++)
                blocks[i][j].add(home);

        // greenhouse
        GreenHouse greenHouse = new GreenHouse();
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
                blocks[i][j].add(Block.water);

        // player
        blocks[App.getPlayer().getX()][App.getPlayer().getY()].add(App.getPlayer());
    }

    public ArrayList<GameObject>[][] getBlocks() {
        return blocks;
    }
}
