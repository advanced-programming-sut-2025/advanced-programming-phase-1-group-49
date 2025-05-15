package com.project.Models.LivingBeings;

import com.project.Models.Enums.BarnTypes;

public class Barn {
    protected BarnTypes barnType;
    protected int components;

    public Barn setBarnType(BarnTypes barnType) {
        this.barnType = barnType;
        return this;
    }
    public BarnTypes getBarnType() {
        return barnType;
    }

    public Barn setComponents(int components) {
        this.components = components;
        return this;
    }
    public int getComponents() {
        return components;
    }
}
