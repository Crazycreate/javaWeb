package cn.day09.Function;

import java.util.function.Function;

public class Demo01Function {
    public static void main(String[] args) {
        String s = "102";
        change(s,(String ans)->{
            return Integer.parseInt(ans);
        });
    }

    public static void change(String s, Function<String,Integer> fun){
        Integer i = fun.apply(s);
        System.out.println(i);
    }

}
