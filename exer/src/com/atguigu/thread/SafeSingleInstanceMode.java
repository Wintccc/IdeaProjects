package com.atguigu.thread;

/**
 * @author Wint
 * @create 2022-05-27 23:46
 */
public class SafeSingleInstanceMode {

    private SafeSingleInstanceMode instance;
    private SafeSingleInstanceMode(){};

    public SafeSingleInstanceMode getInstance() {
        synchronized (SafeSingleInstanceMode.class){
            if(instance == null){
                instance = new SafeSingleInstanceMode();
            }
        }
        return instance;
    }
}