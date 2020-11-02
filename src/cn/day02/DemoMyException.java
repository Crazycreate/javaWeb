package cn.day02;

import java.util.Scanner;

public class DemoMyException extends Exception{

    static String[] names = {"a","b","c"};

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        String username = sc.next();

        check(username);


    }

    public static void check(String name)  {
        for(String s : names){
            if(s.equals(name))
                try {
                    throw new ReException("已被注册");
                } catch (ReException e) {
                    e.printStackTrace();
                    return;
                }
        }
        System.out.println("注册成功");
    }

}
