package cn.day02JdbcTemplate.Template;

import cn.day02JdbcTemplate.Druid.JdbcUtils;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class Demo02 {

    private JdbcTemplate template = new JdbcTemplate(JdbcUtils.getDataSource());

    @Test
    public void test1(){
        String sql = "update account set balance = 2000 where id = 4";
        template.update(sql);
    }

    @Test
    public void test2(){
        //JdbcTemplate template = new JdbcTemplate(JdbcUtils.getDataSource());
        String sql = "insert into account values (3,'wocao',6000)";
        template.update(sql);
    }

    @Test
    public void test3(){
        //JdbcTemplate template = new JdbcTemplate(JdbcUtils.getDataSource());
        String sql = "delete from account where id = ?";
        template.update(sql,5);
    }

    @Test
    public void test4(){//封装为map
        //JdbcTemplate template = new JdbcTemplate(JdbcUtils.getDataSource());
        String sql = "select * from account where id = ?";
        Map<String, Object> map = template.queryForMap(sql, 1);
        System.out.println(map);
    }

    @Test
    public void test5(){//封装为List
        //JdbcTemplate template = new JdbcTemplate(JdbcUtils.getDataSource());
        String sql = "select * from account";
        List<Map<String, Object>> list = template.queryForList(sql);
        System.out.println(list);
    }

    @Test
    public void test6(){//封装为List
        //JdbcTemplate template = new JdbcTemplate(JdbcUtils.getDataSource());
        String sql = "select * from account";
        List<Emp> list = template.query(sql, new RowMapper<Emp>() {
            @Override
            public Emp mapRow(ResultSet resultSet, int i) throws SQLException {
                Emp emp = new Emp(resultSet.getString("name"),resultSet.getDouble("balance"));
                return emp;
            }
        });
        System.out.println(list);
    }

    @Test
    public void test6_2(){//封装为List
        //JdbcTemplate template = new JdbcTemplate(JdbcUtils.getDataSource());
        String sql = "select * from account";
        List<Emp> list = template.query(sql, new BeanPropertyRowMapper<Emp>(Emp.class));
        System.out.println(list);
    }

    @Test
    public void test7(){//封装为List
        //JdbcTemplate template = new JdbcTemplate(JdbcUtils.getDataSource());
        String sql = "select count(id) from account";
        Long ans = template.queryForObject(sql, Long.class);
        System.out.println(ans);
    }


}
