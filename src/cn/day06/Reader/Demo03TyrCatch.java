package cn.day06.Reader;

import javax.imageio.IIOException;
import java.io.FileWriter;
import java.io.IOException;

public class Demo03TyrCatch {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
             fw = new FileWriter("C:\\Users\\Crazycreate\\Desktop\\za\\b.txt",true);
            for (int i = 0; i < 10; i++) {
                fw.write("reply " + i + "\r\n");
            }
        }
            catch(IOException e){
                System.out.println(e);
            }
        finally {
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
