package com.atguigu.t3.compare;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Wint
 * @create 2022-06-22 21:14
 */
public class ComparatorTest {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        String[] str = new String[]{"AA","BB","HH","TV","QQ","BO"};
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(Arrays.toString(str));
    }
}
