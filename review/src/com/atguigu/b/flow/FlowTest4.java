package com.atguigu.b.flow;

import java.util.Scanner;

/**
 * @author Wint
 * @create 2022-06-21 14:29
 */
public class FlowTest4 {
    public static void main(String[] args) {
    /*
    输入高度，输出直角三角形。如：输入4, 将输出如下图形:
    #
    ##
    ###
    ####
     */
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入高度：");
        int high = scan.nextInt();
        for (int i = 0 ; i < high ; i++){
            for (int j = 0 ; j <= i ; j++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
