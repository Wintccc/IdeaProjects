package com.atguigu.collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author Wint
 * @create 2022-05-30 14:28
 */
public class TreeSetTest {
    public static void main(String[] args) {

        Comparator com = new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof User && o2 instanceof User){
                    User u1 = (User) o1;
                    User u2 = (User) o2;
                    int nameCompara = String.CASE_INSENSITIVE_ORDER.compare(u1.getName(), u2.getName());
                    if(nameCompara != 0){
                        return nameCompara;
                    }else{
                        return Integer.compare(u1.getAge(),u2.getAge());
                    }
                }
                throw new RuntimeException("输入的数据类型不一致！");
            }
        };

//        TreeSet treeSet = new TreeSet(com);
        TreeSet treeSet = new TreeSet();
        treeSet.add(new User("Tom",18));
        treeSet.add(new User("Mike",233));
        treeSet.add(new User("Jhon",4));
        treeSet.add(new User("Mary",67));
        treeSet.add(new User("Mark",67));
        treeSet.add(new User("Alex",145));
        treeSet.add(new User("Zabbix",63));
        System.out.println("*****************");
        System.out.println(treeSet.size());
        System.out.println("*****************");
        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
