package com.atguigu.exer;

import org.junit.Test;

/**
 * @author Wint
 * @create 2022-08-12 15:10
 */
public class ReflectTest {

    @Test
    public void test1() throws Exception {

        Double dou1 = new Double(12.3);
        Class class1 = dou1.getClass();
        System.out.println(class1);

        Object obj = class1.newInstance();

    }
}
