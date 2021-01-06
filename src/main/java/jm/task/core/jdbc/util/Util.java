package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Properties;
//import jm.task.core.jdbc.model.User;
//import org.hibernate.SessionFactory;
//import org.hibernate.boot.MetadataSources;
//import org.hibernate.boot.registry.StandardServiceRegistry;
//import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
//import org.hibernate.cfg.Configuration;
//import org.hibernate.cfg.Environment;
//import org.hibernate.service.ServiceRegistry;

public class Util {
    // реализуйте настройку соеденения с БД

    private static String db_driver = "com.mysql.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost:3306/testuser";
    private static String userName = "root";
    private static String pass = "root";

    public Connection getConnBD() throws ClassNotFoundException, SQLException {

        Connection connection = null;
        Class.forName(db_driver);
        connection = DriverManager.getConnection(url, userName, pass);
        return connection;
    }
}
