package com.atguigu.c.arrays;

import java.util.Arrays;

/**
 * @author Wint
 * @create 2022-06-21 15:12
 */
public class ArrayTest1 {
    public static void main(String[] args) {
        /*
        面试题目：创建一个长度为6的int型数组，要求取值为1-30，同时元素值各不相同
         */
        int[] arr = new int[20];
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = (int)(Math.random() * (30 - 1 + 1) + 1);
            for (int j = 0 ; j < i ; j++){
                if (arr[i] == arr[j]){
                    i--;
                    break;
                }
            }
        }
        /*
        使用工具类输出上面创建的数组元素
         */
        System.out.println(Arrays.toString(arr));
        for (int i = 0 ; i < arr.length / 2 ; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(arr));
        /*
        使用线性查找，找出上述某一元素的索引位置
         */
        int dest = 5;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == dest){
                System.out.println(i);
            }
        }
        /*
        使用二分法查找出上述数组某一元素的索引位置
         */

        /*
        对上述数组进行复制操作，复制出一个完全相同的数组
         */
        int[] arr1 = new int[arr.length];
        for (int i = 0 ; i < arr.length ; i++){
            arr1[i] = arr[i];
        }
        System.out.println(Arrays.toString(arr1));
        /*
        对上述复制的数组进行冒泡排序
         */
        for (int i = 0 ; i < arr1.length - 1 ; i++){
            for (int j = 0 ; j < arr1.length - 1 - i ; j++){
                if (arr1[j] > arr1[j + 1]){
                    int temp = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr1));
        /*
        使用Arrays工具类比较上述几个数组是否相同
         */
        System.out.println(Arrays.equals(arr,arr1));
        /*
        使用Arrays工具类将上述数组全部填充为0
         */

        /*
        创建一个九九乘法表的数组并输出
         */
    }
}
