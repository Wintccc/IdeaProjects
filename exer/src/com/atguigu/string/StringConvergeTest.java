package com.atguigu.string;

import java.nio.charset.StandardCharsets;

/**
 * @author Wint
 * @create 2022-05-28 14:48
 */
public class StringConvergeTest {
    public static void main(String[] args) {

        String s1 = "123";
        String s2 = "456";
        int i1 = 789;
        double d1 = 45.67;
        Integer in1 = Integer.parseInt(s1);
        System.out.println(in1);
        Double do1 = Double.parseDouble(s2);
        System.out.println(do1);
        Double do2 = d1;
        String s3 = String.valueOf(d1);
        String s4 = String.valueOf(do2);
        System.out.println(s3);
        System.out.println(s4);

        String s5 = "abcder";
        char[] chars = s5.toCharArray();
        System.out.println(chars);
        String s6 = new String(s5);
        System.out.println(s6);

        String s7 = "123abc";
        byte[] bytes = s7.getBytes(StandardCharsets.UTF_8);
//        for (int i = 0; i < bytes.length; i++) {
//            System.out.println(bytes[i]);
//        }
        String s8 = new String(bytes);
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }

        String s9 = "abc123";
        StringBuffer s10 = new StringBuffer(s9);
        System.out.println(s10);
        StringBuilder s11 = new StringBuilder(s9);
        System.out.println(s11);


    }
}
