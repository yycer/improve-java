package com.frankie.demo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author: Yao Frankie
 * @date: 2020/10/3 10:53
 */
public class InsertTest {

    public static void main(String[] args) {

        String sql = "INSERT INTO Authors(Name) VALUES(?)";
        try (Connection con = DriverManager.getConnection(Config.url, Config.user, Config.pass);
             PreparedStatement ps = con.prepareStatement(sql);){

            // The first parameter is 1.
            ps.setString(1, "yyc");
            ps.executeUpdate();
            System.out.println("A new author has been inserted.");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
