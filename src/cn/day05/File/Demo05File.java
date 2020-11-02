package cn.day05.File;

import java.io.File;

public class Demo05File {
    public static void main(String[] args) {

       // show01();

        show02();
    }

    private static void show01() {
        File fi = new File("C:\\Users\\Crazycreate\\Desktop\\za");
        System.out.println(fi.exists());

        File f2 = new File("C:\\Users\\Crazycreate\\Desktop\\z");
        System.out.println(f2.exists());
    }

    private static void show02() {
        File fi = new File("C:\\Users\\Crazycreate\\Desktop\\za");
        System.out.println(fi.isDirectory());

        File f2 = new File("C:\\Users\\Crazycreate\\Desktop\\za\\使用EvoCoLIC提升 MC.docx");
        System.out.println(f2.isFile());
    }
}
