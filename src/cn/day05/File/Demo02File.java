package cn.day05.File;

import java.io.File;

public class Demo02File {
    public static void main(String[] args) {

        show01();

        show02("C://","a.txt");

        show03();




    }

    private static void show01() {
        File fi = new File("C:\\Users\\Crazycreate\\Desktop\\za");
        System.out.println(fi);

    }

    private static void show02(String parent, String child) {
        File fi = new File(parent,child);
        System.out.println(fi);

    }

    private static void show03() {
        File pa = new File("C://");
        File fi = new File(pa,"b.txt");
        System.out.println(fi);

    }


}
