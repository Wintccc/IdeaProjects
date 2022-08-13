package com.atguigu.t0.bookexer.charpter5;

/**
 * @author Wint
 * @create 2022-08-11 16:11
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{22,46,68,69,78,89};
        int value = 89;
        int index = -1;
        int left = 0;
        int right = arr.length - 1;

        while (left <= right){
            int mid = (left + right) / 2;
            if (value == arr[mid]){
                index = mid;
                break;
            } else if(value > arr[mid]){
                left = mid + 1;
            } else if(value < arr[mid]){
                right = mid - 1;
            }
        }
        if (index == -1){
            System.out.println(value + "不存在");
        }else{
            System.out.println(value + "的索引为：" + index);
        }
    }
}
