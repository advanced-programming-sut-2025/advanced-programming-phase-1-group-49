package com.project;

import com.project.Models.App;
import com.project.Models.Enums.Gender;
import com.project.Models.LivingBeings.Player;
import com.project.view.AppView;

public class Main {
    public static void main(String[] args) {
        Player main = new Player
                ("main", null, "Amin", "main@gmail.com", Gender.Male);
        App.setCurrentPlayer(main);
        Player test1 = new Player
                ("Test1", null, "Reza", "test1@gmail.com", Gender.Male);
        Player test3 = new Player
                ("Test2", null, "Asal", "test2@gmail.com", Gender.Female);
        Player test2 = new Player
                ("Test3", null, "Nima", "test3@gmail.com", Gender.Male);
        App.addPlayer(main);
        App.addPlayer(test1);
        App.addPlayer(test2);
        App.addPlayer(test3);
        (new AppView()).run();
    }
}
