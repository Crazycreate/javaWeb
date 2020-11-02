package cn.day03.ThreadName;

public class Demo01Thread {
    public static void main(String[] args) {

        MyThread mt = new MyThread();

        mt.start();

        new MyThread().start();



    }
}
