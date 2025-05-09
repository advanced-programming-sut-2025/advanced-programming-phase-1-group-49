package com.project.Controllers;

import com.google.gson.Gson;
import com.project.Models.App;
import com.project.Models.Enums.Menu;
import com.project.Models.LivingBeings.Player;

import java.io.*;
import java.util.Scanner;

public class AppController {
    private static final Gson gson = new Gson();

    public static void loadData() {
        File folder = new File("Data");
        if (!folder.exists() && folder.mkdir() || !new File("Data/AppData.txt").exists())
            createAppDataFile();

        try (BufferedReader reader = new BufferedReader(new FileReader("Data/AppData.txt"))) {
            Scanner scanner = new Scanner(reader);
            String line;
            if (scanner.hasNext() && (line = scanner.nextLine()) != null) {
                File target = new File("Data/" + line + "/PlayerInfo.json");
                if (target.exists()) {
                    FileReader fileReader = new FileReader(target);
                    Player loadPlayer = new Gson().fromJson(fileReader, Player.class);
                    App.addPlayer(loadPlayer);
                    App.setCurrentPlayer(loadPlayer);
                    App.setCurrentMenu(Menu.MainMenu);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void createAppDataFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Data/AppData.txt"))) {
            writer.write("");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void saveData() {
        for (Player i : App.getPlayerList())
            savePlayer(i);
    }

    public static void savePlayer(Player player) {
        try (FileWriter writer = new FileWriter("Data/" + player.getUsername() + "/PlayerInfo.json")) {
            gson.toJson(player, writer);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
