package com.frankie.demo.jdbc;

import java.sql.*;

/**
 * @author: Yao Frankie
 * @date: 2020/10/3 10:36
 */
public class JdbcMySQLVersionTest {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/test?serverTimezone=GMT&characterEncoding=utf8";
        String user = "root";
        String pass = "123456";
        String query = "SELECT VERSION()";

        try (Connection con = DriverManager.getConnection(url, user, pass);
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(query)){

            if (rs.next()){
                System.out.println(rs.getString(1));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
