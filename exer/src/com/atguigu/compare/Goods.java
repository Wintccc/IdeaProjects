package com.atguigu.compare;

/**
 * @author Wint
 * @create 2022-05-28 17:16
 */
public class Goods implements Comparable{
    private String name;
    private int price;

    public Goods() {
    }

    public Goods(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof  Goods){
            Goods goods = (Goods)o;
            if (this.price > goods.price){
                return 1;
            }else if(this.price < goods.price){
                return -1;
            }else{
                return -this.name.compareTo(goods.name);
            }
        }
        throw new RuntimeException("传入的数据类型不一致！");
    }
}
