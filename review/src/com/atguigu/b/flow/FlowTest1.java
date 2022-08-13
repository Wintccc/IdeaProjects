package com.atguigu.b.flow;

import java.util.Scanner;

/**
 * @author Wint
 * @create 2022-06-21 14:21
 */
public class FlowTest1 {
    public static void main(String[] args) {
        /*
        闰年的判断规则如下：
        （1）若某个年份能被4整除但不能被100整除，则是闰年。
        （2）若某个年份能被400整除，则也是闰年。
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = scan.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + "是闰年");
        }else{
            System.out.println(year + "不是闰年");
        }
    }
}
