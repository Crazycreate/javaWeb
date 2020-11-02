package cn.day11.Junit.test;

import cn.day11.Junit.Calculator.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    @Before
    public void init(){
        System.out.println("init....");
    }

    @After
    public void colse(){//
        System.out.println("close.......");

    }


    @Test
    public void testAdd(){
       // System.out.println("测试执行");
        Calculator cal = new Calculator();
        System.out.println(cal.add(1, 5));

    }

    @Test
    public void testSub(){
        Calculator cal = new Calculator();
        int ans = cal.sub(1, 5);
        Assert.assertEquals(-4,ans);
    }


}
