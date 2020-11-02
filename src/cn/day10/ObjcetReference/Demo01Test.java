package cn.day10.ObjcetReference;

public class Demo01Test {
    public static void printable(Printable p) {
        p.print("hely");
    }

    public static void main(String[] args) {
        MethodReObject methodReObject = new MethodReObject();

        printable(methodReObject::printUpper);





    }

}
