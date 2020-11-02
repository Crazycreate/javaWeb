package cn.day05.Recursion;

import java.util.Scanner;

public class Demo01 {

    public static int cur = 0;
    public static int sum = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(recursion(a));

    }

    private static int recursion(int a) {
        if(a < cur)
            return sum;
        sum += cur;
        cur++;
        return recursion(a);
    }


}
