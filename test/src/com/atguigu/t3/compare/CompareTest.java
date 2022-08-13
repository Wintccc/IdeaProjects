package com.atguigu.t3.compare;

import java.util.Arrays;

/**
 * @author Wint
 * @create 2022-06-22 21:00
 */
public class CompareTest {
    public static void main(String[] args) {
        Goods[] goods = new Goods[5];
        goods[0] = new Goods("ABC", 245);
        goods[1] = new Goods("GSH", 748);
        goods[2] = new Goods("KRT", 174);
        goods[3] = new Goods("KRT", 846);
        goods[4] = new Goods("BNA", 258);
        System.out.println(Arrays.toString(goods));
        Arrays.sort(goods);
        System.out.println(Arrays.toString(goods));

    }
}
