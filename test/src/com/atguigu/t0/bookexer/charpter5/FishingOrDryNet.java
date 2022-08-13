package com.atguigu.t0.bookexer.charpter5;

import java.util.Scanner;

/**
 * @author Wint
 * @create 2022-08-11 14:22
 */
public class FishingOrDryNet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入年份：");
        int year = scan.nextInt();
        System.out.print("请输入月份：");
        int month = scan.nextInt();
        System.out.print("请输入日期：");
        int day = scan.nextInt();
        int days = day;

        for (int i = 1990; i < year; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
                days += 366;
            } else {
                days += 365;
            }
        }

        int[] daysPerMonth = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
        for (int i = 1; i < month; i++){
            if (i == 2){
                days += 29;
            }
            days += daysPerMonth[i - 1];
        }
        int result = days % 5;
        System.out.println(year + "年" + month + "月" + day + "日在" +
                ((result == 1 || result == 2 || result == 3)? "打渔" : "晒网"));
    }
}
