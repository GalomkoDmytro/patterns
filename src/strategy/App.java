package strategy;

import strategy.auth.UserChecker;
import strategy.strategy.DBAuth;
import strategy.strategy.FileAuth;

import java.io.File;

public class App {

    public static void main(String[] args) {
        UserChecker userChecker = new UserChecker();
        userChecker.check(new DBAuth("jdbc://..."));
        userChecker.check(new FileAuth(new File("c://...")));
    }

}
