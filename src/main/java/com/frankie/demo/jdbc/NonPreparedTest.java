package com.frankie.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * @author: Yao Frankie
 * @date: 2020/10/3 11:03
 */
public class NonPreparedTest {

    public static void main(String[] args) {

        LocalDateTime beg = LocalDateTime.now();
        try (Connection con = DriverManager.getConnection(Config.jdbcUrl);
             Statement st = con.createStatement()){

            for (int i = 1; i <= 5000; i++){
                String sql = "INSERT into Testing(Id) values(" + 2 * i + ")";
                st.executeUpdate(sql);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        LocalDateTime end = LocalDateTime.now();
        // Using 7860ms
        System.out.println("Using " + ChronoUnit.MILLIS.between(beg, end) + "ms");
    }
}
