package atguigu.f.thread.t4;

/**
 * @author Wint
 * @create 2022-05-27 23:07
 */
public class ThreadSafeMode1Son extends Thread{
    private static int ticket = 100;

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            synchronized (Thread.class){
                if (ticket > 0) {
                    ticket--;
                    System.out.println(Thread.currentThread().getName() + "_出票成功，票号为：" + ticket);
                }
            }
        }
    }
}
