package view;

import Controllers.LoginMenuController;

import java.util.Scanner;
import java.util.regex.Matcher;

public class LoginMenu implements AppMenu {
    LoginMenuController controller = new LoginMenuController();

    @Override
    public void check(Scanner scanner) {
        String command = scanner.nextLine();
        Matcher matcher;
    }
}
