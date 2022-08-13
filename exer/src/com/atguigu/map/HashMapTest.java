package com.atguigu.map;

import org.junit.Test;

import java.util.*;

/**
 * @author Wint
 * @create 2022-05-31 10:47
 */
public class HashMapTest {
    @Test
    public void test4(){
        ArrayList arrayList = new ArrayList();
        arrayList.add(123);
        arrayList.add(456.7);
        arrayList.add("AA");
        arrayList.add(new Person("Tom",38));
        System.out.println(arrayList);
        Collections.reverse(arrayList);
        System.out.println(arrayList);
        Collections.shuffle(arrayList);
        System.out.println(arrayList);
//        Collections.sort(arrayList);
//        System.out.println(arrayList);

    }
    @Test
    public void test3(){
        HashMap hashMap = new HashMap();
        hashMap.put("str1",123);
        hashMap.put("str2","ABC");
        hashMap.put("str3",'D');
        hashMap.put("str4",new Person("Tom",38));
        hashMap.put("str5",99.8);
        Set set = hashMap.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            Object obj = iterator.next();
            Map.Entry entry = (Map.Entry) obj;
            System.out.println(entry.getKey() + " --> " + entry.getValue());
        }
    }
    @Test
    public void test2(){
        HashMap hashMap = new HashMap();
        hashMap.put("str1",123);
        hashMap.put("str2","ABC");
        hashMap.put("str3",'D');
        hashMap.put("str4",new Person("Tom",38));
        hashMap.put("str5",99.8);
        System.out.println(hashMap);
        Set set = hashMap.keySet();
        Collection values = hashMap.values();
        for (Object obj:
             set) {
            System.out.println(obj);
        }
        for (Object obj:
             values) {
            System.out.println(obj);
        }
        Set entrySet = hashMap.entrySet();
        for (Object obj:
             entrySet) {
            System.out.println(obj);
        }
    }
    @Test
    public void test1(){
        HashMap hashMap = new HashMap();
        hashMap.put("str1",123);
        hashMap.put("str2","ABC");
        hashMap.put("str3",'D');
        hashMap.put("str4",new Person("Tom",38));
        hashMap.put("str5",99.8);
        System.out.println(hashMap);
        hashMap.remove("str1");
        System.out.println(hashMap);
        hashMap.put("str5",77.6);
        System.out.println(hashMap);
        hashMap.put("str5",99.8);
        System.out.println(hashMap);
        System.out.println(hashMap.get("str3"));
        System.out.println(hashMap.size());
    }
}
