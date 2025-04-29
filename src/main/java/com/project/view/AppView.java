package com.project.view;

import com.project.Models.App;
import com.project.Models.Enums.Menu;

import java.util.Scanner;

public class AppView {
    public void run() {
        Scanner scanner = new Scanner(System.in);
        do {
            App.getCurrentMenu().getMenu().check(scanner);
        } while (App.getCurrentMenu() != Menu.ExitMenu);
    }
}
