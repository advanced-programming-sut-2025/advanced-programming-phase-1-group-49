package com.project.Controllers;

import com.google.gson.Gson;
import com.project.Models.App;
import com.project.Models.Enums.Gender;
import com.project.Models.Enums.Menu;
import com.project.Models.Enums.RegisterMenuCommands;
import com.project.Models.LivingBeings.Player;
import com.project.Models.Result;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.regex.Matcher;

public class RegisterMenuController {
    private boolean checkPassword = false;
    private boolean randomPassword = false;
    private boolean securityQ = false;

    private String username;
    private String password;
    private String nickname;
    private String email;
    private Gender gender;

    private final Gson gson = new Gson();

    private final ArrayList<String> SecurityQuestions = new ArrayList<>(Arrays.asList(
            "1. What was the name of your first pet?",
            "2. What is the name of the street you grew up on?",
            "3. What is your favorite childhood video game?",
            "4. What was the name of your elementary school?",
            "5. What is the name of your best friend in childhood?"
    ));

    private void resetFields() {
        checkPassword = false;
        randomPassword = false;
        securityQ = false;
        username = null;
        password = null;
        nickname = null;
        email = null;
        gender = null;
    }

    private String generatePassword() {
        Random random = new Random();
        String characters = "abcdefghijklmnopqrstuvwxyz?><,\"';:\\/|][}{+=)(*&^%$#!";
        int length = random.nextInt(4) + 11;
        int upperCase = random.nextInt(2) + 3;
        int lowerCase = 7 - upperCase;
        int number = random.nextInt(3) + 1;
        int special = length - 7 - number;

        ArrayList<Character> passwordBuilder = new ArrayList<>();
        for (int i = 0; i < length; i++)
            passwordBuilder.add(null);

        int i = length - number;
        while (i != 0) {
            int index = random.nextInt(length);
            if (passwordBuilder.get(index) == null) {
                if (upperCase > 0) {
                    int charIndex = random.nextInt(26);
                    passwordBuilder.set(index, characters.toUpperCase().charAt(charIndex));
                    upperCase--;
                } else if (lowerCase > 0) {
                    int charIndex = random.nextInt(26);
                    passwordBuilder.set(index, characters.charAt(charIndex));
                    lowerCase--;
                } else if (number > 0) {
                    passwordBuilder.set(index, (char) ('0' + random.nextInt(10)));
                    number--;
                }
            } else
                continue;

            i--;
        }

        StringBuilder result = new StringBuilder();
        for (int j = 0; j < length; j++) {
            if (passwordBuilder.get(j) == null) {
                int charIndex = random.nextInt(26) + 26;
                passwordBuilder.set(j, characters.toUpperCase().charAt(charIndex));
            }
            result.append(passwordBuilder.get(j));
        }

        password = result.toString();
        return password;
    }

    //

    public Result Register(String usernameString, String passwordString,
                           String confirmPasswordString, String nicknameString, String emailString,
                           String genderString) {
        usernameString = usernameString.trim();
        passwordString = passwordString.trim();
        confirmPasswordString = confirmPasswordString.trim();
        nicknameString = nicknameString.trim();
        emailString = emailString.trim();
        genderString = genderString.trim();
        resetFields();

        // check UserName Pattern
        if (!RegisterMenuCommands.USERNAME_PATTERN.getMatcher(usernameString).find())
            return new Result(false, "Invalid username, try Again.\n");
        // check username exists
        if (App.searchPlayer(usernameString) != null)
            return new Result(false, "User whit this username already exists.\n");
        // check Password equality
        if (!passwordString.equals(confirmPasswordString))
            return new Result(false, "Passwords do not match, try again.\n");
        // check Email
        if (!RegisterMenuCommands.EMAIL_PATTERN.getMatcher(emailString).find())
            return new Result(false, "Invalid email. Try Again.\n");
        // check email exists
        if (App.searchPlayerEmail(emailString) != null)
            return new Result(false, "User with this email already exists.\n");
        // check Nick Name
        if (!RegisterMenuCommands.USERNAME_PATTERN.getMatcher(nicknameString).find())
            return new Result(false, "Invalid nickname. Try Again.\n");
        // check Gender
        if (!RegisterMenuCommands.GENDER_PATTERN.getMatcher(genderString).find())
            return new Result(false, "Invalid gender. Try Again.\n");
        // Save Data :
        username = usernameString;
        nickname = nicknameString;
        email = emailString;
        gender = Gender.Male;
        if (genderString.equals("Female"))
            this.gender = Gender.Female;

        if (passwordString.equals("Random")) {
            randomPassword = true;
            return new Result(true,
                    String.format("if %s is good enter \"yes\"(y) else enter \"no\"(n)\n", generatePassword()));
        }

        // check Password :
        if (!RegisterMenuCommands.PASSWORD_PATTERN.getMatcher(passwordString).find()) {
            checkPassword = true;
            return new Result(false,
                    "Invalid password. enter another password or register again.\n");
        }
        password = passwordString;

        for (String question : SecurityQuestions)
            System.out.println(question);
        securityQ = true;

        return new Result(true, "");
    }

    public Result checkPassword(String passwordString) {
        passwordString = passwordString.trim();

        if (!RegisterMenuCommands.PASSWORD_PATTERN.getMatcher(passwordString).find())
            return new Result(false,
                    "Invalid password. enter another password or register again.\n");

        password = passwordString;
        for (String question : SecurityQuestions)
            System.out.println(question);
        checkPassword = false;
        securityQ = true;
        return new Result(true, "");
    }

    public Result randomPassword(String accepted) {
        accepted = accepted.trim().toLowerCase();
        if (!RegisterMenuCommands.accept.getMatcher(accepted).find())
            return new Result(false,
                    String.format("if %s is good enter \"yes\"(y) else enter \"no\"(n)", password));

        if (accepted.equals("y") || accepted.equals("yes")) {
            for (String question : SecurityQuestions)
                System.out.println(question);
            securityQ = true;
            randomPassword = false;
            return new Result(true, "randomPassword checker, Done.");
        }

        return new Result(false, generatePassword() + "\nwhat about this?");
    }

    public Result securityQuestion(String command) {
        command = command.trim();
        Matcher matcher;
        if (!(matcher = RegisterMenuCommands.pickQuestion.getMatcher(command)).find())
            return new Result(false, "please pick a security question");
        String questionIDString = matcher.group(1);
        String answer = matcher.group(2);
        String answerConfirm = matcher.group(3);

        int questionID;
        try {
            questionID = Integer.parseInt(questionIDString);
        } catch (NumberFormatException e) {
            return new Result(false,
                    "Invalid question ID, Enter with this form :\n <question ID>, <Your Answer>");
        }
        if (questionID < 1 || questionID > 5)
            return new Result(false, "Invalid question ID, enter something between 1 and 5");
        if (!answer.equals(answerConfirm))
            return new Result(false, "Answer did not match. try again");

        Player player = new
                Player(username, password, nickname, email, gender, questionID + ", " + answer);
        App.addPlayer(player);
        resetFields();

        File folder = new File("Game/" + player.getUsername());
        if (!folder.exists())
            if (!folder.mkdir())
                return new Result(false, "SomeThing is wrong while create Folder for player.");

        try (FileWriter writer = new FileWriter("Game/" + player.getUsername() + "/" + player.getUsername() + ".json")) {
            gson.toJson(player, writer);
            System.out.println("Player Saved.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return new Result(true, String.format("""
                User Created Successfully. user info :
                nickname = %s(%s)
                email = %s
                ===========================""", player.getNickname(), player.getUsername(), player.getEmail()));
    }

    public Result switchMenu(String menuString) {
        if (!menuString.trim().equals("LoginMenu"))
            return new Result(false, "You are in Register and can go to LoginMenu only.");

        App.setCurrentMenu(Menu.LoginMenu);
        resetFields();

        return new Result(true, "switch menu successful. current menu : " + menuString);
    }

    public Result showCurrentMenu() {
        return new Result(true, App.getCurrentMenu().toString());
    }

    public Result exit() {
        // save data

        App.setCurrentMenu(Menu.ExitMenu);

        return new Result(true, "");
    }

    // getter

    public boolean isCheckPassword() {
        return checkPassword;
    }

    public boolean isRandomPassword() {
        return randomPassword;
    }

    public boolean isSecurityQ() {
        return securityQ;
    }
}
