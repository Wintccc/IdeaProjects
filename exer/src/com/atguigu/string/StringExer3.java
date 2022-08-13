package com.atguigu.string;

/**
 * @author Wint
 * @create 2022-05-28 15:40
 */
public class StringExer3 {
    public static void main(String[] args) {
        String str1 = "abkkcadkabkebfkabkskab";
        String str2 = "ab";
        System.out.println(getSimpleCount(str1, str2));
    }

    static int getSimpleCount(String main,String sub){
        int mainLength = main.length();
        int subLength = sub.length();
        int index = 0;
        int count = 0;
        if(mainLength >= subLength){
            while((index = main.indexOf(sub,index)) != -1){
                count++;
                index += subLength;
            }
            return count;
        }else{
            return 0;
        }
    }
}
