package cn.day10.Demo02Stream;

import java.util.stream.Stream;

public class Demo07Concat {
    public static void main(String[] args) {
        String[] arr = {"a","b","c","d","e","f"};

        Stream<String> stream = Stream.of(arr);

        Stream<String> stream2 = Stream.of("1", "2", "3", "4", "5");

        Stream<String> concat = Stream.concat(stream, stream2);

        concat.forEach(n-> System.out.print(n));

    }
}
