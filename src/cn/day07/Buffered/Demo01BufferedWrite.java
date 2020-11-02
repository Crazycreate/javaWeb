package cn.day07.Buffered;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Demo01BufferedWrite {
    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Crazycreate\\Desktop\\za\\1.txt"));

        for (int i = 0; i < 10; i++) {
            bw.write("等等等等等等等等");
            bw.newLine();
        }

        bw.close();

    }
}
