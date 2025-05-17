package com.project.Models;

import com.google.gson.Gson;
import com.project.Builders.GameBuilder;
import com.project.Controllers.AppController;
import com.project.Models.LivingBeings.Player;
import com.project.Models.Map.Map;
import com.project.Models.Time.Time;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class Game {
    private final Time time = new Time();
    private Map map;
    private static int GameCounter = 0;
    private final int id;
    private final inventory inventory = new inventory();
    private int mainPlayer = -1; // game creator
    transient private ArrayList<Player> players = new ArrayList<>();
    private final ArrayList<String> playerUserNames = new ArrayList<>();
    private final ArrayList<Integer> farmsOwner = new ArrayList<>();
    private int turn = 0;

    public Game(GameBuilder builder) {
        this.map = new Map();
        this.mainPlayer = 0;
        turn = 0;
        GameCounter++;
        id = GameCounter;

        for (int i = 0; i < 4; i++) {
            players.add(builder.getPlayers()[i]);
            playerUserNames.add(players.get(i).getUsername());
            farmsOwner.add(builder.getFarm()[i]);
            players.get(i).setGame(this);
            players.get(i).setGameID(id);
            AppController.savePlayer(players.get(i));
        }
    }

    // getter

    public int getGameID() {
        return id;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public Player getMainPlayer() {
        return players.get(mainPlayer);
    }

    public Map getMap() {
        return map;
    }

    public inventory getInventory() {
        return inventory;
    }

    public Player getPlayer() {
        return players.get(turn);
    }

    public Time getTime() {
        return time;
    }

    // setter

    public void setMainPlayer(Player player) {
        if (!players.contains(player))
            return;
        this.mainPlayer = players.indexOf(player);
    }

    public static void setGameCounter(int gameCounter) {
        GameCounter = gameCounter;
    }

    public void initializePlayers() {
        players = new ArrayList<>();
        for (String username : playerUserNames) {
            Player targetPlayer = App.searchPlayer(username);
            if (targetPlayer == null) {
                File player = new File("Data/" + username + "/PlayerInfo.json");
                try {
                    FileReader reader = new FileReader(player);
                    targetPlayer = new Gson().fromJson(reader, Player.class);
                    App.addPlayer(targetPlayer);
                } catch (FileNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }
            players.add(targetPlayer);
            targetPlayer.initialize();
        }
        map.initialize();
    }

    public void setMap(Map map) {
        this.map = map;
    }

    //

    public void nextTurn() {
        turn++;
        if (turn > 3) {
            time.changeTime(1);
            turn = 0;
        }
    }

}
