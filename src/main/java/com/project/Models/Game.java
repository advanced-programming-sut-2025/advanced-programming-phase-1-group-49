package com.project.Models;

import com.project.Builders.GameBuilder;
import com.project.Controllers.AppController;
import com.project.Models.LivingBeings.Player;
import com.project.Models.Map.Map;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Game {
    private final Map map;
    private static int GameCounter = 0;
    private final int id;
    private int mainPlayer = -1;
    private final LinkedHashMap<Player, Integer> players = new LinkedHashMap<>();
    private final inventory inventory = new inventory();

    public Game(GameBuilder builder) {
        this.map = new Map();
        this.mainPlayer = 0;
        GameCounter++;
        id = GameCounter;

        players.put(builder.getPlayer1(), builder.getFarm1());
        players.put(builder.getPlayer2(), builder.getFarm2());
        players.put(builder.getPlayer3(), builder.getFarm3());
        players.put(builder.getPlayer4(), builder.getFarm4());

        for (Player player : players.keySet()) {
            player.setGame(this);
            player.setGameID(id);
        }

        for (Player player : players.keySet())
            AppController.savePlayer(player);
    }

    // getter

    public Player[] getPlayers() {
        return players.keySet().toArray(new Player[0]);
    }

    public Player getMainPlayer() {
        return new ArrayList<>(players.keySet()).get(mainPlayer);
    }

    public Map getMap() {
        return map;
    }

    public inventory getInventory() {
        return inventory;
    }

    // setter

    public void setMainPlayer(Player player) {
        if (!players.containsKey(player))
            return;
        this.mainPlayer = (new ArrayList<>(players.keySet())).indexOf(player);
    }
}
