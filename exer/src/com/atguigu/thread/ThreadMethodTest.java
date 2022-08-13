package com.atguigu.thread;

/**
 * @author Wint
 * @create 2022-05-27 22:50
 */
public class ThreadMethodTest {
    public static void main(String[] args) {

        ThreadMode1Son1 s1 = new ThreadMode1Son1();
        ThreadMode1Son1 s2 = new ThreadMode1Son1();
        System.out.println(Thread.currentThread());
        System.out.println(s1.getName());
        s1.start();
        s2.start();
        for(int i = 0; i < 100; i++){
            if(i % 2 == 0){
                System.out.println(i + "_" + Math.random());
                System.out.println(Thread.currentThread().isAlive());
                System.out.println(Thread.currentThread().getPriority());
                try {
                    s1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println(s2.isAlive());
    }
}
