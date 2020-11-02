package cn.day06.InputStream;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Demo02InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\Crazycreate\\Desktop\\za\\1.txt");

        byte[] arr = new byte[10];

        System.out.println(fis.read(arr));
        System.out.println(Arrays.toString(arr));
        System.out.println(new String(arr));
        fis.close();
    }
}
