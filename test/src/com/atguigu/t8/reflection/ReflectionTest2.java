package com.atguigu.t8.reflection;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author Wint
 * @create 2022-07-05 22:39
 */
public class ReflectionTest2 {

    @Test
    public void test2() throws Exception {

        Class clazz = Person.class;
        Person p = (Person) clazz.newInstance();
        Method toString = clazz.getDeclaredMethod("toString");
        Object invoke = toString.invoke(p);
        System.out.println(invoke);
    }

    @Test
    public void test1() throws Exception {

        Class clazz = Person.class;
        Person p = (Person) clazz.newInstance();

        Field name = clazz.getField("name");
        name.setAccessible(true);
        name.set(p,"Tom");
        Object o = name.get(p);
        System.out.println(o);
    }
}
