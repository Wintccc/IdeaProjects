package com.atguigu.t0.bookexer.charpter5;

import java.util.Arrays;

/**
 * @author Wint
 * @create 2022-08-11 16:20
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[15];
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * 101);
        }
        System.out.println(Arrays.toString(arr));

        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - 1 - i; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

        int[] arr1 = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            arr1[i] = arr[i];
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(arr);
        System.out.println(arr1);

        for(int i = 0; i < arr1.length / 2; i++){
            int temp = arr1[i];
            arr1[i] = arr1[arr1.length - 1 - i];
            arr1[arr1.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(arr1));
    }
}
