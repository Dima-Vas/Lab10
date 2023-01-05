package users;

import java.time.LocalDate;

enum LoginType{
    TWITTER, FACEBOOK
}

public class Login {
    public Object login(LoginType loginMethod) {
        if(loginMethod.equals(LoginType.TWITTER)) {
            return new TwitterUser("yo@gmail.com", "Poland", String.valueOf(LocalDate.now()));
        } else if(loginMethod.equals(LoginType.FACEBOOK)) {
            return new FacebookUser("yo@gmail.com", Country.USA, LocalDate.now());
        }
        return null;
    }
}
