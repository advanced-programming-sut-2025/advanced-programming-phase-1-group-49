package com.project.Models;

import com.project.Models.Enums.Menu;
import com.project.Models.LivingBeings.Player;

import java.util.ArrayList;

public class App {
    private static final ArrayList<Player> playerList = new ArrayList<>();
    private static Player currentPlayer = null;
    private static Menu currentMenu = Menu.RegisterMenu;
    private static Game game;
    private static final ArrayList<Game> gameList = new ArrayList<>();

    // getter

    public static Player getPlayer() {
        return currentPlayer;
    }

    public static Menu getCurrentMenu() {
        return currentMenu;
    }

    public static ArrayList<Player> getPlayerList() {
        return playerList;
    }

    public static Game getGame() {
        return game;
    }

    public static ArrayList<Game> getGameList() {
        return gameList;
    }

    // setter

    public static void setCurrentPlayer(Player currentPlayer) {
        App.currentPlayer = currentPlayer;
    }

    public static void setCurrentMenu(Menu currentMenu) {
        App.currentMenu = currentMenu;
    }

    public static void setGame(Game game) {
        App.game = game;
    }

    // add

    public static void addPlayer(Player player) {
        playerList.add(player);
    }

    public static void addGame(Game game) {
        gameList.add(game);
    }

    // search

    public static Player searchPlayer(String username) {
        for (Player player : playerList)
            if (player.getUsername().equals(username))
                return player;
        return null;
    }
}
