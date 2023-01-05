package users;

public class Main {
    public static void main(String[] args) {
        Login login = new Login();
        Database db = Database.getDb();
        db.addUser(login.login(LoginType.TWITTER));
        db.addUser(login.login(LoginType.FACEBOOK));
        MessageSender messageSender = new MessageSender(db);
        messageSender.send("Hi!", "USA");
    }
}
