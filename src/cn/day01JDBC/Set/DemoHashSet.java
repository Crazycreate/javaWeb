package cn.day01JDBC.Set;

import java.util.HashSet;

public class DemoHashSet {
    public static void main(String[] args) {
        Person p1 = new Person("a",20);
        Person p2 = new Person("a",20);
        Person p3 = new Person("a",21);
        HashSet<Person> set = new HashSet<>();
        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set);


    }


}
