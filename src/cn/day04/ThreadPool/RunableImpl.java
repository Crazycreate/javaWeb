package cn.day04.ThreadPool;

public class RunableImpl implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"sssssssssss");
    }


}
