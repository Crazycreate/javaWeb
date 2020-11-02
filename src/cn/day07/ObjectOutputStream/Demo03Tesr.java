package cn.day07.ObjectOutputStream;

import java.io.*;
import java.util.ArrayList;

public class Demo03Tesr {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Person> arr = new ArrayList<>();
        arr.add(new Person("a",1));
        arr.add(new Person("b",2));
        arr.add(new Person("c",3));
        arr.add(new Person("d",4));
        arr.add(new Person("e",5));
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Crazycreate\\Desktop\\za\\a.txt"));
        oos.writeObject(arr);
        //
        ObjectInputStream  ois = new ObjectInputStream(new FileInputStream("C:\\Users\\Crazycreate\\Desktop\\za\\a.txt"));
        Object ans = ois.readObject();
        System.out.println(ans);
        ois.close();
        oos.close();

    }
}
