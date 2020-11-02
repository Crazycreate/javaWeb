package cn.day05.File;

import java.io.File;

public class Demo03File {
    public static void main(String[] args) {

       // show01();

        //show02();

        //show03();

        show04();


    }


    private static void show01() {
        File fi = new File("C:\\Users\\Crazycreate\\Desktop\\za\\使用EvoCoLIC提升 MC.docx");
        System.out.println(fi.getAbsolutePath());

        File f2 = new File("a.txt");
        System.out.println(f2.getAbsolutePath());
    }

    private static void show02() {
        File fi = new File("C:\\Users\\Crazycreate\\Desktop\\za");
        System.out.println(fi.getPath());

        File f2 = new File("a.txt");
        System.out.println(f2.getPath());
    }

    private static void show03() {
        File fi = new File("C:\\Users\\Crazycreate\\Desktop\\za");
        System.out.println(fi.getName());

        File f2 = new File("a.txt");
        System.out.println(f2.getName());
    }

    private static void show04() {
        File fi = new File("C:\\Users\\Crazycreate\\Desktop\\za");
        System.out.println(fi.length());

        File f2 = new File("a.txt");
        System.out.println(f2.length());
    }

}
