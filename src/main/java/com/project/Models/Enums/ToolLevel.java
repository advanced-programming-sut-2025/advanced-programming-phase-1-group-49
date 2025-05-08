package com.project.Models.Enums;

public enum ToolLevel {
    basic(5, 0),
    Cu(4, 1),
    Fe(3, 2),
    Au(2, 3),
    Ir(1, 4);

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
