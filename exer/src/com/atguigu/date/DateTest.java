package com.atguigu.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Wint
 * @create 2022-05-28 16:40
 */
public class DateTest {
    public static void main(String[] args) throws ParseException {

        Date d1 = new Date();
        System.out.println(d1);
        System.out.println(System.currentTimeMillis());
        Date d2 = new Date(1653727301015L);
        System.out.println(d2);
        System.out.println(d2.getTime());
        System.out.println(d2.toString());
        java.sql.Date d3 = new java.sql.Date(1653727301015L);
        System.out.println(d3);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        SimpleDateFormat sdf1 = new SimpleDateFormat();
        String birth = "2018-12-3 12:34:13";
        System.out.println(sdf1.format(System.currentTimeMillis()));
        Date date2 = sdf.parse("2020-02-18 11:48:27");
    }
}
