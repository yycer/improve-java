package com.frankie.demo.jdbc;

import java.sql.*;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * @author: Yao Frankie
 * @date: 2020/10/3 11:11
 */
public class PreparedTest {

    public static void main(String[] args) {

        String sql = "INSERT into Testing(Id) values(?)";
        LocalDateTime beg = LocalDateTime.now();
        try (Connection con = DriverManager.getConnection(Config.jdbcUrl);
             PreparedStatement ps = con.prepareStatement(sql)){

            for (int i = 1; i <= 5000; i++){
                ps.setInt(1, i * 2);
                ps.executeUpdate();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        LocalDateTime end = LocalDateTime.now();
        // Using 7129ms
        System.out.println("Using " + ChronoUnit.MILLIS.between(beg, end) + "ms");
    }
}
