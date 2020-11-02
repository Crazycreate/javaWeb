package cn.day01JDBC.Collect;

import java.util.ArrayList;
import java.util.Collection;

public class DemmCollect {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("a");
        coll.add("a");
        coll.add("a");
        System.out.println(coll);

        System.out.println(coll.size());

        Object[] arr = coll.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }

}
