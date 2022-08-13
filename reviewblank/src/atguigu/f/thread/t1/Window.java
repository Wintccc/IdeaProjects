package atguigu.f.thread.t1;

/**
 * @author Wint
 * @create 2022-06-22 11:13
 */
public class Window extends Thread {
    int ticket = 100;
    @Override
    public void run() {
        while (true){
            if(ticket > 0){
                System.out.println(Thread.currentThread().getName() + "出票成功，票号为：" + ticket);
                ticket--;
            }else{
                break;
            }
        }
    }
}
