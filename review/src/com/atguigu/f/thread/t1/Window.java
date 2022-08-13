package com.atguigu.f.thread.t1;

/**
 * @author Wint
 * @create 2022-06-22 11:13
 */
public class Window extends Thread {
    private static int ticket = 100;

    @Override
    public void run() {

        while (true) {

            if (ticket > 0) {
                System.out.println(getName() + "：卖票，票号为：" + ticket);
                ticket--;
            } else {
                break;
            }
        }
    }
}
