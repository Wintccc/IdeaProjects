package com.atguigu.thread;

/**
 * @author Wint
 * @create 2022-05-27 20:55
 */
public class ThreadMode2Test {
    public static void main(String[] args) {

        ThreadMode2Son1 t1 = new ThreadMode2Son1();
        Thread t2 = new Thread(t1);
        t2.start();
        Thread t3 = new Thread(t2);
        t3.start();
        new Thread(t1){
            @Override
            public void run() {
                for(int i = 0; i < 100; i++) {
                    if(i % 100 != 0){
                        System.out.println(i + "******");
                    }
                }
            }
        }.start();

    }
}
