package com.atguigu.thread;

/**
 * @author Wint
 * @create 2022-05-27 22:25
 */
public class ThreadMode4Son1 implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i < 100; i++){
            if(i % 2 == 0){
                System.out.println(i + "&&&&&&");
            }
        }
    }
}
