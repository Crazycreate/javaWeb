package cn.day03.Thread;

public class Demo02Thread {
    public static void main(String[] args) {

        MyThread mt = new MyThread();

        mt.start();

        for (int i = 0; i < 20; i++) {
            System.out.println("w" + i);
        }



    }
}
