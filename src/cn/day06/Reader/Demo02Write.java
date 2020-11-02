package cn.day06.Reader;

import java.io.FileWriter;
import java.io.IOException;

public class Demo02Write {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("C:\\Users\\Crazycreate\\Desktop\\za\\b.txt");
        fw.write(98);
        fw.write("我知道");
        fw.write("9642");
        fw.write("reply");
        fw.flush();
        fw.close();

    }
}
