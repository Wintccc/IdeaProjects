package com.atguigu.f.thread.t5;

/**
 * @author Wint
 * @create 2022-06-22 14:30
 */
public class NotifyTest {
    public static void main(String[] args) {
       Thread1 t = new Thread1();
        Thread w1 = new Thread(t);
        Thread w2 = new Thread(t);
        Thread w3 = new Thread(t);

        w1.start();
        w2.start();
        w3.start();
    }
}
