package users;

import lombok.AllArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
public class MessageSender {
    private Database db;

    public void send(String text, String country) {
        List<Object> users = db.getUsers();
        for (Object i : users) {
            if (((UserAdapter)i).getUserCountry().name().equals(country) &&
                    ((UserAdapter)i).getUserActiveTime().equals(LocalDate.now())) {
                System.out.println("Message '" + text + "' sent to " + ((UserAdapter) i).getEmail());
            }
        }
    }
}
