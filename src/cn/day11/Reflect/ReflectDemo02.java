package cn.day11.Reflect;

import cn.day11.domain.Person;

import java.lang.reflect.Field;

public class ReflectDemo02 {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        Class personClass = Person.class;

        Field[] fields = personClass.getFields();//获取public的方法
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("-------------------------");

        Field a = personClass.getField("a");
        Person p = new Person();
        Object o = a.get(p);
        //
        a.set(p,"assad");
        System.out.println(p);

        System.out.println("-------------------------");

        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }


    }

}
