package com.atguigu.string;

/**
 * @author Wint
 * @create 2022-05-28 14:30
 */
public class StringInstanceTest {

    public static void main(String[] args) {

        String s1 = "abc";
        String s2 = new String("defg");
        String s3 = s1 + "defg";
        String s4 = s1 + s2;
        System.out.println(s3 == s4);

    }
}
