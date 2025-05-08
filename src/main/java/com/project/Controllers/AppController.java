package com.project.Controllers;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AppController {
    public void loadData() {
        File folder = new File("Data");
        if (!folder.exists() && folder.mkdir() || !new File("Data/AppData.txt").exists())
            createAppDataFile();
    }

    private void createAppDataFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Data/AppData.txt"))) {
            writer.write("");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
