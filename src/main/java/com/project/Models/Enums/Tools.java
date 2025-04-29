package com.project.Models.Enums;

import com.project.Models.Tools.Tool;

public enum Tools {
    Axe(new Tool(ToolLevel.basic)),
    FishingPole(new Tool(ToolLevel.basic)),
    Hoe(new Tool(ToolLevel.basic)),
    MilkPail(new Tool(ToolLevel.basic)),
    Pickaxe(new Tool(ToolLevel.basic)),
    Scythe(new Tool(ToolLevel.basic)),
    Shear(new Tool(ToolLevel.basic)),
    WateringCan(new Tool(ToolLevel.basic));

    private final Tool tool;

    Tools(Tool tool) {
        this.tool = tool;
    }

    public Tool getTool() {
        return tool;
    }
}
