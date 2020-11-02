package cn.day04.Lambda;

public class Demo01Cook {
    public static void main(String[] args) {
        invokeCook(new cook() {
            @Override
            public void makeFood() {
                System.out.println("cooking");
            }
        });

        invokeCook(()->{
            System.out.println("cooking2");
        });
    }

    public static void invokeCook(cook cook) {
        cook.makeFood();
    }

}
