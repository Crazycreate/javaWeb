package cn.day07.Buffered;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Demo01BufferedIutputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\Crazycreate\\Desktop\\za\\b.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        //int len = 0;//这时的len时对应的字节数
//        while((len = bis.read()) != -1){
//            System.out.println( len);
//        }
//        System.out.println((char)97);
        byte[] bytes = new byte[1024];
        int len = 0;//这时的len记录的是每次读取的有效个数
        while ((len = bis.read(bytes)) != -1){
            System.out.println(new String(bytes,0,len));
        }
        bis.close();
    }
}
