package cn.day01JDBC;

import java.sql.*;
import java.util.Scanner;

public class Demo09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String password = sc.next();

        boolean flag = new Demo09().login2(name, password);
        System.out.println(flag);
    }

    public boolean login(String username, String password) {
        if (username == null || password == null)
            return false;

        Connection connect = null;
        Statement statement = null;
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;

        try {
            connect = JDBCUtils.getConnect();
             statement = connect.createStatement();
            String sql = "select * from user where name = '"+username+"'  and password = '"+password+"'";

            //ResultSet resultSet1 = preparedStatement.executeQuery();

             resultSet = statement.executeQuery(sql);
            return resultSet.next();


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JDBCUtils.close(resultSet, statement, connect);
        }

        return false;

    }

    public boolean login2(String username, String password) {
        if (username == null || password == null)
            return false;

        Connection connect = null;
        Statement statement = null;
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;

        try {
            connect = JDBCUtils.getConnect();
           // statement = connect.createStatement();
            String sql = "select * from user where name = ?  and password = ?";
            preparedStatement = connect.prepareStatement(sql);
            preparedStatement.setString(1,username);
            preparedStatement.setString(2,password);
            resultSet = preparedStatement.executeQuery();
            // resultSet = statement.executeQuery(sql);
            return resultSet.next();


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JDBCUtils.close(resultSet, statement, connect);
        }

        return false;

    }

}
