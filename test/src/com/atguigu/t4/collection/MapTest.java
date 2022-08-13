package com.atguigu.t4.collection;

import java.util.*;

/**
 * @author Wint
 * @create 2022-06-23 13:54
 */
public class MapTest {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        HashMap hashMap = new HashMap();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        TreeMap treeMap = new TreeMap();
        Hashtable hashtable = new Hashtable();
        Properties properties = new Properties();
        hashMap.put("abc",123);
        hashMap.put("cde",456);
        linkedHashMap.put("abc",123);
        linkedHashMap.put("cde",456);
        treeMap.put("abc",123);
        treeMap.put("cde",456);
        hashtable.put("abc",123);
        hashtable.put("cde",456);
        properties.put("abc",123);
        properties.put("cde",456);

        Set set = hashMap.keySet();
        Collection values = hashMap.values();
        Set entrySet = hashMap.entrySet();
        System.out.println(set);
        System.out.println("------------------------");
        System.out.println(values);
        System.out.println("------------------------");
        System.out.println(entrySet);
        System.out.println("------------------------");
        Iterator setIterator = set.iterator();
        while (setIterator.hasNext()){
            System.out.println(setIterator.next());
        }
        System.out.println("------------------------");
        Iterator entryIterator = entrySet.iterator();
        while(entryIterator.hasNext()){
            System.out.println(entryIterator.next());
        }
    }
}
