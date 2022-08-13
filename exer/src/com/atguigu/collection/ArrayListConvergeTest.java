package com.atguigu.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author Wint
 * @create 2022-05-30 13:55
 */
public class ArrayListConvergeTest {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        list.add(123);
        list.add("ABC");
        list.add(456.7);
        list.add(new User("Tom",18));
        list.add(false);
        System.out.println(list.size());
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("******************");
        Object[] objects = list.toArray();
        for(Object obj : objects){
            System.out.println(obj);
        }
        System.out.println("*******************");
        List list1 = Arrays.asList(objects);
        iterator = list1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("********************");
//        list.addAll(list1);
//        for (Object obj : list) {
//            System.out.println(obj);
//        }
//        list.clear();
//        System.out.println(list.size());
        System.out.println(list.size());
        boolean contains = list.contains(123);
        System.out.println(contains);
        boolean containsAll = list.containsAll(list1);
        System.out.println(containsAll);
        boolean remove = list.remove(new Integer(123));
        System.out.println(remove);
        System.out.println("-------------------");
        for (Object obj : list) {
            System.out.println(obj);
        }
//        System.out.println("-----------------");
//        list.removeAll(list1);
//        for (Object obj : list) {
//            System.out.println(obj);
//        }
//        System.out.println("-----------------");
//        System.out.println(list.hashCode());
//        list.retainAll(list1);
//        for (Object obj : list) {
//            System.out.println(obj);
//        }
        list.add("888");
        System.out.println(list.size());
        System.out.println("(((((((((((((((");
        for (Object obj : list) {
            System.out.println(obj);
        }
        System.out.println("(((((((((((((((");
        System.out.println(list.get(0));
    }
}
