package com.atguigu.f.thread.t1;

/**
 * @author Wint
 * @create 2022-06-22 11:14
 */
/**
 * 例子：创建三个窗口卖票，总票数为100张.使用继承Thread类的方式
 * 存在线程的安全问题，待解决。
 */
public class WindowTest {
    public static void main(String[] args) {
        Window t1 = new Window();
        Window t2 = new Window();
        Window t3 = new Window();


        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();

    }
}
