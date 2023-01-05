package singleton;

import lombok.SneakyThrows;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Database {
    private static Database db;
    private Connection co;
    private int id = 0;

    public void connect(String dbURL) {
        try {
            Class.forName("org.sqlite.JDBC");
            co = DriverManager.getConnection(
                    "jdbc:sqlite:"+dbURL
            );
            System.out.println("Connected!");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static Database getDb() {
        if (db == null) {
            db = new Database();
        }
        return db;
    }
    @SneakyThrows
    public void insert(String query) {
        Statement statement = co.createStatement();
        statement.executeUpdate(query);
        System.out.println("Inserted user to cache.");
        id += 1;
    }
}
