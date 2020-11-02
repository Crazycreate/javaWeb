package cn.day03.Synchronized2;

public class RunableImpl implements Runnable{

    private int ticket = 100;

    @Override
    public void run() {
        while (true){
            if(ticket > 0){
                System.out.println(Thread.currentThread().getName()+ "第"+ticket+"票"+"已经售出");
                ticket--;

            }

        }

    }
}
