package cn.day05.File;

import java.io.File;

public class Demo07File {
    public static void main(String[] args) {

        //show01();

        show02();

    }

    private static void show01() {

        File file = new File("C:\\Users\\Crazycreate\\Desktop\\za");
        String[] arr = file.list();
        for(String s : arr)
        System.out.println(s);

    }

    private static void show02() {

        File file = new File("C:\\Users\\Crazycreate\\Desktop\\za");
        File[] arr = file.listFiles();
        for(File s : arr)
            System.out.println(s);

    }

}
