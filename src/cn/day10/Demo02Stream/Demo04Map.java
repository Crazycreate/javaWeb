package cn.day10.Demo02Stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class Demo04Map {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1", "2", "3", "4", "5");
        Stream<Integer> stream2 = stream.map((String s) -> {
            return Integer.parseInt(s);
        });



        stream2.forEach(name -> System.out.println(name));
    }
}
