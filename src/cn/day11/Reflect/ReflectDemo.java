package cn.day11.Reflect;

import cn.day11.domain.Person;

public class ReflectDemo {

    public static void main(String[] args) throws Exception {

        //1.
        Class cls = Class.forName("cn.day11.domain.Person");
        System.out.println(cls);

        //2.
        Class cls2 = Person.class;
        System.out.println(cls2);

        //3.
        Person p = new Person();
        Class cls3 = p.getClass();
        System.out.println(cls3);

        System.out.println(cls == cls2);
        System.out.println(cls3 == cls2);


    }


}
