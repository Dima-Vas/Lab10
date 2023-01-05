package singleton;

public class User {
    public String name;
    public String email;
    public Integer age;
    public Database db;

    public User(String name, String email, Integer age, Database db) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.db = db;
    }

    public void save() {
        String query = "INSERT INTO user (name, email, age) VALUES ('" +
                name + "', '" + email + "', " + age + ")";
        db.insert(query);
    }

}
