package com.atguigu.a.var;

import org.junit.Test;

/**
 * @author Wint
 * @create 2022-06-21 14:10
 */
public class VariableTest {
    /*
    为抵抗洪水，战士连续作战89小时，编程计算共多少天零多少小时？
     */
    @Test
    public void test1(){
        int hour = 89;
        System.out.println("共" + hour / 24 + "天" + hour % 24 + "小时");
    }
    /*
    今天是周二，100天以后是周几？
     */
    @Test
    public void test2(){
        System.out.println("100天后的今天是星期" + (2 + 100 % 7));
//        int week = 2;
//        week += 100;
//        week = week % 7;
//        System.out.println("100天后星期" + week);
    }
}
