package com.project.Controllers;

import com.project.Models.App;
import com.project.Models.Enums.Block;
import com.project.Models.Game;
import com.project.Models.LivingBeings.Player;
import com.project.Models.Map.GameObject;
import com.project.Models.Result;

import java.util.ArrayList;

public class GameMenuController {
    final String RESET = "\u001B[0m";
    final String RED = "\u001B[31m";
    final String GREEN = "\u001B[32m";
    final String YELLOW = "\u001B[33m";
    final String BLUE = "\u001B[34m";

    public Result newGame(String Player1, String Player2, String Player3) {
        Player1 = Player1.trim();
        Player2 = Player2.trim();
        Player3 = Player3.trim();

        Player player1 = App.searchPlayer(Player1);
        Player player2 = App.searchPlayer(Player2);
        Player player3 = App.searchPlayer(Player3);

        if (player1 == null)
            return new Result(false, "No Player Found with Name " + Player1);
        if (player2 == null)
            return new Result(false, "No Player Found with Name " + Player2);
        if (player3 == null)
            return new Result(false, "No Player Found with Name " + Player3);

        Game newGame = new Game(player1, player2, player3);
        App.addGame(newGame);
        App.setGame(newGame);
        App.getPlayer().setGame(newGame);
        App.getPlayer().walk(5, 84);

        return new Result(true, "game created");
    }

    public Result selectMap(String idString) {
        // select Map

        return new Result(false, "map selected");
    }

    public Result exitGame() {
        // exit game

        return new Result(true, "exit game");
    }

    public Result nextTurn() {
        // next Turn

        return new Result(true, "next turn");
    }

    public Result loadGame() {
        return new Result(true, "load game");
    }

    // Debug Method :

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
