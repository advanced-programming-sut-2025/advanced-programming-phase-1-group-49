package com.project.Models.Item;

import com.project.Compositors.Ingredients;
import com.project.Models.Map.GameObject;
import com.project.Models.Time.ObserveTime;

public interface Item extends GameObject, ObserveTime {
    String Name = new String();
    Ingredients recipe = null;
}
