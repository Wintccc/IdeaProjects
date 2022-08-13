package atguigu.f.thread.t1;

/**
 * @author Wint
 * @create 2022-06-22 11:14
 */
/**
 * 例子：创建三个窗口卖票，总票数为100张.使用继承Thread类的方式
 * 存在线程的安全问题，待解决。
 */
public class WindowTest {
    public static void main(String[] args) {
        Window w1 = new Window();
        Window w2 = new Window();
        Window w3 = new Window();

        w1.start();
        w2.start();
        w3.start();
    }
}
