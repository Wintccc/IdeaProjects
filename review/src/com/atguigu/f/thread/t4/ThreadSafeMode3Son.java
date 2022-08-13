package com.atguigu.f.thread.t4;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Wint
 * @create 2022-05-27 23:32
 */
public class ThreadSafeMode3Son implements Callable {

    private int ticket = 100;
    private ReentrantLock lock = new ReentrantLock();

    @Override
    public Object call() throws Exception {
        while (true) {
            try{
                lock.lock();
                if (ticket > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "_出票成功，票号为：" + ticket);
                    ticket--;
                    Thread.yield();
                }else{
                    return null;
                }
            }finally {
                lock.unlock();
            }
        }

    }
}
