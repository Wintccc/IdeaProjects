package com.atguigu.exer;

/**
 * @author Wint
 * @create 2022-08-11 21:12
 */
public class Thread2 implements Runnable{

    @Override
    public void run() {
        for (int i = 0 ; i < 100; i++){
            System.out.println(Thread.currentThread().getName() + i);
        }
    }
}
