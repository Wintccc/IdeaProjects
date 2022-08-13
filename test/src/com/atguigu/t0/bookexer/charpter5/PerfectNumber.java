package com.atguigu.t0.bookexer.charpter5;

/**
 * @author Wint
 * @create 2022-08-11 13:07
 */
public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println("1000以内所有的完数：");
        for (int i = 1; i <= 1000; i++){
            int iSum = 0;
            for (int j = 1; j < i; j++){
                if (i % j == 0){
                    iSum += j;
                }
            }
            if (iSum == i){
                System.out.print(i + " ");
            }
        }
    }
}
