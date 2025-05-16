package com.project.Controllers;

import com.google.gson.Gson;
import com.project.Builders.GameBuilder;
import com.project.Models.App;
import com.project.Models.Enums.Menu;
import com.project.Models.Game;
import com.project.Models.LivingBeings.Player;
import com.project.Models.Result;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class GameMenuController {
    private boolean createNewGame = false;

    private GameBuilder builder;
    private final Gson gson = new Gson();
    private int index = 0;

    private void resetFields() {
        createNewGame = false;
        builder = null;
        index = 0;
    }

    public Result newGame(String Player1, String Player2, String Player3) {
        resetFields();
        Player1 = Player1.trim();
        Player2 = Player2.trim();
        Player3 = Player3.trim();
        final ArrayList<Player> players = new ArrayList<>();
        final ArrayList<String> playerUsernames = new ArrayList<>(Arrays.asList(Player1, Player2, Player3));

        if (App.getPlayer().getGameID() != 0)
            return new Result(false, "You are already in a game");

        for (String playerUserName : playerUsernames) {
            Player newPlayer = App.searchPlayer(playerUserName);
            if (newPlayer == null) {
                File player = new File("Data/" + playerUserName + "/PlayerInfo.json");
                if (player.exists()) {
                    try (FileReader reader = new FileReader(player)) {
                        newPlayer = gson.fromJson(reader, Player.class);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    App.addPlayer(newPlayer);
                } else
                    return new Result(false, "No Player Found with Name " + playerUserName);
            }
            if (App.getPlayer().equals(newPlayer))
                return new Result(false, "You are already in a game.");
            if (newPlayer.getGameID() != 0)
                return new Result(false, "Player is already in a game.");
            players.add(newPlayer);
        }

        if (players.size() < 3)
            return new Result(false, "Not enough players found");

        builder = new GameBuilder();
        builder.player(App.getPlayer(), 0);
        for (int i = 0; i < players.size(); i++)
            builder.player(players.get(i), i + 1);
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

        builder.farm(id, index);
        index++;
        if (index > 3) {
            // crate game

            Game game = builder.build();
            App.addGame(game);

            // check folders :

            File checkGameFolder = new File("Data/Games");
            if (!checkGameFolder.exists()) {
                if (!checkGameFolder.mkdir())
                    return new Result(false, "Unable to create games folder");
            }
            File gameFolder = new File("Data/Games/" + game.getGameID());
            if (!gameFolder.mkdir())
                return new Result(false, "Unable to create game.create game folder fail");

            //

            saveGame(game);
            loadGame();
            resetFields();

            return new Result(true, "Game Created.");
        }
        return new Result(false, String.format("%s, select your map :", builder.getPlayers()[index].getNickname()));
    }

    public Result exitGame() {
        saveGame(App.getGame());
        App.setGame(null);
        App.setCurrentMenu(Menu.MainMenu);
        return new Result(true, "exit game");
    }

    public Result loadGame() {
        int gameID = App.getPlayer().getGameID();
        if (gameID == 0)
            return new Result(false, "No games found for you. please create new game");
        Game game = App.searchGame(gameID);
        if (game == null) {
            try {
                FileReader fileReader = new FileReader("Data/Games/" + gameID + "/game.json");
                game = gson.fromJson(fileReader, Game.class);
                game.initializePlayers();
                App.addGame(game);
                fileReader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        App.addGame(game);
        App.setGame(game);
        App.setCurrentMenu(Menu.GameActivity);
        return new Result(true, "load game");
    }

    private void saveGame(Game game) {
        try (FileWriter writer = new FileWriter("Data/Games/" + game.getGameID() + "/game.json")) {
            gson.toJson(game, writer);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        App.setGame(null);
        resetFields();
    }

    // getter

    public boolean isCreateNewGame() {
        return createNewGame;
    }
}
