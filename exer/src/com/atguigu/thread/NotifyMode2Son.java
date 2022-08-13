package com.atguigu.thread;

/**
 * @author Wint
 * @create 2022-05-28 0:02
 */
public class NotifyMode2Son implements Runnable{
    private int count = 0;
    private Object obj = new Object();
    @Override
    public void run() {
        while(true){
            synchronized (obj){
                obj.notify();
                if(count <= 100){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "_" + count);
                    count++;
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else{
                    break;
                }
            }
        }
    }
}
