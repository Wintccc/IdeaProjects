package com.atguigu.t4.collection;

import org.junit.Test;

import java.util.*;

/**
 * @author Wint
 * @create 2022-06-23 12:38
 */
public class ListTest {
    @Test
    public void ListTest(){
        @SuppressWarnings("unused")
        ArrayList arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList();
        Vector vector = new Vector();
        arrayList.add(null);
        arrayList.add(null);
        linkedList.add(null);
        linkedList.add(null);
        vector.add(null);
        vector.add(null);
        System.out.println(arrayList);
        System.out.println(linkedList);
        System.out.println(vector);
    }
    @Test
    public void SetTest(){
        HashSet hashSet = new HashSet();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        TreeSet treeSet = new TreeSet();
        hashSet.add(null);
        linkedHashSet.add(null);
        //treeSet.add(null);
        System.out.println(hashSet);
        System.out.println(linkedHashSet);
        System.out.println(treeSet);
    }
}
