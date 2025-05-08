package com.project.view;

import com.project.Controllers.RegisterMenuController;
import com.project.Models.Enums.RegisterMenuCommands;
import com.project.Models.Result;

import java.util.Scanner;
import java.util.regex.Matcher;

public class RegisterMenu implements AppMenu {
    RegisterMenuController controller = new RegisterMenuController();
    private boolean printMenuInfo = true;

    @Override
    public void check(Scanner scanner) {
        if (printMenuInfo) {
            System.out.println("""
                    
                    >>> Register Menu Commands:
                    - register -u <username> -p <password> <password_confirm> -n <nickname> -e <email> -g <gender>
                    can replace <password> and <password_confirm> with "Random" to generate random password.
                    - pick question -q <questionID> -a <Answer> -c <Answer_Confirm>
                    - show current menu
                    - menu enter LoginMenu
                    - exit
                    """);
            printMenuInfo = false;
        }

        String command = scanner.nextLine();
        Matcher matcher;

        if ((matcher = RegisterMenuCommands.register.getMatcher(command)).find())
            System.out.print(controller.Register(matcher.group(1), matcher.group(2), matcher.group(3),
                    matcher.group(4), matcher.group(5), matcher.group(6)));
        else if (controller.isRandomPassword())
            System.out.println(controller.randomPassword(command));
        else if (controller.isCheckPassword())
            System.out.print(controller.checkPassword(command));
        else if (controller.isSecurityQ())
            System.out.println(controller.securityQuestion(command));
        else if (RegisterMenuCommands.ShowCurrentMenu.getMatcher(command).find())
            System.out.println(controller.showCurrentMenu());
        else if ((matcher = RegisterMenuCommands.switchMenu.getMatcher(command)).find()) {
            Result temp = controller.switchMenu(matcher.group(1));
            System.out.println(temp);
            printMenuInfo = temp.isSuccessfully();
        }else if (RegisterMenuCommands.exit.getMatcher(command).find())
            System.out.print(controller.exit());
        else
            System.out.println("Invalid command");
    }
}
