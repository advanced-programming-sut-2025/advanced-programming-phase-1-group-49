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

        for (int i = 0; i < 4; i++) {
            Player player = builder.getPlayers()[i];
            players.put(player, builder.getFarm()[i]);
            player.setGame(this);
            player.setGameID(id);
            AppController.savePlayer(player);
        }
    }

    // getter

    public int getGameID() {
        return id;
    }

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
