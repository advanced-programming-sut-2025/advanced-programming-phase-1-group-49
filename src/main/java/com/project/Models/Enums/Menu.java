package com.project.Models.Enums;


import com.project.view.*;
import com.project.view.Usage.CraftingUsage;
import com.project.view.Usage.ForagingUsage;
import com.project.view.Usage.ToolUsage;

public enum Menu {
    MainMenu(new MainMenu()),
    LoginMenu(new LoginMenu()),
    ProfileMenu(new ProfileMenu()),
    GameMenu(new GameMenu()),
    AvatarMenu(new AvatarMenu()),
    RegisterMenu(new RegisterMenu()),
    ExitMenu(new ExitMenu()),
    GameActivity(new GameActivity()),
    crafting(new CraftingUsage()),
    foraging(new ForagingUsage()),
    tool(new ToolUsage()),
    ;

    private final AppMenu menu;

    Menu(AppMenu menu) {
        this.menu = menu;
    }

    public AppMenu getMenu() {
        return menu;
    }
}
