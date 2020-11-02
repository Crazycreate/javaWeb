package cn.day07.Buffered;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class Demo01BufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Crazycreate\\Desktop\\za\\1.txt"));
        String s = new String();
        int i = 0;
        while((s = br.readLine()) != null){
            System.out.println(s+" "+ ++i);
        }
        br.close();
    }
}
