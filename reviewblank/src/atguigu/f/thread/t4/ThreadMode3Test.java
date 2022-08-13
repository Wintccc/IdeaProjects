package atguigu.f.thread.t4;

import java.util.concurrent.FutureTask;

/**
 * @author Wint
 * @create 2022-05-27 21:02
 */
public class ThreadMode3Test {
    public static void main(String[] args) {
        ThreadMode3Son1 t = new ThreadMode3Son1();
        FutureTask f = new FutureTask(t);
        Thread w1 = new Thread(f);
        Thread w2 = new Thread(f);
        Thread w3 = new Thread(f);

        w1.start();
        w2.start();
        w3.start();
    }
}
