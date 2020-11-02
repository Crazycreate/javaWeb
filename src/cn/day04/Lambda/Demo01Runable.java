package cn.day04.Lambda;

public class Demo01Runable {
    public static void main(String[] args) {
        RunableImpl run = new RunableImpl();

        Thread t = new Thread(run);

        t.start();

        Runnable r = new Runnable(){

            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"222222");
            }
        };

        new Thread(r).start();



    }
}
