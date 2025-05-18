package com.project.Controllers;

import com.project.Models.App;
import com.project.Models.Item.Item;

import java.util.regex.Matcher;

public class CheatingController {

    public static void addItem(Matcher matcher) {
        Item item = null;
        for (Item item1 : App.getGame().getMainPlayer().getInventory().getItems()) {
            if (item1.getName().equals(matcher.group(1))) {
                item = item1;
                break;
            }
        }
        if (item == null) {
            System.out.println("Item not found");
            return;
        }

        App.getGame().getMainPlayer().getInventory().add(item, Integer.parseInt(matcher.group(2)));
        System.out.println("Added " + matcher.group(2) + item.getName() + " to the inventory");
    }
}
