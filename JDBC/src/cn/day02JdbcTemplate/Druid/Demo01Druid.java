package cn.day02JdbcTemplate.Druid;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.sql.Connection;
import java.util.Properties;

public class Demo01Druid {
    public static void main(String[] args) throws Exception {

        Properties pro = new Properties();
        InputStream is = Demo01Druid.class.getClassLoader().getResourceAsStream("druid.properties");
        pro.load(is);

        DataSource ds = DruidDataSourceFactory.createDataSource(pro);

        Connection connection = ds.getConnection();

        System.out.println(connection);


    }
}
