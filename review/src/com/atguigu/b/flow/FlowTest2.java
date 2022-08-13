package com.atguigu.b.flow;

/**
 * @author Wint
 * @create 2022-06-21 14:26
 */
public class FlowTest2 {
    public static void main(String[] args) {
        /*
        打印1-100之间13的倍数，使用for循环
         */
        int sum = 0;
        for (int i = 0 ; i <= 100 ; i++){
            if(i % 13 == 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
