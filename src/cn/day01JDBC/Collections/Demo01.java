package cn.day01JDBC.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo01 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list,"a","b","c","d");
//        System.out.println(list);
//
//        Collections.shuffle(list);
//        System.out.println(list);
//
//        Collections.sort(list);
//        System.out.println(list);

        Person p1 = new Person("a",19);
        Person p2 = new Person("b",20);
        Person p3 = new Person("c",18);

        ArrayList<Person> li = new ArrayList<>();
        Collections.addAll(li,p1,p2,p3);
        System.out.println(li);

        //Collections.sort(li);



        Collections.sort(li, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o2.getAge() - o1.getAge();
            }
        });

        System.out.println(li);






    }


}
