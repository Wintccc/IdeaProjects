package com.atguigu.exer;

import org.junit.Test;

/**
 * @author Wint
 * @create 2022-08-11 21:42
 */
public class StringTest {

    @Test
    public void test3(){
        StringBuffer sb = new StringBuffer(15);
        sb.append("ABC");
        sb.insert(2,"Z");
        System.out.println(sb.toString());
        System.out.println(sb.charAt(1));
    }

    @Test
    public void test2(){
        String s1 = "abc";
        byte[] bytes = s1.getBytes();
        for (byte b:
             bytes) {
            System.out.println((char)b);
        }

    }

    @Test
    public void test1(){
        String s1 = "abc";
        char[] chars = s1.toCharArray();
        for (char c:
             chars) {
            System.out.println(c);
        }
        String s2 = chars.toString();
    }
}
