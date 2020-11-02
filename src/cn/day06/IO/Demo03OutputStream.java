package cn.day06.IO;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo03OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Crazycreate\\Desktop\\za\\a.txt",true);
        for (int i = 0; i < 10; i++) {
            fos.write("你tm的".getBytes());
            fos.write("\r\n".getBytes());
        }

        fos.close();
    }
}
