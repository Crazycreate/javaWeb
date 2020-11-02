package cn.day02JdbcTemplate.Druid;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Demo02Druid {
    public static void main(String[] args) {

        Connection connection = null;
        PreparedStatement pstmt = null;

        try {
            connection = JdbcUtils.getConnection();

            String sql = "insert into account values(null,?,?)";
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1,"wangwu");
            pstmt.setDouble(2,1500);

            int i = pstmt.executeUpdate();
            System.out.println(i);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JdbcUtils.close(connection,pstmt);
        }


    }
}
