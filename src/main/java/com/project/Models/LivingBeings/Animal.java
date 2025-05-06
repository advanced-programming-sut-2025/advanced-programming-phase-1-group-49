package com.project.Models.LivingBeings;

import com.project.Models.Time.ObserveTime;

public abstract class Animal implements LivingBeings, ObserveTime {
    protected int cost;
    ArrayList<Item> products;
}

