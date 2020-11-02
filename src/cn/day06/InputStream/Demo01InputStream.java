package cn.day06.InputStream;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo01InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\Crazycreate\\Desktop\\za\\a.txt");

//        int t = 0 ;
//        while ((t = fis.read()) != -1){
//            System.out.print((char)t);
//        }

        fis.close();

        System.out.println((char)666);

    }
}
