package com.project.Models.LivingBeings;

import com.project.Models.Enums.BarnTypes;

public class Coop {
    protected BarnTypes coopType;
    protected int components;

    public Coop setCoopType(BarnTypes coopType) {
        this.coopType = coopType;
        return this;
    }
    public BarnTypes getCoopType() {
        return coopType;
    }

    public Coop setComponents(int components) {
        this.components = components;
        return this;
    }
    public int getComponents() {
        return components;
    }
}
