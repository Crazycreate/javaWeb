package cn.day04.Lambda.Calculator;

public class Demo01Calculator {
    public static void main(String[] args) {
        invokeCalc(30,20,(int a, int b)->{
            return a+b;
        });
    }

    public static void invokeCalc(int a, int b, Calculator calculator){
        int ans = calculator.calc(a,b);
        System.out.println(ans);
    }

}
