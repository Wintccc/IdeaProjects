package com.atguigu.reflection;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/**
 * @author Wint
 * @create 2022-06-06 15:50
 */
public class ReflectionTest1 {
    @Test
    public void test6(){
        Class clazz = Person.class;
        Class superclass = clazz.getSuperclass();
        System.out.println(superclass.getName());
        Type genericSuperclass = clazz.getGenericSuperclass();
        System.out.println(genericSuperclass);
    }
    @Test
    public void test5() throws NoSuchMethodException {
        Class clazz = Person.class;
        Constructor[] constructor = clazz.getConstructors();
        for(Constructor con : constructor){
            System.out.println(con);
        }
        System.out.println("****************************************");
        Constructor[] declaredConstructors = clazz.getDeclaredConstructors();
        for(Constructor con : declaredConstructors){
            System.out.println(con);
        }
    }
    @Test
    public void test4(){
        Class clazz = Person.class;
        Method[] methods = clazz.getMethods();
        for(Method m : methods){
            System.out.println(m);
        }
        System.out.println("****************************************");
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method m : declaredMethods){
            System.out.println(m);
        }
    }
    @Test
    public void test3(){
        Class clazz = Person.class;
        Field[] dfs = clazz.getDeclaredFields();
        for (Field f : dfs){
            System.out.println(f);
        }
    }
    @Test
    public void test2(){
        Class<Person> clazz = Person.class;
        Field[] fields = clazz.getFields();
        for(Field f : fields){
            System.out.println(f);
        }
    }
    @Test
    public void test1() throws Exception {
        Class<Person> pc = Person.class;
        Person p1 = pc.newInstance();
        System.out.println(p1);
        
    }
}
