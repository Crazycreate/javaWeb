package cn.day01JDBC.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo03EntrySet {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("a","1");
        map.put("b","2");
        map.put("c","3");

        Set<Map.Entry<String,String>> set =  map.entrySet();
        System.out.println(map.entrySet());
        Iterator<Map.Entry<String,String>> it = set.iterator();
        while(it.hasNext())
            System.out.println(it.next());


    }
}
