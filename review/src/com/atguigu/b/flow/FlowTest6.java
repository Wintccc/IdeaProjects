package com.atguigu.b.flow;

/**
 * @author Wint
 * @create 2022-06-21 14:38
 */
public class FlowTest6 {
    public static void main(String[] args) {
        /*
        打印1-100之间数，其中3、5、7的倍数不打印（continue）
         */
        for (int i = 0 ; i <= 100 ; i++){
            if(i % 3 == 0 | i % 5 == 0 | i % 7 == 0){
                continue;
            }
            System.out.println(i);
        }
    }
}
