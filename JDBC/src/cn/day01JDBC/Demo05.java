package cn.day01JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo05 {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String sql = "create table stud (id int,name varchar(20))";

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3305/db1", "root", "root");

            statement = connection.createStatement();

            statement.executeUpdate(sql);


        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if(connection != null) {
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }





    }
}
