package com.project.Models.Enums;


import com.project.view.*;

public enum Menu {
    MainMenu(new MainMenu()),
    LoginMenu(new LoginMenu()),
    ProfileMenu(new ProfileMenu()),
    GameMenu(new GameMenu()),
    AvatarMenu(new AvatarMenu()),
    RegisterMenu(new RegisterMenu()),
    ExitMenu(new ExitMenu()),
    GameActivity(new GameActivity()),
    ;

    private final AppMenu menu;

    Menu(AppMenu menu) {
        this.menu = menu;
    }

    public AppMenu getMenu() {
        return menu;
    }
}
