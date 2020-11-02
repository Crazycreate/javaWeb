package cn.day05.File;

import java.io.File;

public class Demo01File {
    public static void main(String[] args) {
        String pathSeparator = File.pathSeparator;
        System.out.println(pathSeparator);//路径分隔符

        //"D:"+File.separator+"Hearthstone"+File.separator+"Logs"

        String separator = File.separator;
        System.out.println(separator);//文件分隔符
    }
}
