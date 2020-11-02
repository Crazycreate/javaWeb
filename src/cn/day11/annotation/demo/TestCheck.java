package cn.day11.annotation.demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestCheck {
    public static void main(String[] args) throws IOException {

        Calculator c = new Calculator();
        Class cls = c.getClass();

        Method[] methods = cls.getMethods();

        int num = 0;
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Crazycreate\\Desktop\\za\\a.txt"));

        for (Method method : methods) {
            if(method.isAnnotationPresent(Check.class)){
                try {
                    method.invoke(c);
                } catch (Exception e) {
                    num++;
                    bw.write(method.getName()+"方法异常");
                    bw.newLine();
                    bw.write("异常的名称是： "+e.getCause().getClass().getSimpleName());
                    bw.newLine();
                    bw.write("异常的原因是： "+e.getCause().getMessage());
                    bw.newLine();
                    bw.write("-------------------------");
                    bw.newLine();
                }
                }
            }
        bw.write("本次测试一共出现" + num+"次异常");
        bw.flush();
        bw.close();

        }


    }

