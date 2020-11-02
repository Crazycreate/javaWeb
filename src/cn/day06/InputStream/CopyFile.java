package cn.day06.InputStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("C:\\Users\\Crazycreate\\Desktop\\za\\TIM截图20200812125803.png");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Crazycreate\\Desktop\\za\\hhhh\\TIM截图20200812125803.png");

        int len = 0;

        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes)) != -1){
            fos.write(bytes,0,len);
        }
//        while((len = fis.read()) != -1){
//            fos.write(len);
//        }

        fos.close();
        fis.close();
        long e = System.currentTimeMillis();
        System.out.println(e-s);









    }
}