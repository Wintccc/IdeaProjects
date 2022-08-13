package com.atguigu.f.thread.t4;

/**
 * @author Wint
 * @create 2022-05-27 23:22
 */
public class ThreadSafeMode2Son implements Runnable{
    private int ticket = 100;

    @Override
    public void run() {
        while(true){
            show();
            if (ticket == 0){
                break;
            }
        }
    }
    private synchronized void show(){
        if (ticket > 0){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "_出票成功，票号为：" + ticket);
            ticket--;
//            Thread.yield();
        }
    }
}
