package com.atguigu.t4.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author Wint
 * @create 2022-06-23 9:33
 */
public class IteratorTest {
    public static void main(String[] args) {
        Collection coll = new ArrayList();
        coll.add(123);
        coll.add(87);
        coll.add("GBDA");
        coll.add(new Object());
        coll.add(0.9);

        Iterator iterator = coll.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
