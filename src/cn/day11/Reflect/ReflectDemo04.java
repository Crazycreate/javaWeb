package cn.day11.Reflect;

import cn.day11.domain.Person;

import java.lang.reflect.Method;

public class ReflectDemo04 {
    public static void main(String[] args) throws Exception{

        Class<Person> personClass = Person.class;

        Method eat_Method = personClass.getMethod("eat");
        Person p = new Person();
        eat_Method.invoke(p);

        Method eat_Method2 = personClass.getMethod("eat",String.class);
        eat_Method2.invoke(p,"fish");

        System.out.println("==============================");

        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
            System.out.println(method.getName());

        }

        String name = personClass.getName();
        System.out.println(name);


    }
}
