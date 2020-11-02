package cn.day04.Thread;

public class BaoZiFu extends Thread{
    private Baozi bz;

    public BaoZiFu(Baozi bz){
        this.bz = bz;
    }

    @Override
    public void run() {

        int count = 0;
        while (true) {
            synchronized (bz) {
                if (bz.flag) {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (count % 2 == 0) {
                    bz.pi = "thin";
                    bz.xian = "chicken";
                } else {
                    bz.pi = "thick";
                    bz.xian = "beef";
                }
                count++;
                System.out.println("is cooking " + bz.pi + " "+ bz.xian);
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                bz.flag = true;
                bz.notify();
                System.out.println("has cooked " + bz.pi + " " +bz.xian);
            }
        }

    }


}
