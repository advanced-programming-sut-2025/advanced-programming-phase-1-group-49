package Controllers;
import Models.LivingBeings.Player;

public class RegisterMenuController {
    public void Register(String username , String password , String confirmPassword ,
                         String nickname , String email , String gender){

        Player player = new Player(username, password, nickname, email, gender);

    }
}
