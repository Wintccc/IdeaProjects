package com.atguigu.t5.generic.g2;

import java.util.*;

/**
 * @author Wint
 * @create 2022-06-24 14:38
 */
public class DAO<T> {
    private Map<String,T> map = new HashMap<>();

    public void save(String id,T entity){
        map.put(id,entity);
    }

    public T get(String id){
        return map.get(id);
    }

    public void update(String id,T entity){
        if (map.containsKey(id)){
            map.put(id,entity);
        }
    }

    public List<T> list(){
        Collection<T> values = map.values();
        ArrayList<T> arrayList = new ArrayList<>();
        Iterator<T> iterator = values.iterator();
        while (iterator.hasNext()){
            arrayList.add(iterator.next());
        }
        return arrayList;
    }

    public void delete(String id){
        map.remove(id);
    }
}
