package cn.day10.Demo02Stream;

import java.util.ArrayList;

public class Demo08Test {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("aba");
        arr.add("bc");
        arr.add("cc");
        arr.add("aa");
        arr.add("d");
        arr.add("f");

        ArrayList<String> ans1 = new ArrayList<>();
        int count = 0;
        for(String s : arr){
            if(s.length() == 2 && count < 3) {
                ans1.add(s);
                count++;
            }
        }

        ArrayList<String> arr2 = new ArrayList<>();
        arr2.add("1");
        arr2.add("2");
        arr2.add("3");
        arr2.add("11");
        arr2.add("12");
        arr2.add("2232");

        ArrayList<String> ans2 = new ArrayList<>();
        for (String s : arr2) {
            if(s.startsWith("1")){
                ans2.add(s);
            }
        }

        for (int i = 0; i < ans2.size(); i++) {
            if(i > 1)
            ans1.add(ans2.get(i));
        }

        ArrayList<Person> list = new ArrayList<>();
        for(String name : ans1)
            list.add(new Person(name));

        System.out.println(list);


    }
}
