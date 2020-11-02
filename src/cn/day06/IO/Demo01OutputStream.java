package cn.day06.IO;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Crazycreate\\Desktop\\za\\1.txt");
        fos.write(97);
        fos.close();
    }
}
