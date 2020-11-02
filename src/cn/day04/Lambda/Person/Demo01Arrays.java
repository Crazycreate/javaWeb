package cn.day04.Lambda.Person;

import java.util.Arrays;
import java.util.Comparator;

public class Demo01Arrays {
    public static void main(String[] args) {
        Person[] arr = {
                new Person("a", 10),
         new Person("b", 11),
         new Person("c", 12)

        };
        Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o2.getAge()-o1.getAge();
            }
        });

        Arrays.sort(arr,(Person o1, Person o2)->{return o1.getAge()-o2.getAge();});





        for(Person p : arr){
        System.out.println(p);
        }
    }
}
