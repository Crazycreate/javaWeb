package cn.day07.Buffered;

import java.io.*;

public class Demo02CopyFile {
    public static void main(String[] args) throws IOException {
        long s = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("C:\\Users\\Crazycreate\\Desktop\\za\\TIM截图20200812125803.png");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Crazycreate\\Desktop\\za\\hhhh\\xxxx\\TIM截图20200812125803.png");
        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        int len = 0;
        while((len = bis.read()) != -1){
            bos.write(len);
        }
        bis.close();
        bos.close();

//        byte[] bytes = new byte[1024];
//        int len = 0;
//        while((len = bis.read(bytes)) != -1){
//            bos.write(bytes);
//        }

        long e = System.currentTimeMillis();
        System.out.println(e-s);
    }
}
