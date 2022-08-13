package com.atguigu.string;

/**
 * @author Wint
 * @create 2022-05-28 15:05
 */
public class StringExer1 {
    public static void main(String[] args) {

        String s1 = "  a b c 1 3 ";
        System.out.println(myTrim(s1));

    }
    static String myTrim(String str){
       if(str != null){
           int start = 0;
           int end = str.length() - 1;
           while (start < end && str.charAt(start) == ' '){
                start++;
           }
           while (start < end && str.charAt(end) == ' '){
               end--;
           }
           return str.substring(start, end + 1);
       }
        return null;
    }
}
