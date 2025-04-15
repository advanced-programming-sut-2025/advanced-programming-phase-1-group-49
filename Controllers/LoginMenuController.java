package Controllers;

import Models.App;
import Models.LivingBeings.Player;
import Models.Result;

import java.util.Objects;

public class LoginMenuController {

    public Result Login(String username, String password) {
        for (Player i : App.getPlayerList()) {
            if (Objects.equals(i.getUsername(), username) &&
                    Objects.equals(i.getPassword(), password)) return new Result(true, "logged in successfully!");
        }
        return new Result(false, "Try again!");
    }

}
