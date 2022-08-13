package com.atguigu.thread;

/**
 * @author Wint
 * @create 2022-05-27 23:22
 */
public class ThreadSafeTest2 {
    public static void main(String[] args) {

        ThreadSafeMode2Son s = new ThreadSafeMode2Son();
        Thread t1 = new Thread(s);
        Thread t2 = new Thread(s);
        Thread t3 = new Thread(s);
        t1.start();
        t2.start();
        t3.start();

    }
}
