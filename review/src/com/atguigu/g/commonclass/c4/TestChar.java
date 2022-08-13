package com.atguigu.g.commonclass.c4;

/**
 * @author Wint
 * @create 2022-06-22 12:14
 */
public class TestChar {
    /*
    请编写一个 Application 实现如下功能：接受命令行中给出的一个字母串，先将该串原样输出，
    然后判断该串的第一个字母是否为大写，若是大写则统计该串中大写字母的个数，
    并将所有大写字母输出；否则输出信息串”第一个字母不是大写字母!”。
     */
    public static void main(String args[]) {
        int count = 0;
        if (args.length != 0) {
            System.out.println(args[0]);
            if ((int) args[0].charAt(0) >= 65 && (int) args[0].charAt(0) <= 90) {
                for (int i = 0; i < args[0].length(); i++) {
                    if ((int) args[0].charAt(i) >= 65
                            && (int) args[0].charAt(i) <= 90) {
                        System.out.print(args[0].charAt(i));
                        count++;
                    }
                }
                System.out.println();
                System.out.println("共有 " + count + " 个大写字母。");
            } else
                System.out.println("第一个字母不是大写字母!");
        } else
            System.out.println("请给出命令行参数!");
    }

}
