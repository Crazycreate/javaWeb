package cn.day03.synchronized3;

public class RunableImpl implements Runnable{

    private int ticket = 100;

    private static int tic = 1000;

    Object obj = new Object();

    @Override
    public void run() {
        while (true){
            payTicketStaatic();
        }

    }


    public synchronized void payTicket(){
        if(ticket > 0){

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+ "第"+ticket+"票"+"已经售出");
            ticket--;
        }
    }

    public static synchronized void payTicketStaatic(){
        if(tic > 0){

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+ "第"+tic+"票"+"已经售出");
            tic--;
        }
    }




}
