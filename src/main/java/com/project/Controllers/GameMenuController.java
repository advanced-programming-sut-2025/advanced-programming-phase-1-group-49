package com.project.Controllers;

import com.project.Models.App;
import com.project.Models.Game;
import com.project.Models.LivingBeings.Player;
import com.project.Models.Result;

public class GameMenuController {
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
}
