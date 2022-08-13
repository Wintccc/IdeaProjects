package com.atguigu.b.flow;

/**
 * @author Wint
 * @create 2022-06-21 14:27
 */
public class FlowTest3 {
    public static void main(String[] args) {
        /*
        使用双重循环打印20 * 8的矩形，使用for循环实现
         */
        for (int i = 0 ; i < 20 ; i++){
            for (int j = 0 ; j < 8 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
