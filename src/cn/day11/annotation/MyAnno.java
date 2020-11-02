package cn.day11.annotation;

public @interface MyAnno {

    String name() default "aaa";

    int value();

    String[] arr();

    MyAnno2 my();

}
