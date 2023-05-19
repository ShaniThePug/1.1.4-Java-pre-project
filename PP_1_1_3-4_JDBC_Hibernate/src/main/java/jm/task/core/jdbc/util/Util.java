package jm.task.core.jdbc.util;

import java.sql.*;


public class Util {
    // реализуйте настройку соединения с БД

    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/my_users";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "12345";

    public static Connection getConnection() {
        Connection con;
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            if (!con.isClosed()) {
                System.out.println("Соединение с БД установлено");
            }
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Не удалось установить соединение с БД");
            con = null;
        }
        return con;
    }

}
