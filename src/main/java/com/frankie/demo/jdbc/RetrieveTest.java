package com.frankie.demo.jdbc;

import java.sql.*;

/**
 * @author: Yao Frankie
 * @date: 2020/10/3 11:14
 */
public class RetrieveTest {
    
    public static void main(String[] args) {
        
        String query = "select * from authors";
        
        try (Connection con = DriverManager.getConnection(Config.jdbcUrl);
             PreparedStatement ps = con.prepareStatement(query);
             ResultSet rs = ps.executeQuery()){

            while (rs.next()){
                System.out.println(rs.getString(1) + ": " + rs.getString(2));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
