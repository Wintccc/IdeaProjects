package com.atguigu.t2.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author Wint
 * @create 2022-06-22 20:18
 */
public class DateTest {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());
        java.sql.Date date1 = new java.sql.Date(date.getTime());
        System.out.println(date1);
        System.out.println("--------------------------------------");

        SimpleDateFormat sdf = new SimpleDateFormat();
        Date date2 = new Date();
        System.out.println(date2);
        System.out.println(sdf.format(date2));
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format1 = sdf2.format(new Date());
        System.out.println(format1);
        Date parse = null;
        try {
            parse = sdf2.parse(format1);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(parse);
        System.out.println("--------------------------------------");

        Calendar calendar = Calendar.getInstance();
        int days = calendar.get(Calendar.DAY_OF_YEAR);
        System.out.println(days);
    }
}
