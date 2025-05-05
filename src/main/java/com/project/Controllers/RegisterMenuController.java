package com.project.Controllers;

import com.project.Models.App;
import com.project.Models.Enums.Gender;
import com.project.Models.Enums.Menu;
import com.project.Models.Enums.RegisterMenuCommands;
import com.project.Models.LivingBeings.Player;
import com.project.Models.Result;

public class RegisterMenuController {
    private boolean checkPassword = false;
    private boolean randomPassword = false;
    private boolean securityQ = false;

    private String username;
    private String password;
    private String nickname;
    private String email;
    private Gender gender;
    private String securityAnswer;

    private void resetFields() {
        checkPassword = false;
        randomPassword = false;
        securityQ = false;
        username = null;
        password = null;
        nickname = null;
        email = null;
        gender = null;
        securityAnswer = null;
    }

    private String generatePassword() {
        String password = "";

        return password;
    }

    public Result checkPassword(String password) {
        checkPassword = false;
        return new Result(true, "");
    }

    public Result randomPassword(String password) {
        randomPassword = false;
        return new Result(true, "");
    }

    public Result securityQuestion(String questionIDString, String question) {
        Player player = new Player(username, password, nickname, email, gender, securityAnswer);
        App.addPlayer(player);
        securityQ = false;
        return new Result(true, "");
    }

    public Result Register(String usernameString, String passwordString, String confirmPasswordString,
                           String nicknameString, String emailString, String genderString) {
        usernameString = usernameString.trim();
        passwordString = passwordString.trim();
        confirmPasswordString = confirmPasswordString.trim();
        nicknameString = nicknameString.trim();
        emailString = emailString.trim();
        genderString = genderString.trim();

        resetFields();

        // check UserName
        if (!RegisterMenuCommands.USERNAME_PATTERN.getMatcher(usernameString).find())
            return new Result(false, "Invalid username, try Again.");
        // check Password equality
        if (!passwordString.equals(confirmPasswordString))
            return new Result(false, "Passwords do not match, try again.");
        // check Email
        if (!RegisterMenuCommands.EMAIL_PATTERN.getMatcher(passwordString).find())
            return new Result(false, "Invalid email. Try Again.");
        // check Nick Name
        if (!RegisterMenuCommands.USERNAME_PATTERN.getMatcher(nicknameString).find())
            return new Result(false, "Invalid nickname. Try Again.");
        // check Gender
        if (!RegisterMenuCommands.GENDER_PATTERN.getMatcher(genderString).find())
            return new Result(false, "Invalid gender. Try Again.");
        // Save Data :
        username = usernameString;
        nickname = nicknameString;
        email = emailString;
        gender = Gender.Male;
        if (genderString.equals("Female"))
            this.gender = Gender.Female;
        // check Password :
        if (!RegisterMenuCommands.PASSWORD_PATTERN.getMatcher(passwordString).find() && !passwordString.equals("Random")) {
            checkPassword = true;
            return new Result(false, "Invalid password. enter another password or register again.");
        }
        password = passwordString;

        if (password.equals("Random")) {
            randomPassword = true;
            return new Result(true, "");
        }

        securityQ = true;

        return new Result(true, "register successful");
    }

    public Result switchMenu(String menuString) {
        if (!menuString.trim().equals("LoginMenu"))
            return new Result(false, "You are in Register and can go to LoginMenu only.");

        App.setCurrentMenu(Menu.LoginMenu);

        return new Result(true, "switch menu successful. current menu : " + menuString);
    }

    public Result showCurrentMenu() {
        return new Result(true, App.getCurrentMenu().toString());
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
