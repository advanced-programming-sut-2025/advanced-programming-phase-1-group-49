package com.project.view;

import com.project.Controllers.RegisterMenuController;
import com.project.Models.Enums.RegisterMenuCommands;

import java.util.Scanner;
import java.util.regex.Matcher;

public class RegisterMenu implements AppMenu {
    RegisterMenuController controller = new RegisterMenuController();

    @Override
    public void check(Scanner scanner) {
        String command = scanner.nextLine();
        Matcher matcher;

        if ((matcher = RegisterMenuCommands.register.getMatcher(command)).find())
            System.out.println(controller.Register(matcher.group(1), matcher.group(2), matcher.group(3),
                    matcher.group(4), matcher.group(5), matcher.group(6)));
        else if (controller.isCheckPassword())
            System.out.println(controller.checkPassword(command));
        else if (controller.isRandomPassword())
            System.out.println(controller.randomPassword(command));
        else if (controller.isSecurityQ())
            System.out.println(controller.securityQuestion(command, command));
        else if (RegisterMenuCommands.ShowCurrentMenu.getMatcher(command).find())
            System.out.println(controller.showCurrentMenu());
        else if ((matcher = RegisterMenuCommands.switchMenu.getMatcher(command)).find())
            System.out.println(controller.switchMenu(matcher.group(1)));
        else
            System.out.println("Invalid command");
    }
}
