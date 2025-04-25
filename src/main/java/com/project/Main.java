package com.project;

import com.project.Models.Enums.Gender;
import com.project.Models.LivingBeings.Player;
import com.project.view.AppView;

public class Main {
    public static void main(String[] args) {
        Player test = new Player
                ("Amin", null, "Amin", "amin@gmail.com", Gender.Male);
        (new AppView()).run();
    }
}
