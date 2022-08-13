package com.atguigu.thread;

import java.util.concurrent.Callable;

/**
 * @author Wint
 * @create 2022-05-27 21:03
 */
public class ThreadMode3Son1 implements Callable {

    @Override
    public Object call() throws Exception {
        int i;
        for(i = 0; i < 100; i++){
            if(i % 2 == 0){
                System.out.println(i + "&&&&&&");
            }
        }
        return i;
    }
}
