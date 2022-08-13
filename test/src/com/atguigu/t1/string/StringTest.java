package com.atguigu.t1.string;

/**
 * @author Wint
 * @create 2022-06-22 16:35
 */
public class StringTest {
    public static void main(String[] args) {
        String s1 = "helloWorld";
        System.out.println(s1.isEmpty());
        System.out.println(s1.length());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.substring(1,9));

        System.out.println(456 / 10 / 10 % 10);
        System.out.println(456 % 10);
    }
}