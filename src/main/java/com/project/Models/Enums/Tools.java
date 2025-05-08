package com.project.Models.Enums;

import com.project.Models.Tools.Tool;

public enum Tools {
    Axe(new Tool().setName("Axe").setEnergy(5).setCapacity(1)),
    FishingPole(new Tool()),
    Hoe(new Tool()),
    MilkPail(new Tool()),
    Pickaxe(new Tool()),
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
