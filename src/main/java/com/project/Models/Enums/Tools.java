package com.project.Models.Enums;

import com.project.Models.Tools.Tool;

public enum Tools {
    Axe(new Tool().setName("Axe").setEnergy(5).setCapacity(1).setLevel(ToolLevel.basic).setCutTree(true).setDeleteBranches(true)),
    FishingPole(new Tool().setName("FishingPole").setCapacity(1).setLevel(ToolLevel.basic).setFishing(true)),
    Hoe(new Tool().setName("Hoe").setCapacity(1).setLevel(ToolLevel.basic).setDigging(true)),
    MilkPail(new Tool().setName("MilkPail").setCapacity(1).setLevel(ToolLevel.basic).setMilking(true)),
    Pickaxe(new Tool().setName("Pickaxe").setCapacity(1).setLevel(ToolLevel.basic).setBreakStone(true).setUndig(true).setDeleteItem(true)),
    Scythe(new Tool()),
    Shear(new Tool()),
    WateringCan(new Tool());

    private final Tool tool;

    Tools(Tool tool) {
        this.tool = tool;
    }

    public Tool getTool() {
        return tool;
    }
}
