package com.project.Models.Enums;

public enum FPLevel {
    TrainingFP(8, 0, 0.1),
    BambooFP(8, 1, 0.5),
    FiberGlassFP(6, 2, 0.9),
    IrFP(4, 3, 1.2),
    ;

    public final int energy;
    public final int level;
    public final double amount;

    FPLevel(int energy, int level, double amount) {
        this.energy = energy;
        this.level = level;
        this.amount = amount;
    }

    public int getEnergy() {
        return energy;
    }
}
