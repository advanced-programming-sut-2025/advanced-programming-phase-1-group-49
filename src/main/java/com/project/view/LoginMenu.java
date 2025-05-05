package com.project.view;

import com.project.Controllers.LoginMenuController;
import com.project.Models.Enums.LoginMenuCommands;

import java.util.Scanner;
import java.util.regex.Matcher;

public class LoginMenu implements AppMenu {
    LoginMenuController controller = new LoginMenuController();
    private boolean printMenuInfo = true;

    @Override
    public void check(Scanner scanner) {
        if (printMenuInfo) {
            System.out.println("""
                    
                    """);
        }

        String command = scanner.nextLine();
        Matcher matcher;

        if ((matcher = LoginMenuCommands.login.getMatcher(command)).find())
            System.out.println(controller.Login(matcher.group(1), matcher.group(2)));
        else
            System.out.println("Invalid command");
    }
}
