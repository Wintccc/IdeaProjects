package atguigu.f.thread.t4;

import java.util.concurrent.Callable;

/**
 * @author Wint
 * @create 2022-05-27 21:03
 */
public class ThreadMode3Son1 implements Callable {

    @Override
    public Object call() throws Exception {
        int ticket = 100;
        while (true){
            if(ticket > 0){
                System.out.println(Thread.currentThread().getName() + "出票成功，票号为：" + ticket);
                ticket--;
                Thread.sleep(50);
                Thread.yield();
            }else{
                break;
            }
        }
        return null;
    }
}
