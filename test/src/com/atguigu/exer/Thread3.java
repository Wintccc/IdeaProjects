package com.atguigu.exer;

import java.util.concurrent.Callable;

/**
 * @author Wint
 * @create 2022-08-11 21:14
 */
public class Thread3 implements Callable {
    @Override
    public Object call() throws Exception {
        for (int i = 0 ; i < 100; i++){
            System.out.println(Thread.currentThread().getName() + i);
        }
        return null;
    }
}
