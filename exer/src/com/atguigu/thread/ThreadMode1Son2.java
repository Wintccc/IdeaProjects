package com.atguigu.thread;

/**
 * @author Wint
 * @create 2022-05-27 20:48
 */
public class ThreadMode1Son2 extends Thread {
    private static int ticket = 100;

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            synchronized (Thread.class){
                if (ticket > 0) {
                    ticket--;
                    System.out.println(this.getName() + "_出票成功，票数剩余：" + ticket);
                    try {
                        sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
