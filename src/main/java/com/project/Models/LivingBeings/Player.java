package com.project.Models.LivingBeings;

import com.project.Builders.AccountBuilder;
import com.project.Models.App;
import com.project.Models.Enums.Gender;
import com.project.Models.Game;
import com.project.Models.Tools.Tool;
import com.project.Models.inventory;

public class Player extends Person {
    private int energyLimit = 200;
    private Integer Energy = 200;
    private Integer Coin = 1000;

    private String username;
    private String password;
    private String email;
    private String securityQuestion;

    private Integer level = 0;
    private Integer XP = 0;
    private Integer farmingXP = 1;
    private Integer miningXP = 1;
    private Integer sightseeingXP = 1;
    private Integer fishingXP = 1;

    transient private Game currentGame = null;
    private int gameID = 0;

    private final inventory inventory = new inventory();
    private int currentToolIndex = -1;

    private int x = 5;
    private int y = 84;

    public Player(AccountBuilder accountBuilder) {
        this.username = accountBuilder.getUsername();
        this.password = accountBuilder.getPassword();
        this.nickname = accountBuilder.getNickname();
        this.email = accountBuilder.getEmail();
        this.gender = accountBuilder.getGender();
        this.securityQuestion = accountBuilder.getSecurityQuestion();
    }

    // getter

    public String getUsername() {
        return this.username;
    }

    public String getNickname() {
        return this.nickname;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }

    public Gender getGender() {
        return this.gender;
    }

    public Integer getLevel() {
        return level;
    }

    public Integer getXP() {
        return XP;
    }

    public Integer getEnergy() {
        return Energy;
    }

    public Game getCurrentGame() {
        return currentGame;
    }

    public inventory getInventory() {
        return inventory;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getSecurityQuestion() {
        return securityQuestion;
    }

    public int getGameID() {
        return gameID;
    }

    public int getEnergyLimit() {
        return energyLimit;
    }

    public Tool getCurrentTool() {
        if (currentToolIndex == -1) {
            return null;
        }
        return inventory.getTools().get(currentToolIndex);
    }

    public Integer getCoin() {
        return Coin;
    }

    // setter

    public void setUsername(String username) {
        this.username = username;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setFarmingXP(Integer farmingXP) {
        this.farmingXP = farmingXP;
    }

    public void setMiningXP(Integer miningXP) {
        this.miningXP = miningXP;
    }

    public void setSightseeingXP(Integer sightseeingXP) {
        this.sightseeingXP = sightseeingXP;
    }

    public void setFishingXP(Integer fishingXP) {
        this.fishingXP = fishingXP;
    }

    public void setGame(Game currentGame) {
        this.currentGame = currentGame;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setSecurityQuestion(String securityQuestion) {
        this.securityQuestion = securityQuestion;
    }

    public void setGameID(int gameID) {
        this.gameID = gameID;
    }

    public void setEnergyLimit(int energyLimit) {
        this.energyLimit = energyLimit;
    }

    public void setCurrentToolIndex(int currentToolIndex) {
        this.currentToolIndex = currentToolIndex;
    }

    public void resetCurrentTool(Tool tool) {
        this.inventory.change(tool, currentToolIndex);
    }

    // increase

    public Integer increaseMiningXP() {
        return miningXP;
    }

    public Integer increaseSightseeingXP() {
        return sightseeingXP;
    }

    public void increaseLevel(Integer level) {
        this.level += level;
    }

    public void increaseXP(Integer XP) {
        this.XP += XP;
        level = updateLevel(this.XP);
    }

    public Integer increaseFarmingXP() {
        return farmingXP;
    }

    public Integer increaseFishingXP() {
        return fishingXP;
    }

    public void increaseEnergy(Integer energy) {
        Energy += energy;
    }

    public void increaseCoin(Integer coin) {
        Coin += coin;
    }

    // decrease

    public void decreaseEnergy(Integer energy) {
        Energy -= energy;
    }

    public void decreaseCoin(Integer coin) {
        Coin -= coin;
    }

    // Override

    @Override
    public void passByHour() {

    }

    @Override
    public void passByDay() {

    }

    @Override
    public String getID() {
        return username;
    }

    @Override
    public String tooString() {
        return CYAN_TEXT + "Y" + RESET;
    }

    //

    public int updateLevel(int XP) {
        int result = 0;
        while (true) {
            int xpNeeded = 50 * result * result;
            if (XP < xpNeeded)
                return result - 1;
            XP -= xpNeeded;
            result++;
        }
    }

    public void initialize() {
        if (gameID == -1)
            if (App.searchGame(gameID) != null)
                currentGame = App.searchGame(gameID);
    }

    public void walk(int x, int y) {
        App.getGame().getMap().getBlocks()[this.x][this.y].remove(this);
        this.x = x;
        this.y = y;
        App.getGame().getMap().getBlocks()[x][y].add(this);
    }
}
