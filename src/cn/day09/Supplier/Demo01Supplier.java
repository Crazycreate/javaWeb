package cn.day09.Supplier;

import java.util.function.Supplier;

public class Demo01Supplier {
    public static void main(String[] args) {
        String s = getString(()->{
            return "aaaa";
        });
        System.out.println(s);
    }

    public static String getString(Supplier<String> sup) {
        return sup.get();
    }


}
