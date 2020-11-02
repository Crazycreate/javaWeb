package cn.day09.Predicate;

import java.util.function.Predicate;

public class Demo01Predicate {
    public static void main(String[] args) {

        System.out.println(checkString("aaa", (String s) -> {
            if (s.length() == 3)
                return true;
            else
                return false;
        }));


    }

    public static boolean checkString(String s, Predicate<String> pre){
        return pre.test(s);
    }
}
