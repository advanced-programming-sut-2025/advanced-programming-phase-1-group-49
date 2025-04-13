package controllers;
import models.App;
import models.person.player;
import models.Result;
import java.util.Objects;

public class loginMenuController {

    public Result Login(String username, String password){
        for(player i : App.playerlist) {
            if(Objects.equals(i.getUsername(), username) &&
                    Objects.equals(i.getPassword(), password)) return new Result(true,"logged in successfully!");
        }
        return new Result(false,"Try again!");
    }

}
