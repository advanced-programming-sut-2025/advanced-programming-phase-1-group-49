package com.project.view;

import java.util.Scanner;

public class AvatarMenu implements AppMenu {

    public AvatarMenu() {
    }

    @Override
    public void check(Scanner scanner) {
        System.out.println("Avatar Menu - Enter your command (type 'exit' to quit):");

        while (true) {
            System.out.print("> ");  // Prompt for input
            String input = scanner.nextLine().trim();  // Read user input

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting Avatar Menu...");
                break;
            }

            // Process the input here
            System.out.println("You entered: " + input);

            // Add your menu logic here
            // For example:
            // switch(input.toLowerCase()) {
            //     case "create": createAvatar(); break;
            //     case "list": listAvatars(); break;
            //     ...
            // }
        }
    }
}