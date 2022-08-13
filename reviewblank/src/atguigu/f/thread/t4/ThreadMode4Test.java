package atguigu.f.thread.t4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Wint
 * @create 2022-05-27 22:25
 */
public class ThreadMode4Test {
    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(10);
        service.execute(new ThreadMode4Son1());
        service.execute(new ThreadMode4Son2());
        service.shutdown();
    }
}
