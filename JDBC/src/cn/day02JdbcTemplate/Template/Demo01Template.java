package cn.day02JdbcTemplate.Template;

import cn.day02JdbcTemplate.Druid.JdbcUtils;
import org.springframework.jdbc.core.JdbcTemplate;

public class Demo01Template {
    public static void main(String[] args) {

        JdbcTemplate template = new JdbcTemplate(JdbcUtils.getDataSource());
        String sql = "update account set balance = 1000 where id = ?";
        int i = template.update(sql, 4);
        System.out.println(i);


    }
}
