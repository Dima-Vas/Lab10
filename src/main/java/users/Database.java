package users;


import java.util.ArrayList;
import java.util.List;

public class Database {
    private final static Database db = new Database();
    private Database(){

    }
    private List<Object> users = new ArrayList<>();
    public void addUser(Object toAdd) {
        users.add(new UserAdapter(toAdd));
    }
    public static Database getDb() {
        return db;
    }
    public List<Object> getUsers() {
        return users;
    }
}
