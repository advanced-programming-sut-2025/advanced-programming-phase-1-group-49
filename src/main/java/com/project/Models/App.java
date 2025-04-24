package com.project.Models;

import com.project.Models.Enums.Menu;
import com.project.Models.LivingBeings.Player;

import java.util.ArrayList;

public class App {
    private static final ArrayList<Player> playerList = new ArrayList<>();
    private static Player currentPlayer = null;
    private static Menu currentMenu = Menu.RegisterMenu;

    public static Player getCurrentPlayer() {
        return currentPlayer;
    }

    public static void setCurrentPlayer(Player currentPlayer) {
        App.currentPlayer = currentPlayer;
    }

    public static Menu getCurrentMenu() {
        return currentMenu;
    }

    public static void setCurrentMenu(Menu currentMenu) {
        App.currentMenu = currentMenu;
    }


    public void addPlayer(Player player) {
        playerList.add(player);
    }

    public static ArrayList<Player> getPlayerList() {
        return playerList;
    }
}
