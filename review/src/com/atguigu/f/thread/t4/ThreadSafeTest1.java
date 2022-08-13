package com.atguigu.f.thread.t4;

/**
 * @author Wint
 * @create 2022-05-27 23:06
 */
public class ThreadSafeTest1 {
    public static void main(String[] args) {

        ThreadSafeMode1Son t1 = new ThreadSafeMode1Son();
        ThreadSafeMode1Son t2 = new ThreadSafeMode1Son();
        t1.setName("线程一");
        t2.setName("线程二");
        t1.start();
        t2.start();


    }
}
