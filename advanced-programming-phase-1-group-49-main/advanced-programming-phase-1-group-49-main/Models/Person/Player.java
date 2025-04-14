package Models.Person;

import java.util.ArrayList;

public class Player extends Person {
    private String username;
    private String password;
    private String email;


    public Player(String username, String password, String nickname, String email, String gender) {
        this.username = username;
        this.password = password;
        super.nickname = nickname;
        this.email = email;
        super.gender = gender;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return this.username;
    }

    public void setNickname(String nickname) {
        super.nickname = nickname;
    }

    public String getNickname() {
        return super.nickname;
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
        super.gender = gender;
    }

    public String getGender() {
        return super.gender;
    }


}
