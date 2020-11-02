package cn.day01JDBC.Generic;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo05Generic {
    public static void main(String[] args) {

        ArrayList<String> arr1 = new ArrayList<>();
        arr1.add("a");
        arr1.add("b");
        arr1.add("c");

        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(1);
        arr2.add(2);
        arr2.add(3);

        print(arr1);print(arr2);
    }


    public static void print(ArrayList<?> list) {
        Iterator<?> it = list.iterator();
//        while(it.hasNext())
//            System.out.println(it.next());
        for(Object i : list)
            System.out.println(i);
    }
}