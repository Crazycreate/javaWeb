package cn.day09.LambdaTest;

public class Demo01Runable {

    public static void main(String[] args) {

        startThread(() ->{
            System.out.println(Thread.currentThread().getName());
        });





    }

    public static void startThread(Runnable run) {
        new Thread(run).start();
    }


}
