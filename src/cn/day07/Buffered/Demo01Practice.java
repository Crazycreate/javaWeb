package cn.day07.Buffered;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Demo01Practice {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Crazycreate\\Desktop\\za\\1.txt"));
        HashMap<String,String> map = new HashMap<>();
        String s;
        while ((s = br.readLine()) != null){
            String[] arr = s.split("\\.");
            map.put(arr[0],arr[1]);
            //System.out.println(s);
        }
        for(String key : map.keySet()){
            System.out.println(map.get(key));
        }
    }
}
