package cn.day04.Thread;

public class Demo {
    public static void main(String[] args) {

        Baozi bz = new Baozi();

        new BaoZiFu(bz).start();

        new Customer(bz).start();





    }
}
