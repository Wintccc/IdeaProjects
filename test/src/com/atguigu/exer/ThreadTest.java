package com.atguigu.exer;

import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/**
 * @author Wint
 * @create 2022-08-11 21:10
 */
public class ThreadTest {

    @Test
    public void test4(){
        ExecutorService service = Executors.newFixedThreadPool(10);
        service.execute(new Thread2());
        service.submit(new Thread3());
        service.shutdown();
    }

    @Test
    public void test3(){
        Thread3 t = new Thread3();
        FutureTask futureTask = new FutureTask(t);
        new Thread(futureTask).start();
    }

    @Test
    public void test2(){
        Thread2 t = new Thread2();
        Thread t1 = new Thread(t);
        t1.start();
    }

    @Test
    public void test1(){
        Thread1 t1 = new Thread1();
        t1.start();
    }
}
