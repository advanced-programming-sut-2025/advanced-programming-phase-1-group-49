package com.project.Models.LivingBeings;

import com.project.Models.Item.Item;
import com.project.Models.Time.ObserveTime;

import java.util.ArrayList;

public abstract class Animal implements LivingBeings, ObserveTime {
    protected int cost;
    ArrayList<Item> products;
}

