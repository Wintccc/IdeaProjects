package atguigu.f.thread.t2;

/**
 * @author Wint
 * @create 2022-06-22 11:50
 */

/**
 * 例子：创建三个窗口卖票，总票数为100张.使用实现Runnable接口的方式
 * 存在线程的安全问题，待解决。
 */
public class WindowTest1 {
    public static void main(String[] args) {
        Window1 w = new Window1();
        Thread w1 = new Thread(w);
        Thread w2 = new Thread(w);
        Thread w3 = new Thread(w);

        w1.start();
        w2.start();
        w3.start();
    }
}
