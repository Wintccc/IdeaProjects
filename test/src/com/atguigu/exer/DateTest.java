package com.atguigu.exer;

import org.junit.Test;

import java.util.Date;

/**
 * @author Wint
 * @create 2022-08-11 21:54
 */
public class DateTest {

    @Test
    public void test1(){
        Date date = new Date();
        System.out.println(date.getTime());
        java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        System.out.println(sqlDate);
        Date date1 = new Date(sqlDate.getTime());
        System.out.println(date1);

    }

}
