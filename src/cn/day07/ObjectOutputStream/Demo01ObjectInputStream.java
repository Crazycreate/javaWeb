package cn.day07.ObjectOutputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Demo01ObjectInputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\Crazycreate\\Desktop\\za\\a.txt"));
        Object o = ois.readObject();
        ois.close();
        System.out.println(o);
    }
}
