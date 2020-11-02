package cn.day02JdbcTemplate.C3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class Demo01C3p0 {
    public static void main(String[] args) throws SQLException {

        //1.创建数据库连接池对象
        DataSource ds = new ComboPooledDataSource();

        //2.获取连接对象
        Connection connection = ds.getConnection();

        System.out.println(connection);


    }
}
