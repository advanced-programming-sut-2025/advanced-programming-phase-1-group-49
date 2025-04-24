package com.project.Controllers;

import com.project.Models.App;
import com.project.Models.LivingBeings.Player;
import com.project.Models.Result;

public class LoginMenuController {

    public Result Login(String username, String password) {
        for (Player i : App.getPlayerList()) {
            if (i.getUsername().equals(username) && i.getPassword().equals(password))
                return new Result(true, "logged in successfully!");
        }
        return new Result(false, "Try again!");
    }
}
