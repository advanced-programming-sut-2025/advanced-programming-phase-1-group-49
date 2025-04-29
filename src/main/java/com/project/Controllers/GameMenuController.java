package com.project.Controllers;

import com.project.Models.App;
import com.project.Models.Enums.Block;
import com.project.Models.Game;
import com.project.Models.LivingBeings.Player;
import com.project.Models.Result;

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

        return new Result(true, "game created");
    }

    public Result selectMap(String idString) {
        return new Result(false, "map selected");
    }

    // Debug Method :

    public void printMap() {
        for (Block[] i : App.getGame().getMap().getBlocks()) {
            for (Block b : i) {
                if (b == null)
                    System.out.print("█");
                if (b == Block.water)
                    System.out.print(BLUE + "█" + RESET);
                if (b == Block.homeWall)
                    System.out.print(RED + "█" + RESET);
                if (b == Block.greenhouseWall)
                    System.out.print(RED + "█" + RESET);
                if (b == Block.home)
                    System.out.print(GREEN + "█" + RESET);
                if (b == Block.greenhouse)
                    System.out.print(GREEN + "█" + RESET);
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
