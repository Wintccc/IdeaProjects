package com.atguigu.thread;

/**
 * @author Wint
 * @create 2022-05-27 20:42
 */
public class ThreadMode1Test {
    public static void main(String[] args) {
        //创建Thread子类的对象
        ThreadMode1Son1 t1 = new ThreadMode1Son1();
//        t1.start();
        ThreadMode1Son2 t2 = new ThreadMode1Son2();
        t2.setName("线程一");
        ThreadMode1Son2 t3 = new ThreadMode1Son2();
        t3.setName("线程二");
        ThreadMode1Son2 t4 = new ThreadMode1Son2();
        t4.setName("线程三");
        t2.start();
        t3.start();
        t4.start();
        //创建Thread类的匿名子类对象
//        new Thread(){
//            @Override
//            public void run() {
//                for (int i = 0; i < 100; i++) {
//                    if(i % 100 != 0){
//                        System.out.println(i + "******");
//                    }
//                }
//            }
//        }.start();


    }
}
