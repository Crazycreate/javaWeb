package cn.day04.Thread;

public class Customer extends Thread{

    private Baozi bz;

    public Customer(Baozi bz){
        this.bz = bz;
    }

    @Override
    public void run(){
        while (true){
            synchronized (bz){
                if(!bz.flag){
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println("is eating " +  bz.pi + " " + bz.xian);
                bz.flag = false;
                bz.notify();
                System.out.println("has eaten " +  bz.pi + " " + bz.xian);
                System.out.println("------------------");
            }









        }
    }
}
