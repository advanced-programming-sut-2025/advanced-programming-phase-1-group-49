package com.project.Models.LivingBeings;

import com.project.Models.Enums.Gender;
import com.project.Models.Game;
import com.project.Models.inventory;

public class Player extends Person {
    private String username;
    private String password;
    private String email;
    private Integer level = 0;
    private Integer XP = 0;
    private Integer farmingXP = 0;
    private Integer miningXP = 0;
    private Integer sightseeingXP = 0;
    private Integer fishingXP = 0;
    private Integer Energy = 100;
    transient private Game currentGame = null;
    private int gameID = 0;
    private final inventory inventory = new inventory();
    private int x = 5;
    private int y = 84;
    private String securityQuestion = null;

    public Player(String username, String password, String nickname, String email, Gender gender, String securityQuestion) {
        this.username = username;
        this.password = password;
        this.nickname = nickname;
        this.email = email;
        this.gender = gender;
        this.securityQuestion = securityQuestion;
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

    // decrease

    public void decreaseEnergy(Integer energy) {
        Energy -= energy;
    }

    // Override

    @Override
    public void passByHour() {

    }


    @Override
    public void passByDay() {

    }

    @Override
    public String tooString() {
        return "Y";
    }

    //

    public void walk(int x, int y) {
        currentGame.getMap().getBlocks()[this.x][this.y].remove(this);
        this.x = x;
        this.y = y;
        currentGame.getMap().getBlocks()[x][y].set(currentGame.getMap().getBlocks()[x][y].size() - 1, this);
    }
}
