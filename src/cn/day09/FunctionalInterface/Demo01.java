package cn.day09.FunctionalInterface;

public class Demo01 {
    public static void main(String[] args) {
        show01(new MyFunctionalInterfaceImpl());
        show01(new MyFunctionalInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类进行重写");
            }
        });

        show01(()->{
            System.out.println("使用lambda表达式重写接口");
        });

    }

    private static void show01(MyFunctionalInterface myinter) {
        myinter.method();
    }
}
