package cn.day10.Stream;

import java.util.ArrayList;
import java.util.List;

public class Demo01List {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("aa");
        list.add("abc");
        list.add("abb");

        List<String> list1 = new ArrayList<>();
        for (String s : list) {
            if(s.startsWith("a") && s.length() == 3)
                list1.add(s);
        }

        System.out.println(list1);

    }
}
