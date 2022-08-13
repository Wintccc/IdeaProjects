package com.atguigu.t8.reflection;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @author Wint
 * @create 2022-06-27 20:42
 */
public class ReflectionTest1 {

    @Test
    public void test5(){
        Class clazz = String.class;
        System.out.println(clazz.getSuperclass());
    }

    @Test
    public void test4(){
        Class clazz = String.class;
        Constructor[] constructors = clazz.getConstructors();
        for (Constructor con : constructors){
            System.out.println(con);
        }
        System.out.println("______________________________________________");
        Constructor[] declaredConstructors = clazz.getDeclaredConstructors();
        for (Constructor con : declaredConstructors){
            System.out.println(con);
        }

    }

    @Test
    public void test3(){
        Class clazz = String.class;
        Method[] methods = clazz.getMethods();
        for(Method m : methods){
            System.out.print(Modifier.toString(m.getModifiers()) + "\t");
            System.out.print(m.getReturnType().getName() + "\t");
            System.out.println(m.getName());
        }
        System.out.println("___________________________________________________________");
        Method[] declaredMethods = clazz.getDeclaredMethods();
        System.out.println(Modifier.toString(declaredMethods[0].getModifiers()));
        System.out.println(declaredMethods[0].getReturnType());
        System.out.println(declaredMethods[0].getName());
    }

    @Test
    public void test2(){
        Class clazz = String.class;
        Field[] fields = clazz.getFields();
        for(Field f : fields){
            System.out.println(f);
        }
        System.out.println("*************************");
        Field[] declaredFields = clazz.getDeclaredFields();
        for(Field f : declaredFields){
            System.out.println(f);
        }
        System.out.println("*************************");
        for(Field f : declaredFields){
            int modifiers = f.getModifiers();
            System.out.println(Modifier.toString(modifiers));
        }
        System.out.println("__________________________");
        for(Field f : declaredFields){
            int modifiers = f.getModifiers();
            System.out.println(modifiers);
        }
    }

    @Test
    public void test1() throws ClassNotFoundException {
        Class clazz1 = Person.class;
        System.out.println(clazz1);

        Class clazz2 = new Person().getClass();
        System.out.println(clazz2);

        Class clazz3 = Class.forName("com.atguigu.t8.reflection.Person");
        System.out.println(clazz3);
    }
}
