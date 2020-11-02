package cn.day01JDBC.Map;

import java.util.HashMap;
import java.util.Scanner;

public class Demptest {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String ans = sc.next();

        char[] a = ans.toCharArray();
        HashMap<Character,Integer> lmap = new HashMap<>();
        for (char c: a) {
            if(lmap.containsKey(c))
                lmap.put(c, lmap.get(c) + 1);
            else
                lmap.put(c,1);
        }

        //System.out.println(lmap);

        //System.out.println(ans);


    }



}
