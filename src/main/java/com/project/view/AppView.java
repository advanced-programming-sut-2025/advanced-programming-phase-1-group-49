package com.project.view;

import com.project.Controllers.AppController;
import com.project.Models.App;
import com.project.Models.Enums.Menu;

import java.util.Scanner;

public class AppView {

    public void run() {
        AppController.loadData();
        Scanner scanner = new Scanner(System.in);
        do {
            App.getCurrentMenu().getMenu().check(scanner);
        } while (App.getCurrentMenu() != Menu.ExitMenu);
        AppController.saveData();
    }
}
