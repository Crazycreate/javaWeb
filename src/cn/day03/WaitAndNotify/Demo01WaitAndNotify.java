package cn.day03.WaitAndNotify;

public class Demo01WaitAndNotify {
    public static void main(String[] args) {

        Object obj  = new Object();

        new Thread(){
            @Override
            public void run(){
                synchronized (obj){
                    System.out.println("消费者");
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("已经唤醒");
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run(){
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (obj){
                    System.out.println("生产者ready");
                    obj.notify();
                }
            }




        }.start();



    }
}
