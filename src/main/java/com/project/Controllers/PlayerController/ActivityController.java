package com.project.Controllers.PlayerController;

import com.project.Models.App;
import com.project.Models.Enums.Menu;
import com.project.Models.LivingBeings.Player;
import com.project.Models.Map.GameObject;
import com.project.Models.Result;

import java.util.ArrayList;

public class ActivityController {
    public Result walk(String xString, String yString) {
        xString = xString.trim();
        yString = yString.trim();

        int x;
        int y;
        try {
            x = Integer.parseInt(xString);
            y = Integer.parseInt(yString);
        } catch (NumberFormatException e) {
            return new Result(false, "Invalid x or y value");
        }

        App.getPlayer().walk(x, y);
        return new Result(true, "player is in + " + x + ", " + y);
    }

    public void increaseEnergy() {

    }

    public void decreaseEnergy() {

    }

    public void GhashKardan() {

    }

    public Result exit() {
        // exit from game

        App.setCurrentMenu(Menu.GameMenu);
        App.setGame(null);

        return new Result(true, "exit");
    }

    // debugging

    public void gameInfo() {
        System.out.println("------------Game Info:------------");
        for (Player i : App.getGame().getPlayers()) {
            System.out.print(i.getUsername() + "(" + i.getNickname() + "): " + i.getLevel() + ", " + i.getGender());
            if (App.getGame().getMainPlayer().equals(i))
                System.out.print("(main player)");
            System.out.println();
        }
        System.out.println("------------------------");
    }

    public void printMap() {
        for (ArrayList<GameObject>[] i : App.getGame().getMap().getBlocks()) {
            for (ArrayList<GameObject> b : i) {
                GameObject gameObject = b.get(b.size() - 1);
                System.out.print(gameObject.tooString());
            }
            System.out.println();
        }
    }
}
