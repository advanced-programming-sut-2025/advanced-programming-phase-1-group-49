package com.project.Models.Tools;

import com.project.Models.Enums.ToolLevel;

public class Tool {
    ToolLevel level;
    boolean digging = false;
    boolean breakStone = false;
    boolean undig = false;
    boolean deleteItem = false;



    public Tool(ToolLevel level) {
        this.level = level;
    }

    public void decreaseEnergy() {

    }

    public void toolBehaviour() {

    }
}
