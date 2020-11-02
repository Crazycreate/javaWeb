package cn.day10.Stream;

import java.util.ArrayList;
import java.util.List;

public class Demo02Stream {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("aa");
        list.add("abc");
        list.add("abb");

        list.stream().filter(name -> name.startsWith("a")).filter(name -> name.length()==3).forEach(name -> System.out.println(name));



    }
}
