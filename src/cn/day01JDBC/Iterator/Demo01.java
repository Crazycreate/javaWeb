package cn.day01JDBC.Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo01 {
    public static void main(String[] args) {


        Collection coll = new ArrayList<>();
        coll.add("b");
        coll.add("a");
        coll.add("d");
        coll.add("e");

        Iterator it = coll.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

//        Iterator<String> iterator = coll.iterator();
////        System.out.println(iterator.next());
////        System.out.println(iterator.next());
//        while (iterator.hasNext())
//            System.out.println(iterator.next());
//        System.out.println(iterator.hasNext());
//
//        //增强for循环
//        for(String c : coll){
//            System.out.print(c);
//        }








    }
}
