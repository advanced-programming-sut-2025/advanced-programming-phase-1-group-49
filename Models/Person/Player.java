package Models.Person;

import java.util.ArrayList;

public class Player extends Person {
    private String username;
    private String password;
    private String email;
    private final ArrayList<String> firstStageFriends = new ArrayList<>();
    private final ArrayList<String> secondStageFriends = new ArrayList<>();
    private final ArrayList<String> thirdStageFriends = new ArrayList<>();
    private final ArrayList<String> fourthStageFriends = new ArrayList<>();

    public Player(String username, String password, String nickname, String email, String gender) {
        this.username = username;
        this.password = password;
        this.nickname = nickname;
        this.email = email;
        this.gender = gender;
    }

    public void addFirstStageFriend(String name) {
        firstStageFriends.add(name);
    }

    public void addSecondStageFriend(String name) {
        secondStageFriends.add(name);
    }

    public void addThirdStageFriend(String name) {
        thirdStageFriends.add(name);
    }

    public void addFourthStageFriend(String name) {
        fourthStageFriends.add(name);
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return this.username;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return this.nickname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return this.gender;
    }
}
