package com.project.Models.Enums;

public enum ToolLevel {
    Basic(5, 0),
    Cu(4, 1),
    Fe(3, 2),
    Au(2, 3),
    Ir(1, 4),
    Scythe(2, 0),
    ShearOrMilk(4, 0),
    BasicCan(5, 40),
    CuCan(4, 55),
    FeCan(3, 70),
    AuCan(2, 85),
    IrCan(1, 100),
    ;

    private final int energy;
    private final int level;

    ToolLevel(int energy, int level) {
        this.energy = energy;
        this.level = level;
    }

    public int getEnergy() {
        return energy;
    }
}
