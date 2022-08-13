package com.atguigu.j.genericity.g4;

/**
 * @author Wint
 * @create 2022-06-24 13:47
 */
public class AppleTest {
    public static void main(String[] args) {
        Apple<String> stringApple = new Apple<>();
        Apple<Integer> integerApple = new Apple<>();
        Apple<Double> doubleApple = new Apple<>();
        stringApple.setWeight("500克");
        integerApple.setWeight(500);
        doubleApple.setWeight(500.5);
        System.out.println(stringApple.getWeight());
        System.out.println(integerApple.getWeight());
        System.out.println(doubleApple.getWeight());
        System.out.println(stringApple.getValue(new Integer(123)));
    }
}
