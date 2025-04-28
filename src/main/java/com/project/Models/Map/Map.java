package com.project.Models.Map;

import com.project.Models.Enums.Block;

import java.util.ArrayList;

public class Map {
    //    ArrayList<ArrayList<Block>> blocks;

    private Block[][] blocks = new Block[100][40];

    public Block[][] getBlocks() {
        return blocks;
    }

    public void setBlocks(Block[][] blocks) {
        this.blocks = blocks;
    }
}
