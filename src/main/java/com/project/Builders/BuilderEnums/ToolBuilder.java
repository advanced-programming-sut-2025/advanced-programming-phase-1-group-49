package com.project.Builders.BuilderEnums;

import com.project.Models.Enums.ToolLevel;
import com.project.Models.Tools.Tool;

public enum ToolBuilder {
    Axe(new Tool().setName("Axe").setEnergy(5).setComplement(-1).setLevel(ToolLevel.Basic).setCutTree(true).setDeleteBranches(true)),
    FishingPole(new Tool().setName("FishingPole").setComplement(0).setLevel(ToolLevel.Basic).setFishing(true).setCost(25)),
    Hoe(new Tool().setName("Hoe").setComplement(0).setLevel(ToolLevel.Basic).setDigging(true)),
    MilkPail(new Tool().setName("MilkPail").setComplement(0).setLevel(ToolLevel.ShearOrMilk).setMilking(true)),
    Pickaxe(new Tool().setName("Pickaxe").setComplement(-1).setLevel(ToolLevel.Basic).setBreakStone(true).setUndig(true).setDeleteItem(true)),
    Scythe(new Tool().setName("Scythe").setComplement(0).setLevel(ToolLevel.Scythe).setCutWeed(true).setReap(true)),
    Shear(new Tool().setName("Shear").setComplement(0).setLevel(ToolLevel.ShearOrMilk).setShearing(true)),
    WateringCan(new Tool().setName("WateringCan").setComplement(-1).setLevel(ToolLevel.BasicCan).setWatering(true).setAnotherComplement(40));

    private final Tool tool;

    ToolBuilder(Tool tool) {
        this.tool = tool;
    }

    public Tool getTool() {
        return tool;
    }
}
