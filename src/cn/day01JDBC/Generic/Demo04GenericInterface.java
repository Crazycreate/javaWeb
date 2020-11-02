package cn.day01JDBC.Generic;

public class Demo04GenericInterface {
    public static void main(String[] args) {

        //1
        GenericInterfaceImpl gi1 = new GenericInterfaceImpl();
        gi1.method("ssss");


        //2
        GenericInterfaceImpl2<Integer> gi2 = new GenericInterfaceImpl2<>();
        gi2.method(5656);






    }




}
