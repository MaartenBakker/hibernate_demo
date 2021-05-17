package com.maartenmusic.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class TestJdbc {
    public static void main(String[] args) {
        Connection conn;
        try {
            String url = "jdbc:postgresql://localhost/maarten";
            Properties props = new Properties();
            props.setProperty("user","maarten");
            props.setProperty("password","maarten");
            conn = DriverManager.getConnection(url, props);

            System.out.println("DB Connection success");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
