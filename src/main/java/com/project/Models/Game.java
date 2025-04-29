package com.project.Models;

import com.project.Models.LivingBeings.Player;
import com.project.Models.Map.Map;

import java.util.ArrayList;

public class Game {
    private final ArrayList<Player> players = new ArrayList<>();
    private Player mainPlayer;
    private Map map;

    public Game(Player player1, Player player2, Player player3) {
        this.mainPlayer = App.getCurrentPlayer();
        this.players.add(mainPlayer);
        this.players.add(player1);
        this.players.add(player2);
        this.players.add(player3);
        this.map = new Map();
    }

    // getter

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public Player getMainPlayer() {
        return mainPlayer;
    }

    public Map getMap() {
        return map;
    }

    // add

    public void addPlayers(Player player) {
        players.add(player);
    }

    // setter

    public void setMainPlayer(Player mainPlayer) {
        this.mainPlayer = mainPlayer;
    }
}
