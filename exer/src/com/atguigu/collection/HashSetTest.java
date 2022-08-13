package com.atguigu.collection;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author Wint
 * @create 2022-05-30 14:26
 */
public class HashSetTest {
    public static void main(String[] args) {

        HashSet hashSet = new HashSet();
        hashSet.add(123);
        hashSet.add("ABC");
        hashSet.add(456.7);
        hashSet.add(new User("Tom",18));
        hashSet.add(false);
        Iterator iterator = hashSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
