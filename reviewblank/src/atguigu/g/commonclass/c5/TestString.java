package atguigu.g.commonclass.c5;

import java.util.Scanner;

/**
 * @author Wint
 * @create 2022-06-22 12:15
 */
/*
一个应用程序，接受用户输入的一行字符串，统计字符个数，然后反序输出
 */
public class TestString {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int j = str.length();
        System.out.println(j);
        for (int i = str.length()  - 1; i >= 0 ; i--){
            System.out.print(str.charAt(i));
        }
    }

}
