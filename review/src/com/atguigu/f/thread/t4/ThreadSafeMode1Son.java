package com.atguigu.f.thread.t4;

/**
 * @author Wint
 * @create 2022-05-27 23:07
 */
public class ThreadSafeMode1Son extends Thread{
    private static int ticket = 100;

    @Override
    public void run() {
        synchronized (this){
            for (int i = 0; i < 100; i++) {
                if (ticket > 0){
                    System.out.println(Thread.currentThread().getName() + "_出票成功，票号为：" + ticket);
                    ticket--;
                    Thread.yield();
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
//            while(true){
//                if (ticket > 0){
//                    System.out.println(Thread.currentThread().getName() + "_出票成功，票号为：" + ticket);
//                    ticket--;
//                    Thread.yield();
//                    try {
//                        Thread.sleep(100);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }else{
//                    break;
//                }
//            }
        }
    }
}
