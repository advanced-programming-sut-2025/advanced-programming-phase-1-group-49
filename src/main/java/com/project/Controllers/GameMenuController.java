package com.project.Controllers;

import com.google.gson.Gson;
import com.project.Builders.GameBuilder;
import com.project.Models.App;
import com.project.Models.Enums.Block;
import com.project.Models.Enums.Menu;
import com.project.Models.Game;
import com.project.Models.LivingBeings.Player;
import com.project.Models.Map.GameObject;
import com.project.Models.Result;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

public class GameMenuController {
    private boolean createNewGame = false;

    private GameBuilder builder;
    private final Gson gson = new Gson();
    private int index = 1;

    private void resetFields() {
        createNewGame = false;
        builder = null;
        index = 1;
    }

    public Result newGame(String Player1, String Player2, String Player3) {
        resetFields();
        Player1 = Player1.trim();
        Player2 = Player2.trim();
        Player3 = Player3.trim();
        final ArrayList<Player> players = new ArrayList<>();
        final ArrayList<String> playerUsernames = new ArrayList<>(Arrays.asList(Player1, Player2, Player3));

        for (String playerUserName : playerUsernames) {
            Player newPlayer = App.searchPlayer(playerUserName);
            if (newPlayer == null) {
                File player = new File("Data/" + playerUserName + "/PlayerInfo.json");
                if (player.exists())
                    try {
                        FileReader reader = new FileReader(player);
                        newPlayer = new Gson().fromJson(reader, Player.class);
                        App.addPlayer(newPlayer);
                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    }
                else
                    return new Result(false, "No Player Found with Name " + playerUserName);
            }
            if (App.getPlayer().equals(newPlayer))
                return new Result(false, "You are already in a game.");
//            if (newPlayer.getGameID() != 0)
//                return new Result(false, "Player is already in a game.");
            players.add(newPlayer);
        }

        if (players.size() < 3)
            return new Result(false, "Not enough players found");

        builder = new GameBuilder();
        for (int i = 0; i < players.size(); i++)
            builder.player(players.get(i), i);
        createNewGame = true;

        return new Result(true, String.format("%s, select your map :", builder.getPlayers()[index].getNickname()));
    }

    public Result selectMap(String idString) {
        idString = idString.trim();
        int id;

        try {
            id = Integer.parseInt(idString);
        } catch (NumberFormatException e) {
            return new Result(false, "Not a valid map id");
        }
        if (id > 4 || id < 1)
            return new Result(false, "Not a valid map id");
        for (int i : builder.getFarm())
            if (i == id)
                return new Result(false, "already selected farm");

        builder.farm(id, index - 1);
        index++;
        if (index > 4) {
            Game game = new Game(builder);
            App.addGame(game);
            resetFields();

            // Save Game

            return new Result(true, "Game Created. Now you can load game");
        }
        return new Result(true, String.format("%s, select your map :", builder.getPlayers()[index].getNickname()));
    }

    public Result exitGame() {
        // exit game

        return new Result(true, "exit game");
    }

    public Result loadGame() {
        // load game

        return new Result(true, "load game");
    }

    // getter

    public boolean isCreateNewGame() {
        return createNewGame;
    }
}
