package cn.day03.Ticket;

public class RunableImpl implements Runnable{

    private int ticket = 100;

    Object obj = new Object();

    @Override
    public void run() {
        while (true){
            synchronized (obj){
                if(ticket > 0){

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+ "第"+ticket+"票"+"已经售出");
                    ticket--;
                }
            }

        }

    }
}
