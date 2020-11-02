package cn.day01JDBC.Iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class doudizhu {
    public static void main(String[] args) {
        ArrayList<String> poker = new ArrayList<>();
        String[] a = new String[]{"♥","♣","♦","♠"};
        String[] b = new String[]{"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        poker.add("king");
        poker.add("JOKER");
        for (int i = 0; i < 4; i++) {
            for (int i1 = 0; i1 < 13; i1++) {
                poker.add(a[i]+b[i1]);
            }
        }
        Collections.shuffle(poker);
        //System.out.println(poker.size());

        ArrayList<String> x = new ArrayList<>();
        ArrayList<String> y = new ArrayList<>();
        ArrayList<String> z = new ArrayList<>();
        ArrayList<String> d = new ArrayList<>();
        int con = 0;
        Iterator<String> it = poker.iterator();
        while(it.hasNext()){
            if(con >= 51)
                d.add(it.next());
            else if(con % 3 == 0) {
                x.add(it.next());
            }
            else if (con % 3 == 1) {
                y.add(it.next());
            }
            else if (con % 3 == 2) {
                z.add(it.next());
            }
            ++con;
        }
        System.out.println(d.size());
        System.out.println(d);


    }
}
