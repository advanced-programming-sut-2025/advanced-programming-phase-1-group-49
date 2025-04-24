package view;

import Controllers.RegisterMenuController;
import Models.Enums.RegisterMenuCommands;

import java.util.Scanner;
import java.util.regex.Matcher;

public class RegisterMenu implements AppMenu {
    RegisterMenuController controller = new RegisterMenuController();

    @Override
    public void check(Scanner scanner) {
        String command = scanner.nextLine();
        Matcher matcher;
        if ((matcher = RegisterMenuCommands.register.getMatcher(command)).find()) {
            controller.Register(matcher.group(1), matcher.group(2), matcher.group(3),
                    matcher.group(4), matcher.group(5), matcher.group(6));
        } else {
            System.out.println("Invalid command");
        }
    }
}
