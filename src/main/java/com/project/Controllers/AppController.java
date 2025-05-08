package com.project.Controllers;

import java.io.File;

public class AppController {
    public void loadData() {
        File folder = new File("Game");
        if (!folder.exists())
            if (folder.mkdir())
                System.out.println("Welcome!");

        // LOAD DATA
    }
}
