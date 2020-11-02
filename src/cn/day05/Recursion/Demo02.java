package cn.day05.Recursion;

import java.io.File;

public class Demo02 {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\Crazycreate\\Desktop\\za");
        getAllfiles(file);




    }

    public static void getAllfiles(File dir){

        System.out.println(dir);
        File[] files = dir.listFiles();
        for(File f : files){
            if(f.isDirectory())
                getAllfiles(f);
            else
            System.out.println(f);
        }
    }
}
