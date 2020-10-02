package com.frankie.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author: Yao Frankie
 * @date: 2020/10/2 21:40
 */
public class JDBCTest {

    public static void main(String[] args) {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?" +
                            "user=root&password=123456&serverTimezone=GMT&characterEncoding=utf8");

            // Do something with the Connection
            System.out.println("Connect to the MySQL successfully!");

        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }
}
