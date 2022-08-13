package com.atguigu.string;

/**
 * @author Wint
 * @create 2022-05-28 16:32
 */
public class StringBufferBuilderTest {
    public static void main(String[] args) {

        StringBuffer s1 = new StringBuffer();
        s1.append("123");
        s1.append("abc");
        System.out.println(s1);
//        StringBuffer delete = s1.delete(0, 2);
//        System.out.println(delete);
//        System.out.println(s1);
        s1.setCharAt(0,'a');
        System.out.println(s1);
        s1.replace(0,2,"789");
        System.out.println(s1);
        char a = s1.charAt(3);
        System.out.println(a);
        System.out.println(s1);
        s1.insert(1,"z");
        System.out.println(s1);
        System.out.println(s1.length());
    }
}
