package cn.day10.Demo02Stream;

import java.util.stream.Stream;

public class Demo03ForEach {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("aa", "bb", "ac", "cc");
//        stream.forEach((name)->{
//            System.out.println(name);
//        });

        stream.filter(name-> name.startsWith("a")).forEach(name -> System.out.println(name));





    }
}
