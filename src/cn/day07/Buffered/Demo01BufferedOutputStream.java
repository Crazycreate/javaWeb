package cn.day07.Buffered;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01BufferedOutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Crazycreate\\Desktop\\za\\1.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        bos.write("字节通过缓冲流读入".getBytes());
        bos.flush();
        bos.close();
    }
}
