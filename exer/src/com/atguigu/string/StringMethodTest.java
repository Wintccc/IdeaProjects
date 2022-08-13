package com.atguigu.string;

/**
 * @author Wint
 * @create 2022-05-28 14:36
 */
public class StringMethodTest {
    public static void main(String[] args) {

        String s1 = "Abc123";
        System.out.println(s1.length());
        System.out.println(s1.charAt(0));
        System.out.println(s1.isEmpty());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toString());
        System.out.println(s1.toUpperCase());
        String s2 = "  a  b c 1 3 5   ";
        System.out.println(s2.trim());
        System.out.println(s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.concat(s2));
        System.out.println(s1.compareTo(s2));
        String s3 = "a";
        String s4 = "b";
        System.out.println(s3.compareTo(s4));
        System.out.println(s1.substring(2));
        System.out.println(s1.substring(2,5));
        System.out.println(s1.endsWith("2"));
        System.out.println(s1.endsWith("3"));
        System.out.println(s1.contains("bc"));
        System.out.println(s1.indexOf("c"));
        System.out.println(s1.indexOf("z"));
        System.out.println(s1.replace("c","z"));
        System.out.println(s1.toString());
        System.out.println(s1.replace("123","567"));
    }
}
