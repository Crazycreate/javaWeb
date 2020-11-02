package cn.day01JDBC.List;

import java.util.LinkedList;

public class DemoLinkList {
    public static void main(String[] args) {

        LinkedList<String> li = new LinkedList<>();

        li.addFirst("a");
        li.addLast("b");
        li.push("c");

        System.out.println(li);

        String s = li.getLast();
        System.out.println(s);

        li.removeLast();
        System.out.println(li.getLast());


    }


}
