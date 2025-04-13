package Models.Enums;

import view.*;

public enum Menu {
    MainMenu(new MainMenu()),
    LoginMenu(new LoginMenu()),
    ProfileMenu(new ProfileMenu()),
    GameMenu(new GameMenu()),
    AvatarMenu(new AvatarMenu()),
    RegisterMenu(new RegisterMenu()),
    ExitMenu(new ExitMenu());

    private final AppMenu menu;

    Menu(AppMenu menu) {
        this.menu = menu;
    }

    public AppMenu getMenu() {
        return menu;
    }
}
