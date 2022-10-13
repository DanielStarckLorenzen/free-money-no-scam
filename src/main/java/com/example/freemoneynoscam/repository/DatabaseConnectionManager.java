package com.example.freemoneynoscam.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionManager {

    //Variabler
    private static String hostname;
    private static String username;
    private static String password;
    private static Connection conn;

    //Metoder
    public static Connection getConnection() {
        if (conn != null)
            return conn;

        hostname = "jdbc:mysql://localhost/noscam";
        username = "root";
        password = "IamBroke101!";

        try {
            conn = DriverManager.getConnection(hostname, username, password);
        } catch (SQLException e) {
            System.out.println("Connection to database Failed!");
            throw new RuntimeException(e);
        }
        System.out.println("Connection to database Established!");
        return conn;
    }
}
