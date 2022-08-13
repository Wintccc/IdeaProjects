package com.atguigu.thread;

/**
 * @author Wint
 * @create 2022-05-28 0:02
 */
public class NotifyTest {
    public static void main(String[] args) {

        NotifyMode2Son s = new NotifyMode2Son();
        Thread t1 = new Thread(s);
        Thread t2 = new Thread(s);
        Thread t3 = new Thread(s);

        t1.start();
        t2.start();
        t3.start();
    }
}
