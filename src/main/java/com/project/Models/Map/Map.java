package com.project.Models.Map;

import com.project.Models.Enums.Block;
import com.project.Models.Houses.GreenHouse;
import com.project.Models.Houses.Home;

import java.util.ArrayList;
import java.util.Arrays;

public class Map {
    private final Block[][] blocks = new Block[20][100];

    public Map() {
        for (Block[] block : blocks)
            Arrays.fill(block, Block.basic);

        // home
        int homeX = 1;
        int homeLength = 4;
        int homeY = 80;
        int homeWidth = 8;
        for (int i = homeX; i < homeX + homeLength; i++)
            for (int j = homeY; j < homeY + homeWidth; j++)
                blocks[i][j] = Block.home;
        Home home = new Home();
        // greenhouse
        int greenHouseX = 2;
        int greenHouseY = 2;
        int greenHouseLength = 9;
        int greenHouseWidth = 4;
        for (int i = greenHouseX; i < greenHouseX + greenHouseWidth; i++)
            for (int j = greenHouseY; j < greenHouseY + greenHouseLength; j++)
                blocks[i][j] = Block.greenhouse;
        GreenHouse greenHouse = new GreenHouse();
        // leak
        int LeakX = 12;
        int LeakY = 48;
        int LeakLength = 3;
        int LeakWidth = 7;
        for (int i = LeakX; i < LeakLength + LeakX; i++)
            for (int j = LeakY; j < LeakY + LeakWidth; j++)
                blocks[i][j] = Block.water;
    }

    public Block[][] getBlocks() {
        return blocks;
    }
}
