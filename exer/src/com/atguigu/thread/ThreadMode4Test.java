package com.atguigu.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author Wint
 * @create 2022-05-27 22:25
 */
public class ThreadMode4Test {
    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(10);
        ThreadPoolExecutor s = (ThreadPoolExecutor) service;
        System.out.println(s.getClass());
        service.execute(new ThreadMode4Son1());
        service.submit(new ThreadMode4Son2());
        service.shutdown();
    }
}
