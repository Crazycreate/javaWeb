package cn.day03.Runable;

public class Demo01Runable {
    public static void main(String[] args) {

        RunableImpl runable = new RunableImpl();

        Thread t = new Thread(runable);

        t.start();

        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+i);
        }




    }
}
