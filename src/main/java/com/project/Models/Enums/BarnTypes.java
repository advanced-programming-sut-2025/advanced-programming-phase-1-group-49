package com.project.Models.Enums;

public enum BarnTypes {
    Regular(4),
    Big(8),
    Deluxe(12),
    ;

    public final int Capacity;
    BarnTypes(int capacity) {
        Capacity = capacity;
    }

}
