package com.atguigu.date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

/**
 * @author Wint
 * @create 2022-05-28 17:08
 */
public class DateTimeFormatterTest {
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        TemporalAccessor parse = formatter.parse("2019-02-18 03:52:09");
        System.out.println(parse);
    }
}
