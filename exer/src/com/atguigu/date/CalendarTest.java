package com.atguigu.date;

import java.util.Calendar;

/**
 * @author Wint
 * @create 2022-05-28 17:00
 */
public class CalendarTest {
    public static void main(String[] args) {

        Calendar instance = Calendar.getInstance();
        System.out.println(instance.getClass());
        System.out.println(instance.get(Calendar.DAY_OF_MONTH));
    }
}
