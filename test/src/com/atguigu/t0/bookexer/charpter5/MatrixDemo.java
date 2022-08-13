package com.atguigu.t0.bookexer.charpter5;

/**
 * @author Wint
 * @create 2022-08-11 17:37
 */
public class MatrixDemo {
    public static void main(String[] args) {
        int[][] arr = new int[4][5];
        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                arr[i][j] = (int)(Math.random()* (100 - 1 + 1 + 1));
            }
        }
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("-----------------------------------");
        int[][] arr1 = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr1.length; i++){
            for (int j = 0; j < arr1[i].length; j++){
                arr1[i][j] = arr[j][i];
            }
        }
        for (int i = 0; i < arr1.length; i++){
            for (int j = 0; j < arr1[i].length; j++){
                System.out.print(arr1[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
