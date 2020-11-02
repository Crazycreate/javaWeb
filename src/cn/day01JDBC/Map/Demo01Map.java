package cn.day01JDBC.Map;

import java.util.HashMap;
import java.util.Map;

public class Demo01Map {
    public static void main(String[] args) {

        Map<String,String> map = new HashMap<>();
        map.put("a","1");
        map.put("b","2");
        map.put("c","3");
        System.out.println(map.get("c"));

        System.out.println(map);
        //System.out.println(map.remove("a"));


    }
}
