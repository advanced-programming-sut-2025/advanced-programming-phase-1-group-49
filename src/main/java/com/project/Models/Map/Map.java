package com.project.Models.Map;

import com.project.Models.App;
import com.project.Models.Enums.Block;
import com.project.Models.Game;
import com.project.Models.Houses.GreenHouse;
import com.project.Models.Houses.Home;
import com.project.Models.LivingBeings.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Map {
    transient private Game game;
    static private final int mapLength = 72;
    static private final int mapWidth = 300;

    private final int[][] positions = new int[][]{{3, 5}, {49, 5}, {3, 155}, {49, 155}};
    private final ArrayList<GameObject>[][] blocks = new ArrayList[mapLength][mapWidth];
    private static final ArrayList<Class<?>> forbiddenClasses = new ArrayList<>(List.of(Home.class));

    transient private ArrayList<GameObject> objects = new ArrayList<>();

    public Map(Player[] players) {
        BlockWrapper basic = new BlockWrapper(Block.basic);
        BlockWrapper dust = new BlockWrapper(Block.soil);
        // initialize
        for (int i = 0; i < blocks.length; i++) {
            for (int j = 0; j < blocks[i].length; j++) {
                blocks[i][j] = new ArrayList<>();
                blocks[i][j].add(basic);
                blocks[i][j].add(dust);
            }
        }

        for (int i = 0; i < 4; i++) {
            initFarm(i, positions[i], players[i]);
        }

        objects.add(basic);
        objects.add(dust);
    }

    // getter

    public int[][] getPositions() {
        return positions;
    }

    static public int getMapLength() {
        return mapLength;
    }

    static public int getMapWidth() {
        return mapWidth;
    }

    public ArrayList<GameObject>[][] getBlocks() {
        return blocks;
    }

    public static ArrayList<Class<?>> getForbiddenClasses() {
        return forbiddenClasses;
    }

    // search

    public GameObject searchObject(String id) {
        for (GameObject object : objects) {
            if (object.getID().equals(id)) {
                return object;
            }
        }
        return null;
    }

    //

    private void initFarm(int id, int[] position, Player player) {
        Home home = new Home(id);
        for (int i = home.getHomeX() + position[0]; i < home.getHomeX() + position[0] + home.getHomeLength(); i++)
            for (int j = home.getHomeY() + position[1]; j < home.getHomeY() + position[1] + home.getHomeWidth(); j++)
                blocks[i][j].add(home);
        objects.add(home);

        GreenHouse greenHouse = new GreenHouse(id);
        for (int i = greenHouse.getGreenHouseX() + position[0]; i < greenHouse.getGreenHouseX() + position[0] + greenHouse.getGreenHouseWidth(); i++)
            for (int j = greenHouse.getGreenHouseY() + position[1]; j < greenHouse.getGreenHouseY() + position[1] + greenHouse.getGreenHouseLength(); j++)
                blocks[i][j].add(greenHouse);
        objects.add(greenHouse);

        int LeakX = 8 + position[0];
        int LeakY = 30 + position[1];
        int LeakLength = 3;
        int LeakWidth = 7;
        BlockWrapper water = new BlockWrapper(Block.water);
        for (int i = LeakX; i < LeakLength + LeakX; i++)
            for (int j = LeakY; j < LeakY + LeakWidth; j++)
                blocks[i][j].add(water);
        objects.add(water);

        int mineX = 18 + position[0];
        int mineY = 10 + position[1];
        int mineLength = 5;
        int mineWidth = 7;
        BlockWrapper mine = new BlockWrapper(Block.mineBlock);
        for (int i = mineX; i < mineX + mineLength; i++)
            for (int j = mineY; j < mineY + mineWidth; j++)
                blocks[i][j].add(mine);
        objects.add(mine);

        Random rand = new Random();
        int rockCount;
        int treeCount = rand.nextInt();

        player.setX(player.getX() + position[0]);
        player.setY(player.getY() + position[1]);
        blocks[player.getX()][player.getY()].add(player);
    }

    public void initialize() {
        objects = new ArrayList<>();
        game = App.getGame();
        for (ArrayList<GameObject>[] block : blocks) {
            for (ArrayList<GameObject> gameObjects : block) {
                for (GameObject g : gameObjects) {
                    if (g.getClass().equals(Player.class)) {
                        objects.add(App.searchPlayer(((Player) g).getUsername()));
                        gameObjects.set(gameObjects.indexOf(g), App.searchPlayer(((Player) g).getUsername()));
                    } else if (objects.contains(g)) {
                        gameObjects.set(gameObjects.indexOf(g), objects.get(objects.indexOf(g)));
                    } else {
                        objects.add(g);
                    }
                }
            }
        }
    }
}
