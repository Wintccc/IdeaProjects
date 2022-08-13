package com.atguigu.enumm;

/**
 * @author Wint
 * @create 2022-05-28 19:10
 */
public class SeasonTest {
    public static void main(String[] args) {
        System.out.println(Season.SPRING);
        Season1 summer = Season1.SUMMER;
        System.out.println(summer);
        Season1[] values = Season1.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
    }
}
