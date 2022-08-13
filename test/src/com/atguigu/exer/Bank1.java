package com.atguigu.exer;

/**
 * @author Wint
 * @create 2022-08-11 20:53
 */
public class Bank1 {
    private Bank1(){
    }
    private static Bank1 instance = new Bank1();

    public Bank1 getInstance(){
        return instance;
    }
}
class Bank2{
    private Bank2(){
    }
    private static Bank2 instance = null;
    static {
        instance = new Bank2();
    }
    public static Bank2 getInstance(){
        return instance;
    }
}

class Bank3{
    private Bank3(){
    }
    private static Bank3 instance = null;
    public static Bank3 getInstance(){
        if(instance == null){
            instance = new Bank3();
        }
        return instance;
    }
}
