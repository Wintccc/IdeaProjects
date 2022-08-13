package com.atguigu.reflection;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author Wint
 * @create 2022-06-06 16:16
 */
public class ReflectionTest2 {
    @Test
    public void test3() throws Exception {
        Class clazz = Person.class;
        Constructor declaredConstructor = clazz.getDeclaredConstructor(String.class,int.class,String.class,double.class);
        declaredConstructor.setAccessible(true);
        Object o = declaredConstructor.newInstance("Tom", 18, "CHN", 23.4);
        System.out.println(o);
        Person p = (Person) o;
        System.out.println(p);
        System.out.println(p == o);
    }
    @Test
    public void test2() throws Exception {
        Class clazz = Person.class;
        Person p = (Person) clazz.newInstance();
        Method walk = clazz.getDeclaredMethod("walk");
        walk.setAccessible(true);
        Object invoke = walk.invoke(p);
        System.out.println(invoke);
        Method nation = clazz.getDeclaredMethod("nation", String.class);
        nation.setAccessible(true);
        Object chn = nation.invoke(p, "CHN");
        System.out.println(chn);
    }
    @Test
    public void test1() throws Exception {
        Class clazz = Person.class;
        Object o = clazz.newInstance();
        Person p1 = (Person) o;
        Field name = clazz.getDeclaredField("name");
        name.setAccessible(true);
        name.set(p1,"Tom");
        System.out.println(name.get(p1));
        Field age = clazz.getDeclaredField("age");
        age.set(p1,18);
        System.out.println(age.get(p1));
    }
}
