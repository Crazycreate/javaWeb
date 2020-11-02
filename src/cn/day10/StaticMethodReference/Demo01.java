package cn.day10.StaticMethodReference;

public class Demo01 {
    public static void main(String[] args) {

        int i = method(-10, (n) -> {
            return Math.abs(n);
        });

        System.out.println(i);

        //相当于对于lambda表达式的进一步省略
        System.out.println(method(-50, Math::abs));


    }

    public static int method(int num, Calcable c){
        return c.calsAbs(num);
    }
}
