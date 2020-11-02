package cn.day11.Reflect;

import cn.day11.domain.Person;

import java.lang.reflect.Constructor;

public class ReflectDemo03 {
    public static void main(String[] args) throws Exception {

        Class personClass = Person.class;

        Constructor constructor = personClass.getConstructor(String.class, int.class);
        //System.out.println(constructor);
        Object person = constructor.newInstance("aa", 20);
        System.out.println(person);


    }
}
