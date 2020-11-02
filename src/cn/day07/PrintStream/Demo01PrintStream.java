package cn.day07.PrintStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Demo01PrintStream {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("C:\\Users\\Crazycreate\\Desktop\\za\\a.txt");

        ps.write(97);
        ps.println(97);

        System.out.println("控制台输出");

        System.setOut(ps);

        System.out.println("输出到文件中");

        ps.close();

    }
}
