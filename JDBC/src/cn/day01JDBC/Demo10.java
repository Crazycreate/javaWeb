package cn.day01JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Demo10 {
    public static void main(String[] args) {

        Connection connection = null;
        PreparedStatement pstmt1 = null;
        PreparedStatement pstmt2 = null;

        try {
            connection = JDBCUtils.getConnect();

            connection.setAutoCommit(false);

            String sql1 = "update account set balance =  balance - ? where id = ?";
            String sql2 = "update account set balance = balance + ? where id = ?";

            pstmt1 = connection.prepareStatement(sql1);
            int a = 3/0;
            pstmt2 = connection.prepareStatement(sql2);

            pstmt1.setDouble(1,500);
            pstmt1.setInt(2,1);
            pstmt2.setDouble(1,500);
            pstmt2.setInt(2,2);

            pstmt1.executeUpdate();
            pstmt2.executeUpdate();

            connection.commit();


        } catch (SQLException throwables) {
            try {
                connection.rollback();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            throwables.printStackTrace();
        }finally {
            JDBCUtils.close(null,pstmt1,connection);
            JDBCUtils.close(null,pstmt2,null);
        }


    }
}
