package cn.day10.Demo02Stream;

import java.util.stream.Stream;

public class Demo06Limit {
    public static void main(String[] args) {

        String[] arr = {"a","b","c","d","e","f"};

        Stream<String> stream = Stream.of(arr);

        stream.limit(3).forEach(name-> System.out.println(name));
        System.out.println("-------------------------");

        Stream<String> stream2 = Stream.of(arr);
        stream2.skip(3).forEach(n-> System.out.println(n));

    }
}
