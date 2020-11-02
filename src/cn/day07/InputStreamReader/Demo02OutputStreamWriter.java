package cn.day07.InputStreamReader;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Demo02OutputStreamWriter {
    public static void main(String[] args) throws IOException {
        show01();
    }

    private static void show01() throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("C:\\Users\\Crazycreate\\Desktop\\za\\a.txt"),"GBK");
        osw.write("等等等");
        osw.flush();
        osw.close();
    }
}
