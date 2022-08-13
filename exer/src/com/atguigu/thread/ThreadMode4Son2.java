package com.atguigu.thread;

/**
 * @author Wint
 * @create 2022-05-27 22:27
 */
public class ThreadMode4Son2 implements Runnable{
    private int ticket = 100;
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            synchronized (Thread.class){
                if (ticket > 0) {
                    ticket--;
                    System.out.println(this.getClass().getName() + "_出票成功，票号为：" + ticket);
//                    try {
//                        Thread.sleep(500);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
                }
            }
        }
    }
}
