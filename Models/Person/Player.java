package Models.Person;

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
    //  private final Integer XPMax = ;

    public Player(String username, String password, String nickname, String email, String gender) {
        this.username = username;
        this.password = password;
        this.nickname = nickname;
        this.email = email;
        this.gender = gender;
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

    public String getGender() {
        return this.gender;
    }

    public Integer getLevel() {
        return level;
    }

    public Integer getXP() {
        return XP;
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

    public void setGender(String gender) {
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
}
