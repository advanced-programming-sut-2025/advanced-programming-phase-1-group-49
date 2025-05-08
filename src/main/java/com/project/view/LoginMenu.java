package com.project.view;

import com.project.Controllers.LoginMenuController;
import com.project.Models.Enums.LoginMenuCommands;
import com.project.Models.Result;

import java.util.Scanner;
import java.util.regex.Matcher;

public class LoginMenu implements AppMenu {
    LoginMenuController controller = new LoginMenuController();
    private boolean printMenuInfo = true;

    @Override
    public void check(Scanner scanner) {
        if (printMenuInfo) {
            System.out.println("""
                    
                    >>> Login Menu Commands:
                    - login -u <username> -p <password> –stay logged in
                    "-stay logged in" flag is optional.
                    - forget password -u <username>
                    and for answer to security questions :
                    - answer -a <answer>
                    - menu enter RegisterMenu
                    - show current menu
                    - exit
                    """);
            printMenuInfo = false;
        }

        String command = scanner.nextLine();
        Matcher matcher;

        if ((matcher = LoginMenuCommands.login.getMatcher(command)).find())
            System.out.println(controller.Login(matcher.group(1), matcher.group(2), matcher.group(3)));
        else if (controller.isAskSecurityQuestion())
            System.out.println(controller.securityQuestion(command));
        else if (controller.isEnterNewPassword())
            System.out.println(controller.enterNewPass(command));
        else if ((matcher = LoginMenuCommands.forgetPassword.getMatcher(command)).find())
            System.out.print(controller.forgetPassword(matcher.group(1)));
        else if ((matcher = LoginMenuCommands.switchMenu.getMatcher(command)).find()) {
            Result temp = controller.switchMenu(matcher.group(1));
            System.out.println(temp);
            printMenuInfo = temp.isSuccessfully();
        } else if (LoginMenuCommands.exit.getMatcher(command).find())
            System.out.print(controller.exit());
        else if (LoginMenuCommands.ShowCurrentMenu.getMatcher(command).find())
            System.out.println(controller.showCurrentMenu());
        else
            System.out.println("Invalid command");
    }
}
