package cn.day05.File;

import java.io.File;
import java.io.IOException;

public class Demo06File {
    public static void main(String[] args) {
        //show01();

        //show02();

        show03();

    }

    private static void show01() {
        File fi = new File("C:\\Users\\Crazycreate\\Desktop\\za\\1.txt");
        boolean b = false;
        try {
            b = fi.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(b);


    }

    private static void show02() {
        File fi = new File("C:\\Users\\Crazycreate\\Desktop\\za\\hhhh");
        boolean m = fi.mkdir();
        System.out.println(m);

        File f2 = new File("C:\\Users\\Crazycreate\\Desktop\\za\\hhhh\\xxxx\\ffff");
        boolean m2 = f2.mkdirs();
        System.out.println(m2);


    }

    private static void show03() {
        File fi = new File("C:\\Users\\Crazycreate\\Desktop\\za\\hhhh\\xxxx\\ffff");
        boolean m = fi.delete();
        System.out.println(m);




    }
}
