package com.project.Builders;

import com.project.Models.Game;
import com.project.Models.LivingBeings.Player;

public class GameBuilder {
    private final Player[] players = new Player[4];
    private final int[] farm = new int[4];

    // builder

    public void player(Player player, int index) {
        players[index] = player;
    }

    public void farm(int id, int player) {
        farm[id] = player;
    }

    // getter

    public Player[] getPlayers() {
        return players;
    }

    public int[] getFarm() {
        return farm;
    }

    // result

    public Game build() {
        return (new Game(this));
    }
}
