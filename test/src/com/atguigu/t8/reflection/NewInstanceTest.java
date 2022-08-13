package com.atguigu.t8.reflection;

import org.junit.Test;

/**
 * @author Wint
 * @create 2022-07-01 20:35
 */
public class NewInstanceTest {

    @Test
    public void test1() throws Exception {

        Class clazz = Person.class;
        Person p = (Person)clazz.newInstance();
        System.out.println(p);

        Class clazz1 = Class.forName("com.atguigu.t8.reflection.Person");
    }
}
