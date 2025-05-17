package com.project.Controllers.PlayerController;

import com.project.Controllers.AppController;
import com.project.Controllers.GameMenuController;
import com.project.Models.App;
import com.project.Models.Enums.Menu;
import com.project.Models.Game;
import com.project.Models.LivingBeings.Player;
import com.project.Models.Map.GameObject;
import com.project.Models.Map.Map;
import com.project.Models.Result;

import javax.swing.*;
import java.util.*;

public class ActivityController {

    /*
     * Ghash Kardan ro kamel konam
     * mohasebeh pichideh tar walk
     */

    private Game game;
    private Player player;

    private boolean forbiddenBlock(int x, int y) {
        for (GameObject g : game.getMap().getBlocks()[x][y])
            if (Map.getForbiddenClasses().contains(g.getClass()))
                return false;
        return true;
    }

    private int bfsSearch(int playerX, int playerY, int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        queue.add(new int[]{playerX, playerY, 0});
        visited.add(playerX + "-" + playerY);

        while (!queue.isEmpty()) {
            int[] current = queue.remove();
            visited.add(current[0] + "-" + current[1]);

            if (current[0] == x && current[1] == y)
                return current[2];

            int[][] neighbors = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}, {1, 1}, {-1, -1}, {-1, 1}, {1, -1}};

            for (int[] neighbor : neighbors) {
                int[] target = new int[]{current[0] + neighbor[0], current[1] + neighbor[1], current[2] + 1};
                if (target[0] >= 0 && target[1] >= 0
                        && target[0] < Map.getMapLength() && target[1] < Map.getMapWidth()
                        && forbiddenBlock(target[0], target[1]) && !visited.contains(target[0] + "-" + target[1])) {
                    queue.add(target);
                    visited.add(target[0] + "-" + target[1]);
                }
            }

            if (player.getEnergy() - (current[2] / 20) <= 0) {
                GhashKardan(current[0], current[1]);
                return 0;
            }
        }
        return 0;
    }

    public Result walk(String xString, String yString) {
        xString = xString.trim();
        yString = yString.trim();
        int x, y;
        try {
            x = Integer.parseInt(xString);
            y = Integer.parseInt(yString);
        } catch (NumberFormatException e) {
            return new Result(false, "Invalid x or y value");
        }
        if (x >= Map.getMapLength() || y >= Map.getMapWidth() || x < 0 || y < 0)
            return new Result(false, "Invalid x or y value");
        for (GameObject g : App.getGame().getMap().getBlocks()[x][y])
            if (Map.getForbiddenClasses().contains(g.getClass()))
                return new Result(false, "You can't walk out of blocks");
        int length = bfsSearch(player.getX(), player.getY(), x, y);
        if (length == 0)
            return new Result(false, "You can't walk there");
        player.decreaseEnergy(length / 20);
        player.walk(x, y);
        player.increaseXP(length / 20);
        return new Result(true, "player is in " + x + ", " + y);
    }

    public void GhashKardan(int x, int y) {
        System.out.println("Ghash kardi");
        player.walk(x, y);
        player.decreaseEnergy(player.getEnergy());
        // Switch Turn
    }

    public Result exit() {
        if (!game.getPlayer().equals(game.getMainPlayer()))
            return new Result(false, "You are not the main player");

        for (Player p : game.getPlayers()) {
            AppController.savePlayer(p);
        }

        (new GameMenuController()).saveGame(game);

        App.setCurrentMenu(Menu.GameMenu);
        App.setGame(null);

        return new Result(true, "exit");
    }

    public Result nextTurn() {
        game.nextTurn();
        initialize();
        return new Result(true, game.getPlayer() + ", its your turn.");
    }

    public Result time() {
        String result = game.getTime().getCurrentHour() + ":00 ";
        if (game.getTime().getCurrentHour() < 12)
            result += "(AM)";
        else
            result += "(PM)";
        return new Result(true, result);
    }

    public Result date() {
        return new Result(true, (game.getTime().getSpentMonth()) + "/" + (game.getTime().getSpentDays()));
    }

    public Result dateTime() {
        return new Result(true, game.getTime().getSpentMonth() + "/" + (game.getTime().getSpentDays()) + "-" + game.getTime().getCurrentHour() + ":00");
    }

    public Result weather() {
        return new Result(true, "Today : " + game.getTime().getCurrentWeather());
    }

    public Result weatherForecast() {
        return new Result(true, "Weather Forecast for tomorrow : " + game.getTime().getWeatherForecast());
    }

    public Result day() {
        return new Result(true, "Day : " + game.getTime().getCurrentDay());
    }

    public Result season() {
        return new Result(true, "Season : " + game.getTime().getCurrentSeason());
    }

    public Result greenHouse() {
//        if (player.getCoin() >= 1000 && player.getInventory().)
        return null;
    }

    public Result printMap(String xString, String yString, String sizeString) {
        return null;
    }

    public Result mapGuid() {
        return null;
    }

    // cheat codes :

    public Result increaseTime(String amountString) {
        return null;
    }

    public Result increaseDate(String amountString) {
        return null;
    }

    public Result changeWeather(String amountString) {
        return null;
    }

    //

    public void initialize() {
        game = App.getGame();
        player = game.getPlayer();
    }

    // debugging

    public void gameInfo() {
        System.out.println("------------Game Info:------------");
        for (Player i : App.getGame().getPlayers()) {
            System.out.print(i.getUsername() + "(" + i.getNickname() + "): " + i.getLevel() + ", " + i.getGender());
            if (App.getGame().getMainPlayer().equals(i))
                System.out.print("(main player)");
            System.out.println();
        }
        System.out.println("------------------------");
    }

    public void printMap() {
        System.out.printf("Player : %s(%d), XP : %d, Energy : %d", player.getUsername(), player.getLevel(), player.getXP(), player.getEnergy());
        for (ArrayList<GameObject>[] i : App.getGame().getMap().getBlocks()) {
            for (ArrayList<GameObject> b : i) {
                GameObject gameObject = b.get(b.size() - 1);
                System.out.print(gameObject.tooString());
            }
            System.out.println();
        }
    }
}
