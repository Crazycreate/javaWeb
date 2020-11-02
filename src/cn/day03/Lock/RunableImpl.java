package cn.day03.Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RunableImpl implements Runnable{

    private int ticket = 100;

    Object obj = new Object();

    Lock l = new ReentrantLock();

    @Override
    public void run() {
        while (true){
            //synchronized (obj){

            l.lock();

            if(ticket > 0){

                try {
                    Thread.sleep(100);
                    System.out.println(Thread.currentThread().getName()+ "第"+ticket+"票"+"已经售出");
                    ticket--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    l.unlock();

                }

            }
            //}


        }

    }






//    public void run() {
//        while (true){
//            //synchronized (obj){
//
//            l.lock();
//
//                if(ticket > 0){
//
//                    try {
//                        Thread.sleep(100);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println(Thread.currentThread().getName()+ "第"+ticket+"票"+"已经售出");
//                    ticket--;
//                }
//            //}
//            l.unlock();
//
//        }
//
//    }
}
