package com.atguigu.reflection;

import org.junit.Test;

/**
 * @author Wint
 * @create 2022-06-06 15:28
 */
public class ReflectionTest {
    @Test
    public void test4() throws ClassNotFoundException {
        ClassLoader cl = ReflectionTest.class.getClassLoader();
        Class clazz = cl.loadClass("com.atguigu.reflection.Person");
        System.out.println(cl);
        System.out.println(clazz);
    }
    @Test
    public void test3() throws ClassNotFoundException {
        Class clazz = Class.forName("com.atguigu.reflection.Person");
        System.out.println(clazz);
        Class clazz1 = Person.class;
        System.out.println(clazz == clazz1);
    }
    @Test
    public void test2(){
        Person p1 = new Person();
        Class clazz1 = p1.getClass();
        System.out.println(clazz1);
    }
    @Test
    public void test1(){
        Class p1 = Person.class;
        System.out.println(p1);
        Class<Person> p2 = Person.class;
        System.out.println(p2);
        System.out.println(p1 == p2);
        Class l1 = Life.class;
        System.out.println(l1);
        Class l2 = Life.class;
        System.out.println(l2);
    }
}
