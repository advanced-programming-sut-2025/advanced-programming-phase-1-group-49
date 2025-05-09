package com.project.Controllers.PlayerController;

import com.project.Models.App;
import com.project.Models.Enums.Block;
import com.project.Models.LivingBeings.Player;
import com.project.Models.Map.GameObject;
import com.project.Models.Result;

import java.util.ArrayList;

public class ActivityController {
    final String RESET = "\u001B[0m";
    final String RED = "\u001B[31m";
    final String GREEN = "\u001B[32m";
    final String YELLOW = "\u001B[33m";
    final String BLUE = "\u001B[34m";

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

    public void printMap() {
        for (ArrayList<GameObject>[] i : App.getGame().getMap().getBlocks()) {
            for (ArrayList<GameObject> b : i) {
                GameObject gameObject = b.get(b.size() - 1);
                if (gameObject.equals(Block.basic)) {
                    System.out.print(" ");
                } else if (gameObject.equals(Block.water)) {
                    System.out.print(BLUE + "█" + RESET);
                } else if (gameObject.equals(Block.homeWall) || gameObject.equals(Block.greenhouseWall)) {
                    System.out.print(RED + "█" + RESET);
                } else if (gameObject.equals(Block.home) || gameObject.equals(Block.greenhouse)) {
                    System.out.print(GREEN + "█" + RESET);
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

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
}
