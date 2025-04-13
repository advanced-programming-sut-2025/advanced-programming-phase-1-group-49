package controllers;
import models.person.player;

public class registerMenuController {
    public void Register(String username , String password , String confirmPassword ,
                         String nickname , String email , String gender){

        player player = new player(username, password, nickname, email, gender);

    }
}
