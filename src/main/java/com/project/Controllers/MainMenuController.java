package com.project.Controllers;

import com.project.Models.App;
import com.project.Models.Enums.Menu;
import com.project.Models.Result;

public class MainMenuController {
    public Result logout() {
        App.setCurrentMenu(Menu.LoginMenu);
        App.setCurrentPlayer(null);
        return new Result(true, "You are logged out");
    }

    public Result switchMenu(String menuString) {
        menuString = menuString.trim();
        switch (menuString){
            case ""
        }
        return new Result(true, "");
    }
}
