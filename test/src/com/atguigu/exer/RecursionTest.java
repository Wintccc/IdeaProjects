package com.atguigu.exer;

import org.junit.Test;

/**
 * @author Wint
 * @create 2022-08-11 20:31
 */
public class RecursionTest {

    @Test
    public void test2(){
        Integer in1 = new Integer(10);
        String i1 = in1.toString();
        System.out.println(i1);

        String s1 = "123.46";
        Double do1 = Double.parseDouble(s1);
        System.out.println(do1);
        String s = String.valueOf(do1);
        System.out.println(s);
    }

    @Test
    public void test1(){
        System.out.println(recursion(10));
    }

    public int recursion(int n){
        if(n == 1){
            return 1;
        }else{
            return n + recursion(n - 1);
        }
    }
}
