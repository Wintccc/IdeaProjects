package com.atguigu.exer;

import org.junit.Test;

/**
 * @author Wint
 * @create 2022-08-12 15:21
 */
public class NewCharacterTest {
    @Test
    public void test1(){
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println(1);
            }
        };

        Runnable r2 = () -> System.out.println(2);
    }
}
