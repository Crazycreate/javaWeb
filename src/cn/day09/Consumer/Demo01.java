package cn.day09.Consumer;

import java.util.function.Consumer;

public class Demo01 {
    public static void main(String[] args) {

        method("aaaa",(String s)->{
            System.out.println(s);
        });



    }

    public static void method(String name, Consumer<String> con){
        con.accept(name);
    }
}
