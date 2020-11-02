package cn.day01JDBC.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Demo04HashMap {
    public static void main(String[] args) {
        HashMap<String,Person> hmap = new HashMap<>();
        hmap.put("California",new Person("Tom",22));
        hmap.put("zx",new Person("y",2));
        hmap.put("sh",new Person("x",72));
        hmap.put("ss",new Person("z",25));
        hmap.put("California",new Person("l",26));


        //System.out.println(hmap);

        LinkedHashMap<String,Person> lmap = new LinkedHashMap<>();
        lmap.put("California",new Person("Tom",22));
        lmap.put("zx",new Person("y",2));
        lmap.put("sh",new Person("x",72));
        lmap.put("ss",new Person("z",25));
        lmap.put("California",new Person("l",26));

        System.out.println(lmap);


    }
}
