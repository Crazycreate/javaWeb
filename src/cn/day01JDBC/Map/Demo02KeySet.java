package cn.day01JDBC.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo02KeySet {
    public static void main(String[] args) {

        Map<String,String> map = new HashMap<>();
        map.put("a","1");
        map.put("b","2");
        map.put("c","3");

        Set<String> set = map.keySet();
        for(String s : set){
            System.out.println(map.get(s));
        }


    }
}
