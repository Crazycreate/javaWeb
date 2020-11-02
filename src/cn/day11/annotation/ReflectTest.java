package cn.day11.annotation;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;


@Pro(className = "cn.day11.annotation.Demo1",methodName = "show")
public class ReflectTest {
    public static void main(String[] args) throws Exception {


        //1.解析注解
        // 获取该类的字节码文件对象
        Class<ReflectTest> reflectTestClass = ReflectTest.class;
        //2.获取上面的注解对象
        //其实就是在内存中生成一个该注解接口的子类实现对象
        Pro an = reflectTestClass.getAnnotation(Pro.class);
        //3.调用该注解对象中定义的抽象方法，获取返回值
        String className = an.className();
        String methodName = an.methodName();

        Class cls = Class.forName(className);
        Object obj = cls.getDeclaredConstructor().newInstance();
        Method method = cls.getMethod(methodName);
        method.invoke(obj);


    }
}
