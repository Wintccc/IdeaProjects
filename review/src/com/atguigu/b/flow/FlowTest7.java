package com.atguigu.b.flow;

/**
 * @author Wint
 * @create 2022-06-21 14:43
 */
public class FlowTest7 {
    public static void main(String[] args) {
        /*
        一个数如果恰好等于它的因子之和，这个数就称为"完数"。（因子：除去这个数本身的约数）
        例如6=1＋2＋3.编程 找出1000以内的所有完数
         */
        for (int i = 1 ; i <= 1000 ; i++){
            int sum = 0;
            for (int j = 1 ; j < i ; j++){
                if(i % j == 0){
                    sum += j;
                }
            }
            if(i == sum){
                System.out.println(i);
            }
        }
    }
}
