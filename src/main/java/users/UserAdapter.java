package users;

import lombok.Getter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


@Getter
public class UserAdapter {
    private final String email;
    private final Country userCountry;
    private final LocalDate userActiveTime;

    public UserAdapter(Object user) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        if ((user.getClass() == TwitterUser.class)) {
            userActiveTime = LocalDate.parse(((TwitterUser) user).getLastActiveTime(), formatter);
            userCountry = Country.valueOf(((TwitterUser) user).getCountry());
            email = ((TwitterUser)user).getUserMail();
        }
        else {
            userActiveTime = ((FacebookUser) user).getUserActiveTime();
            userCountry =((FacebookUser) user).getUserCountry();
            email = ((FacebookUser)user).getEmail();
        }
    }
}
