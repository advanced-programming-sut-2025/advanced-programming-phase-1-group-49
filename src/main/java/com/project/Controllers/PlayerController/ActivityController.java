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

    // we should work with game.getPlayer => return main player

    private Game game;
    private Player player;

    private boolean forbiddenBlock(int x, int y) {
        for (GameObject g : game.getMap().getBlocks()[x][y])
            if (Map.getForbiddenClasses().contains(g.getClass()))
                return false;
        return true;
    }

    private int bfsSearch(int playerX, int playerY, int x, int y) {
        int length = 0;

        Queue<int[]> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        queue.add(new int[]{playerX, playerY});
        visited.add(playerX + "-" + playerY);

        while (!queue.isEmpty()) {
            int[] current = queue.remove();
            visited.add(current[0] + "-" + current[1]);
            length++;

            if (current[0] == x && current[1] == y)
                return length;

            int[][] neighbors = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
            // age mostaghim beshe orib raft bayad inja add konam

            for (int[] neighbor : neighbors) {
                int[] target = new int[]{current[0] + neighbor[0], current[1] + neighbor[1]};
                if (target[0] > 0 && target[1] > 0
                        && target[0] < Map.getMapLength() && target[1] < Map.getMapWidth()
                        && forbiddenBlock(target[0], target[1]) && !visited.contains(target[0] + "-" + target[1])) {
                    queue.add(target);
                    visited.add(target[0] + "-" + target[1]);
                }
            }

            // shart Energy inja add mikonam, age energy tamoom shod haminja miofte
        }
        return 0;
    }

    public Result walk(String xString, String yString) {
        ArrayList<GameObject>[][] map = App.getGame().getMap().getBlocks();
        xString = xString.trim();
        yString = yString.trim();

        int x;
        int y;
        try {
            x = Integer.parseInt(xString);
            y = Integer.parseInt(yString);
        } catch (NumberFormatException e) {
            return new Result(false, "Invalid x or y value");
        }
        if (x >= Map.getMapLength() || y >= Map.getMapWidth() || x < 0 || y < 0)
            return new Result(false, "Invalid x or y value");

        for (GameObject g : map[x][y])
            if (Map.getForbiddenClasses().contains(g.getClass()))
                return new Result(false, "You can't walk out of blocks");

        int length = bfsSearch(player.getX(), player.getY(), x, y);
        if (length == 0)
            return new Result(false, "You can't walk there");

        player.decreaseEnergy(length / 20);
        player.walk(x, y);

        return new Result(true, "player is in " + x + ", " + y);
    }

    public void GhashKardan() {

    }

    public Result exit() {
        for (Player p : game.getPlayers()) {
            AppController.savePlayer(p);
        }

        (new GameMenuController()).saveGame(game);

        App.setCurrentMenu(Menu.GameMenu);
        App.setGame(null);

        return new Result(true, "exit");
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
        System.out.printf("Player : %s, Level : %d, Energy : %d%n", player.getUsername(), player.getLevel(), player.getEnergy());
        for (ArrayList<GameObject>[] i : App.getGame().getMap().getBlocks()) {
            for (ArrayList<GameObject> b : i) {
                GameObject gameObject = b.get(b.size() - 1);
                System.out.print(gameObject.tooString());
            }
            System.out.println();
        }
    }
}
