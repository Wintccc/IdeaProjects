package com.atguigu.exer;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * @author Wint
 * @create 2022-08-12 14:36
 */
public class CollectionTest {

    @Test
    public void test2(){
        HashMap hashMap = new HashMap();
        hashMap.put("张三",18);
        hashMap.put("李四",20);
        Object w5 = hashMap.put("王五", 21);
        System.out.println(w5);
        Set entrySet = hashMap.entrySet();
        for (Object obj:
             entrySet) {
            System.out.println(obj);
        }
    }

    @Test
    public void test1() {
        ArrayList arrayList = new ArrayList();
        boolean a1 = arrayList.add("ABC");
        boolean a2 = arrayList.add("BCD");
        boolean a3 = arrayList.add("EFG");
        boolean a4 = arrayList.add("ZZZ");
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
