package cn.day01JDBC;

import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo08 {
    public static void main(String[] args) {

        List<Route> ans = findAll2();
        Iterator<Route> iterator = ans.iterator();
        while(iterator.hasNext()){
            Route r = iterator.next();
            System.out.println(r.toString());
        }
    }

/*    public static List<Route> findAll(){
        List<Route> list = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3305/db1", "root", "root");
            statement = connection.createStatement();
            String sql = "select * from tab_route";
            resultSet  = statement.executeQuery(sql);


            while (resultSet.next()){
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                double price = resultSet.getDouble(3);
                list.add(new Route(id,name,price));
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                resultSet.close();
                statement.close();
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }

        }

        return list;
    }*/

    public static List<Route> findAll2(){
        List<Route> list = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            /*Class.forName("com.mysql.jdbc.Driver");

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3305/db1", "root", "root");*/
            connection = JDBCUtils.getConnect();
            statement = connection.createStatement();
            String sql = "select * from tab_route";
            resultSet  = statement.executeQuery(sql);


            while (resultSet.next()){
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                double price = resultSet.getDouble(3);
                list.add(new Route(id,name,price));
            }

        } catch ( SQLException e) {
            e.printStackTrace();
        }finally {

            JDBCUtils.close(resultSet,statement,connection);
        }

        return list;
    }

}
