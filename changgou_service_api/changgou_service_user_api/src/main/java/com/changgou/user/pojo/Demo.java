package com.changgou.user.pojo;

public class Demo {
    public static void main(String[] args) {

        int[] arr = {16, 1, 8, 22, 9, 3, 66, 4};
        int min;
        for (int i = 0; i < arr.length; i++) {
            min = i;
            //找出最小的值
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            if (min != i) {
                int tem;
                tem = arr[i];
                arr[i] = arr[min];
                arr[min] = tem;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
