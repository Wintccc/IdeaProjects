package com.atguigu.generic;

import org.junit.Test;

import java.util.*;

/**
 * @author Wint
 * @create 2022-06-01 14:25
 */
public class GenericTest {
    @Test
    public void test3(){
        OrderT<Double> orderT = new OrderT<>();

    }
    @Test
    public void test2(){
        HashMap<String, Integer> map = new HashMap<>();
        map.put("AA",12);
        map.put("BB",23);
        map.put("CC",34);
        map.put("DD",45);
        map.put("EE",56);
//        System.out.println(map);
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Integer> entry = iterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " --> " + value);
        }
    }
    @Test
    public void test1(){
        ArrayList<String> strings = new ArrayList<>();
        strings.add("AA");
        strings.add("BB");
        strings.add("CC");
        strings.add("DD");
        strings.add("EE");
        strings.add("BB");
        Iterator<String> iterator = strings.iterator();
//        while(iterator.hasNext()){
//            String next = iterator.next();
//            System.out.println(next);
//        }
        for(String s : strings){
            String str = s;
            System.out.println(str);
        }
    }
}
