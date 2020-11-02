package cn.day04.Lambda;

public class Demo02Lambda {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"11111");
            }
        }).start();


        new Thread(()->{
            System.out.println(Thread.currentThread().getName()+"11111");
        }
        ).start();
    }
}
