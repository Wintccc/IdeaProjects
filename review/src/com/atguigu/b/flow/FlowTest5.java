package com.atguigu.b.flow;

/**
 * @author Wint
 * @create 2022-06-21 14:35
 */
public class FlowTest5 {
    public static void main(String[] args) {
        /*
        3000米长的绳子，每天减一半。问多少天这个绳子会小于5米？不考虑小数。
         */
        int count = 0;
        for (int i = 3000 ; i >= 5 ; i /= 2){
            count++;
        }
        System.out.println(count);
    }
}
