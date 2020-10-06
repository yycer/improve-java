package com.frankie.demo.jdbc;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author: Yao Frankie
 * @date: 2020/10/5 09:39
 */
public class MySQLDataSourceTest {

    public static void main(String[] args) {

        MysqlDataSource mds = new MysqlDataSource();
        mds.setURL(Config.jdbcUrl);
        String query = "select version()";

        try (Connection con = mds.getConnection();
             PreparedStatement ps = con.prepareStatement(query);
             ResultSet rs = ps.executeQuery()){

            if (rs.next()){
                System.out.println(rs.getString(1));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
