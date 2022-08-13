package com.atguigu.thread;

/**
 * @author Wint
 * @create 2022-05-27 20:56
 */
public class ThreadMode2Son1 implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i < 100; i++){
            if(i % 2 == 0){
                System.out.println(i + "_" + Math.random());
            }
        }
    }
}
