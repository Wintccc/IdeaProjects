package com.atguigu.generic;

/**
 * @author Wint
 * @create 2022-06-01 15:02
 */
public class OrderT <T>{
    private String name;
    private int id;
    private T orderT;

    public OrderT() {
        T[] arr = (T[]) (new Object[10]);
    }

    public OrderT(String name, int id, T orderT) {
        this.name = name;
        this.id = id;
        this.orderT = orderT;
    }

    public static <E> void print(){
        System.out.println("printttttttt...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public T getOrderT() {
        return orderT;
    }

    public void setOrderT(T orderT) {
        this.orderT = orderT;
    }

    @Override
    public String toString() {
        return "OrderT{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", orderT=" + orderT +
                '}';
    }
}
