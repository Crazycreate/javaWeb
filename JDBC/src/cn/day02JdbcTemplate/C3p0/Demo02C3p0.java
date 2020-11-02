package cn.day02JdbcTemplate.C3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class Demo02C3p0 {
    public static void main(String[] args) throws SQLException {

        //ComboPooledDataSource()不传数据时，使用的时默认配置，传数据则使用指定配置
        //DataSource ds = new ComboPooledDataSource();
        DataSource ds = new ComboPooledDataSource("otherc3p0");

        Connection connection = ds.getConnection();




    }
}
