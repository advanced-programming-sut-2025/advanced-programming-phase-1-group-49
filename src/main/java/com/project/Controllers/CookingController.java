package com.project.Controllers;

import com.project.Models.App;
import com.project.Models.Item.Edible;
import com.project.Models.Item.Item;

import java.util.regex.Matcher;

public class CookingController extends AppController {

    public static void Eat(Matcher matcher) {
        for (Item item : App.getGame().getMainPlayer().getInventory().getItems()) {
            if (item instanceof Edible ) {
                if (App.getGame().getMainPlayer().getInventory().getQuantity(item) < 1) {
                    break;
                }
                App.getGame().getMainPlayer().getInventory().add(item, -1);
                return;
            }
        }
        System.out.println("Food not found!");
    }
}
