package cn.day03.ThreadName;

public class MyThread extends Thread{
    @Override
    public void run(){
        String name = getName();
        System.out.println(name);
    }
}
