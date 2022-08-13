package com.atguigu.f.thread.t2;

/**
 * @author Wint
 * @create 2022-06-22 11:50
 */
public class Window1 implements Runnable{
    private int ticket = 100;

    @Override
    public void run() {
        while(true){
            if(ticket > 0){
                System.out.println(Thread.currentThread().getName() + ":卖票，票号为：" + ticket);
                ticket--;
            }else{
                break;
            }
        }
    }
}
