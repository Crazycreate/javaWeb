package cn.day07.ObjectOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Demo01ObjectOutputStream {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Crazycreate\\Desktop\\za\\a.txt"));

        oos.writeObject(new Person("a",1));
        oos.writeObject(new Person("b",2));
        oos.writeObject(new Person("c",3));
        oos.writeObject(new Person("d",4));

        oos.close();

    }
}
