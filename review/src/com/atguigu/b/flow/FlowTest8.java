package com.atguigu.b.flow;

import java.util.Scanner;

/**
 * @author Wint
 * @create 2022-06-21 14:47
 */
public class FlowTest8 {
    public static void main(String[] args) {
        /*
        输入两个正整数m和n，求其最大公约数和最小公倍数
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("输入正整数m：");
        int m = scan.nextInt();
        System.out.println("输入正整数n：");
        int n = scan.nextInt();
        int max = (m > n) ? m : n;
        int min = (m < n) ? m : n;
        //求最大公约数
        for(int i = min ; i >= 1 ; i--){
            if(max % i == 0 && min % i == 0){
                System.out.println(m + "和" + n + "的最大公约数为：" + i);
                break;
            }
        }
        for (int i = max ; i <= m * n ; i++){
            if(i % m == 0 && i % n == 0){
                System.out.println(m + "和" + n + "的最小公倍数为：" + i);
                break;
            }
        }
    }
}
