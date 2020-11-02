package cn.day01JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcDemo01 {
    public static void main(String[] args) throws Exception {

        //2.注册驱动
        Class.forName("com.mysql.jdbc.Driver");

        //3.获取数据库链接对象
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3305/db1", "root", "root");

        String sql = "update account set balance = 500 where id = 1 ";


        //5.获取执行sql的对象 Statement
        Statement stmt = connection.createStatement();

        //6.执行方法
        int count = stmt.executeUpdate(sql);

        //7处理结果
        System.out.println(count);

        //8.释放资源
        stmt.close();
        connection.close();


    }
}
