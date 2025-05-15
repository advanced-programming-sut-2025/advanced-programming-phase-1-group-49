package com.project.Builders;

import com.project.Models.Enums.Gender;
import com.project.Models.LivingBeings.Player;

public class AccountBuilder {
    private String username;
    private String password;
    private String nickname;
    private String email;
    private Gender gender;
    private String securityQuestion;

    // builder

    public AccountBuilder setSQ(String securityQuestion) {
        this.securityQuestion = securityQuestion;
        return this;
    }

    public AccountBuilder setUsername(String username) {
        this.username = username;
        return this;
    }

    public AccountBuilder setPassword(String password) {
        this.password = password;
        return this;
    }

    public AccountBuilder setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    public AccountBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public AccountBuilder setGender(Gender gender) {
        this.gender = gender;
        return this;
    }

    // getter

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getNickname() {
        return nickname;
    }

    public String getEmail() {
        return email;
    }

    public Gender getGender() {
        return gender;
    }

    public String getSecurityQuestion() {
        return securityQuestion;
    }

    //

    public Player build() {
        return new Player(this);
    }

}
