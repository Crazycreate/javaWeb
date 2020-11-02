package cn.day03.Thread;

public class Demo01Thread {
    public static void main(String[] args) {

        Person p1 = new Person("a");
        p1.run();

        Person p2 = new Person("b");
        p2.run();
    }


}
