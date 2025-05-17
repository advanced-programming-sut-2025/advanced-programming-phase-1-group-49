package com.project.Controllers.PlayerController;

import com.project.Controllers.AppController;
import com.project.Controllers.GameMenuController;
import com.project.Models.App;
import com.project.Models.Enums.Menu;
import com.project.Models.Enums.Menus.GameCommands;
import com.project.Models.Enums.Weathers;
import com.project.Models.Game;
import com.project.Models.Houses.GreenHouse;
import com.project.Models.LivingBeings.Player;
import com.project.Models.Map.GameObject;
import com.project.Models.Map.Map;
import com.project.Models.Result;

import java.util.*;

public class ActivityController {
    private Game game;
    private Player player;

    private boolean forbiddenBlock(int x, int y) {
        for (GameObject g : game.getMap().getBlocks()[x][y])
            if (Map.getForbiddenClasses().contains(g.getClass()))
                return false;
        return true;
    }

    private int[] bfsSearch(int playerX, int playerY, int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        queue.add(new int[]{playerX, playerY, 0, 0});
        visited.add(playerX + "-" + playerY);

        while (!queue.isEmpty()) {
            int[] current = queue.remove();
            visited.add(current[0] + "-" + current[1]);
            if (current[0] == x && current[1] == y)
                return new int[]{current[2], current[3]};
            int[][] neighbors = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}, {1, 1}, {-1, -1}, {-1, 1}, {1, -1}};
            for (int[] neighbor : neighbors) {
                int add = current[3];
                if (neighbor[0] != 0 && neighbor[1] != 0)
                    add += 1;
                int[] target = new int[]{current[0] + neighbor[0], current[1] + neighbor[1], current[2] + 1, add};
                if (target[0] >= 0 && target[1] >= 0
                        && target[0] < Map.getMapLength() && target[1] < Map.getMapWidth()
                        && forbiddenBlock(target[0], target[1]) && !visited.contains(target[0] + "-" + target[1])) {
                    queue.add(target);
                    visited.add(target[0] + "-" + target[1]);
                }
            }
            if (player.getEnergy() - (current[2] + (current[3] + 10) / 20) <= 0) {
                GhashKardan(current[0], current[1]);
                return new int[]{0, 0};
            }
        }
        return new int[]{0, 0};
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
        int[][] position = game.getMap().getPositions();
        for (int i = 0; i < 4; i++) {
            if (i == game.getFarmID(player)) continue;
            int[] j = position[i];
            if (x >= j[0] && x <= j[0] + 20 && y >= j[1] && y <= j[1] + 100)
                return new Result(false, "You can't walk into the others farm");
        }
        int[] length = bfsSearch(player.getX(), player.getY(), x, y);
        if (length[0] == 0)
            return new Result(false, "You can't walk there");
        player.decreaseEnergy(length[0] + (length[1] + 10) / 20);
        player.walk(x, y);
        player.increaseXP(length[0] + (length[1] + 10) / 20);
        return new Result(true, "player is in " + x + ", " + y);
    }

    public void GhashKardan(int x, int y) {
        nextTurn();
        player.walk(x, y);
        player.decreaseEnergy(player.getEnergy());
    }

    public Result exit() {
        if (!game.getPlayer().equals(game.getMainPlayer()))
            return new Result(false, "You are not the main player");

        for (Player p : game.getPlayers())
            AppController.savePlayer(p);

        (new GameMenuController()).saveGame(game);

        App.setCurrentMenu(Menu.GameMenu);

        return new Result(true, "exit");
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

    public Result printMap(String xString, String yString, String sizeString) {
        xString = xString.trim();
        yString = yString.trim();
        sizeString = sizeString.trim();

        int x, y, size;
        try {
            x = Integer.parseInt(xString);
            y = Integer.parseInt(yString);
            size = Integer.parseInt(sizeString);
        } catch (NumberFormatException e) {
            return new Result(false, "Invalid x or y value");
        }

        ArrayList<GameObject>[][] map = game.getMap().getBlocks();

        if (size > 72)
            size = 72;
        int startX = x - (size / 4), startY = y - size;
        int endX = x + (size / 4), endY = y + size;

        if (startX < 0) {
            startX = 3;
            endX = startX + size / 2;
        } else if (endX >= map.length) {
            startX = map.length - (size / 2) - 3;
            endX = map.length - 3;
        }

        if (startY < 0) {
            startY = 0;
            endY = startY + size + size;
        } else if (endY >= map[0].length) {
            endY = map[0].length - 5;
            startY = map[0].length - 5 - size - size;
        }

        System.out.printf("Player : %s(%d), XP : %d, Energy : %d, Farm ID : %d\nprint map from <%d,%d> -> <%d,%d>, your position : <%d,%d>\n",
                player.getUsername(), player.getLevel(), player.getXP(), player.getEnergy(), game.getFarmID(player) + 1,
                startX, endX, startY, endY, player.getX(), player.getY());

        System.out.print("┌");
        for (int i = startY + 1; i < endY; i++)
            System.out.print("─");
        System.out.print("┐");
        System.out.println();

        for (int i = startX; i < endX; i++) {
            System.out.print("│");
            for (int j = startY; j < endY; j++) {
                System.out.print(map[i][j].get(map[i][j].size() - 1).tooString());
            }
            System.out.print("│");
            System.out.println();
        }

        System.out.print("└");
        for (int i = startY + 1; i < endY; i++)
            System.out.print("─");
        System.out.print("┘");
        System.out.println();
        return new Result(true, "");
    }

    public Result nextTurn() {
        AppController.savePlayer(player);
        game.nextTurn();
        initialize();
        return new Result(true, game.getPlayer() + ", its your turn.");
    }

    public Result greenHouse() {
        if (player.getCoin() < 1000 || player.getInventory().searchItem("wood") == null
                || player.getInventory().getQuantity(player.getInventory().searchItem("wood")) <= 0)
            return new Result(false, "You don't have enough resource");
        String id = "GreenHouse" + game.getFarmID(player);
        ((GreenHouse) game.getMap().searchObject(id)).switchStatement();
        return new Result(true, "GreenHouse created successfully!");
    }

    public Result mapGuid() {
        String result = ("""
                Y   :   Player
                H   :   Home
                G   :   Green House
                L   :   Leak
                """);
        return new Result(true, result);
    }

    // cheat codes :

    public Result increaseTime(String amountString) {
        amountString = amountString.trim();
        int amount;
        try {
            amount = Integer.parseInt(amountString);
        } catch (NumberFormatException e) {
            return new Result(false, "Invalid amount value");
        }
        game.getTime().changeTime(amount);
        return new Result(true, "new time :" + game.getTime().getCurrentHour() + ":00");
    }

    public Result increaseDate(String amountString) {
        amountString = amountString.trim();
        int amount;
        try {
            amount = Integer.parseInt(amountString);
        } catch (NumberFormatException e) {
            return new Result(false, "Invalid amount value");
        }
        game.getTime().changeTime(amount * 13);
        return new Result(true, "new date :" + game.getTime().getCurrentDay());
    }

    public Result changeWeather(String amountString) {
        amountString = amountString.trim().toLowerCase();
        if (!GameCommands.weathers.getMatcher(amountString).find())
            return new Result(false, "Invalid weather value");
        game.getTime().setCurrentWeather(switch (amountString) {
            case "sunny" -> Weathers.SUNNY;
            case "storm" -> Weathers.STORM;
            case "rain" -> Weathers.RAIN;
            case "snow" -> Weathers.SNOW;
            default -> game.getTime().getCurrentWeather();
        });
        return new Result(true, "current weather :" + game.getTime().getCurrentWeather());
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
        printMap(player.getX() + "", player.getY() + "", "60");
    }
}
