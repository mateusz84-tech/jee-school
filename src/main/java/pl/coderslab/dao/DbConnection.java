package pl.coderslab.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    private static final String URL =
            "jdbc:mysql://localhost:3306/db_name?useSSL=false&characterEncoding=utf8";
    private static final String USER = "root";
    private static final String PASSWORD = "coderslab";

    public static Connection getConnection(String dbName) throws SQLException {
        return DriverManager.getConnection(URL.replace("db_name",dbName), USER,PASSWORD);
    }


}
