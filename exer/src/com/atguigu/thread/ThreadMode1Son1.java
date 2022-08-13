package com.atguigu.thread;

/**
 * @author Wint
 * @create 2022-05-27 20:42
 */
public class ThreadMode1Son1 extends Thread{
    @Override
    public void run() {
        for(int i = 0; i < 100; i++){
            if(i % 2 == 0){
                System.out.println(getName() + "_" + i);
                yield();
            }
        }
    }
}
