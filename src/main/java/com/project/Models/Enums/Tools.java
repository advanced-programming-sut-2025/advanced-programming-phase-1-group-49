package com.project.Models.Enums;

import com.project.Models.Tools.Tool;

public enum Tools {
    Axe(new Tool().setName("Axe").setEnergy(5).setCapacity(1).setLevel(ToolLevel.Basic).setCutTree(true).setDeleteBranches(true)),
    FishingPole(new Tool().setName("FishingPole").setCapacity(1).setLevel(ToolLevel.TrainingFP).setFishing(true).setCost(25)),
    Hoe(new Tool().setName("Hoe").setCapacity(1).setLevel(ToolLevel.Basic).setDigging(true)),
    MilkPail(new Tool().setName("MilkPail").setCapacity(1).setLevel(ToolLevel.ShearOrMilk).setMilking(true)),
    Pickaxe(new Tool().setName("Pickaxe").setCapacity(1).setLevel(ToolLevel.Basic).setBreakStone(true).setUndig(true).setDeleteItem(true)),
    Scythe(new Tool().setName("Scythe").setCapacity(1).setLevel(ToolLevel.Scythe).setCutWeed(true).setReap(true)),
    Shear(new Tool().setName("Shear").setCapacity(1).setLevel(ToolLevel.ShearOrMilk).setShearing(true)),
    WateringCan(new Tool().setName("WateringCan").setCapacity(40).setLevel(ToolLevel.Basic).setWatering(true));

    private final Tool tool;

    Tools(Tool tool) {
        this.tool = tool;
    }

    public Tool getTool() {
        return tool;
    }
}
