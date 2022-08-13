package com.atguigu.t3.compare;

/**
 * @author Wint
 * @create 2022-06-22 21:01
 */
public class Goods implements Comparable{
    public Goods() {
    }

    public Goods(String name, int price) {
        this.name = name;
        this.price = price;
    }

    String name;
    int price;

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
        if (o instanceof Goods){
            Goods good = (Goods)o;
            if(this.name.compareTo(good.name) > 0){
                return 1;
            }else if(this.name.compareTo(good.name) < 0){
                return -1;
            }else {
                if (this.price > good.price){
                    return 1;
                }else if(this.price < good.price){
                    return -1;
                }else{
                    return 0;
                }
            }
        }
        throw new RuntimeException("传入的数据类型不一致");
    }
}
