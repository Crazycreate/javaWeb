package cn.day03.InnerClassThread;

public class Demo01InnerClassThread {
    public static void main(String[] args) {

        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+"sssss"+i);
                }
            }
        }.start();


        new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+"aaaa"+i);
                }

            }
        }.run();




    }
}
