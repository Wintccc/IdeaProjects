package atguigu.f.thread.t4;

import java.util.concurrent.FutureTask;

/**
 * @author Wint
 * @create 2022-05-27 23:32
 */
public class ThreadSafeTest3 {
    public static void main(String[] args) {

        ThreadSafeMode3Son s = new ThreadSafeMode3Son();
        FutureTask t = new FutureTask(s);
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);
        Thread t3 = new Thread(t);
        t1.start();
        t2.start();
        t3.start();

    }
}
