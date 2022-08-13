package com.atguigu.string;

/**
 * @author Wint
 * @create 2022-05-28 15:21
 */
public class StringExer2 {
    //abcdefg反转为abfedcg
    public static void main(String[] args) {
        String s1 = "abcdefg";
        System.out.println(s1);
        System.out.println(reverse(s1,2,5));
    }

    static String reverse(String str,int start,int end){
        if (str != null){
           char[] arr = str.toCharArray();
           for(int x = start,y = end; x < y; x++,y--){
               char temp = arr[x];
               arr[x] = arr[y];
               arr[y] = temp;
           }
           return new String(arr);
        }
        return null;
    }
}
