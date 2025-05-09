package com.project.Builders;

import com.project.Models.Game;
import com.project.Models.LivingBeings.Player;

public class GameBuilder {
    private Player mainPlayer;
    private Player player1;
    private Player player2;
    private Player player3;
    private int farm1;
    private int farm2;
    private int farm3;
    private int farm4;

    // builder

    public GameBuilder player1(Player mainPlayer) {
        this.mainPlayer = mainPlayer;
        return this;
    }

    public GameBuilder player2(Player player1) {
        this.player1 = player1;
        return this;
    }

    public GameBuilder player3(Player player2) {
        this.player2 = player2;
        return this;
    }

    public GameBuilder player4(Player player3) {
        this.player3 = player3;
        return this;
    }

    public GameBuilder farm1(int farm1) {
        this.farm1 = farm1;
        return this;
    }

    public GameBuilder farm2(int farm2) {
        this.farm2 = farm2;
        return this;
    }

    public GameBuilder farm3(int farm3) {
        this.farm3 = farm3;
        return this;
    }

    public GameBuilder farm4(int farm4) {
        this.farm4 = farm4;
        return this;
    }

    // getter

    public Player getPlayer1() {
        return mainPlayer;
    }

    public Player getPlayer2() {
        return player1;
    }

    public Player getPlayer3() {
        return player2;
    }

    public Player getPlayer4() {
        return player3;
    }

    public int getFarm1() {
        return farm1;
    }

    public int getFarm2() {
        return farm2;
    }

    public int getFarm3() {
        return farm3;
    }

    public int getFarm4() {
        return farm4;
    }

    // result

    public Game build() {
        return (new Game(this));
    }
}
