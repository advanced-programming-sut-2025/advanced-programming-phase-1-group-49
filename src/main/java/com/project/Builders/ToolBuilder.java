package com.project.Builders;

import com.project.Models.Tools.Tool;

public class ToolBuilder extends Tool {
    String owner;
    String name;
    int energy;
    int capacity = 0;

    boolean digging = false;
    boolean breakStone = false;
    boolean undig = false;
    boolean deleteItem = false;
    boolean cutTree = false;
    boolean deleteBranches = false;
    boolean watering = false;
    boolean takeWater = false;
    boolean fishing = false;
    boolean cutWeed = false;
    boolean reap = false;
    boolean milking = false;
    boolean shearing = false;
}
