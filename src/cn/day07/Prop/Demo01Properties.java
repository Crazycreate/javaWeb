package cn.day07.Prop;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Demo01Properties {
    public static void main(String[] args) throws IOException {

        //show01();
        //show02();
        show03();

    }


    private static void show01() {
        Properties prop = new Properties();
        prop.setProperty("a","1");
        prop.setProperty("b","2");
        prop.setProperty("c","3");
        prop.setProperty("d","4");

        Set<String> s = prop.stringPropertyNames();

        for (String ans : s) {

            String value = prop.getProperty(ans);
            System.out.println(ans +"->"+value);
        }
    }

    private static void show02() throws IOException {

        Properties prop = new Properties();
        prop.setProperty("a","1");
        prop.setProperty("b","2");
        prop.setProperty("c","3");
        prop.setProperty("d","4");


        FileWriter fw = new FileWriter("C:\\Users\\Crazycreate\\Desktop\\za\\b.txt",true);

        prop.store(fw,"save data");

        fw.close();

    }

    private static void show03() throws IOException{
        Properties prop = new Properties();
        prop.load(new FileInputStream("C:\\Users\\Crazycreate\\Desktop\\za\\1.txt"));
        Set<String> set = prop.stringPropertyNames();
        for (String key : set) {
            String value = prop.getProperty(key);
            System.out.println(key+" "+value);
        }
    }
}
