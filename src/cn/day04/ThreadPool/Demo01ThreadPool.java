package cn.day04.ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo01ThreadPool {
    public static void main(String[] args) {

        ExecutorService ex = Executors.newFixedThreadPool(3);

        ex.submit(new RunableImpl());
        ex.submit(new RunableImpl());
        ex.submit(new RunableImpl());
        ex.submit(new RunableImpl());

        ex.shutdown();


    }






}
