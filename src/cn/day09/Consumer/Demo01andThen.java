package cn.day09.Consumer;

import java.util.function.Consumer;

public class Demo01andThen {
    public static void method(String s, Consumer<String> con1, Consumer<String> con2) {
        con1.accept(s);
        con2.accept(s);

        con1.andThen(con2).accept(s);

        con2.andThen(con1).accept(s);


    }

    public static void main(String[] args) {
        method("aaaa",(String s)->{
            System.out.println(s);
        },(String s)->{
            System.out.println(s.toUpperCase());
        });
    }



}
