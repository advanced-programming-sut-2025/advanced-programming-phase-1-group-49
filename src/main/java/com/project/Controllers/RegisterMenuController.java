package com.project.Controllers;

import com.project.Models.Enums.Gender;
import com.project.Models.LivingBeings.Player;
import com.project.Models.Result;

public class RegisterMenuController {
    public Result Register(String username, String password, String confirmPassword,
                           String nickname, String email, String genderString) {
        Gender gender;
        if (genderString.equals("Male")) {
            gender = Gender.Male;
        } else if (genderString.equals("Female")) {
            gender = Gender.Female;
        } else
            return new Result(false, "Invalid gender");

        Player player = new Player(username, password, nickname, email, gender);
        return new Result(true, "register successful");
    }
}
