package cn.day06.Reader;

import java.io.FileReader;
import java.io.IOException;

public class Demo02Reader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:\\Users\\Crazycreate\\Desktop\\za\\a.txt");
        int len = 0;
        while((len = fr.read()) != -1)
            System.out.print((char)len);
        fr.close();
    }
}
