package com.atguigu.date;

import java.time.LocalDateTime;

/**
 * @author Wint
 * @create 2022-05-28 17:03
 */
public class LocalDateTimeTest {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime of = LocalDateTime.of(2018, 9, 2, 12, 2);
        System.out.println(now.getDayOfMonth());
        LocalDateTime localDateTime = now.withDayOfMonth(4);
        System.out.println(localDateTime);
        System.out.println(now);


    }
}
