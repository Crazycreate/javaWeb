package cn.day10.Demo02Stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Demo05Count {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);

        Stream<Integer> stream = arr.stream();

        System.out.println(stream.count());


    }
}
