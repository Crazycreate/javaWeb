package cn.day10.Demo02Stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Demo08TestPro {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("aba");
        arr.add("bc");
        arr.add("cc");
        arr.add("aa");
        arr.add("d");
        arr.add("f");

        Stream<String> ans1 = arr.stream().filter(name -> name.length() == 2).limit(3);

        ArrayList<String> arr2 = new ArrayList<>();
        arr2.add("1");
        arr2.add("2");
        arr2.add("3");
        arr2.add("11");
        arr2.add("12");
        arr2.add("2232");

        Stream<String> ans2 = arr2.stream().filter(name -> name.startsWith("1")).skip(2);

        Stream<Person> personStream = Stream.concat(ans1, ans2).map(name -> new Person(name));

        personStream.forEach(person -> System.out.println(person));


    }
}
