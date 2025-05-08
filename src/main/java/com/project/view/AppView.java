package com.project.view;

import com.project.Controllers.AppController;
import com.project.Models.App;
import com.project.Models.Enums.Menu;

import java.util.Scanner;

public class AppView {
    private final AppController controller = new AppController();

    public void run() {
//        controller.loadData();
        Scanner scanner = new Scanner(System.in);
        do {
            App.printPlayers();
            App.getCurrentMenu().getMenu().check(scanner);
        } while (App.getCurrentMenu() != Menu.ExitMenu);
    }
}
