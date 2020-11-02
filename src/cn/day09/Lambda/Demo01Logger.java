package cn.day09.Lambda;

public class Demo01Logger {
    public static void main(String[] args) {

        String msg1 = "a";
        String msg2 = "b";
        String msg3 = "c";

        showLog(1,msg1+msg2+msg3);

    }

    public static void showLog(int level, String message){
        if(level == 1)
            System.out.println(message);
    }

}
