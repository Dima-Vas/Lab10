package singleton;

public class Main {
    public static void main(String[] args) {
        Database db = Database.getDb();
        User user = new User("Ano", "Nym@gmail.moc", 12, db);
        user.db.connect("/home/dmytro/IdeaProjects/Lab10/userData.db");
        user.save();
    }
}