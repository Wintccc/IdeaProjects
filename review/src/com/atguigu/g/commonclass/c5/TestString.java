package com.atguigu.g.commonclass.c5;

/**
 * @author Wint
 * @create 2022-06-22 12:15
 */
/*
一个应用程序，接受用户输入的一行字符串，统计字符个数，然后反序输出
 */
public class TestString {
    public static void main(String args[]) {
        String str;
        str = args[0];
        int j = str.length();
        System.out.println(str + " " + j);
        for (int i = j - 1; i >= 0; i--) {
            System.out.print(str.charAt(i) + " ");
        }
    }

}
