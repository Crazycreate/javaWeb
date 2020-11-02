package cn.day09.Lambda;

public class Dem02lambda {
    public static void main(String[] args) {

        String msg1 = "a";
        String msg2 = "b";
        String msg3 = "c";

        showLog(1,()->{
            return msg1+msg2+msg3;
        });

    }

    public static void showLog(int level, MessageBuilder mb){

        if(level == 1)
            System.out.println(mb.builderMessage());


    }



}
