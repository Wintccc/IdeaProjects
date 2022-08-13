package com.atguigu.f.thread.t4;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author Wint
 * @create 2022-05-27 21:02
 */
public class ThreadMode3Test {
    public static void main(String[] args) {

        ThreadMode3Son1 t1 = new ThreadMode3Son1();
        FutureTask f1 = new FutureTask(t1);
        Thread t2 = new Thread(f1);
        t2.start();
        try {
            Object i = f1.get();
            System.out.println(i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
