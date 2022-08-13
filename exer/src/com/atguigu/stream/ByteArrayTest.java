package com.atguigu.stream;

import org.junit.Test;

/**
 * @author Wint
 * @create 2022-06-03 22:33
 */
public class ByteArrayTest {
    @Test
    public void test1(){
        String str = new String("中国人人人人人人");
        byte[] bytes = str.getBytes();
        for (byte b:
             bytes) {
            System.out.print(b);
        }
        System.out.println();
        char[] chars = str.toCharArray();
        for (char c:
             chars) {
            System.out.print(c);
        }

    }
}
