package cn.day06.IO;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo02OutputStream {
    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("C:\\Users\\Crazycreate\\Desktop\\za\\a.txt");

        //byte[] arr = {65,66,67,68};
        byte[] arr = {-65,-66,-67,68,69};
        byte[] bytes = "我艹".getBytes();
        fos.write(bytes);

        fos.close();

    }
}
