package atguigu.f.thread.t3;

/**
 * @author Wint
 * @create 2022-06-22 11:52
 */
/**
 * 练习：创建两个分线程，其中一个线程遍历100以内的偶数，另一个线程遍历100以内的奇数
 * 创建Thread类的匿名子类的方式
 */
public class ThreadDemo {
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                for(int i = 1 ; i <= 100 ; i++){
                    if(i % 2 == 0){
                        System.out.println(Thread.currentThread().getName() + "_" + i);
                    }
                }
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                for(int i = 1 ; i <= 100 ; i++){
                    if(i % 2 != 0){
                        System.out.println(Thread.currentThread().getName() + "_" + i);
                    }
                }
            }
        }.start();
    }
}
