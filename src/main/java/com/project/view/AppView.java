package view;

import Models.App;
import Models.Enums.Menu;

import java.util.Scanner;

public class AppView {
    public void run() {
        Scanner scanner = new Scanner(System.in);
        do {
            App.getCurrentMenu().getMenu().check(scanner);
        } while (App.getCurrentMenu() != Menu.ExitMenu);
    }
}
