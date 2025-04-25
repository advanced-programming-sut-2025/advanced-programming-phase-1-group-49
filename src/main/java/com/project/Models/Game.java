package com.project.Models;

import com.project.Models.LivingBeings.Player;
import com.project.Models.Map.Map;

import java.util.ArrayList;

public class Game {
    private final ArrayList<Player> players = new ArrayList<>();
    private Player mainPlayer;
    private Map map;

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void addPlayers(Player player) {
        players.add(player);
    }
}
