package cn.day02;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo03TryCatch {
    public static void main(String[] args) {
        try {
            readFile("d:\\a.txt");

        }
        catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("bbbbb");

    }

    public static void readFile(String filename) throws IOException{
        if(!filename.endsWith(".txt"))
            throw new IOException("文件后缀名不对");
        if(!filename.equals("c:\\a.txt"))
            throw new FileNotFoundException("文件路径不对");

        System.out.println("correct");

    }

}
