package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД

    private static String db_driver = "com.mysql.jdbc.Driver"; // ссылка на драйвер не работает пока
    private static String url = "jdbc:mysql://localhost:3306/testuser";
    private static String userName = "root";
    private static String pass = "root";

    public Connection getConnBD() throws ClassNotFoundException, SQLException {

        Connection connection = null;
        Class.forName(db_driver);
        connection = DriverManager.getConnection(url, userName, pass);
        System.out.println("connection okey");
        return connection;
    }
}
