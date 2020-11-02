package cn.day10.MethodReference;

public class Deme01Printable {
    public static void main(String[] args) {

        printString((s)->{
            System.out.println(s);
        });
        printString(System.out::println);
    }
    public static void printString(Printable p){
        p.print("Hely ");
    }

}
