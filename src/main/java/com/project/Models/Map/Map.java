package com.project.Models.Map;

import com.project.Models.Enums.Block;
import com.project.Models.Houses.GreenHouse;
import com.project.Models.Houses.Home;

import java.util.Arrays;

public class Map {
    private final ArrayList<GameObject>[][] blocks = new ArrayList[20][100];

    public Map() {
        for (int i = 0; i < blocks.length; i++) {
            for (int j = 0; j < blocks[i].length; j++) {
                blocks[i][j] = new ArrayList<>();
                blocks[i][j].add(Block.basic);
            }
        }

        // home
        int homeX = 1;
        int homeLength = 4;
        int homeY = 80;
        int homeWidth = 8;
        for (int i = homeX; i < homeX + homeLength; i++)
            for (int j = homeY; j < homeY + homeWidth; j++)
                blocks[i][j].add(Block.home);
        Home home = new Home();

        // greenhouse
        int greenHouseX = 2;
        int greenHouseY = 2;
        int greenHouseLength = 9;
        int greenHouseWidth = 4;
        for (int i = greenHouseX; i < greenHouseX + greenHouseWidth; i++)
            for (int j = greenHouseY; j < greenHouseY + greenHouseLength; j++)
                blocks[i][j].add(Block.greenhouse);
        GreenHouse greenHouse = new GreenHouse();

        // leak
        int LeakX = 12;
        int LeakY = 48;
        int LeakLength = 3;
        int LeakWidth = 7;
        for (int i = LeakX; i < LeakLength + LeakX; i++)
            for (int j = LeakY; j < LeakY + LeakWidth; j++)
                blocks[i][j].add(Block.water);
    }

    public ArrayList<GameObject>[][] getBlocks() {
        return blocks;
    }
}
