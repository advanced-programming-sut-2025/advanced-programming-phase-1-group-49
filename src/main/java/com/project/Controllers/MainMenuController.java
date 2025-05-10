package com.project.Controllers;

import com.project.Models.App;
import com.project.Models.Enums.Menu;
import com.project.Models.Result;

import java.io.FileWriter;
import java.io.IOException;

public class MainMenuController {
    public Result logout() {
        App.setCurrentMenu(Menu.LoginMenu);
        App.setCurrentPlayer(null);
        try (FileWriter writer = new FileWriter("Data/AppData.txt", false)) {
            writer.write("");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return new Result(true, "You are logged out");
    }

    public Result switchMenu(String menuString) {
        menuString = menuString.trim().toLowerCase();
        switch (menuString) {
            case "game":
            case "gamemenu":
                App.setCurrentMenu(Menu.GameMenu);
                break;
            case "profile":
            case "profilemenu":
                App.setCurrentMenu(Menu.ProfileMenu);
                break;
        }
        return new Result(true, "");
    }
}
