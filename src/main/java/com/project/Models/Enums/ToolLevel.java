package com.project.Models.Enums;

public enum ToolLevel {
    basic(5),
    Cu(4),
    Fe(3),
    Au(2),
    Ir(1);

    private final int energy;

    ToolLevel(int energy) {
        this.energy = energy;
    }

    public int getEnergy() {
        return energy;
    }
}
