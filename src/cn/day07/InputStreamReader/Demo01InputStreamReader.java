package cn.day07.InputStreamReader;

import java.io.*;

public class Demo01InputStreamReader {
    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Crazycreate\\Desktop\\za\\a.txt"));
        InputStreamReader isr = new InputStreamReader(new FileInputStream("C:\\Users\\Crazycreate\\Desktop\\za\\a.txt"),"GBK");
        String s;
        int len = 0;
        while ((len = isr.read()) != -1){
            System.out.print((char)len);
        }
        isr.close();
    }
}
